
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

public class LanguageVisitor extends AbstractParseTreeVisitor<Evaluator> implements ComS319LanguageVisitor<Evaluator> {

	private Environment env;

	public LanguageVisitor(Environment env) {
		this.env = env;
	}

	public LanguageVisitor() {
		this(new Environment());
	}

	@Override
	public Evaluator visitProgram(ComS319LanguageParser.ProgramContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Evaluator visitCode(ComS319LanguageParser.CodeContext ctx) {
		for (ComS319LanguageParser.StatementContext statement : ctx.statement()) {
			Evaluator ret = visit(statement);
			if (ret != null) {
				return ret;
			}
		}
		return null;
	}

	@Override
	public Evaluator visitStatement(ComS319LanguageParser.StatementContext ctx) {
		try {
			Evaluator val = visit(ctx.getChild(0));

			return val;
		} catch (RuntimeException e) {
			System.err.println("Error on statement: " + ctx.getText() + " : " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Evaluator visitAssignment(ComS319LanguageParser.AssignmentContext ctx) {
		Evaluator value = null;
		if (ctx.expr() != null) {
			value = visit(ctx.expr());
			env.setVar(ctx.Variable().getText(), value);
		} else if (ctx.boolExpr() != null) {
			value = visit(ctx.boolExpr());
			env.setVar(ctx.Variable().getText(), value);
		} else if (ctx.stringExpr() != null) {
			value = visit(ctx.stringExpr());
			env.setVar(ctx.Variable().getText(), value);
		}
		return value;
	}

	@Override
	public Evaluator visitIfPartement(ComS319LanguageParser.IfPartementContext ctx) {
		Evaluator value = visit(ctx.ifPart().boolExpr());
		if (value.isBool() && value.getBool()) {
			visit(ctx.ifPart());
			return null;
		}

		for (int i = 0; i < ctx.elseIfPart().size(); i++) {
			value = visit(ctx.elseIfPart(i).boolExpr());
			if (value.isBool() && value.getBool()) {
				visit(ctx.elseIfPart(i));
				return null;
			}
		}
		if (ctx.elsePart() != null) {
			visit(ctx.elsePart());
		}
		return null;
	}

	@Override
	public Evaluator visitIfPart(ComS319LanguageParser.IfPartContext ctx) {
		return visit(ctx.code());
	}

	@Override
	public Evaluator visitElseIfPart(ComS319LanguageParser.ElseIfPartContext ctx) {
		return visit(ctx.code());
	}

	@Override
	public Evaluator visitElsePart(ComS319LanguageParser.ElsePartContext ctx) {
		return visit(ctx.code());
	}

	@Override
	public Evaluator visitModExpr(ComS319LanguageParser.ModExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() % op2.getNumber());
		} else {
			throw new RuntimeException("Modulo must be type number%number, not type " + op1.getType() + "%" + op2.getType());
		}
	}

	@Override
	public Evaluator visitAddExpr(ComS319LanguageParser.AddExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() + op2.getNumber());
		} else {
			throw new RuntimeException("Addition must be type number+number, not type " + op1.getType() + "+" + op2.getType());
		}
	}

	@Override
	public Evaluator visitNegExpr(ComS319LanguageParser.NegExprContext ctx) {
		Evaluator value = visit(ctx.expr());
		if (value.isNumber()) {
			return new Evaluator(value.getNumber() * -1);
		} else {
			throw new RuntimeException("Cannot negate type " + value.getType());
		}
	}

	@Override
	public Evaluator visitInnerExpr(ComS319LanguageParser.InnerExprContext ctx) {
		return visit(ctx.expr());
	}

