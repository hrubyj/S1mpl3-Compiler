// Generated from /home/markovda/Skola/repos/simple/simple.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Const=5, If=6, Switch=7, Case=8, Default=9, 
		Func=10, Int=11, Bool=12, Void=13, For=14, In=15, While=16, Else=17, Do=18, 
		Instanceof=19, LeftParen=20, RightParen=21, LeftBracket=22, RightBracket=23, 
		LeftBrace=24, RightBrace=25, Less=26, LessEqual=27, Greater=28, GreaterEqual=29, 
		Equal=30, Plus=31, Minus=32, Star=33, Div=34, And=35, Or=36, Question=37, 
		Colon=38, Semi=39, Comma=40, BooleanLiteral=41, Identifier=42, NonzeroConstant=43, 
		DigitSequence=44, NonzeroDigitSequence=45, Whitespace=46, Newline=47;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_assignment = 2, RULE_statement = 3, 
		RULE_iterationStatement = 4, RULE_expressionStatement = 5, RULE_labeledStatement = 6, 
		RULE_jumpStatement = 7, RULE_selectionStatement = 8, RULE_blockItemList = 9, 
		RULE_blockItem = 10, RULE_expression = 11, RULE_nonVoidReturnValue = 12, 
		RULE_conditionalExpression = 13, RULE_functionDeclaration = 14, RULE_functionDeclParams = 15, 
		RULE_functionDeclParam = 16, RULE_functionCall = 17, RULE_functionCallParams = 18, 
		RULE_functionCallParam = 19, RULE_functionIdentifier = 20, RULE_arrayFunctionParamTypeSpecifier = 21, 
		RULE_arrayTypeSpecifier = 22, RULE_baseTypeSpecifier = 23, RULE_nonVoidTypeSpecifier = 24, 
		RULE_typeQualifier = 25, RULE_unaryOperator = 26, RULE_comparisonOperator = 27, 
		RULE_signedConstant = 28, RULE_decimalConstant = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "assignment", "statement", "iterationStatement", 
			"expressionStatement", "labeledStatement", "jumpStatement", "selectionStatement", 
			"blockItemList", "blockItem", "expression", "nonVoidReturnValue", "conditionalExpression", 
			"functionDeclaration", "functionDeclParams", "functionDeclParam", "functionCall", 
			"functionCallParams", "functionCallParam", "functionIdentifier", "arrayFunctionParamTypeSpecifier", 
			"arrayTypeSpecifier", "baseTypeSpecifier", "nonVoidTypeSpecifier", "typeQualifier", 
			"unaryOperator", "comparisonOperator", "signedConstant", "decimalConstant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'return'", "'!'", "'0'", "'const'", "'if'", "'switch'", 
			"'case'", "'default'", "'func'", "'int'", "'bool'", "'void'", "'for'", 
			"'in'", "'while'", "'else'", "'do'", "'instanceof'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'=='", "'+'", "'-'", 
			"'*'", "'/'", "'AND'", "'OR'", "'?'", "':'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Const", "If", "Switch", "Case", "Default", 
			"Func", "Int", "Bool", "Void", "For", "In", "While", "Else", "Do", "Instanceof", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "Equal", 
			"Plus", "Minus", "Star", "Div", "And", "Or", "Question", "Colon", "Semi", 
			"Comma", "BooleanLiteral", "Identifier", "NonzeroConstant", "DigitSequence", 
			"NonzeroDigitSequence", "Whitespace", "Newline"
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
	public String getGrammarFileName() { return "simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
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
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Func) {
				{
				{
				setState(60);
				functionDeclaration();
				}
				}
				setState(65);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public NonVoidTypeSpecifierContext nonVoidTypeSpecifier() {
			return getRuleContext(NonVoidTypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(simpleParser.Identifier, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public DecimalConstantContext decimalConstant() {
			return getRuleContext(DecimalConstantContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(simpleParser.BooleanLiteral, 0); }
		public TerminalNode Plus() { return getToken(simpleParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(simpleParser.Minus, 0); }
		public ArrayTypeSpecifierContext arrayTypeSpecifier() {
			return getRuleContext(ArrayTypeSpecifierContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				typeQualifier();
				setState(67);
				nonVoidTypeSpecifier();
				setState(68);
				match(Identifier);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(69);
					match(T__0);
					setState(76);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(70);
						functionCall();
						}
						break;
					case T__3:
					case Plus:
					case Minus:
					case NonzeroConstant:
						{
						setState(72);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Plus || _la==Minus) {
							{
							setState(71);
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

						setState(74);
						decimalConstant();
						}
						break;
					case BooleanLiteral:
						{
						setState(75);
						match(BooleanLiteral);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case Int:
			case Bool:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				arrayTypeSpecifier();
				setState(81);
				match(Identifier);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(simpleParser.Identifier, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SignedConstantContext signedConstant() {
			return getRuleContext(SignedConstantContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(simpleParser.BooleanLiteral, 0); }
		public TerminalNode LeftBracket() { return getToken(simpleParser.LeftBracket, 0); }
		public NonVoidReturnValueContext nonVoidReturnValue() {
			return getRuleContext(NonVoidReturnValueContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(simpleParser.RightBracket, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(Identifier);
				setState(86);
				match(T__0);
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(87);
					functionCall();
					}
					break;
				case T__3:
				case Plus:
				case Minus:
				case NonzeroConstant:
					{
					setState(88);
					signedConstant();
					}
					break;
				case BooleanLiteral:
					{
					setState(89);
					match(BooleanLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(Identifier);
				setState(93);
				match(LeftBracket);
				setState(94);
				nonVoidReturnValue();
				setState(95);
				match(RightBracket);
				setState(96);
				match(T__0);
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(97);
					functionCall();
					}
					break;
				case T__3:
				case Plus:
				case Minus:
				case NonzeroConstant:
					{
					setState(98);
					signedConstant();
					}
					break;
				case BooleanLiteral:
					{
					setState(99);
					match(BooleanLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case LeftParen:
			case Plus:
			case Minus:
			case Semi:
			case BooleanLiteral:
			case Identifier:
			case NonzeroConstant:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				expressionStatement();
				}
				break;
			case If:
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				selectionStatement();
				}
				break;
			case For:
			case While:
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
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
		public TerminalNode While() { return getToken(simpleParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(simpleParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(simpleParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(simpleParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(simpleParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public TerminalNode Do() { return getToken(simpleParser.Do, 0); }
		public TerminalNode Semi() { return getToken(simpleParser.Semi, 0); }
		public TerminalNode For() { return getToken(simpleParser.For, 0); }
		public List<TerminalNode> Identifier() { return getTokens(simpleParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(simpleParser.Identifier, i);
		}
		public TerminalNode In() { return getToken(simpleParser.In, 0); }
		public TerminalNode NonzeroConstant() { return getToken(simpleParser.NonzeroConstant, 0); }
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iterationStatement);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(While);
				setState(110);
				match(LeftParen);
				setState(111);
				expression();
				setState(112);
				match(RightParen);
				setState(113);
				match(LeftBrace);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Const) | (1L << If) | (1L << Switch) | (1L << Int) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Semi) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
					{
					setState(114);
					blockItemList();
					}
				}

				setState(117);
				match(RightBrace);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(Do);
				setState(120);
				match(LeftBrace);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Const) | (1L << If) | (1L << Switch) | (1L << Int) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Semi) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
					{
					setState(121);
					blockItemList();
					}
				}

				setState(124);
				match(RightBrace);
				setState(125);
				match(While);
				setState(126);
				match(LeftParen);
				setState(127);
				expression();
				setState(128);
				match(RightParen);
				setState(129);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(For);
				setState(132);
				match(Identifier);
				setState(133);
				match(In);
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==NonzeroConstant) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				match(LeftBrace);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Const) | (1L << If) | (1L << Switch) | (1L << Int) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Semi) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
					{
					setState(136);
					blockItemList();
					}
				}

				setState(139);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(simpleParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
				{
				setState(142);
				expression();
				}
			}

			setState(145);
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
		public TerminalNode Case() { return getToken(simpleParser.Case, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(simpleParser.Colon, 0); }
		public TerminalNode LeftBrace() { return getToken(simpleParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(simpleParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public TerminalNode Default() { return getToken(simpleParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_labeledStatement);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(Case);
				setState(148);
				conditionalExpression();
				setState(149);
				match(Colon);
				setState(150);
				match(LeftBrace);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Const) | (1L << If) | (1L << Switch) | (1L << Int) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Semi) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
					{
					setState(151);
					blockItemList();
					}
				}

				setState(154);
				match(RightBrace);
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(Default);
				setState(157);
				match(Colon);
				setState(158);
				match(LeftBrace);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Const) | (1L << If) | (1L << Switch) | (1L << Int) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Semi) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
					{
					setState(159);
					blockItemList();
					}
				}

				setState(162);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(simpleParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__1);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
				{
				setState(166);
				expression();
				}
			}

			setState(169);
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
		public TerminalNode If() { return getToken(simpleParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(simpleParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(simpleParser.RightParen, 0); }
		public List<TerminalNode> LeftBrace() { return getTokens(simpleParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(simpleParser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(simpleParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(simpleParser.RightBrace, i);
		}
		public List<BlockItemListContext> blockItemList() {
			return getRuleContexts(BlockItemListContext.class);
		}
		public BlockItemListContext blockItemList(int i) {
			return getRuleContext(BlockItemListContext.class,i);
		}
		public TerminalNode Else() { return getToken(simpleParser.Else, 0); }
		public TerminalNode Switch() { return getToken(simpleParser.Switch, 0); }
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
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectionStatement);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(If);
				setState(172);
				match(LeftParen);
				setState(173);
				expression();
				setState(174);
				match(RightParen);
				setState(175);
				match(LeftBrace);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Const) | (1L << If) | (1L << Switch) | (1L << Int) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Semi) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
					{
					setState(176);
					blockItemList();
					}
				}

				setState(179);
				match(RightBrace);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(180);
					match(Else);
					setState(181);
					match(LeftBrace);
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << Const) | (1L << If) | (1L << Switch) | (1L << Int) | (1L << Bool) | (1L << For) | (1L << While) | (1L << Do) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Semi) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
						{
						setState(182);
						blockItemList();
						}
					}

					setState(185);
					match(RightBrace);
					}
				}

				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(Switch);
				setState(189);
				match(LeftParen);
				setState(190);
				expression();
				setState(191);
				match(RightParen);
				setState(192);
				match(LeftBrace);
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(193);
					labeledStatement();
					}
					}
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Case || _la==Default );
				setState(198);
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
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(202);
					blockItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockItem);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
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
				setState(207);
				statement();
				}
				break;
			case Const:
			case Int:
			case Bool:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				declaration();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				jumpStatement();
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
		public TerminalNode BooleanLiteral() { return getToken(simpleParser.BooleanLiteral, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				signedConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
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
		public TerminalNode BooleanLiteral() { return getToken(simpleParser.BooleanLiteral, 0); }
		public SignedConstantContext signedConstant() {
			return getRuleContext(SignedConstantContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(simpleParser.Identifier, 0); }
		public NonVoidReturnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonVoidReturnValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterNonVoidReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitNonVoidReturnValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitNonVoidReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonVoidReturnValueContext nonVoidReturnValue() throws RecognitionException {
		NonVoidReturnValueContext _localctx = new NonVoidReturnValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nonVoidReturnValue);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				functionCall();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(BooleanLiteral);
				}
				break;
			case T__3:
			case Plus:
			case Minus:
			case NonzeroConstant:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				signedConstant();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(Identifier);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public NonVoidReturnValueContext nonVoidReturnValue() {
			return getRuleContext(NonVoidReturnValueContext.class,0);
		}
		public TerminalNode Question() { return getToken(simpleParser.Question, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(simpleParser.Colon, 0); }
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			nonVoidReturnValue();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(225);
				match(Question);
				setState(226);
				expression();
				setState(227);
				match(Colon);
				setState(228);
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
		public TerminalNode Func() { return getToken(simpleParser.Func, 0); }
		public BaseTypeSpecifierContext baseTypeSpecifier() {
			return getRuleContext(BaseTypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(simpleParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(simpleParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(simpleParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(simpleParser.LeftBrace, 0); }
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(simpleParser.RightBrace, 0); }
		public FunctionDeclParamsContext functionDeclParams() {
			return getRuleContext(FunctionDeclParamsContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(Func);
			setState(233);
			baseTypeSpecifier();
			setState(234);
			match(Identifier);
			setState(235);
			match(LeftParen);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Int || _la==Bool) {
				{
				setState(236);
				functionDeclParams();
				}
			}

			setState(239);
			match(RightParen);
			setState(240);
			match(LeftBrace);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(241);
				blockItemList();
				}
				break;
			}
			setState(244);
			jumpStatement();
			setState(245);
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

	public static class FunctionDeclParamsContext extends ParserRuleContext {
		public List<FunctionDeclParamContext> functionDeclParam() {
			return getRuleContexts(FunctionDeclParamContext.class);
		}
		public FunctionDeclParamContext functionDeclParam(int i) {
			return getRuleContext(FunctionDeclParamContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(simpleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(simpleParser.Comma, i);
		}
		public FunctionDeclParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionDeclParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionDeclParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionDeclParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclParamsContext functionDeclParams() throws RecognitionException {
		FunctionDeclParamsContext _localctx = new FunctionDeclParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			functionDeclParam();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(248);
				match(Comma);
				setState(249);
				functionDeclParam();
				}
				}
				setState(254);
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
		public TerminalNode Identifier() { return getToken(simpleParser.Identifier, 0); }
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
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionDeclParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionDeclParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionDeclParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclParamContext functionDeclParam() throws RecognitionException {
		FunctionDeclParamContext _localctx = new FunctionDeclParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionDeclParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(255);
				nonVoidTypeSpecifier();
				}
				break;
			case 2:
				{
				setState(256);
				arrayFunctionParamTypeSpecifier();
				}
				break;
			}
			setState(259);
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
		public TerminalNode LeftParen() { return getToken(simpleParser.LeftParen, 0); }
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(simpleParser.RightParen, 0); }
		public FunctionCallParamsContext functionCallParams() {
			return getRuleContext(FunctionCallParamsContext.class,0);
		}
		public TerminalNode Instanceof() { return getToken(simpleParser.Instanceof, 0); }
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public TerminalNode Comma() { return getToken(simpleParser.Comma, 0); }
		public BaseTypeSpecifierContext baseTypeSpecifier() {
			return getRuleContext(BaseTypeSpecifierContext.class,0);
		}
		public ArrayFunctionParamTypeSpecifierContext arrayFunctionParamTypeSpecifier() {
			return getRuleContext(ArrayFunctionParamTypeSpecifierContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(LeftParen);
				setState(262);
				functionIdentifier();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << LeftParen) | (1L << BooleanLiteral) | (1L << Identifier) | (1L << NonzeroConstant))) != 0)) {
					{
					setState(263);
					functionCallParams();
					}
				}

				setState(266);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(LeftParen);
				setState(269);
				match(Instanceof);
				setState(270);
				functionCallParam();
				setState(271);
				match(Comma);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(272);
					baseTypeSpecifier();
					}
					break;
				case 2:
					{
					setState(273);
					arrayFunctionParamTypeSpecifier();
					}
					break;
				}
				setState(276);
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
		public List<TerminalNode> Comma() { return getTokens(simpleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(simpleParser.Comma, i);
		}
		public FunctionCallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParamsContext functionCallParams() throws RecognitionException {
		FunctionCallParamsContext _localctx = new FunctionCallParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionCallParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			functionCallParam();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(281);
				match(Comma);
				setState(282);
				functionCallParam();
				}
				}
				setState(287);
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
		public TerminalNode Identifier() { return getToken(simpleParser.Identifier, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(simpleParser.BooleanLiteral, 0); }
		public DecimalConstantContext decimalConstant() {
			return getRuleContext(DecimalConstantContext.class,0);
		}
		public FunctionCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionCallParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallParamContext functionCallParam() throws RecognitionException {
		FunctionCallParamContext _localctx = new FunctionCallParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCallParam);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(Identifier);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				functionCall();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(BooleanLiteral);
				}
				break;
			case T__3:
			case NonzeroConstant:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
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
		public TerminalNode Identifier() { return getToken(simpleParser.Identifier, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionIdentifier);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
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
				setState(295);
				comparisonOperator();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				unaryOperator();
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
		public TerminalNode LeftBracket() { return getToken(simpleParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(simpleParser.RightBracket, 0); }
		public ArrayFunctionParamTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayFunctionParamTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterArrayFunctionParamTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitArrayFunctionParamTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitArrayFunctionParamTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayFunctionParamTypeSpecifierContext arrayFunctionParamTypeSpecifier() throws RecognitionException {
		ArrayFunctionParamTypeSpecifierContext _localctx = new ArrayFunctionParamTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayFunctionParamTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			nonVoidTypeSpecifier();
			setState(300);
			match(LeftBracket);
			setState(301);
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
		public TerminalNode LeftBracket() { return getToken(simpleParser.LeftBracket, 0); }
		public TerminalNode NonzeroConstant() { return getToken(simpleParser.NonzeroConstant, 0); }
		public TerminalNode RightBracket() { return getToken(simpleParser.RightBracket, 0); }
		public ArrayTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterArrayTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitArrayTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitArrayTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeSpecifierContext arrayTypeSpecifier() throws RecognitionException {
		ArrayTypeSpecifierContext _localctx = new ArrayTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			nonVoidTypeSpecifier();
			setState(304);
			match(LeftBracket);
			setState(305);
			match(NonzeroConstant);
			setState(306);
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
		public TerminalNode Void() { return getToken(simpleParser.Void, 0); }
		public BaseTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterBaseTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitBaseTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitBaseTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeSpecifierContext baseTypeSpecifier() throws RecognitionException {
		BaseTypeSpecifierContext _localctx = new BaseTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_baseTypeSpecifier);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				nonVoidTypeSpecifier();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
		public TerminalNode Int() { return getToken(simpleParser.Int, 0); }
		public TerminalNode Bool() { return getToken(simpleParser.Bool, 0); }
		public NonVoidTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonVoidTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterNonVoidTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitNonVoidTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitNonVoidTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonVoidTypeSpecifierContext nonVoidTypeSpecifier() throws RecognitionException {
		NonVoidTypeSpecifierContext _localctx = new NonVoidTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nonVoidTypeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
		public TerminalNode Const() { return getToken(simpleParser.Const, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__2);
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
		public TerminalNode Less() { return getToken(simpleParser.Less, 0); }
		public TerminalNode LessEqual() { return getToken(simpleParser.LessEqual, 0); }
		public TerminalNode Greater() { return getToken(simpleParser.Greater, 0); }
		public TerminalNode GreaterEqual() { return getToken(simpleParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(simpleParser.Equal, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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

	public static class SignedConstantContext extends ParserRuleContext {
		public DecimalConstantContext decimalConstant() {
			return getRuleContext(DecimalConstantContext.class,0);
		}
		public TerminalNode Plus() { return getToken(simpleParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(simpleParser.Minus, 0); }
		public SignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterSignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitSignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitSignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedConstantContext signedConstant() throws RecognitionException {
		SignedConstantContext _localctx = new SignedConstantContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_signedConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(320);
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

			setState(323);
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
		public TerminalNode NonzeroConstant() { return getToken(simpleParser.NonzeroConstant, 0); }
		public DecimalConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).enterDecimalConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleListener ) ((simpleListener)listener).exitDecimalConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleVisitor ) return ((simpleVisitor<? extends T>)visitor).visitDecimalConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalConstantContext decimalConstant() throws RecognitionException {
		DecimalConstantContext _localctx = new DecimalConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_decimalConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==NonzeroConstant) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u014a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\5\3O\n\3"+
		"\5\3Q\n\3\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4g\n\4\5\4i\n\4\3\5\3\5\3\5\5\5n\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6v\n\6\3\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008c\n\6\3\6\5\6\u008f\n\6\3"+
		"\7\5\7\u0092\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u009b\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00a3\n\b\3\b\5\b\u00a6\n\b\3\t\3\t\5\t\u00aa\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\n\3\n\3\n\3\n\5\n\u00ba\n"+
		"\n\3\n\5\n\u00bd\n\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00c5\n\n\r\n\16\n\u00c6"+
		"\3\n\3\n\5\n\u00cb\n\n\3\13\6\13\u00ce\n\13\r\13\16\13\u00cf\3\f\3\f\3"+
		"\f\5\f\u00d5\n\f\3\r\3\r\3\r\3\r\5\r\u00db\n\r\3\16\3\16\3\16\3\16\5\16"+
		"\u00e1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e9\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00f0\n\20\3\20\3\20\3\20\5\20\u00f5\n\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u00fd\n\21\f\21\16\21\u0100\13\21\3\22\3\22"+
		"\5\22\u0104\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u010b\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u0115\n\23\3\23\3\23\5\23\u0119\n\23"+
		"\3\24\3\24\3\24\7\24\u011e\n\24\f\24\16\24\u0121\13\24\3\25\3\25\3\25"+
		"\3\25\5\25\u0127\n\25\3\26\3\26\3\26\5\26\u012c\n\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u0139\n\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\5\36\u0144\n\36\3\36\3\36\3\37\3\37\3\37"+
		"\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2"+
		"\7\3\2!\"\3\2,-\3\2\r\16\3\2\34 \4\2\6\6--\2\u0160\2A\3\2\2\2\4U\3\2\2"+
		"\2\6h\3\2\2\2\bm\3\2\2\2\n\u008e\3\2\2\2\f\u0091\3\2\2\2\16\u00a5\3\2"+
		"\2\2\20\u00a7\3\2\2\2\22\u00ca\3\2\2\2\24\u00cd\3\2\2\2\26\u00d4\3\2\2"+
		"\2\30\u00da\3\2\2\2\32\u00e0\3\2\2\2\34\u00e2\3\2\2\2\36\u00ea\3\2\2\2"+
		" \u00f9\3\2\2\2\"\u0103\3\2\2\2$\u0118\3\2\2\2&\u011a\3\2\2\2(\u0126\3"+
		"\2\2\2*\u012b\3\2\2\2,\u012d\3\2\2\2.\u0131\3\2\2\2\60\u0138\3\2\2\2\62"+
		"\u013a\3\2\2\2\64\u013c\3\2\2\2\66\u013e\3\2\2\28\u0140\3\2\2\2:\u0143"+
		"\3\2\2\2<\u0147\3\2\2\2>@\5\36\20\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2B\3\3\2\2\2CA\3\2\2\2DE\5\64\33\2EF\5\62\32\2FP\7,\2\2GN\7\3\2\2"+
		"HO\5$\23\2IK\t\2\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LO\5<\37\2MO\7+\2\2"+
		"NH\3\2\2\2NJ\3\2\2\2NM\3\2\2\2OQ\3\2\2\2PG\3\2\2\2PQ\3\2\2\2QV\3\2\2\2"+
		"RS\5.\30\2ST\7,\2\2TV\3\2\2\2UD\3\2\2\2UR\3\2\2\2V\5\3\2\2\2WX\7,\2\2"+
		"X\\\7\3\2\2Y]\5$\23\2Z]\5:\36\2[]\7+\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2"+
		"\2\2]i\3\2\2\2^_\7,\2\2_`\7\30\2\2`a\5\32\16\2ab\7\31\2\2bf\7\3\2\2cg"+
		"\5$\23\2dg\5:\36\2eg\7+\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2gi\3\2\2\2hW"+
		"\3\2\2\2h^\3\2\2\2i\7\3\2\2\2jn\5\f\7\2kn\5\22\n\2ln\5\n\6\2mj\3\2\2\2"+
		"mk\3\2\2\2ml\3\2\2\2n\t\3\2\2\2op\7\22\2\2pq\7\26\2\2qr\5\30\r\2rs\7\27"+
		"\2\2su\7\32\2\2tv\5\24\13\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\33\2\2x"+
		"\u008f\3\2\2\2yz\7\24\2\2z|\7\32\2\2{}\5\24\13\2|{\3\2\2\2|}\3\2\2\2}"+
		"~\3\2\2\2~\177\7\33\2\2\177\u0080\7\22\2\2\u0080\u0081\7\26\2\2\u0081"+
		"\u0082\5\30\r\2\u0082\u0083\7\27\2\2\u0083\u0084\7)\2\2\u0084\u008f\3"+
		"\2\2\2\u0085\u0086\7\20\2\2\u0086\u0087\7,\2\2\u0087\u0088\7\21\2\2\u0088"+
		"\u0089\t\3\2\2\u0089\u008b\7\32\2\2\u008a\u008c\5\24\13\2\u008b\u008a"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7\33\2\2"+
		"\u008eo\3\2\2\2\u008ey\3\2\2\2\u008e\u0085\3\2\2\2\u008f\13\3\2\2\2\u0090"+
		"\u0092\5\30\r\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0094\7)\2\2\u0094\r\3\2\2\2\u0095\u0096\7\n\2\2\u0096\u0097"+
		"\5\34\17\2\u0097\u0098\7(\2\2\u0098\u009a\7\32\2\2\u0099\u009b\5\24\13"+
		"\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\7\33\2\2\u009d\u00a6\3\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a0\7(\2\2"+
		"\u00a0\u00a2\7\32\2\2\u00a1\u00a3\5\24\13\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\33\2\2\u00a5\u0095\3"+
		"\2\2\2\u00a5\u009e\3\2\2\2\u00a6\17\3\2\2\2\u00a7\u00a9\7\4\2\2\u00a8"+
		"\u00aa\5\30\r\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00ac\7)\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00af"+
		"\7\26\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\7\27\2\2\u00b1\u00b3\7\32\2"+
		"\2\u00b2\u00b4\5\24\13\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00bc\7\33\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00b9\7"+
		"\32\2\2\u00b8\u00ba\5\24\13\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00bd\7\33\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00cb\3\2\2\2\u00be\u00bf\7\t\2\2\u00bf\u00c0\7\26\2\2"+
		"\u00c0\u00c1\5\30\r\2\u00c1\u00c2\7\27\2\2\u00c2\u00c4\7\32\2\2\u00c3"+
		"\u00c5\5\16\b\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\33\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00ad\3\2\2\2\u00ca\u00be\3\2\2\2\u00cb\23\3\2\2"+
		"\2\u00cc\u00ce\5\26\f\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\25\3\2\2\2\u00d1\u00d5\5\b\5"+
		"\2\u00d2\u00d5\5\4\3\2\u00d3\u00d5\5\20\t\2\u00d4\u00d1\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\27\3\2\2\2\u00d6\u00db\5\34\17"+
		"\2\u00d7\u00db\5\6\4\2\u00d8\u00db\5:\36\2\u00d9\u00db\7+\2\2\u00da\u00d6"+
		"\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\31\3\2\2\2\u00dc\u00e1\5$\23\2\u00dd\u00e1\7+\2\2\u00de\u00e1\5:\36\2"+
		"\u00df\u00e1\7,\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\33\3\2\2\2\u00e2\u00e8\5\32\16\2\u00e3"+
		"\u00e4\7\'\2\2\u00e4\u00e5\5\30\r\2\u00e5\u00e6\7(\2\2\u00e6\u00e7\5\30"+
		"\r\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\35\3\2\2\2\u00ea\u00eb\7\f\2\2\u00eb\u00ec\5\60\31\2\u00ec\u00ed\7,\2"+
		"\2\u00ed\u00ef\7\26\2\2\u00ee\u00f0\5 \21\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\27\2\2\u00f2\u00f4\7"+
		"\32\2\2\u00f3\u00f5\5\24\13\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5\20\t\2\u00f7\u00f8\7\33\2\2\u00f8\37"+
		"\3\2\2\2\u00f9\u00fe\5\"\22\2\u00fa\u00fb\7*\2\2\u00fb\u00fd\5\"\22\2"+
		"\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff!\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0104\5\62\32\2\u0102"+
		"\u0104\5,\27\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\7,\2\2\u0106#\3\2\2\2\u0107\u0108\7\26\2\2\u0108\u010a"+
		"\5*\26\2\u0109\u010b\5&\24\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\7\27\2\2\u010d\u0119\3\2\2\2\u010e\u010f\7"+
		"\26\2\2\u010f\u0110\7\25\2\2\u0110\u0111\5(\25\2\u0111\u0114\7*\2\2\u0112"+
		"\u0115\5\60\31\2\u0113\u0115\5,\27\2\u0114\u0112\3\2\2\2\u0114\u0113\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\27\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0107\3\2\2\2\u0118\u010e\3\2\2\2\u0119%\3\2\2\2\u011a\u011f\5(\25\2"+
		"\u011b\u011c\7*\2\2\u011c\u011e\5(\25\2\u011d\u011b\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\'\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0127\7,\2\2\u0123\u0127\5$\23\2\u0124\u0127\7+\2"+
		"\2\u0125\u0127\5<\37\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0125\3\2\2\2\u0127)\3\2\2\2\u0128\u012c\7,\2\2\u0129\u012c"+
		"\58\35\2\u012a\u012c\5\66\34\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012a\3\2\2\2\u012c+\3\2\2\2\u012d\u012e\5\62\32\2\u012e\u012f"+
		"\7\30\2\2\u012f\u0130\7\31\2\2\u0130-\3\2\2\2\u0131\u0132\5\62\32\2\u0132"+
		"\u0133\7\30\2\2\u0133\u0134\7-\2\2\u0134\u0135\7\31\2\2\u0135/\3\2\2\2"+
		"\u0136\u0139\5\62\32\2\u0137\u0139\7\17\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\61\3\2\2\2\u013a\u013b\t\4\2\2\u013b\63\3\2\2\2\u013c"+
		"\u013d\7\7\2\2\u013d\65\3\2\2\2\u013e\u013f\7\5\2\2\u013f\67\3\2\2\2\u0140"+
		"\u0141\t\5\2\2\u01419\3\2\2\2\u0142\u0144\t\2\2\2\u0143\u0142\3\2\2\2"+
		"\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\5<\37\2\u0146;\3"+
		"\2\2\2\u0147\u0148\t\6\2\2\u0148=\3\2\2\2*AJNPU\\fhmu|\u008b\u008e\u0091"+
		"\u009a\u00a2\u00a5\u00a9\u00b3\u00b9\u00bc\u00c6\u00ca\u00cf\u00d4\u00da"+
		"\u00e0\u00e8\u00ef\u00f4\u00fe\u0103\u010a\u0114\u0118\u011f\u0126\u012b"+
		"\u0138\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}