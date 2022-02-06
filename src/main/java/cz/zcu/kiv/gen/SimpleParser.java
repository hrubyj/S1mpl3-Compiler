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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		RULE_conditionalExpression = 18, RULE_functionDeclaration = 19, RULE_mainFunctionDeclaration = 20, 
		RULE_functionDeclParams = 21, RULE_functionDeclParam = 22, RULE_functionCall = 23, 
		RULE_functionCallParams = 24, RULE_functionCallParam = 25, RULE_functionIdentifier = 26, 
		RULE_arrayFunctionParamTypeSpecifier = 27, RULE_arrayTypeSpecifier = 28, 
		RULE_baseTypeSpecifier = 29, RULE_nonVoidTypeSpecifier = 30, RULE_typeQualifier = 31, 
		RULE_unaryOperator = 32, RULE_comparisonOperator = 33, RULE_arithmeticOperator = 34, 
		RULE_logicalOperator = 35, RULE_signedConstant = 36, RULE_decimalConstant = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "assignment", "arrayAccess", "statement", "iterationStatement", 
			"expressionStatement", "labeledStatement", "returnStatement", "selectionStatement", 
			"blockItemList", "blockItem", "expression", "nonVoidReturnValue", "scope", 
			"functionScope", "condition", "whileCondition", "conditionalExpression", 
			"functionDeclaration", "mainFunctionDeclaration", "functionDeclParams", 
			"functionDeclParam", "functionCall", "functionCallParams", "functionCallParam", 
			"functionIdentifier", "arrayFunctionParamTypeSpecifier", "arrayTypeSpecifier", 
			"baseTypeSpecifier", "nonVoidTypeSpecifier", "typeQualifier", "unaryOperator", 
			"comparisonOperator", "arithmeticOperator", "logicalOperator", "signedConstant", 
			"decimalConstant"
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					functionDeclaration();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(82);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(84);
					typeQualifier();
					}
				}

				setState(87);
				nonVoidTypeSpecifier();
				setState(88);
				match(Identifier);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EqualSign) {
					{
					setState(89);
					match(EqualSign);
					setState(90);
					conditionalExpression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				arrayTypeSpecifier();
				setState(94);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(Identifier);
				setState(99);
				match(EqualSign);
				setState(100);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				arrayAccess();
				setState(102);
				match(EqualSign);
				setState(103);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Identifier);
			setState(108);
			match(LeftBracket);
			setState(109);
			conditionalExpression();
			setState(110);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(115);
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
				setState(112);
				expressionStatement();
				}
				break;
			case If:
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				selectionStatement();
				}
				break;
			case For:
			case While:
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iterationStatement);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				whileCondition();
				setState(118);
				scope();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(Do);
				setState(121);
				scope();
				setState(122);
				whileCondition();
				setState(123);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(For);
				setState(126);
				match(Identifier);
				setState(127);
				match(In);
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==NonzeroConstant) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitExpressionStatement(this);
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
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
				{
				setState(132);
				expression();
				}
			}

			setState(135);
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
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_labeledStatement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(Case);
				setState(138);
				conditionalExpression();
				setState(139);
				match(Colon);
				setState(140);
				scope();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(Default);
				setState(143);
				match(Colon);
				setState(144);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitReturnStatement(this);
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
			setState(147);
			match(Return);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
				{
				setState(148);
				expression();
				}
			}

			setState(151);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectionStatement);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(If);
				setState(154);
				condition();
				setState(155);
				scope();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(156);
					match(Else);
					setState(157);
					scope();
					}
				}

				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(Switch);
				setState(161);
				condition();
				setState(162);
				match(LeftBrace);
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163);
					labeledStatement();
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Case || _la==Default );
				setState(168);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitBlockItemList(this);
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
			setState(173); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(172);
					blockItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(175); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockItem);
		try {
			setState(180);
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
				setState(177);
				statement();
				}
				break;
			case Const:
			case Int:
			case Bool:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				declaration();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				signedConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitNonVoidReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonVoidReturnValueContext nonVoidReturnValue() throws RecognitionException {
		NonVoidReturnValueContext _localctx = new NonVoidReturnValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nonVoidReturnValue);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(BooleanLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				signedConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitScope(this);
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
			setState(195);
			match(LeftBrace);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Const) | (1L << If) | (1L << Switch) | (1L << Int) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << Return) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Semi) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
				{
				setState(196);
				blockItemList();
				}
			}

			setState(199);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFunctionScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionScopeContext functionScope() throws RecognitionException {
		FunctionScopeContext _localctx = new FunctionScopeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LeftBrace);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(202);
				blockItemList();
				}
				break;
			}
			setState(205);
			returnStatement();
			setState(206);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LeftParen);
			setState(209);
			expression();
			setState(210);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(While);
			setState(213);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitConditionalExpression(this);
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
			setState(215);
			nonVoidReturnValue();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(216);
				match(Question);
				setState(217);
				expression();
				setState(218);
				match(Colon);
				setState(219);
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
		public BaseTypeSpecifierContext baseTypeSpecifier() {
			return getRuleContext(BaseTypeSpecifierContext.class,0);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
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
			setState(223);
			match(Func);
			setState(224);
			baseTypeSpecifier();
			setState(225);
			match(Identifier);
			setState(226);
			match(LeftParen);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Int || _la==Bool) {
				{
				setState(227);
				functionDeclParams();
				}
			}

			setState(230);
			match(RightParen);
			setState(231);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitMainFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionDeclarationContext mainFunctionDeclaration() throws RecognitionException {
		MainFunctionDeclarationContext _localctx = new MainFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mainFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(Func);
			setState(234);
			match(Void);
			setState(235);
			match(T__0);
			setState(236);
			match(LeftParen);
			setState(237);
			match(RightParen);
			setState(238);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFunctionDeclParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclParamsContext functionDeclParams() throws RecognitionException {
		FunctionDeclParamsContext _localctx = new FunctionDeclParamsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDeclParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			functionDeclParam();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(241);
				match(Comma);
				setState(242);
				functionDeclParam();
				}
				}
				setState(247);
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
		public ArrayFunctionParamTypeSpecifierContext arrayFunctionParamTypeSpecifier() {
			return getRuleContext(ArrayFunctionParamTypeSpecifierContext.class,0);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFunctionDeclParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclParamContext functionDeclParam() throws RecognitionException {
		FunctionDeclParamContext _localctx = new FunctionDeclParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDeclParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(248);
				nonVoidTypeSpecifier();
				}
				break;
			case 2:
				{
				setState(249);
				arrayFunctionParamTypeSpecifier();
				}
				break;
			}
			setState(252);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCall);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(LeftParen);
				setState(255);
				functionIdentifier();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LeftParen) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
					{
					setState(256);
					functionCallParams();
					}
				}

				setState(259);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(LeftParen);
				setState(262);
				match(Instanceof);
				setState(263);
				functionCallParam();
				setState(264);
				match(Comma);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(265);
					baseTypeSpecifier();
					}
					break;
				case 2:
					{
					setState(266);
					arrayFunctionParamTypeSpecifier();
					}
					break;
				}
				setState(269);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(LeftParen);
				setState(272);
				unaryOperator();
				setState(273);
				functionCallParam();
				setState(274);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFunctionCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParamsContext functionCallParams() throws RecognitionException {
		FunctionCallParamsContext _localctx = new FunctionCallParamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCallParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			functionCallParam();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(279);
				match(Comma);
				setState(280);
				functionCallParam();
				}
				}
				setState(285);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFunctionCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParamContext functionCallParam() throws RecognitionException {
		FunctionCallParamContext _localctx = new FunctionCallParamContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCallParam);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(Identifier);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				functionCall();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(BooleanLiteral);
				}
				break;
			case T__2:
			case NonzeroConstant:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				decimalConstant();
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionIdentifier);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
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
				setState(293);
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
				setState(294);
				arithmeticOperator();
				}
				break;
			case And:
			case Or:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitArrayFunctionParamTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayFunctionParamTypeSpecifierContext arrayFunctionParamTypeSpecifier() throws RecognitionException {
		ArrayFunctionParamTypeSpecifierContext _localctx = new ArrayFunctionParamTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayFunctionParamTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			nonVoidTypeSpecifier();
			setState(299);
			match(LeftBracket);
			setState(300);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitArrayTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeSpecifierContext arrayTypeSpecifier() throws RecognitionException {
		ArrayTypeSpecifierContext _localctx = new ArrayTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			nonVoidTypeSpecifier();
			setState(303);
			match(LeftBracket);
			setState(304);
			match(NonzeroConstant);
			setState(305);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitBaseTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeSpecifierContext baseTypeSpecifier() throws RecognitionException {
		BaseTypeSpecifierContext _localctx = new BaseTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_baseTypeSpecifier);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				nonVoidTypeSpecifier();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitNonVoidTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonVoidTypeSpecifierContext nonVoidTypeSpecifier() throws RecognitionException {
		NonVoidTypeSpecifierContext _localctx = new NonVoidTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nonVoidTypeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedConstantContext signedConstant() throws RecognitionException {
		SignedConstantContext _localctx = new SignedConstantContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_signedConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(323);
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

			setState(326);
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
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDecimalConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalConstantContext decimalConstant() throws RecognitionException {
		DecimalConstantContext _localctx = new DecimalConstantContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_decimalConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u014d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\2\3\2\3\3\5\3X\n\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\3\3\3\3\3\5\3c\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\5\6v\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0085"+
		"\n\7\3\b\5\b\u0088\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0094"+
		"\n\t\3\n\3\n\5\n\u0098\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a1"+
		"\n\13\3\13\3\13\3\13\3\13\6\13\u00a7\n\13\r\13\16\13\u00a8\3\13\3\13\5"+
		"\13\u00ad\n\13\3\f\6\f\u00b0\n\f\r\f\16\f\u00b1\3\r\3\r\3\r\5\r\u00b7"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u00bd\n\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00c4\n\17\3\20\3\20\5\20\u00c8\n\20\3\20\3\20\3\21\3\21\5\21\u00ce\n"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u00e0\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00e7\n\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27"+
		"\u00f6\n\27\f\27\16\27\u00f9\13\27\3\30\3\30\5\30\u00fd\n\30\3\30\3\30"+
		"\3\31\3\31\3\31\5\31\u0104\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u010e\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0117\n\31\3"+
		"\32\3\32\3\32\7\32\u011c\n\32\f\32\16\32\u011f\13\32\3\33\3\33\3\33\3"+
		"\33\5\33\u0125\n\33\3\34\3\34\3\34\3\34\5\34\u012b\n\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\5\37\u0138\n\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\5&\u0147\n&\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\n\3"+
		"\2./\3\2\f\r\4\2\4\4##\3\2\34 \3\2\"&\3\2\'(\3\2\"#\4\2\5\5//\2\u0152"+
		"\2Q\3\2\2\2\4b\3\2\2\2\6k\3\2\2\2\bm\3\2\2\2\nu\3\2\2\2\f\u0084\3\2\2"+
		"\2\16\u0087\3\2\2\2\20\u0093\3\2\2\2\22\u0095\3\2\2\2\24\u00ac\3\2\2\2"+
		"\26\u00af\3\2\2\2\30\u00b6\3\2\2\2\32\u00bc\3\2\2\2\34\u00c3\3\2\2\2\36"+
		"\u00c5\3\2\2\2 \u00cb\3\2\2\2\"\u00d2\3\2\2\2$\u00d6\3\2\2\2&\u00d9\3"+
		"\2\2\2(\u00e1\3\2\2\2*\u00eb\3\2\2\2,\u00f2\3\2\2\2.\u00fc\3\2\2\2\60"+
		"\u0116\3\2\2\2\62\u0118\3\2\2\2\64\u0124\3\2\2\2\66\u012a\3\2\2\28\u012c"+
		"\3\2\2\2:\u0130\3\2\2\2<\u0137\3\2\2\2>\u0139\3\2\2\2@\u013b\3\2\2\2B"+
		"\u013d\3\2\2\2D\u013f\3\2\2\2F\u0141\3\2\2\2H\u0143\3\2\2\2J\u0146\3\2"+
		"\2\2L\u014a\3\2\2\2NP\5(\25\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2"+
		"RT\3\2\2\2SQ\3\2\2\2TU\5*\26\2U\3\3\2\2\2VX\5@!\2WV\3\2\2\2WX\3\2\2\2"+
		"XY\3\2\2\2YZ\5> \2Z]\7.\2\2[\\\7!\2\2\\^\5&\24\2][\3\2\2\2]^\3\2\2\2^"+
		"c\3\2\2\2_`\5:\36\2`a\7.\2\2ac\3\2\2\2bW\3\2\2\2b_\3\2\2\2c\5\3\2\2\2"+
		"de\7.\2\2ef\7!\2\2fl\5&\24\2gh\5\b\5\2hi\7!\2\2ij\5&\24\2jl\3\2\2\2kd"+
		"\3\2\2\2kg\3\2\2\2l\7\3\2\2\2mn\7.\2\2no\7\30\2\2op\5&\24\2pq\7\31\2\2"+
		"q\t\3\2\2\2rv\5\16\b\2sv\5\24\13\2tv\5\f\7\2ur\3\2\2\2us\3\2\2\2ut\3\2"+
		"\2\2v\13\3\2\2\2wx\5$\23\2xy\5\36\20\2y\u0085\3\2\2\2z{\7\23\2\2{|\5\36"+
		"\20\2|}\5$\23\2}~\7+\2\2~\u0085\3\2\2\2\177\u0080\7\17\2\2\u0080\u0081"+
		"\7.\2\2\u0081\u0082\7\20\2\2\u0082\u0083\t\2\2\2\u0083\u0085\5\36\20\2"+
		"\u0084w\3\2\2\2\u0084z\3\2\2\2\u0084\177\3\2\2\2\u0085\r\3\2\2\2\u0086"+
		"\u0088\5\32\16\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008a\7+\2\2\u008a\17\3\2\2\2\u008b\u008c\7\t\2\2\u008c\u008d"+
		"\5&\24\2\u008d\u008e\7*\2\2\u008e\u008f\5\36\20\2\u008f\u0094\3\2\2\2"+
		"\u0090\u0091\7\n\2\2\u0091\u0092\7*\2\2\u0092\u0094\5\36\20\2\u0093\u008b"+
		"\3\2\2\2\u0093\u0090\3\2\2\2\u0094\21\3\2\2\2\u0095\u0097\7\25\2\2\u0096"+
		"\u0098\5\32\16\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u009a\7+\2\2\u009a\23\3\2\2\2\u009b\u009c\7\7\2\2\u009c\u009d"+
		"\5\"\22\2\u009d\u00a0\5\36\20\2\u009e\u009f\7\22\2\2\u009f\u00a1\5\36"+
		"\20\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ad\3\2\2\2\u00a2"+
		"\u00a3\7\b\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a6\7\32\2\2\u00a5\u00a7\5"+
		"\20\t\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ad\3"+
		"\2\2\2\u00ac\u009b\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ad\25\3\2\2\2\u00ae"+
		"\u00b0\5\30\r\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\27\3\2\2\2\u00b3\u00b7\5\n\6\2\u00b4"+
		"\u00b7\5\4\3\2\u00b5\u00b7\5\22\n\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3"+
		"\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00bd\5&\24\2\u00b9"+
		"\u00bd\5\6\4\2\u00ba\u00bd\5J&\2\u00bb\u00bd\7-\2\2\u00bc\u00b8\3\2\2"+
		"\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\33"+
		"\3\2\2\2\u00be\u00c4\5\60\31\2\u00bf\u00c4\7-\2\2\u00c0\u00c4\5J&\2\u00c1"+
		"\u00c4\7.\2\2\u00c2\u00c4\5\b\5\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2"+
		"\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00c7\7\32\2\2\u00c6\u00c8\5\26\f\2\u00c7\u00c6\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\33\2\2\u00ca"+
		"\37\3\2\2\2\u00cb\u00cd\7\32\2\2\u00cc\u00ce\5\26\f\2\u00cd\u00cc\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\22\n\2\u00d0"+
		"\u00d1\7\33\2\2\u00d1!\3\2\2\2\u00d2\u00d3\7\26\2\2\u00d3\u00d4\5\32\16"+
		"\2\u00d4\u00d5\7\27\2\2\u00d5#\3\2\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8"+
		"\5\"\22\2\u00d8%\3\2\2\2\u00d9\u00df\5\34\17\2\u00da\u00db\7)\2\2\u00db"+
		"\u00dc\5\32\16\2\u00dc\u00dd\7*\2\2\u00dd\u00de\5\32\16\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\'\3\2\2\2\u00e1"+
		"\u00e2\7\13\2\2\u00e2\u00e3\5<\37\2\u00e3\u00e4\7.\2\2\u00e4\u00e6\7\26"+
		"\2\2\u00e5\u00e7\5,\27\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\5 \21\2\u00ea)\3\2\2\2"+
		"\u00eb\u00ec\7\13\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef"+
		"\7\26\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\5 \21\2\u00f1+\3\2\2\2\u00f2"+
		"\u00f7\5.\30\2\u00f3\u00f4\7,\2\2\u00f4\u00f6\5.\30\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"-\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\5> \2\u00fb\u00fd\58\35\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7."+
		"\2\2\u00ff/\3\2\2\2\u0100\u0101\7\26\2\2\u0101\u0103\5\66\34\2\u0102\u0104"+
		"\5\62\32\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2"+
		"\u0105\u0106\7\27\2\2\u0106\u0117\3\2\2\2\u0107\u0108\7\26\2\2\u0108\u0109"+
		"\7\24\2\2\u0109\u010a\5\64\33\2\u010a\u010d\7,\2\2\u010b\u010e\5<\37\2"+
		"\u010c\u010e\58\35\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\7\27\2\2\u0110\u0117\3\2\2\2\u0111\u0112\7\26\2\2"+
		"\u0112\u0113\5B\"\2\u0113\u0114\5\64\33\2\u0114\u0115\7\27\2\2\u0115\u0117"+
		"\3\2\2\2\u0116\u0100\3\2\2\2\u0116\u0107\3\2\2\2\u0116\u0111\3\2\2\2\u0117"+
		"\61\3\2\2\2\u0118\u011d\5\64\33\2\u0119\u011a\7,\2\2\u011a\u011c\5\64"+
		"\33\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\63\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0125\7.\2\2"+
		"\u0121\u0125\5\60\31\2\u0122\u0125\7-\2\2\u0123\u0125\5L\'\2\u0124\u0120"+
		"\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\65\3\2\2\2\u0126\u012b\7.\2\2\u0127\u012b\5D#\2\u0128\u012b\5F$\2\u0129"+
		"\u012b\5H%\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2"+
		"\2\u012a\u0129\3\2\2\2\u012b\67\3\2\2\2\u012c\u012d\5> \2\u012d\u012e"+
		"\7\30\2\2\u012e\u012f\7\31\2\2\u012f9\3\2\2\2\u0130\u0131\5> \2\u0131"+
		"\u0132\7\30\2\2\u0132\u0133\7/\2\2\u0133\u0134\7\31\2\2\u0134;\3\2\2\2"+
		"\u0135\u0138\5> \2\u0136\u0138\7\16\2\2\u0137\u0135\3\2\2\2\u0137\u0136"+
		"\3\2\2\2\u0138=\3\2\2\2\u0139\u013a\t\3\2\2\u013a?\3\2\2\2\u013b\u013c"+
		"\7\6\2\2\u013cA\3\2\2\2\u013d\u013e\t\4\2\2\u013eC\3\2\2\2\u013f\u0140"+
		"\t\5\2\2\u0140E\3\2\2\2\u0141\u0142\t\6\2\2\u0142G\3\2\2\2\u0143\u0144"+
		"\t\7\2\2\u0144I\3\2\2\2\u0145\u0147\t\b\2\2\u0146\u0145\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\5L\'\2\u0149K\3\2\2\2\u014a"+
		"\u014b\t\t\2\2\u014bM\3\2\2\2!QW]bku\u0084\u0087\u0093\u0097\u00a0\u00a8"+
		"\u00ac\u00b1\u00b6\u00bc\u00c3\u00c7\u00cd\u00df\u00e6\u00f7\u00fc\u0103"+
		"\u010d\u0116\u011d\u0124\u012a\u0137\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}