	@Override
	public Evaluator visitDivExpr(ComS319LanguageParser.DivExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() / op2.getNumber());
		} else {
			throw new RuntimeException("Division must be type number/number, not type " + op1.getType() + "/" + op2.getType());
		}
	}

	@Override
	public Evaluator visitSubExpr(ComS319LanguageParser.SubExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() - op2.getNumber());
		} else {
			throw new RuntimeException("Subtraction must be type number-number, not type " + op1.getType() + "-" + op2.getType());
		}
	}

	@Override
	public Evaluator visitMultExpr(ComS319LanguageParser.MultExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() * op2.getNumber());
		} else {
			throw new RuntimeException("Multiplication must be type number*number, not type " + op1.getType() + "*" + op2.getType());
		}
	}

	@Override
	public Evaluator visitNumExpr(ComS319LanguageParser.NumExprContext ctx) {
		Double n = Double.valueOf(ctx.getText());
		return new Evaluator(n);
	}

	@Override
	public Evaluator visitBoolBoolExpr(ComS319LanguageParser.BoolBoolExprContext ctx) {
		return new Evaluator(Boolean.valueOf(ctx.getText()));
	}

	@Override
	public Evaluator visitString(ComS319LanguageParser.StringContext ctx) {
		return new Evaluator(ctx.getText().substring(1, ctx.getText().length() - 1));
	}

	@Override
	public Evaluator visitRelBoolExpr(ComS319LanguageParser.RelBoolExprContext ctx) {
		return visit(ctx.relationExpr());
	}

	@Override
	public Evaluator visitEqBoolExpr(ComS319LanguageParser.EqBoolExprContext ctx) {
		Evaluator op1 = visit(ctx.boolExpr(0));
		Evaluator op2 = visit(ctx.boolExpr(1));
		if (op1.isBool() && op2.isBool()) {
			return new Evaluator(op1.getBool() == op2.getBool());
		} else {
			throw new RuntimeException("Boolean eq must be type boolean == boolean, not type " + op1.getType() + " == " + op2.getType());
		}
	}

	@Override
	public Evaluator visitNeqBoolExpr(ComS319LanguageParser.NeqBoolExprContext ctx) {
		Evaluator op1 = visit(ctx.boolExpr(0));
		Evaluator op2 = visit(ctx.boolExpr(1));
		if (op1.isBool() && op2.isBool()) {
			return new Evaluator(op1.getBool() != op2.getBool());
		} else {
			throw new RuntimeException("Boolean not eq must be type boolean != boolean, not type " + op1.getType() + " != " + op2.getType());
		}
	}

	@Override
	public Evaluator visitAndBoolExpr(ComS319LanguageParser.AndBoolExprContext ctx) {
		Evaluator op1 = visit(ctx.boolExpr(0));
		Evaluator op2 = visit(ctx.boolExpr(1));
		if (op1.isBool() && op2.isBool()) {
			return new Evaluator(op1.getBool() && op2.getBool());
		} else {
			throw new RuntimeException("Boolean and must be type boolean && boolean, not type " + op1.getType() + " && " + op2.getType());
		}
	}

	@Override
	public Evaluator visitOrBoolExpr(ComS319LanguageParser.OrBoolExprContext ctx) {
		Evaluator op1 = visit(ctx.boolExpr(0));
		Evaluator op2 = visit(ctx.boolExpr(1));
		if (op1.isBool() && op2.isBool()) {
			return new Evaluator(op1.getBool() || op2.getBool());
		} else {
			throw new RuntimeException("Boolean or must be type boolean || boolean, not type " + op1.getType() + " || " + op2.getType());
		}
	}

	@Override
	public Evaluator visitNotBoolExpr(ComS319LanguageParser.NotBoolExprContext ctx) {
		Evaluator op = visit(ctx.boolExpr());
		if (op.isBool()) {
			return new Evaluator(!op.getBool());
		} else {
			throw new RuntimeException("Boolean not must be type !boolean , not type !" + op.getType());
		}
	}

	@Override
	public Evaluator visitGteExpr(ComS319LanguageParser.GteExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() >= op2.getNumber());
		} else {
			throw new RuntimeException(">= must be type number>=number, not type " + op1.getType() + ">=" + op2.getType());
		}
	}

	@Override
	public Evaluator visitLteExpr(ComS319LanguageParser.LteExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() <= op2.getNumber());
		} else {
			throw new RuntimeException("<= must be type number<=number, not type " + op1.getType() + "<=" + op2.getType());
		}
	}

	@Override
	public Evaluator visitGtExpr(ComS319LanguageParser.GtExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() > op2.getNumber());
		} else {
			throw new RuntimeException("> must be type number>number, not type " + op1.getType() + ">" + op2.getType());
		}
	}

	@Override
	public Evaluator visitLtExpr(ComS319LanguageParser.LtExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() < op2.getNumber());
		} else {
			throw new RuntimeException("< must be type number<number, not type " + op1.getType() + "<" + op2.getType());
		}
	}

	@Override
	public Evaluator visitEqExpr(ComS319LanguageParser.EqExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() == op2.getNumber());
		} else {
			throw new RuntimeException("== must be type number==number, not type " + op1.getType() + "==" + op2.getType());
		}
	}

	@Override
	public Evaluator visitNeqExpr(ComS319LanguageParser.NeqExprContext ctx) {
		Evaluator op1 = visit(ctx.expr(0));
		Evaluator op2 = visit(ctx.expr(1));
		if (op1.isNumber() && op2.isNumber()) {
			return new Evaluator(op1.getNumber() != op2.getNumber());
		} else {
			throw new RuntimeException("!= must be type number!=number, not type " + op1.getType() + "!=" + op2.getType());
		}
	}

	@Override
	public Evaluator visitStringAdd(ComS319LanguageParser.StringAddContext ctx) {
		Evaluator op1 = visit(ctx.stringExpr(0));
		Evaluator op2 = visit(ctx.stringExpr(1));
		if (op1.isString() && op2.isString()) {
			return new Evaluator(op1.getString() + op2.getString());
		} else {
			throw new RuntimeException("String append must be type string+string, not type " + op1.getType() + "+" + op2.getType());
		}
	}

	@Override
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

	@Override
	public Evaluator visitPrint(ComS319LanguageParser.PrintContext ctx) {
		Evaluator value = null;
		if (ctx.expr() != null) {
			value = visit(ctx.expr());
		} else if (ctx.boolExpr() != null) {
			value = visit(ctx.boolExpr());
		} else if (ctx.stringExpr() != null) {
			value = visit(ctx.stringExpr());
		}
		System.out.println(value.getObject());
		return null;
	}

	@Override
	public Evaluator visitVarExpr(ComS319LanguageParser.VarExprContext ctx) {
		Evaluator value = env.getVar(ctx.getText());
		return value;
	}

	@Override
	public Evaluator visitVarBoolExpr(ComS319LanguageParser.VarBoolExprContext ctx) {
		Evaluator value = env.getVar(ctx.getText());
		return value;
	}

	@Override
	public Evaluator visitVarStringExpr(ComS319LanguageParser.VarStringExprContext ctx) {
		Evaluator value = env.getVar(ctx.getText());
		return value;
	}

	@Override
	public Evaluator visitIncExpr(ComS319LanguageParser.IncExprContext ctx) {
		Evaluator value = visit(ctx.expr());
		return new Evaluator(value.getNumber() + 1);
	}

	@Override
	public Evaluator visitDecExpr(ComS319LanguageParser.DecExprContext ctx) {
		Evaluator value = visit(ctx.expr());
		return new Evaluator(value.getNumber() - 1);
	}

	@Override
	public Evaluator visitInnerBoolExpr(ComS319LanguageParser.InnerBoolExprContext ctx) {
		return visit(ctx.boolExpr());
	}

	@Override
	public Evaluator visitInnerRelation(ComS319LanguageParser.InnerRelationContext ctx) {
		return visit(ctx.relationExpr());
	}

	@Override
	public Evaluator visitWhileLoop(ComS319LanguageParser.WhileLoopContext ctx) {
		ParseTree block = ctx.code();
		while (visit(ctx.boolExpr()).getBool()) {
			visit(block);
		}
		return null;
	}

	@Override
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
				visit(block);
				visit(incState);
			}
		}
		return null;
	}

	@Override
	public Evaluator visitVarInc(ComS319LanguageParser.VarIncContext ctx) {
		Evaluator value = env.getVar(ctx.Variable().getText());
		if (value.isNumber()) {
			value = new Evaluator(value.getNumber() + 1);
			env.setVar(ctx.Variable().getText(), value);
			return value;
		} else {
			throw new RuntimeException("Variable Increment must be type number");
		}
	}

	@Override
	public Evaluator visitVarDec(ComS319LanguageParser.VarDecContext ctx) {
		Evaluator value = env.getVar(ctx.Variable().getText());
		if (value.isNumber()) {
			value = new Evaluator(value.getNumber() - 1);
			env.setVar(ctx.Variable().getText(), value);
			return value;
		} else {
			throw new RuntimeException("Variable Decrement must be type number");
		}
	}

	@Override
	public Evaluator visitVarIncExpr(ComS319LanguageParser.VarIncExprContext ctx) {
		Evaluator value = env.getVar(ctx.varInc().Variable().getText());
		if (value.isNumber()) {
			value = new Evaluator(value.getNumber() + 1);
			env.setVar(ctx.varInc().Variable().getText(), value);
			return value;
		} else {
			throw new RuntimeException("Variable Increment must be type number");
		}
	}

	@Override
	public Evaluator visitVarDecExpr(ComS319LanguageParser.VarDecExprContext ctx) {
		Evaluator value = env.getVar(ctx.varDec().Variable().getText());
		if (value.isNumber()) {
			value = new Evaluator(value.getNumber() - 1);
			env.setVar(ctx.varDec().Variable().getText(), value);
			return value;
		} else {
			throw new RuntimeException("Variable Decrement must be type number");
		}
	}

	@Override
	public Evaluator visitFuncDef(ComS319LanguageParser.FuncDefContext ctx) {
		String functionName = ctx.Variable().getText();
		ArrayList<String> paramNames = new ArrayList<String>();
		for (int i = 0; i < ctx.param().size(); i++) {
			paramNames.add(ctx.param(i).getText());
		}
		env.defFunc(functionName, new Function(ctx.funcBody(), paramNames));
		return null;
	}

	@Override
	public Evaluator visitFuncApply(ComS319LanguageParser.FuncApplyContext ctx) {
		Environment funcEnv = new Environment(env);
		LanguageVisitor funcVisitor = new LanguageVisitor(funcEnv);
		String funcName = ctx.Variable().getText();
		Function f = env.getFunc(funcName);
		ArrayList<String> paramNames = f.getParamNames();
		for (int i = 0; i < ctx.param().size(); i++) {
			funcEnv.setVar(paramNames.get(i), funcVisitor.visit(ctx.param(i)));
			// funcVisitor.visit(ctx.param(i));
		}
		return f.visit(funcVisitor);
	}

	@Override
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

	@Override
	public Evaluator visitApplyFunc(ComS319LanguageParser.ApplyFuncContext ctx) {
		Environment funcEnv = new Environment(env);
		LanguageVisitor funcVisitor = new LanguageVisitor(funcEnv);
		String funcName = ctx.funcApply().Variable().getText();
		Function f = env.getFunc(funcName);
		ArrayList<String> paramNames = f.getParamNames();
		for (int i = 0; i < ctx.funcApply().param().size(); i++) {
			funcEnv.setVar(paramNames.get(i), funcVisitor.visit(ctx.funcApply().param(i)));
		}
		return f.visit(funcVisitor);
	}

	@Override
	public Evaluator visitApplyBoolFunc(ComS319LanguageParser.ApplyBoolFuncContext ctx) {
		Environment funcEnv = new Environment(env);
		LanguageVisitor funcVisitor = new LanguageVisitor(funcEnv);
		String funcName = ctx.funcApply().Variable().getText();
		Function f = env.getFunc(funcName);
		ArrayList<String> paramNames = f.getParamNames();
		for (int i = 0; i < ctx.funcApply().param().size(); i++) {
			funcEnv.setVar(paramNames.get(i), funcVisitor.visit(ctx.funcApply().param(i)));
			// funcVisitor.visit(ctx.param(i));
		}
		return f.visit(funcVisitor);
	}

	@Override
	public Evaluator visitApplyStringFunc(ComS319LanguageParser.ApplyStringFuncContext ctx) {
		Environment funcEnv = new Environment(env);
		LanguageVisitor funcVisitor = new LanguageVisitor(funcEnv);
		String funcName = ctx.funcApply().Variable().getText();
		Function f = env.getFunc(funcName);
		ArrayList<String> paramNames = f.getParamNames();
		for (int i = 0; i < ctx.funcApply().param().size(); i++) {
			funcEnv.setVar(paramNames.get(i), funcVisitor.visit(ctx.funcApply().param(i)));
			// funcVisitor.visit(ctx.param(i));
		}
		return f.visit(funcVisitor);
	}

	@Override
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

	@Override
	public Evaluator visitFuncBody(ComS319LanguageParser.FuncBodyContext ctx) {
		for (ComS319LanguageParser.FuncStatementContext statement : ctx.funcStatement()) {
			Evaluator ret = visit(statement);
			if (ret != null) {
				return ret;
			}
		}
		return null;
	}

	@Override
	public Evaluator visitFuncStatement(ComS319LanguageParser.FuncStatementContext ctx) {
		if (ctx.funcReturn() != null) {
			return visit(ctx.funcReturn());
		}
		visit(ctx.statement());
		return null;
	}

}