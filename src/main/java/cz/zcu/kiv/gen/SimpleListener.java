package cz.zcu.kiv.gen;// Generated from /home/markovda/Skola/repos/simple/src/main/resources/Simple.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SimpleParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SimpleParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(SimpleParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(SimpleParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(SimpleParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(SimpleParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SimpleParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SimpleParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(SimpleParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(SimpleParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SimpleParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SimpleParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(SimpleParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(SimpleParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(SimpleParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(SimpleParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(SimpleParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(SimpleParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#nonVoidReturnValue}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidReturnValue(SimpleParser.NonVoidReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#nonVoidReturnValue}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidReturnValue(SimpleParser.NonVoidReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(SimpleParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(SimpleParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionScope}.
	 * @param ctx the parse tree
	 */
	void enterFunctionScope(SimpleParser.FunctionScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionScope}.
	 * @param ctx the parse tree
	 */
	void exitFunctionScope(SimpleParser.FunctionScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SimpleParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SimpleParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(SimpleParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(SimpleParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(SimpleParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(SimpleParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(SimpleParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(SimpleParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturnType(SimpleParser.FunctionReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturnType(SimpleParser.FunctionReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#mainFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainFunctionDeclaration(SimpleParser.MainFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#mainFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainFunctionDeclaration(SimpleParser.MainFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionDeclParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclParams(SimpleParser.FunctionDeclParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionDeclParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclParams(SimpleParser.FunctionDeclParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionDeclParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclParam(SimpleParser.FunctionDeclParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionDeclParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclParam(SimpleParser.FunctionDeclParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SimpleParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SimpleParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParams(SimpleParser.FunctionCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParams(SimpleParser.FunctionCallParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParam(SimpleParser.FunctionCallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionCallParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParam(SimpleParser.FunctionCallParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(SimpleParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(SimpleParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#arrayFunctionParamTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayFunctionParamTypeSpecifier(SimpleParser.ArrayFunctionParamTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#arrayFunctionParamTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayFunctionParamTypeSpecifier(SimpleParser.ArrayFunctionParamTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#arrayTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeSpecifier(SimpleParser.ArrayTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#arrayTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeSpecifier(SimpleParser.ArrayTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeSpecifier(SimpleParser.BaseTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeSpecifier(SimpleParser.BaseTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#nonVoidTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidTypeSpecifier(SimpleParser.NonVoidTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#nonVoidTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidTypeSpecifier(SimpleParser.NonVoidTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(SimpleParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(SimpleParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(SimpleParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(SimpleParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SimpleParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SimpleParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(SimpleParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(SimpleParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SimpleParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SimpleParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#signedConstant}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant(SimpleParser.SignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#signedConstant}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant(SimpleParser.SignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#decimalConstant}.
	 * @param ctx the parse tree
	 */
	void enterDecimalConstant(SimpleParser.DecimalConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#decimalConstant}.
	 * @param ctx the parse tree
	 */
	void exitDecimalConstant(SimpleParser.DecimalConstantContext ctx);
}