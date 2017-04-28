
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

/**
 * Tree walking object which steps through the source code of the program and
 * generates the semantics of the program.
 *
 */
public class LanguageVisitor extends AbstractParseTreeVisitor<Evaluator> implements ComS319LanguageVisitor<Evaluator> {

	/**
	 * Stores variables, functions, and main function
	 */
	private Program env;

	/**
	 * Creates a Visitor with a give program environment
	 * 
	 * @param env
	 */
	public LanguageVisitor(Program env) {
		this.env = env;
	}

	/**
	 * Creates a Visitor with a new program environment
	 */
	public LanguageVisitor() {
		this(new Program());
	}

	/**
	 * Begins execution of a program by defining every function and executing
	 * the main function.
	 */
	public Evaluator visitProgram(ComS319LanguageParser.ProgramContext ctx) {
		// Define every function in the program
		visitChildren(ctx);
		// Throw exception if main function does not exist
		if (env.getMain() == null) {
			return null;
		}
		// Execute main function
		return env.getMain().visit(this);
	}

	/**
	 * Execute every statement in a code block until a return statement is
	 * found, then return the symantics within that statment.
	 */
	public Evaluator visitCode(ComS319LanguageParser.CodeContext ctx) {
		// Execute every statment in a code block until a return statement is
		// executed
		for (ComS319LanguageParser.StatementContext statement : ctx.statement()) {
			Evaluator ret = visit(statement);
			if (ret != null) {
				return ret;
			}
		}
		return null;
	}

	/**
	 * Evaluate the semantics of given statment. Statement could be loop,
	 * condition block, variable assignment, incremment/decrement statements,
	 * function calls or print statements.
	 */
	public Evaluator visitStatement(ComS319LanguageParser.StatementContext ctx) {
		// Increment the number of statements which have been excecuted
		LanguageMain.instCount++;
		try {
			Evaluator val = visit(ctx.getChild(0));
			return val;
		} catch (RuntimeException e) {
			System.out.println("Error on statement: " + ctx.getText() + " : " + e.getMessage());
		}
		return null;
	}

	/**
	 * Evaluates the semantics of variable assignment. Sets the variable in the
	 * Program environment
	 */
	public Evaluator visitAssignment(ComS319LanguageParser.AssignmentContext ctx) {
		Evaluator value = null;
		if (ctx.expr() != null) {
			value = visit(ctx.expr());
		} else if (ctx.boolExpr() != null) {
			value = visit(ctx.boolExpr());
		} else if (ctx.stringExpr() != null) {
			value = visit(ctx.stringExpr());
		} else if (ctx.arrayDec() != null) {
			value = visit(ctx.arrayDec());
		} else {
			return null;
		}
		env.setVar(ctx.Variable().getText(), value);
		return null;
	}

	/**
	 * Evalutates the semantics of if/elseif/else blocks depending on the
	 * boolean conditions available.
	 */
	public Evaluator visitIfPartement(ComS319LanguageParser.IfPartementContext ctx) {
		Evaluator value = visit(ctx.ifPart().boolExpr());
		if (value.isBool() && value.getBool()) {
			return visit(ctx.ifPart());
		}

		for (int i = 0; i < ctx.elseIfPart().size(); i++) {
			value = visit(ctx.elseIfPart(i).boolExpr());
			if (value.isBool() && value.getBool()) {

				return visit(ctx.elseIfPart(i));
			}
		}
		if (ctx.elsePart() != null) {
			return visit(ctx.elsePart());
		}
		return null;
	}

	/**
	 * Evaluate the body of if.
	 */
	public Evaluator visitIfPart(ComS319LanguageParser.IfPartContext ctx) {
		return visit(ctx.code());
	}

	/**
	 * Evaluate the body of else if.
	 */
	public Evaluator visitElseIfPart(ComS319LanguageParser.ElseIfPartContext ctx) {
		return visit(ctx.code());
	}

	/**
	 * Evaluate the body of else.
	 */
	public Evaluator visitElsePart(ComS319LanguageParser.ElsePartContext ctx) {
		return visit(ctx.code());
	}

