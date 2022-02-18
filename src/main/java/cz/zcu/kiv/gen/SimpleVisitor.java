package cz.zcu.kiv.gen;// Generated from /home/markovda/Skola/repos/simple/src/main/resources/Simple.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SimpleParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(SimpleParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(SimpleParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SimpleParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(SimpleParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SimpleParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(SimpleParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(SimpleParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(SimpleParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#nonVoidReturnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidReturnValue(SimpleParser.NonVoidReturnValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(SimpleParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#functionScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionScope(SimpleParser.FunctionScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SimpleParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#whileCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCondition(SimpleParser.WhileConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(SimpleParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(SimpleParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#functionReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnType(SimpleParser.FunctionReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#mainFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunctionDeclaration(SimpleParser.MainFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#functionDeclParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclParams(SimpleParser.FunctionDeclParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#functionDeclParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclParam(SimpleParser.FunctionDeclParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SimpleParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#functionCallParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParams(SimpleParser.FunctionCallParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#functionCallParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParam(SimpleParser.FunctionCallParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(SimpleParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#arrayFunctionParamTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctionParamTypeSpecifier(SimpleParser.ArrayFunctionParamTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#arrayTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeSpecifier(SimpleParser.ArrayTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeSpecifier(SimpleParser.BaseTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#nonVoidTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidTypeSpecifier(SimpleParser.NonVoidTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(SimpleParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(SimpleParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SimpleParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(SimpleParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(SimpleParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#signedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedConstant(SimpleParser.SignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#decimalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalConstant(SimpleParser.DecimalConstantContext ctx);
}