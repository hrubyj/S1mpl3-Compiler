package cz.zcu.kiv.gen;// Generated from /home/markovda/Skola/repos/simple/src/main/resources/Simple.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Const=4, If=5, Switch=6, Case=7, Default=8, Func=9, 
		Int=10, Bool=11, Void=12, For=13, In=14, While=15, Else=16, Do=17, Instanceof=18, 
		Return=19, LeftParen=20, RightParen=21, LeftBracket=22, RightBracket=23, 
		LeftBrace=24, RightBrace=25, Less=26, LessEqual=27, Greater=28, GreaterEqual=29, 
		Equal=30, EqualSign=31, Plus=32, Minus=33, Star=34, Div=35, Mod=36, And=37, 
		Or=38, Question=39, Colon=40, Semi=41, Comma=42, BooleanLiteral=43, Identifier=44, 
		NonzeroConstant=45, DigitSequence=46, NonzeroDigitSequence=47, Whitespace=48, 
		Newline=49;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_assignment = 2, RULE_arrayAccess = 3, 
		RULE_statement = 4, RULE_iterationStatement = 5, RULE_expressionStatement = 6, 
		RULE_labeledStatement = 7, RULE_returnStatement = 8, RULE_selectionStatement = 9, 
		RULE_blockItemList = 10, RULE_blockItem = 11, RULE_expression = 12, RULE_nonVoidReturnValue = 13, 
		RULE_scope = 14, RULE_functionScope = 15, RULE_condition = 16, RULE_whileCondition = 17, 
		RULE_conditionalExpression = 18, RULE_functionDeclaration = 19, RULE_functionReturnType = 20, 
		RULE_mainFunctionDeclaration = 21, RULE_functionDeclParams = 22, RULE_functionDeclParam = 23, 
		RULE_functionCall = 24, RULE_functionCallParams = 25, RULE_functionCallParam = 26, 
		RULE_functionIdentifier = 27, RULE_arrayFunctionParamTypeSpecifier = 28, 
		RULE_arrayTypeSpecifier = 29, RULE_baseTypeSpecifier = 30, RULE_nonVoidTypeSpecifier = 31, 
		RULE_typeQualifier = 32, RULE_unaryOperator = 33, RULE_comparisonOperator = 34, 
		RULE_arithmeticOperator = 35, RULE_logicalOperator = 36, RULE_signedConstant = 37, 
		RULE_decimalConstant = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "assignment", "arrayAccess", "statement", "iterationStatement", 
			"expressionStatement", "labeledStatement", "returnStatement", "selectionStatement", 
			"blockItemList", "blockItem", "expression", "nonVoidReturnValue", "scope", 
			"functionScope", "condition", "whileCondition", "conditionalExpression", 
			"functionDeclaration", "functionReturnType", "mainFunctionDeclaration", 
			"functionDeclParams", "functionDeclParam", "functionCall", "functionCallParams", 
			"functionCallParam", "functionIdentifier", "arrayFunctionParamTypeSpecifier", 
			"arrayTypeSpecifier", "baseTypeSpecifier", "nonVoidTypeSpecifier", "typeQualifier", 
			"unaryOperator", "comparisonOperator", "arithmeticOperator", "logicalOperator", 
			"signedConstant", "decimalConstant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'!'", "'0'", "'const'", "'if'", "'switch'", "'case'", 
			"'default'", "'func'", "'int'", "'bool'", "'void'", "'for'", "'in'", 
			"'while'", "'else'", "'do'", "'instanceof'", "'return'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'=='", "'='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'AND'", "'OR'", "'?'", "':'", "';'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Const", "If", "Switch", "Case", "Default", "Func", 
			"Int", "Bool", "Void", "For", "In", "While", "Else", "Do", "Instanceof", 
			"Return", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "Equal", 
			"EqualSign", "Plus", "Minus", "Star", "Div", "Mod", "And", "Or", "Question", 
			"Colon", "Semi", "Comma", "BooleanLiteral", "Identifier", "NonzeroConstant", 
			"DigitSequence", "NonzeroDigitSequence", "Whitespace", "Newline"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionDeclarationContext mainFunctionDeclaration() {
			return getRuleContext(MainFunctionDeclarationContext.class,0);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					functionDeclaration();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(84);
			mainFunctionDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public NonVoidTypeSpecifierContext nonVoidTypeSpecifier() {
			return getRuleContext(NonVoidTypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleParser.Identifier, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TerminalNode EqualSign() { return getToken(SimpleParser.EqualSign, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ArrayTypeSpecifierContext arrayTypeSpecifier() {
			return getRuleContext(ArrayTypeSpecifierContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(86);
					typeQualifier();
					}
				}

				setState(89);
				nonVoidTypeSpecifier();
				setState(90);
				match(Identifier);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EqualSign) {
					{
					setState(91);
					match(EqualSign);
					setState(92);
					conditionalExpression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				arrayTypeSpecifier();
				setState(96);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleParser.Identifier, 0); }
		public TerminalNode EqualSign() { return getToken(SimpleParser.EqualSign, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(Identifier);
				setState(101);
				match(EqualSign);
				setState(102);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				arrayAccess();
				setState(104);
				match(EqualSign);
				setState(105);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(SimpleParser.LeftBracket, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(SimpleParser.RightBracket, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Identifier);
			setState(110);
			match(LeftBracket);
			setState(111);
			conditionalExpression();
			setState(112);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case LeftParen:
			case Plus:
			case Minus:
			case Semi:
			case BooleanLiteral:
			case Identifier:
			case NonzeroConstant:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				expressionStatement();
				}
				break;
			case If:
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				selectionStatement();
				}
				break;
			case For:
			case While:
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				iterationStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode Do() { return getToken(SimpleParser.Do, 0); }
		public TerminalNode Semi() { return getToken(SimpleParser.Semi, 0); }
		public TerminalNode For() { return getToken(SimpleParser.For, 0); }
		public List<TerminalNode> Identifier() { return getTokens(SimpleParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleParser.Identifier, i);
		}
		public TerminalNode In() { return getToken(SimpleParser.In, 0); }
		public TerminalNode NonzeroConstant() { return getToken(SimpleParser.NonzeroConstant, 0); }
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iterationStatement);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				whileCondition();
				setState(120);
				scope();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(Do);
				setState(123);
				scope();
				setState(124);
				whileCondition();
				setState(125);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(For);
				setState(128);
				match(Identifier);
				setState(129);
				match(In);
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==NonzeroConstant) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				scope();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(SimpleParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
				{
				setState(134);
				expression();
				}
			}

			setState(137);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(SimpleParser.Case, 0); }
		public SignedConstantContext signedConstant() {
			return getRuleContext(SignedConstantContext.class,0);
		}
		public TerminalNode Colon() { return getToken(SimpleParser.Colon, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode Default() { return getToken(SimpleParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_labeledStatement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(Case);
				setState(140);
				signedConstant();
				setState(141);
				match(Colon);
				setState(142);
				scope();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(Default);
				setState(145);
				match(Colon);
				setState(146);
				scope();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SimpleParser.Return, 0); }
		public TerminalNode Semi() { return getToken(SimpleParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Return);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
				{
				setState(150);
				expression();
				}
			}

			setState(153);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SimpleParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public TerminalNode Else() { return getToken(SimpleParser.Else, 0); }
		public TerminalNode Switch() { return getToken(SimpleParser.Switch, 0); }
		public NonVoidReturnValueContext nonVoidReturnValue() {
			return getRuleContext(NonVoidReturnValueContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(SimpleParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleParser.RightBrace, 0); }
		public List<LabeledStatementContext> labeledStatement() {
			return getRuleContexts(LabeledStatementContext.class);
		}
		public LabeledStatementContext labeledStatement(int i) {
			return getRuleContext(LabeledStatementContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectionStatement);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(If);
				setState(156);
				condition();
				setState(157);
				scope();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(158);
					match(Else);
					setState(159);
					scope();
					}
				}

				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(Switch);
				setState(163);
				nonVoidReturnValue();
				setState(164);
				match(LeftBrace);
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(165);
					labeledStatement();
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Case || _la==Default );
				setState(170);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(174);
					blockItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockItem);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case If:
			case Switch:
			case For:
			case While:
			case Do:
			case LeftParen:
			case Plus:
			case Minus:
			case Semi:
			case BooleanLiteral:
			case Identifier:
			case NonzeroConstant:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				statement();
				}
				break;
			case Const:
			case Int:
			case Bool:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				declaration();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				returnStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SignedConstantContext signedConstant() {
			return getRuleContext(SignedConstantContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(SimpleParser.BooleanLiteral, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				signedConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(BooleanLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonVoidReturnValueContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(SimpleParser.BooleanLiteral, 0); }
		public SignedConstantContext signedConstant() {
			return getRuleContext(SignedConstantContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleParser.Identifier, 0); }
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public NonVoidReturnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonVoidReturnValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterNonVoidReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitNonVoidReturnValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitNonVoidReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonVoidReturnValueContext nonVoidReturnValue() throws RecognitionException {
		NonVoidReturnValueContext _localctx = new NonVoidReturnValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nonVoidReturnValue);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(BooleanLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				signedConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(SimpleParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LeftBrace);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Const) | (1L << If) | (1L << Switch) | (1L << Int) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << Return) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Semi) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
				{
				setState(198);
				blockItemList();
				}
			}

			setState(201);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionScopeContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(SimpleParser.LeftBrace, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(SimpleParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public FunctionScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFunctionScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFunctionScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitFunctionScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionScopeContext functionScope() throws RecognitionException {
		FunctionScopeContext _localctx = new FunctionScopeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(LeftBrace);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(204);
				blockItemList();
				}
				break;
			}
			setState(207);
			returnStatement();
			setState(208);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SimpleParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SimpleParser.RightParen, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LeftParen);
			setState(211);
			expression();
			setState(212);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileConditionContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(SimpleParser.While, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(While);
			setState(215);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public NonVoidReturnValueContext nonVoidReturnValue() {
			return getRuleContext(NonVoidReturnValueContext.class,0);
		}
		public TerminalNode Question() { return getToken(SimpleParser.Question, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(SimpleParser.Colon, 0); }
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			nonVoidReturnValue();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(218);
				match(Question);
				setState(219);
				expression();
				setState(220);
				match(Colon);
				setState(221);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Func() { return getToken(SimpleParser.Func, 0); }
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleParser.RightParen, 0); }
		public FunctionScopeContext functionScope() {
			return getRuleContext(FunctionScopeContext.class,0);
		}
		public FunctionDeclParamsContext functionDeclParams() {
			return getRuleContext(FunctionDeclParamsContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(Func);
			setState(226);
			functionReturnType();
			setState(227);
			match(Identifier);
			setState(228);
			match(LeftParen);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Int || _la==Bool) {
				{
				setState(229);
				functionDeclParams();
				}
			}

			setState(232);
			match(RightParen);
			setState(233);
			functionScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public BaseTypeSpecifierContext baseTypeSpecifier() {
			return getRuleContext(BaseTypeSpecifierContext.class,0);
		}
		public ArrayTypeSpecifierContext arrayTypeSpecifier() {
			return getRuleContext(ArrayTypeSpecifierContext.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionReturnType);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				baseTypeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				arrayTypeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Func() { return getToken(SimpleParser.Func, 0); }
		public TerminalNode Void() { return getToken(SimpleParser.Void, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleParser.RightParen, 0); }
		public FunctionScopeContext functionScope() {
			return getRuleContext(FunctionScopeContext.class,0);
		}
		public MainFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterMainFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitMainFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitMainFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionDeclarationContext mainFunctionDeclaration() throws RecognitionException {
		MainFunctionDeclarationContext _localctx = new MainFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mainFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(Func);
			setState(240);
			match(Void);
			setState(241);
			match(T__0);
			setState(242);
			match(LeftParen);
			setState(243);
			match(RightParen);
			setState(244);
			functionScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclParamsContext extends ParserRuleContext {
		public List<FunctionDeclParamContext> functionDeclParam() {
			return getRuleContexts(FunctionDeclParamContext.class);
		}
		public FunctionDeclParamContext functionDeclParam(int i) {
			return getRuleContext(FunctionDeclParamContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleParser.Comma, i);
		}
		public FunctionDeclParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFunctionDeclParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFunctionDeclParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitFunctionDeclParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclParamsContext functionDeclParams() throws RecognitionException {
		FunctionDeclParamsContext _localctx = new FunctionDeclParamsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDeclParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			functionDeclParam();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(247);
				match(Comma);
				setState(248);
				functionDeclParam();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclParamContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleParser.Identifier, 0); }
		public NonVoidTypeSpecifierContext nonVoidTypeSpecifier() {
			return getRuleContext(NonVoidTypeSpecifierContext.class,0);
		}
		public ArrayTypeSpecifierContext arrayTypeSpecifier() {
			return getRuleContext(ArrayTypeSpecifierContext.class,0);
		}
		public FunctionDeclParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFunctionDeclParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFunctionDeclParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitFunctionDeclParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclParamContext functionDeclParam() throws RecognitionException {
		FunctionDeclParamContext _localctx = new FunctionDeclParamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionDeclParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(254);
				nonVoidTypeSpecifier();
				}
				break;
			case 2:
				{
				setState(255);
				arrayTypeSpecifier();
				}
				break;
			}
			setState(258);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SimpleParser.LeftParen, 0); }
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SimpleParser.RightParen, 0); }
		public FunctionCallParamsContext functionCallParams() {
			return getRuleContext(FunctionCallParamsContext.class,0);
		}
		public TerminalNode Instanceof() { return getToken(SimpleParser.Instanceof, 0); }
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public TerminalNode Comma() { return getToken(SimpleParser.Comma, 0); }
		public BaseTypeSpecifierContext baseTypeSpecifier() {
			return getRuleContext(BaseTypeSpecifierContext.class,0);
		}
		public ArrayFunctionParamTypeSpecifierContext arrayFunctionParamTypeSpecifier() {
			return getRuleContext(ArrayFunctionParamTypeSpecifierContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCall);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(LeftParen);
				setState(261);
				functionIdentifier();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LeftParen) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
					{
					setState(262);
					functionCallParams();
					}
				}

				setState(265);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(LeftParen);
				setState(268);
				match(Instanceof);
				setState(269);
				functionCallParam();
				setState(270);
				match(Comma);
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(271);
					baseTypeSpecifier();
					}
					break;
				case 2:
					{
					setState(272);
					arrayFunctionParamTypeSpecifier();
					}
					break;
				}
				setState(275);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(LeftParen);
				setState(278);
				unaryOperator();
				setState(279);
				functionCallParam();
				setState(280);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallParamsContext extends ParserRuleContext {
		public List<FunctionCallParamContext> functionCallParam() {
			return getRuleContexts(FunctionCallParamContext.class);
		}
		public FunctionCallParamContext functionCallParam(int i) {
			return getRuleContext(FunctionCallParamContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleParser.Comma, i);
		}
		public FunctionCallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFunctionCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFunctionCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitFunctionCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParamsContext functionCallParams() throws RecognitionException {
		FunctionCallParamsContext _localctx = new FunctionCallParamsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCallParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			functionCallParam();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(285);
				match(Comma);
				setState(286);
				functionCallParam();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallParamContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleParser.Identifier, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(SimpleParser.BooleanLiteral, 0); }
		public DecimalConstantContext decimalConstant() {
			return getRuleContext(DecimalConstantContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public FunctionCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFunctionCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFunctionCallParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitFunctionCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParamContext functionCallParam() throws RecognitionException {
		FunctionCallParamContext _localctx = new FunctionCallParamContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCallParam);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				decimalConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleParser.Identifier, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionIdentifier);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(Identifier);
				}
				break;
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case Equal:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				comparisonOperator();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				arithmeticOperator();
				}
				break;
			case And:
			case Or:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				logicalOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayFunctionParamTypeSpecifierContext extends ParserRuleContext {
		public NonVoidTypeSpecifierContext nonVoidTypeSpecifier() {
			return getRuleContext(NonVoidTypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleParser.RightBracket, 0); }
		public ArrayFunctionParamTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayFunctionParamTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterArrayFunctionParamTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitArrayFunctionParamTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitArrayFunctionParamTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayFunctionParamTypeSpecifierContext arrayFunctionParamTypeSpecifier() throws RecognitionException {
		ArrayFunctionParamTypeSpecifierContext _localctx = new ArrayFunctionParamTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayFunctionParamTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			nonVoidTypeSpecifier();
			setState(306);
			match(LeftBracket);
			setState(307);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeSpecifierContext extends ParserRuleContext {
		public NonVoidTypeSpecifierContext nonVoidTypeSpecifier() {
			return getRuleContext(NonVoidTypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleParser.LeftBracket, 0); }
		public TerminalNode NonzeroConstant() { return getToken(SimpleParser.NonzeroConstant, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleParser.RightBracket, 0); }
		public ArrayTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterArrayTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitArrayTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitArrayTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeSpecifierContext arrayTypeSpecifier() throws RecognitionException {
		ArrayTypeSpecifierContext _localctx = new ArrayTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			nonVoidTypeSpecifier();
			setState(310);
			match(LeftBracket);
			setState(311);
			match(NonzeroConstant);
			setState(312);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeSpecifierContext extends ParserRuleContext {
		public NonVoidTypeSpecifierContext nonVoidTypeSpecifier() {
			return getRuleContext(NonVoidTypeSpecifierContext.class,0);
		}
		public TerminalNode Void() { return getToken(SimpleParser.Void, 0); }
		public BaseTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBaseTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBaseTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitBaseTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeSpecifierContext baseTypeSpecifier() throws RecognitionException {
		BaseTypeSpecifierContext _localctx = new BaseTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_baseTypeSpecifier);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				nonVoidTypeSpecifier();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonVoidTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SimpleParser.Int, 0); }
		public TerminalNode Bool() { return getToken(SimpleParser.Bool, 0); }
		public NonVoidTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonVoidTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterNonVoidTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitNonVoidTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitNonVoidTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonVoidTypeSpecifierContext nonVoidTypeSpecifier() throws RecognitionException {
		NonVoidTypeSpecifierContext _localctx = new NonVoidTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nonVoidTypeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Bool) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(SimpleParser.Const, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(Const);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(SimpleParser.Minus, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==Minus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(SimpleParser.Less, 0); }
		public TerminalNode LessEqual() { return getToken(SimpleParser.LessEqual, 0); }
		public TerminalNode Greater() { return getToken(SimpleParser.Greater, 0); }
		public TerminalNode GreaterEqual() { return getToken(SimpleParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(SimpleParser.Equal, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual) | (1L << Equal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(SimpleParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleParser.Minus, 0); }
		public TerminalNode Div() { return getToken(SimpleParser.Div, 0); }
		public TerminalNode Star() { return getToken(SimpleParser.Star, 0); }
		public TerminalNode Mod() { return getToken(SimpleParser.Mod, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(SimpleParser.And, 0); }
		public TerminalNode Or() { return getToken(SimpleParser.Or, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Or) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedConstantContext extends ParserRuleContext {
		public DecimalConstantContext decimalConstant() {
			return getRuleContext(DecimalConstantContext.class,0);
		}
		public TerminalNode Plus() { return getToken(SimpleParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleParser.Minus, 0); }
		public SignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitSignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedConstantContext signedConstant() throws RecognitionException {
		SignedConstantContext _localctx = new SignedConstantContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_signedConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(330);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(333);
			decimalConstant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalConstantContext extends ParserRuleContext {
		public TerminalNode NonzeroConstant() { return getToken(SimpleParser.NonzeroConstant, 0); }
		public DecimalConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDecimalConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDecimalConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor) return ((SimpleVisitor<? extends T>)visitor).visitDecimalConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalConstantContext decimalConstant() throws RecognitionException {
		DecimalConstantContext _localctx = new DecimalConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_decimalConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==NonzeroConstant) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u0152\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0005\u0000"+
		"P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0003\u0001X\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001^\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"c\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002l\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004v\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0085\b\u0005\u0001\u0006"+
		"\u0003\u0006\u0088\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0094\b\u0007\u0001\b\u0001\b\u0003\b\u0098\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a1\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0004\t\u00a7\b\t\u000b\t\f\t\u00a8\u0001\t\u0001\t"+
		"\u0003\t\u00ad\b\t\u0001\n\u0004\n\u00b0\b\n\u000b\n\f\n\u00b1\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00b7\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00bd\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00c4\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u00c8\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00ce\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e0\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e7\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00ee\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u00fa\b\u0016\n\u0016\f\u0016\u00fd\t\u0016\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0101\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0108\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0112"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u011b\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0120\b\u0019\n\u0019\f\u0019\u0123\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u012a\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0130\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u013d\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0003%\u014c\b%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJL\u0000\b\u0001\u0000,-\u0001\u0000\n\u000b\u0002\u0000\u0002\u0002"+
		"!!\u0001\u0000\u001a\u001e\u0001\u0000 $\u0001\u0000%&\u0001\u0000 !\u0002"+
		"\u0000\u0003\u0003--\u0158\u0000Q\u0001\u0000\u0000\u0000\u0002b\u0001"+
		"\u0000\u0000\u0000\u0004k\u0001\u0000\u0000\u0000\u0006m\u0001\u0000\u0000"+
		"\u0000\bu\u0001\u0000\u0000\u0000\n\u0084\u0001\u0000\u0000\u0000\f\u0087"+
		"\u0001\u0000\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u0095"+
		"\u0001\u0000\u0000\u0000\u0012\u00ac\u0001\u0000\u0000\u0000\u0014\u00af"+
		"\u0001\u0000\u0000\u0000\u0016\u00b6\u0001\u0000\u0000\u0000\u0018\u00bc"+
		"\u0001\u0000\u0000\u0000\u001a\u00c3\u0001\u0000\u0000\u0000\u001c\u00c5"+
		"\u0001\u0000\u0000\u0000\u001e\u00cb\u0001\u0000\u0000\u0000 \u00d2\u0001"+
		"\u0000\u0000\u0000\"\u00d6\u0001\u0000\u0000\u0000$\u00d9\u0001\u0000"+
		"\u0000\u0000&\u00e1\u0001\u0000\u0000\u0000(\u00ed\u0001\u0000\u0000\u0000"+
		"*\u00ef\u0001\u0000\u0000\u0000,\u00f6\u0001\u0000\u0000\u0000.\u0100"+
		"\u0001\u0000\u0000\u00000\u011a\u0001\u0000\u0000\u00002\u011c\u0001\u0000"+
		"\u0000\u00004\u0129\u0001\u0000\u0000\u00006\u012f\u0001\u0000\u0000\u0000"+
		"8\u0131\u0001\u0000\u0000\u0000:\u0135\u0001\u0000\u0000\u0000<\u013c"+
		"\u0001\u0000\u0000\u0000>\u013e\u0001\u0000\u0000\u0000@\u0140\u0001\u0000"+
		"\u0000\u0000B\u0142\u0001\u0000\u0000\u0000D\u0144\u0001\u0000\u0000\u0000"+
		"F\u0146\u0001\u0000\u0000\u0000H\u0148\u0001\u0000\u0000\u0000J\u014b"+
		"\u0001\u0000\u0000\u0000L\u014f\u0001\u0000\u0000\u0000NP\u0003&\u0013"+
		"\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000TU\u0003*\u0015\u0000U\u0001\u0001\u0000\u0000\u0000"+
		"VX\u0003@ \u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X"+
		"Y\u0001\u0000\u0000\u0000YZ\u0003>\u001f\u0000Z]\u0005,\u0000\u0000[\\"+
		"\u0005\u001f\u0000\u0000\\^\u0003$\u0012\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^c\u0001\u0000\u0000\u0000_`\u0003:\u001d\u0000"+
		"`a\u0005,\u0000\u0000ac\u0001\u0000\u0000\u0000bW\u0001\u0000\u0000\u0000"+
		"b_\u0001\u0000\u0000\u0000c\u0003\u0001\u0000\u0000\u0000de\u0005,\u0000"+
		"\u0000ef\u0005\u001f\u0000\u0000fl\u0003$\u0012\u0000gh\u0003\u0006\u0003"+
		"\u0000hi\u0005\u001f\u0000\u0000ij\u0003$\u0012\u0000jl\u0001\u0000\u0000"+
		"\u0000kd\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000l\u0005\u0001"+
		"\u0000\u0000\u0000mn\u0005,\u0000\u0000no\u0005\u0016\u0000\u0000op\u0003"+
		"$\u0012\u0000pq\u0005\u0017\u0000\u0000q\u0007\u0001\u0000\u0000\u0000"+
		"rv\u0003\f\u0006\u0000sv\u0003\u0012\t\u0000tv\u0003\n\u0005\u0000ur\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"v\t\u0001\u0000\u0000\u0000wx\u0003\"\u0011\u0000xy\u0003\u001c\u000e"+
		"\u0000y\u0085\u0001\u0000\u0000\u0000z{\u0005\u0011\u0000\u0000{|\u0003"+
		"\u001c\u000e\u0000|}\u0003\"\u0011\u0000}~\u0005)\u0000\u0000~\u0085\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\r\u0000\u0000\u0080\u0081\u0005,"+
		"\u0000\u0000\u0081\u0082\u0005\u000e\u0000\u0000\u0082\u0083\u0007\u0000"+
		"\u0000\u0000\u0083\u0085\u0003\u001c\u000e\u0000\u0084w\u0001\u0000\u0000"+
		"\u0000\u0084z\u0001\u0000\u0000\u0000\u0084\u007f\u0001\u0000\u0000\u0000"+
		"\u0085\u000b\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0018\f\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005)\u0000\u0000\u008a\r"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0007\u0000\u0000\u008c\u008d"+
		"\u0003J%\u0000\u008d\u008e\u0005(\u0000\u0000\u008e\u008f\u0003\u001c"+
		"\u000e\u0000\u008f\u0094\u0001\u0000\u0000\u0000\u0090\u0091\u0005\b\u0000"+
		"\u0000\u0091\u0092\u0005(\u0000\u0000\u0092\u0094\u0003\u001c\u000e\u0000"+
		"\u0093\u008b\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000"+
		"\u0094\u000f\u0001\u0000\u0000\u0000\u0095\u0097\u0005\u0013\u0000\u0000"+
		"\u0096\u0098\u0003\u0018\f\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005)\u0000\u0000\u009a\u0011\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005\u0005\u0000\u0000\u009c\u009d\u0003 \u0010\u0000\u009d\u00a0\u0003"+
		"\u001c\u000e\u0000\u009e\u009f\u0005\u0010\u0000\u0000\u009f\u00a1\u0003"+
		"\u001c\u000e\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00ad\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0006\u0000\u0000\u00a3\u00a4\u0003\u001a\r\u0000\u00a4\u00a6\u0005\u0018"+
		"\u0000\u0000\u00a5\u00a7\u0003\u000e\u0007\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\u0019\u0000\u0000\u00ab\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ac\u009b\u0001\u0000\u0000\u0000\u00ac\u00a2\u0001\u0000"+
		"\u0000\u0000\u00ad\u0013\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u0016"+
		"\u000b\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u0015\u0001\u0000\u0000\u0000\u00b3\u00b7\u0003\b\u0004"+
		"\u0000\u00b4\u00b7\u0003\u0002\u0001\u0000\u00b5\u00b7\u0003\u0010\b\u0000"+
		"\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u0017\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bd\u0003$\u0012\u0000\u00b9\u00bd\u0003\u0004\u0002\u0000\u00ba"+
		"\u00bd\u0003J%\u0000\u00bb\u00bd\u0005+\u0000\u0000\u00bc\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u0019\u0001"+
		"\u0000\u0000\u0000\u00be\u00c4\u00030\u0018\u0000\u00bf\u00c4\u0005+\u0000"+
		"\u0000\u00c0\u00c4\u0003J%\u0000\u00c1\u00c4\u0005,\u0000\u0000\u00c2"+
		"\u00c4\u0003\u0006\u0003\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u001b\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005\u0018\u0000\u0000\u00c6"+
		"\u00c8\u0003\u0014\n\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0019\u0000\u0000\u00ca\u001d\u0001\u0000\u0000\u0000\u00cb\u00cd"+
		"\u0005\u0018\u0000\u0000\u00cc\u00ce\u0003\u0014\n\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0003\u0010\b\u0000\u00d0\u00d1\u0005\u0019"+
		"\u0000\u0000\u00d1\u001f\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0014"+
		"\u0000\u0000\u00d3\u00d4\u0003\u0018\f\u0000\u00d4\u00d5\u0005\u0015\u0000"+
		"\u0000\u00d5!\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u000f\u0000\u0000"+
		"\u00d7\u00d8\u0003 \u0010\u0000\u00d8#\u0001\u0000\u0000\u0000\u00d9\u00df"+
		"\u0003\u001a\r\u0000\u00da\u00db\u0005\'\u0000\u0000\u00db\u00dc\u0003"+
		"\u0018\f\u0000\u00dc\u00dd\u0005(\u0000\u0000\u00dd\u00de\u0003\u0018"+
		"\f\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0%\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005\t\u0000\u0000\u00e2\u00e3\u0003(\u0014\u0000\u00e3"+
		"\u00e4\u0005,\u0000\u0000\u00e4\u00e6\u0005\u0014\u0000\u0000\u00e5\u00e7"+
		"\u0003,\u0016\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"\u0015\u0000\u0000\u00e9\u00ea\u0003\u001e\u000f\u0000\u00ea\'\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ee\u0003<\u001e\u0000\u00ec\u00ee\u0003:\u001d\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee)\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\t\u0000\u0000\u00f0"+
		"\u00f1\u0005\f\u0000\u0000\u00f1\u00f2\u0005\u0001\u0000\u0000\u00f2\u00f3"+
		"\u0005\u0014\u0000\u0000\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4\u00f5"+
		"\u0003\u001e\u000f\u0000\u00f5+\u0001\u0000\u0000\u0000\u00f6\u00fb\u0003"+
		".\u0017\u0000\u00f7\u00f8\u0005*\u0000\u0000\u00f8\u00fa\u0003.\u0017"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc-\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0003>\u001f\u0000\u00ff\u0101\u0003:\u001d\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0005,\u0000\u0000\u0103/\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005\u0014\u0000\u0000\u0105\u0107\u00036\u001b"+
		"\u0000\u0106\u0108\u00032\u0019\u0000\u0107\u0106\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0005\u0015\u0000\u0000\u010a\u011b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\u0014\u0000\u0000\u010c\u010d\u0005\u0012\u0000\u0000"+
		"\u010d\u010e\u00034\u001a\u0000\u010e\u0111\u0005*\u0000\u0000\u010f\u0112"+
		"\u0003<\u001e\u0000\u0110\u0112\u00038\u001c\u0000\u0111\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0005\u0015\u0000\u0000\u0114\u011b\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005\u0014\u0000\u0000\u0116\u0117\u0003B!\u0000"+
		"\u0117\u0118\u00034\u001a\u0000\u0118\u0119\u0005\u0015\u0000\u0000\u0119"+
		"\u011b\u0001\u0000\u0000\u0000\u011a\u0104\u0001\u0000\u0000\u0000\u011a"+
		"\u010b\u0001\u0000\u0000\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011b"+
		"1\u0001\u0000\u0000\u0000\u011c\u0121\u00034\u001a\u0000\u011d\u011e\u0005"+
		"*\u0000\u0000\u011e\u0120\u00034\u001a\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u01223\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u012a\u0005,\u0000\u0000\u0125"+
		"\u012a\u00030\u0018\u0000\u0126\u012a\u0005+\u0000\u0000\u0127\u012a\u0003"+
		"L&\u0000\u0128\u012a\u0003\u0006\u0003\u0000\u0129\u0124\u0001\u0000\u0000"+
		"\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u012a5\u0001\u0000\u0000\u0000\u012b\u0130\u0005,\u0000\u0000\u012c"+
		"\u0130\u0003D\"\u0000\u012d\u0130\u0003F#\u0000\u012e\u0130\u0003H$\u0000"+
		"\u012f\u012b\u0001\u0000\u0000\u0000\u012f\u012c\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000"+
		"\u01307\u0001\u0000\u0000\u0000\u0131\u0132\u0003>\u001f\u0000\u0132\u0133"+
		"\u0005\u0016\u0000\u0000\u0133\u0134\u0005\u0017\u0000\u0000\u01349\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0003>\u001f\u0000\u0136\u0137\u0005\u0016"+
		"\u0000\u0000\u0137\u0138\u0005-\u0000\u0000\u0138\u0139\u0005\u0017\u0000"+
		"\u0000\u0139;\u0001\u0000\u0000\u0000\u013a\u013d\u0003>\u001f\u0000\u013b"+
		"\u013d\u0005\f\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013d=\u0001\u0000\u0000\u0000\u013e\u013f\u0007"+
		"\u0001\u0000\u0000\u013f?\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0004"+
		"\u0000\u0000\u0141A\u0001\u0000\u0000\u0000\u0142\u0143\u0007\u0002\u0000"+
		"\u0000\u0143C\u0001\u0000\u0000\u0000\u0144\u0145\u0007\u0003\u0000\u0000"+
		"\u0145E\u0001\u0000\u0000\u0000\u0146\u0147\u0007\u0004\u0000\u0000\u0147"+
		"G\u0001\u0000\u0000\u0000\u0148\u0149\u0007\u0005\u0000\u0000\u0149I\u0001"+
		"\u0000\u0000\u0000\u014a\u014c\u0007\u0006\u0000\u0000\u014b\u014a\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0003L&\u0000\u014eK\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0007\u0007\u0000\u0000\u0150M\u0001\u0000\u0000\u0000"+
		" QW]bku\u0084\u0087\u0093\u0097\u00a0\u00a8\u00ac\u00b1\u00b6\u00bc\u00c3"+
		"\u00c7\u00cd\u00df\u00e6\u00ed\u00fb\u0100\u0107\u0111\u011a\u0121\u0129"+
		"\u012f\u013c\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}