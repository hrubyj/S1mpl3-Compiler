// Generated from /home/markovda/Skola/repos/simple/simple.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(simpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(simpleParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(simpleParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simpleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(simpleParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(simpleParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(simpleParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(simpleParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(simpleParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(simpleParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(simpleParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(simpleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#nonVoidReturnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidReturnValue(simpleParser.NonVoidReturnValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(simpleParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(simpleParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionDeclParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclParams(simpleParser.FunctionDeclParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionDeclParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclParam(simpleParser.FunctionDeclParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(simpleParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionCallParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParams(simpleParser.FunctionCallParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionCallParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParam(simpleParser.FunctionCallParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(simpleParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#arrayFunctionParamTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctionParamTypeSpecifier(simpleParser.ArrayFunctionParamTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#arrayTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeSpecifier(simpleParser.ArrayTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeSpecifier(simpleParser.BaseTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#nonVoidTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidTypeSpecifier(simpleParser.NonVoidTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(simpleParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(simpleParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(simpleParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#signedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedConstant(simpleParser.SignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleParser#decimalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalConstant(simpleParser.DecimalConstantContext ctx);
}