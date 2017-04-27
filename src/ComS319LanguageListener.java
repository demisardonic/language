// Generated from ComS319Language.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ComS319LanguageParser}.
 */
public interface ComS319LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ComS319LanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ComS319LanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(ComS319LanguageParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(ComS319LanguageParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ComS319LanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ComS319LanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ComS319LanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ComS319LanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#varInc}.
	 * @param ctx the parse tree
	 */
	void enterVarInc(ComS319LanguageParser.VarIncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#varInc}.
	 * @param ctx the parse tree
	 */
	void exitVarInc(ComS319LanguageParser.VarIncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(ComS319LanguageParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(ComS319LanguageParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#ifPartement}.
	 * @param ctx the parse tree
	 */
	void enterIfPartement(ComS319LanguageParser.IfPartementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#ifPartement}.
	 * @param ctx the parse tree
	 */
	void exitIfPartement(ComS319LanguageParser.IfPartementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#ifPart}.
	 * @param ctx the parse tree
	 */
	void enterIfPart(ComS319LanguageParser.IfPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#ifPart}.
	 * @param ctx the parse tree
	 */
	void exitIfPart(ComS319LanguageParser.IfPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#elseIfPart}.
	 * @param ctx the parse tree
	 */
	void enterElseIfPart(ComS319LanguageParser.ElseIfPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#elseIfPart}.
	 * @param ctx the parse tree
	 */
	void exitElseIfPart(ComS319LanguageParser.ElseIfPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void enterElsePart(ComS319LanguageParser.ElsePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void exitElsePart(ComS319LanguageParser.ElsePartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(ComS319LanguageParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(ComS319LanguageParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(ComS319LanguageParser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(ComS319LanguageParser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncExpr(ComS319LanguageParser.IncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncExpr(ComS319LanguageParser.IncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floorExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloorExpr(ComS319LanguageParser.FloorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floorExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloorExpr(ComS319LanguageParser.FloorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInnerExpr(ComS319LanguageParser.InnerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInnerExpr(ComS319LanguageParser.InnerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecExpr(ComS319LanguageParser.DecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecExpr(ComS319LanguageParser.DecExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(ComS319LanguageParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(ComS319LanguageParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ComS319LanguageParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ComS319LanguageParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(ComS319LanguageParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(ComS319LanguageParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(ComS319LanguageParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(ComS319LanguageParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varIncExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarIncExpr(ComS319LanguageParser.VarIncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varIncExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarIncExpr(ComS319LanguageParser.VarIncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLength}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(ComS319LanguageParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLength}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(ComS319LanguageParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarDecExpr(ComS319LanguageParser.VarDecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarDecExpr(ComS319LanguageParser.VarDecExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyFunc}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterApplyFunc(ComS319LanguageParser.ApplyFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyFunc}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitApplyFunc(ComS319LanguageParser.ApplyFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ComS319LanguageParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ComS319LanguageParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(ComS319LanguageParser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(ComS319LanguageParser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(ComS319LanguageParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(ComS319LanguageParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyBoolFunc}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterApplyBoolFunc(ComS319LanguageParser.ApplyBoolFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyBoolFunc}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitApplyBoolFunc(ComS319LanguageParser.ApplyBoolFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarBoolExpr(ComS319LanguageParser.VarBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarBoolExpr(ComS319LanguageParser.VarBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolBoolExpr(ComS319LanguageParser.BoolBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolBoolExpr(ComS319LanguageParser.BoolBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelBoolExpr(ComS319LanguageParser.RelBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelBoolExpr(ComS319LanguageParser.RelBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqBoolExpr(ComS319LanguageParser.EqBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqBoolExpr(ComS319LanguageParser.EqBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neqBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNeqBoolExpr(ComS319LanguageParser.NeqBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neqBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNeqBoolExpr(ComS319LanguageParser.NeqBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndBoolExpr(ComS319LanguageParser.AndBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndBoolExpr(ComS319LanguageParser.AndBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterInnerBoolExpr(ComS319LanguageParser.InnerBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitInnerBoolExpr(ComS319LanguageParser.InnerBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrBoolExpr(ComS319LanguageParser.OrBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrBoolExpr(ComS319LanguageParser.OrBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotBoolExpr(ComS319LanguageParser.NotBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotBoolExpr(ComS319LanguageParser.NotBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gteExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterGteExpr(ComS319LanguageParser.GteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gteExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitGteExpr(ComS319LanguageParser.GteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lteExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterLteExpr(ComS319LanguageParser.LteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lteExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitLteExpr(ComS319LanguageParser.LteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterGtExpr(ComS319LanguageParser.GtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitGtExpr(ComS319LanguageParser.GtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterLtExpr(ComS319LanguageParser.LtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitLtExpr(ComS319LanguageParser.LtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(ComS319LanguageParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(ComS319LanguageParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neqExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterNeqExpr(ComS319LanguageParser.NeqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neqExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitNeqExpr(ComS319LanguageParser.NeqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerRelation}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterInnerRelation(ComS319LanguageParser.InnerRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerRelation}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitInnerRelation(ComS319LanguageParser.InnerRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyStringFunc}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterApplyStringFunc(ComS319LanguageParser.ApplyStringFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyStringFunc}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitApplyStringFunc(ComS319LanguageParser.ApplyStringFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterString(ComS319LanguageParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitString(ComS319LanguageParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAdd}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringAdd(ComS319LanguageParser.StringAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAdd}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringAdd(ComS319LanguageParser.StringAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varStringExpr}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarStringExpr(ComS319LanguageParser.VarStringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varStringExpr}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarStringExpr(ComS319LanguageParser.VarStringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAddExpr}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringAddExpr(ComS319LanguageParser.StringAddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAddExpr}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringAddExpr(ComS319LanguageParser.StringAddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ComS319LanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ComS319LanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(ComS319LanguageParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(ComS319LanguageParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(ComS319LanguageParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(ComS319LanguageParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(ComS319LanguageParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(ComS319LanguageParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(ComS319LanguageParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(ComS319LanguageParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#funcApply}.
	 * @param ctx the parse tree
	 */
	void enterFuncApply(ComS319LanguageParser.FuncApplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#funcApply}.
	 * @param ctx the parse tree
	 */
	void exitFuncApply(ComS319LanguageParser.FuncApplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ComS319LanguageParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ComS319LanguageParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#funcReturn}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturn(ComS319LanguageParser.FuncReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#funcReturn}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturn(ComS319LanguageParser.FuncReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void enterImportStatment(ComS319LanguageParser.ImportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void exitImportStatment(ComS319LanguageParser.ImportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(ComS319LanguageParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(ComS319LanguageParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComS319LanguageParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(ComS319LanguageParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComS319LanguageParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(ComS319LanguageParser.ArrayIndexContext ctx);
}