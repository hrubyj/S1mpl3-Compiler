// Generated from /home/markovda/Skola/repos/simple/src/main/simple.g4 by ANTLR 4.9.2
package cz.zcu.kiv.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleParser}.
 */
public interface simpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(simpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(simpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(simpleParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(simpleParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(simpleParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(simpleParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(simpleParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(simpleParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(simpleParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(simpleParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(simpleParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(simpleParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(simpleParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(simpleParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(simpleParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(simpleParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(simpleParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(simpleParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(simpleParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(simpleParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(simpleParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(simpleParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(simpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(simpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nonVoidReturnValue}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidReturnValue(simpleParser.NonVoidReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nonVoidReturnValue}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidReturnValue(simpleParser.NonVoidReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(simpleParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(simpleParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionScope}.
	 * @param ctx the parse tree
	 */
	void enterFunctionScope(simpleParser.FunctionScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionScope}.
	 * @param ctx the parse tree
	 */
	void exitFunctionScope(simpleParser.FunctionScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(simpleParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(simpleParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(simpleParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(simpleParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(simpleParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(simpleParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(simpleParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(simpleParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionDeclParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclParams(simpleParser.FunctionDeclParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionDeclParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclParams(simpleParser.FunctionDeclParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionDeclParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclParam(simpleParser.FunctionDeclParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionDeclParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclParam(simpleParser.FunctionDeclParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(simpleParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(simpleParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParams(simpleParser.FunctionCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParams(simpleParser.FunctionCallParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParam(simpleParser.FunctionCallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParam(simpleParser.FunctionCallParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(simpleParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(simpleParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#arrayFunctionParamTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayFunctionParamTypeSpecifier(simpleParser.ArrayFunctionParamTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#arrayFunctionParamTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayFunctionParamTypeSpecifier(simpleParser.ArrayFunctionParamTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#arrayTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeSpecifier(simpleParser.ArrayTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#arrayTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeSpecifier(simpleParser.ArrayTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeSpecifier(simpleParser.BaseTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeSpecifier(simpleParser.BaseTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#nonVoidTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidTypeSpecifier(simpleParser.NonVoidTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#nonVoidTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidTypeSpecifier(simpleParser.NonVoidTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(simpleParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(simpleParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(simpleParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(simpleParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(simpleParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(simpleParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(simpleParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(simpleParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(simpleParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(simpleParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#signedConstant}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant(simpleParser.SignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#signedConstant}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant(simpleParser.SignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleParser#decimalConstant}.
	 * @param ctx the parse tree
	 */
	void enterDecimalConstant(simpleParser.DecimalConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleParser#decimalConstant}.
	 * @param ctx the parse tree
	 */
	void exitDecimalConstant(simpleParser.DecimalConstantContext ctx);
}