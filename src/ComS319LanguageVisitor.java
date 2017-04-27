// Generated from ComS319Language.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ComS319LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ComS319LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ComS319LanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(ComS319LanguageParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ComS319LanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ComS319LanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#varInc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInc(ComS319LanguageParser.VarIncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(ComS319LanguageParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#ifPartement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfPartement(ComS319LanguageParser.IfPartementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#ifPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfPart(ComS319LanguageParser.IfPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#elseIfPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfPart(ComS319LanguageParser.ElseIfPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#elsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsePart(ComS319LanguageParser.ElsePartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpr(ComS319LanguageParser.ModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncExpr(ComS319LanguageParser.IncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerExpr(ComS319LanguageParser.InnerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecExpr(ComS319LanguageParser.DecExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(ComS319LanguageParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(ComS319LanguageParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(ComS319LanguageParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(ComS319LanguageParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varIncExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIncExpr(ComS319LanguageParser.VarIncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDecExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecExpr(ComS319LanguageParser.VarDecExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyFunc}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyFunc(ComS319LanguageParser.ApplyFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ComS319LanguageParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpr(ComS319LanguageParser.NegExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link ComS319LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(ComS319LanguageParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyBoolFunc}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyBoolFunc(ComS319LanguageParser.ApplyBoolFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBoolExpr(ComS319LanguageParser.VarBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolBoolExpr(ComS319LanguageParser.BoolBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelBoolExpr(ComS319LanguageParser.RelBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqBoolExpr(ComS319LanguageParser.EqBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neqBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqBoolExpr(ComS319LanguageParser.NeqBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndBoolExpr(ComS319LanguageParser.AndBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerBoolExpr(ComS319LanguageParser.InnerBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrBoolExpr(ComS319LanguageParser.OrBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notBoolExpr}
	 * labeled alternative in {@link ComS319LanguageParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBoolExpr(ComS319LanguageParser.NotBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gteExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteExpr(ComS319LanguageParser.GteExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lteExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteExpr(ComS319LanguageParser.LteExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(ComS319LanguageParser.GtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(ComS319LanguageParser.LtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(ComS319LanguageParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neqExpr}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqExpr(ComS319LanguageParser.NeqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerRelation}
	 * labeled alternative in {@link ComS319LanguageParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerRelation(ComS319LanguageParser.InnerRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyStringFunc}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyStringFunc(ComS319LanguageParser.ApplyStringFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ComS319LanguageParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAdd}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAdd(ComS319LanguageParser.StringAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varStringExpr}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStringExpr(ComS319LanguageParser.VarStringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAddExpr}
	 * labeled alternative in {@link ComS319LanguageParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAddExpr(ComS319LanguageParser.StringAddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ComS319LanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(ComS319LanguageParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(ComS319LanguageParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(ComS319LanguageParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#funcApply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncApply(ComS319LanguageParser.FuncApplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ComS319LanguageParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComS319LanguageParser#funcReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturn(ComS319LanguageParser.FuncReturnContext ctx);
}