	/**
	 * Evaluate expr%expr function over two numbers
	 */
	public Evaluator visitModExpr(ComS319LanguageParser.ModExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() % op2.getNumber());
		} else {
			throw new RuntimeException("Modulo must be type number%number, not type " + op1.getType() + "%" + op2.getType());
		}
	}

	/**
	 * Evaluate expr+expr function over two numbers. Can also add numbers to
	 * strings
	 */
	public Evaluator visitAddExpr(ComS319LanguageParser.AddExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() + op2.getNumber());
		} else if (op1.isString() && op2.isNumber()) {
			return new Evaluator(op1.getString() + op2.getNumber());
		} else if (op1.isNumber() && op2.isString()) {
			return new Evaluator(op1.getNumber() + op2.getString());
		} else if (op1.isArray() && op2.isArray()) {
			ArrayList<Evaluator> newArray = new ArrayList<Evaluator>(op1.getArray());
			newArray.addAll(op2.getArray());
			return new Evaluator(newArray);
		} else if (op1.isArray()) {
			ArrayList<Evaluator> newArray = new ArrayList<Evaluator>(op1.getArray());
			newArray.add(op2);
			return new Evaluator(newArray);
		} else {
			throw new RuntimeException("Addition cannot be done between type " + op1.getType() + " and " + op2.getType());
		}
	}

	/**
	 * Evaluate expr-expr function over two numbers
	 */
	public Evaluator visitNegExpr(ComS319LanguageParser.NegExprContext ctx) {
		Evaluator value = visit(ctx.expr());
		if (value.isNumber()) {
			return new Evaluator(value.getNumber() * -1);
		} else {
			throw new RuntimeException("Cannot negate type " + value.getType());
		}
	}

	/**
	 * Evaluate ( expression ) function over two numbers
	 */
	public Evaluator visitInnerExpr(ComS319LanguageParser.InnerExprContext ctx) {
		return visit(ctx.expr());
	}

	/**
	 * Evaluate expr/expr function over two numbers
	 */
	public Evaluator visitDivExpr(ComS319LanguageParser.DivExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() / op2.getNumber());
		} else {
			throw new RuntimeException("Division must be type number/number, not type " + op1.getType() + "/" + op2.getType());
		}
	}

	/**
	 * Evaluate -expr function over two numbers
	 */
	public Evaluator visitSubExpr(ComS319LanguageParser.SubExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() - op2.getNumber());
		} else {
			throw new RuntimeException("Subtraction must be type number-number, not type " + op1.getType() + "-" + op2.getType());
		}
	}

	/**
	 * Evaluate expr*expr function over two numbers
	 */
	public Evaluator visitMultExpr(ComS319LanguageParser.MultExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() * op2.getNumber());
		} else {
			throw new RuntimeException("Multiplication must be type number*number, not type " + op1.getType() + "*" + op2.getType());
		}
	}

	/**
	 * Returns the value of Number
	 */
	public Evaluator visitNumExpr(ComS319LanguageParser.NumExprContext ctx) {
		return new Evaluator(Double.valueOf(ctx.getText()));
	}

	/**
	 * Returns the value of Boolean
	 */
	public Evaluator visitBoolBoolExpr(ComS319LanguageParser.BoolBoolExprContext ctx) {
		return new Evaluator(Boolean.valueOf(ctx.getText()));
	}

	/**
	 * Returns the value of String
	 */
	public Evaluator visitString(ComS319LanguageParser.StringContext ctx) {
		return new Evaluator(ctx.getText().substring(1, ctx.getText().length() - 1));
	}

	/**
	 * Evaluates the <,<=,==,!=,>=,> expressions
	 */
	public Evaluator visitRelBoolExpr(ComS319LanguageParser.RelBoolExprContext ctx) {
		return visit(ctx.relationExpr());
	}

	/**
	 * Evaluate boolean==boolean function over two numbers
	 */
	public Evaluator visitEqBoolExpr(ComS319LanguageParser.EqBoolExprContext ctx) {
		Evaluator op1 = visit(ctx.boolExpr(0));
		Evaluator op2 = visit(ctx.boolExpr(1));
		if (op1.isBool() && op2.isBool()) {
			return new Evaluator(op1.getBool() == op2.getBool());
		} else {
			throw new RuntimeException("Boolean eq must be type boolean == boolean, not type " + op1.getType() + " == " + op2.getType());
		}
	}

	/**
	 * Evaluate boolean!=boolean function over two numbers
	 */
	public Evaluator visitNeqBoolExpr(ComS319LanguageParser.NeqBoolExprContext ctx) {
		Evaluator op1 = visit(ctx.boolExpr(0));
		Evaluator op2 = visit(ctx.boolExpr(1));
		if (op1.isBool() && op2.isBool()) {
			return new Evaluator(op1.getBool() != op2.getBool());
		} else {
			throw new RuntimeException("Boolean not eq must be type boolean != boolean, not type " + op1.getType() + " != " + op2.getType());
		}
	}

	/**
	 * Evaluate boolean&&boolean function over two numbers
	 */
	public Evaluator visitAndBoolExpr(ComS319LanguageParser.AndBoolExprContext ctx) {
		Evaluator op1 = visit(ctx.boolExpr(0));
		Evaluator op2 = visit(ctx.boolExpr(1));
		if (op1.isBool() && op2.isBool()) {
			return new Evaluator(op1.getBool() && op2.getBool());
		} else {
			throw new RuntimeException("Boolean and must be type boolean && boolean, not type " + op1.getType() + " && " + op2.getType());
		}
	}

	/**
	 * Evaluate boolean||boolean function over two numbers
	 */
	public Evaluator visitOrBoolExpr(ComS319LanguageParser.OrBoolExprContext ctx) {
		Evaluator op1 = visit(ctx.boolExpr(0));
		Evaluator op2 = visit(ctx.boolExpr(1));
		if (op1.isBool() && op2.isBool()) {
			return new Evaluator(op1.getBool() || op2.getBool());
		} else {
			throw new RuntimeException("Boolean or must be type boolean || boolean, not type " + op1.getType() + " || " + op2.getType());
		}
	}

	/**
	 * Evaluate !boolean function over two numbers
	 */
	public Evaluator visitNotBoolExpr(ComS319LanguageParser.NotBoolExprContext ctx) {
		Evaluator op = visit(ctx.boolExpr());
		if (op.isBool()) {
			return new Evaluator(!op.getBool());
		} else {
			throw new RuntimeException("Boolean not must be type !boolean , not type !" + op.getType());
		}
	}

	/**
	 * Evaluate expr>=expr function over two numbers
	 */
	public Evaluator visitGteExpr(ComS319LanguageParser.GteExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() >= op2.getNumber());
		} else {
			throw new RuntimeException(">= must be type number>=number, not type " + op1.getType() + ">=" + op2.getType());
		}
	}

	/**
	 * Evaluate expr<=expr function over two numbers
	 */
	public Evaluator visitLteExpr(ComS319LanguageParser.LteExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() <= op2.getNumber());
		} else {
			throw new RuntimeException("<= must be type number<=number, not type " + op1.getType() + "<=" + op2.getType());
		}
	}

	/**
	 * Evaluate expr>expr function over two numbers
	 */
	public Evaluator visitGtExpr(ComS319LanguageParser.GtExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() > op2.getNumber());
		} else {
			throw new RuntimeException("> must be type number>number, not type " + op1.getType() + ">" + op2.getType());
		}
	}

	/**
	 * Evaluate expr<expr function over two numbers
	 */
	public Evaluator visitLtExpr(ComS319LanguageParser.LtExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() < op2.getNumber());
		} else {
			throw new RuntimeException("< must be type number<number, not type " + op1.getType() + "<" + op2.getType());
		}
	}

	/**
	 * Evaluate expr==expr function over two numbers
	 */
	public Evaluator visitEqExpr(ComS319LanguageParser.EqExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() == op2.getNumber());
		} else {
			throw new RuntimeException("== must be type number==number, not type " + op1.getType() + "==" + op2.getType());
		}
	}

	/**
	 * Evaluate expr!=expr function over two numbers
	 */
	public Evaluator visitNeqExpr(ComS319LanguageParser.NeqExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() != op2.getNumber());
		} else {
			throw new RuntimeException("!= must be type number!=number, not type " + op1.getType() + "!=" + op2.getType());
		}
	}

	/**
	 * Evaluate string+string function over two numbers
	 */
	public Evaluator visitStringAdd(ComS319LanguageParser.StringAddContext ctx) {
		Evaluator op1 = visit(ctx.stringExpr(0));
		Evaluator op2 = visit(ctx.stringExpr(1));
		if (op1.isString() && op2.isString()) {
			return new Evaluator(op1.getString() + op2.getString());
		} else {
			throw new RuntimeException("String append must be type string+string, not type " + op1.getType() + "+" + op2.getType());
		}
	}

	/**
	 * Evaluate string+number function over two numbers
	 */
	public Evaluator visitStringAddExpr(ComS319LanguageParser.StringAddExprContext ctx) {
		Evaluator op1 = visit(ctx.stringExpr());
		Evaluator op2 = visit(ctx.expr());
		if (op1.isString() && op2.isNumber()) {
			String s = op1.getString() + op2.getNumber();
			return new Evaluator(s);
		} else {
			throw new RuntimeException("String append must be type string+string, not type " + op1.getType() + "+" + op2.getType());
		}
	}

	/**
	 * Prints the evaluation of the expression to the terminal
	 */
	public Evaluator visitPrint(ComS319LanguageParser.PrintContext ctx) {
		Evaluator value = null;
		if (ctx.expr() != null) {
			value = visit(ctx.expr());
		} else if (ctx.boolExpr() != null) {
			value = visit(ctx.boolExpr());
		} else if (ctx.stringExpr() != null) {
			value = visit(ctx.stringExpr());
		}
		if (value.isArray()) {
			ArrayList<Evaluator> list = value.getArray();
			String str = "[";
			if (list.size() > 0) {
				str += list.get(0).getObject();
				for (int i = 1; i < list.size(); i++) {
					str += "," + list.get(i).getObject();
				}
			}
			str += "]";
			System.out.println(str);
			return null;
		}
		System.out.println(value.getObject());
		return null;
	}

	/**
	 * Returns the value within a variable
	 */
	public Evaluator visitVarExpr(ComS319LanguageParser.VarExprContext ctx) {
		if (ctx.arrayIndex() == null) {
			Evaluator value = env.getVar(ctx.getText());
			if (value == null) {
				throw new RuntimeException("Variable \"" + ctx.getText() + "\" does not exist");
			}
			return value;
		} else {
			Evaluator value = env.getVar(ctx.Variable().getText());
			if (value == null) {
				throw new RuntimeException("Variable \"" + ctx.getText() + "\" does not exist");
			}
			Evaluator index = visit(ctx.arrayIndex());
			return value.getArrayIndex((int) index.getNumber());
		}
	}

	/**
	 * Returns the value within a variable
	 */
	public Evaluator visitVarBoolExpr(ComS319LanguageParser.VarBoolExprContext ctx) {
		Evaluator value = env.getVar(ctx.getText());
		if (value == null) {
			throw new RuntimeException("Variable \"" + ctx.getText() + "\" does not exist");
		}
		return value;
	}

	public Evaluator visitVarStringExpr(ComS319LanguageParser.VarStringExprContext ctx) {
		Evaluator value = env.getVar(ctx.getText());
		if (value == null) {
			throw new RuntimeException("Variable \"" + ctx.getText() + "\" does not exist");
		}
		return value;
	}

	/**
	 * Evaluates number++
	 */
	public Evaluator visitIncExpr(ComS319LanguageParser.IncExprContext ctx) {
		Evaluator value = visit(ctx.expr());
		return new Evaluator(value.getNumber() + 1);
	}

	/**
	 * Evaluates number--
	 */
	public Evaluator visitDecExpr(ComS319LanguageParser.DecExprContext ctx) {
		Evaluator value = visit(ctx.expr());
		return new Evaluator(value.getNumber() - 1);
	}

	/**
	 * Evaluates (boolean)
	 */
	public Evaluator visitInnerBoolExpr(ComS319LanguageParser.InnerBoolExprContext ctx) {
		return visit(ctx.boolExpr());
	}

	/**
	 * Evaluates (relational expression)
	 */
	public Evaluator visitInnerRelation(ComS319LanguageParser.InnerRelationContext ctx) {
		return visit(ctx.relationExpr());
	}

	/**
	 * Excecutes while loop Iterates the body of the while loop until the
	 * boolean contdition is false.
	 */
	public Evaluator visitWhileLoop(ComS319LanguageParser.WhileLoopContext ctx) {
		ParseTree block = ctx.code();
		while (visit(ctx.boolExpr()).getBool()) {
			Evaluator retVal = visit(block);
			if (retVal != null) {
				return retVal;
			}
		}
		return null;
	}

	/**
	 * Excecutes for loop Excecutes the initial statments, then executes the
	 * body of the loop followed by the terminating condition as long as the
	 * boolean condition is true
	 */
	public Evaluator visitForLoop(ComS319LanguageParser.ForLoopContext ctx) {
		ParseTree block = ctx.code();
		if (ctx.assignment(0).expr() != null) {
			visit(ctx.assignment(0));
			ParseTree incState = null;
			if (ctx.assignment(1) != null) {
				incState = ctx.assignment(1);
			} else {
				incState = ctx.expr();
			}
			while (visit(ctx.boolExpr()).getBool()) {
				Evaluator retVal = visit(block);
				if (retVal != null) {
					return retVal;
				}
				visit(incState);
			}
		}
		return null;
	}

	/**
	 * Sets variable to one greater than its current variable
	 */
	public Evaluator visitVarInc(ComS319LanguageParser.VarIncContext ctx) {
		Evaluator value = env.getVar(ctx.Variable().getText());
		if (value == null) {
			throw new RuntimeException("Variable \"" + ctx.getText() + "\" does not exist");
		}
		if (value.isNumber()) {
			value = new Evaluator(value.getNumber() + 1);
			env.setVar(ctx.Variable().getText(), value);
			return value;
		} else {
			throw new RuntimeException("Variable Increment must be type number");
		}
	}

	/**
	 * Sets variable to one lesser than its current variable
	 */
	public Evaluator visitVarDec(ComS319LanguageParser.VarDecContext ctx) {
		Evaluator value = env.getVar(ctx.Variable().getText());
		if (value == null) {
			throw new RuntimeException("Variable \"" + ctx.getText() + "\" does not exist");
		}
		if (value.isNumber()) {
			value = new Evaluator(value.getNumber() - 1);
			env.setVar(ctx.Variable().getText(), value);
			return value;
		} else {
			throw new RuntimeException("Variable Decrement must be type number");
		}
	}

	/**
	 * Sets variable to one greater than its current variable
	 */
	public Evaluator visitVarIncExpr(ComS319LanguageParser.VarIncExprContext ctx) {
		Evaluator value = env.getVar(ctx.varInc().Variable().getText());
		if (value == null) {
			throw new RuntimeException("Variable \"" + ctx.getText() + "\" does not exist");
		}
		if (value.isNumber()) {
			value = new Evaluator(value.getNumber() + 1);
			env.setVar(ctx.varInc().Variable().getText(), value);
			return value;
		} else {
			throw new RuntimeException("Variable Increment must be type number");
		}
	}

	/**
	 * Sets variable to one lesser than its current variable
	 */
	public Evaluator visitVarDecExpr(ComS319LanguageParser.VarDecExprContext ctx) {
		Evaluator value = env.getVar(ctx.varDec().Variable().getText());
		if (value == null) {
			throw new RuntimeException("Variable \"" + ctx.getText() + "\" does not exist");
		}
		if (value.isNumber()) {
			value = new Evaluator(value.getNumber() - 1);
			env.setVar(ctx.varDec().Variable().getText(), value);
			return value;
		} else {
			throw new RuntimeException("Variable Decrement must be type number");
		}
	}

	/**
	 * Defines a function and adds the body of this function into the program
	 * environment.
	 */
	public Evaluator visitFuncDef(ComS319LanguageParser.FuncDefContext ctx) {
		String functionName = ctx.Variable().getText();
		if (functionName.equals("main")) {
			if (ctx.param().size() != 0) {
				throw new RuntimeException("Main function must have no parameters.");
			}
			env.setMain(new Function(ctx.code(), new ArrayList<String>()));
			return null;
		}
		ArrayList<String> paramNames = new ArrayList<String>();
		for (int i = 0; i < ctx.param().size(); i++) {
			paramNames.add(ctx.param(i).getText());
		}
		env.defFunc(functionName, new Function(ctx.code(), paramNames));
		return null;
	}

	/**
	 * Executes the semantics of a function given the parameters. These
	 * functions are direct statments and are not for return statments or
	 * expressions.
	 */
	public Evaluator visitFuncApply(ComS319LanguageParser.FuncApplyContext ctx) {
		Program funcEnv = new Program(env);
		LanguageVisitor funcVisitor = new LanguageVisitor(funcEnv);
		String funcName = ctx.Variable().getText();
		Function f = env.getFunc(funcName);
		if (f == null) {
			throw new RuntimeException("Function \"" + funcName + "\" does not exist.");
		}
		ArrayList<String> paramNames = f.getParamNames();
		for (int i = 0; i < ctx.param().size(); i++) {
			funcEnv.setVar(paramNames.get(i), funcVisitor.visit(ctx.param(i)));
		}
		f.visit(funcVisitor);
		return null;
	}

	/**
	 * Returns the evaluation of a function parameter.
	 */
	public Evaluator visitParam(ComS319LanguageParser.ParamContext ctx) {
		if (ctx.funcApply() != null)
			return visit(ctx.funcApply());
		else if (ctx.expr() != null)
			return visit(ctx.expr());
		else if (ctx.boolExpr() != null)
			return visit(ctx.boolExpr());
		else if (ctx.stringExpr() != null)
			return visit(ctx.stringExpr());
		else
			return null;
	}

	/**
	 * Executes the semantics of a function given the parameters. These
	 * functions are NOT direct statments and are CAN be used as return
	 * statments or expressions.
	 */
	public Evaluator visitApplyFunc(ComS319LanguageParser.ApplyFuncContext ctx) {
		Program funcEnv = new Program(env);
		LanguageVisitor funcVisitor = new LanguageVisitor(funcEnv);
		String funcName = ctx.funcApply().Variable().getText();
		Function f = env.getFunc(funcName);
		if (f == null) {
			throw new RuntimeException("Function \"" + funcName + "\" does not exist.");
		}
		ArrayList<String> paramNames = f.getParamNames();
		for (int i = 0; i < ctx.funcApply().param().size(); i++) {
			funcEnv.setVar(paramNames.get(i), funcVisitor.visit(ctx.funcApply().param(i)));
		}
		return f.visit(funcVisitor);
	}

	/**
	 * Executes the semantics of a function given the parameters. These
	 * functions are NOT direct statments and are CAN be used as return
	 * statments or expressions.
	 */
	public Evaluator visitApplyBoolFunc(ComS319LanguageParser.ApplyBoolFuncContext ctx) {
		Program funcEnv = new Program(env);
		LanguageVisitor funcVisitor = new LanguageVisitor(funcEnv);
		String funcName = ctx.funcApply().Variable().getText();
		Function f = env.getFunc(funcName);
		if (f == null) {
			throw new RuntimeException("Function \"" + funcName + "\" does not exist.");
		}
		ArrayList<String> paramNames = f.getParamNames();
		for (int i = 0; i < ctx.funcApply().param().size(); i++) {
			funcEnv.setVar(paramNames.get(i), funcVisitor.visit(ctx.funcApply().param(i)));
		}
		return f.visit(funcVisitor);
	}

	/**
	 * Executes the semantics of a function given the parameters. These
	 * functions are NOT direct statments and are CAN be used as return
	 * statments or expressions.
	 */
	public Evaluator visitApplyStringFunc(ComS319LanguageParser.ApplyStringFuncContext ctx) {
		Program funcEnv = new Program(env);
		LanguageVisitor funcVisitor = new LanguageVisitor(funcEnv);
		String funcName = ctx.funcApply().Variable().getText();
		Function f = env.getFunc(funcName);
		if (f == null) {
			throw new RuntimeException("Function \"" + funcName + "\" does not exist.");
		}
		ArrayList<String> paramNames = f.getParamNames();
		for (int i = 0; i < ctx.funcApply().param().size(); i++) {
			funcEnv.setVar(paramNames.get(i), funcVisitor.visit(ctx.funcApply().param(i)));
		}
		return f.visit(funcVisitor);
	}

	/**
	 * Returns the value of a return statment.
	 */
	public Evaluator visitFuncReturn(ComS319LanguageParser.FuncReturnContext ctx) {
		if (ctx.expr() != null) {
			Evaluator val = visit(ctx.expr());
			return val;
		} else if (ctx.boolExpr() != null)
			return visit(ctx.boolExpr());
		else if (ctx.stringExpr() != null)
			return visit(ctx.stringExpr());
		else
			return null;
	}

	/**
	 * Imports all functions from the given file. Ignores duplicate imports.
	 */
	public Evaluator visitImportStatment(ComS319LanguageParser.ImportStatmentContext ctx) {
		String path = ctx.Path().getText();
		if (env.addImport(path)) {
			ANTLRInputStream input;
			try {
				input = new ANTLRInputStream(new FileInputStream(LanguageMain.relativePath + path.substring(1, path.length() - 1)));
			} catch (IOException e) {
				throw new RuntimeException("Import path " + path + " does not exist.");
			}
			ComS319LanguageLexer lexer = new ComS319LanguageLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ComS319LanguageParser parser = new ComS319LanguageParser(tokens);
			visit(parser.program());
		} else {
			System.out.println("Duplicate Import : " + path);
		}
		return null;
	}

	/**
	 * Declares a variable as an array.
	 */
	public Evaluator visitArrayDec(ComS319LanguageParser.ArrayDecContext ctx) {
		ArrayList<Evaluator> list = new ArrayList<Evaluator>();
		Evaluator value = null;
		for (ParseTree expr : ctx.children) {
			if (expr instanceof TerminalNodeImpl) {
				continue;
			}
			value = visit(expr);
			list.add(value);
		}
		return new Evaluator(list);
	}

	/**
	 * Returns the expression with [] after array variable
	 */
	public Evaluator visitArrayIndex(ComS319LanguageParser.ArrayIndexContext ctx) {
		Evaluator index = visit(ctx.expr());
		return index;
	}

	/**
	 * Returns the length of array
	 */
	public Evaluator visitLength(ComS319LanguageParser.LengthContext ctx) {
		Evaluator array = visit(ctx.Variable());
		if (array.isArray()) {
			return new Evaluator((double) array.getArray().size());
		}
		throw new RuntimeException(ctx.Variable().getText() + " is not an array.");
	}

	/**
	 * Returns the length of array
	 */
	public Evaluator visitArrayLength(ComS319LanguageParser.ArrayLengthContext ctx) {
		Evaluator value = env.getVar(ctx.length().Variable().getText());
		if (value.isArray()) {
			return new Evaluator((double) value.getArray().size());
		}
		throw new RuntimeException(ctx.length().Variable().getText() + " is not an array.");
	}

	public Evaluator visitFloorExpr(ComS319LanguageParser.FloorExprContext ctx) {
		Evaluator value = visit(ctx.expr());
		if (value.isNumber()) {
			return new Evaluator(Math.floor(value.getNumber()));
		}
		throw new RuntimeException(ctx.expr().getText() + " is not type number.");
	}

	public Evaluator visitArrayExpr(ComS319LanguageParser.ArrayExprContext ctx) {
		return visit(ctx.arrayDec());
	}
}