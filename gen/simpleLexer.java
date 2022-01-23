// Generated from /home/markovda/Skola/repos/simple/simple.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "Const", "If", "Switch", "Case", "Default", 
			"Func", "Int", "Bool", "Void", "For", "In", "While", "Else", "Do", "Instanceof", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "Equal", 
			"Plus", "Minus", "Star", "Div", "And", "Or", "Question", "Colon", "Semi", 
			"Comma", "BooleanLiteral", "Identifier", "Nondigit", "Digit", "NonzeroDigit", 
			"NonzeroConstant", "DigitSequence", "NonzeroDigitSequence", "Sign", "Whitespace", 
			"Newline"
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


	public simpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0131\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\5*\u0100\n*\3+\3+\7+\u0104\n+\f+\16+\u0107\13+\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\7/\u0111\n/\f/\16/\u0114\13/\3\60\6\60\u0117\n\60\r"+
		"\60\16\60\u0118\3\61\6\61\u011c\n\61\r\61\16\61\u011d\3\62\3\62\3\63\6"+
		"\63\u0123\n\63\r\63\16\63\u0124\3\63\3\63\3\64\3\64\5\64\u012b\n\64\3"+
		"\64\5\64\u012e\n\64\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y\2"+
		"[\2]-_.a/c\2e\60g\61\3\2\7\4\2C\\c|\3\2\62;\3\2\63;\4\2--//\4\2\13\13"+
		"\"\"\2\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7r\3\2\2\2\tt\3\2\2\2\13v\3\2\2\2\r|\3\2"+
		"\2\2\17\177\3\2\2\2\21\u0086\3\2\2\2\23\u008b\3\2\2\2\25\u0093\3\2\2\2"+
		"\27\u0098\3\2\2\2\31\u009c\3\2\2\2\33\u00a1\3\2\2\2\35\u00a6\3\2\2\2\37"+
		"\u00aa\3\2\2\2!\u00ad\3\2\2\2#\u00b3\3\2\2\2%\u00b8\3\2\2\2\'\u00bb\3"+
		"\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61"+
		"\u00ce\3\2\2\2\63\u00d0\3\2\2\2\65\u00d2\3\2\2\2\67\u00d4\3\2\2\29\u00d7"+
		"\3\2\2\2;\u00d9\3\2\2\2=\u00dc\3\2\2\2?\u00df\3\2\2\2A\u00e1\3\2\2\2C"+
		"\u00e3\3\2\2\2E\u00e5\3\2\2\2G\u00e7\3\2\2\2I\u00eb\3\2\2\2K\u00ee\3\2"+
		"\2\2M\u00f0\3\2\2\2O\u00f2\3\2\2\2Q\u00f4\3\2\2\2S\u00ff\3\2\2\2U\u0101"+
		"\3\2\2\2W\u0108\3\2\2\2Y\u010a\3\2\2\2[\u010c\3\2\2\2]\u010e\3\2\2\2_"+
		"\u0116\3\2\2\2a\u011b\3\2\2\2c\u011f\3\2\2\2e\u0122\3\2\2\2g\u012d\3\2"+
		"\2\2ij\7?\2\2j\4\3\2\2\2kl\7t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2op\7t\2\2"+
		"pq\7p\2\2q\6\3\2\2\2rs\7#\2\2s\b\3\2\2\2tu\7\62\2\2u\n\3\2\2\2vw\7e\2"+
		"\2wx\7q\2\2xy\7p\2\2yz\7u\2\2z{\7v\2\2{\f\3\2\2\2|}\7k\2\2}~\7h\2\2~\16"+
		"\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7y\2\2\u0081\u0082\7k\2\2\u0082"+
		"\u0083\7v\2\2\u0083\u0084\7e\2\2\u0084\u0085\7j\2\2\u0085\20\3\2\2\2\u0086"+
		"\u0087\7e\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2"+
		"\u008a\22\3\2\2\2\u008b\u008c\7f\2\2\u008c\u008d\7g\2\2\u008d\u008e\7"+
		"h\2\2\u008e\u008f\7c\2\2\u008f\u0090\7w\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7v\2\2\u0092\24\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7w\2\2\u0095\u0096"+
		"\7p\2\2\u0096\u0097\7e\2\2\u0097\26\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7p\2\2\u009a\u009b\7v\2\2\u009b\30\3\2\2\2\u009c\u009d\7d\2\2\u009d\u009e"+
		"\7q\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7n\2\2\u00a0\32\3\2\2\2\u00a1\u00a2"+
		"\7x\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7f\2\2\u00a5"+
		"\34\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\36\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac \3\2\2\2\u00ad"+
		"\u00ae\7y\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7n\2\2"+
		"\u00b1\u00b2\7g\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7n"+
		"\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7$\3\2\2\2\u00b8\u00b9"+
		"\7f\2\2\u00b9\u00ba\7q\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7q\2\2"+
		"\u00c4\u00c5\7h\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7*\3\2\2\2\u00c8"+
		"\u00c9\7+\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7]\2\2\u00cb.\3\2\2\2\u00cc\u00cd"+
		"\7_\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7}\2\2\u00cf\62\3\2\2\2\u00d0\u00d1"+
		"\7\177\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\66\3\2\2\2\u00d4"+
		"\u00d5\7>\2\2\u00d5\u00d6\7?\2\2\u00d68\3\2\2\2\u00d7\u00d8\7@\2\2\u00d8"+
		":\3\2\2\2\u00d9\u00da\7@\2\2\u00da\u00db\7?\2\2\u00db<\3\2\2\2\u00dc\u00dd"+
		"\7?\2\2\u00dd\u00de\7?\2\2\u00de>\3\2\2\2\u00df\u00e0\7-\2\2\u00e0@\3"+
		"\2\2\2\u00e1\u00e2\7/\2\2\u00e2B\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4D\3\2"+
		"\2\2\u00e5\u00e6\7\61\2\2\u00e6F\3\2\2\2\u00e7\u00e8\7C\2\2\u00e8\u00e9"+
		"\7P\2\2\u00e9\u00ea\7F\2\2\u00eaH\3\2\2\2\u00eb\u00ec\7Q\2\2\u00ec\u00ed"+
		"\7T\2\2\u00edJ\3\2\2\2\u00ee\u00ef\7A\2\2\u00efL\3\2\2\2\u00f0\u00f1\7"+
		"<\2\2\u00f1N\3\2\2\2\u00f2\u00f3\7=\2\2\u00f3P\3\2\2\2\u00f4\u00f5\7."+
		"\2\2\u00f5R\3\2\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9"+
		"\7w\2\2\u00f9\u0100\7g\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7c\2\2\u00fc"+
		"\u00fd\7n\2\2\u00fd\u00fe\7u\2\2\u00fe\u0100\7g\2\2\u00ff\u00f6\3\2\2"+
		"\2\u00ff\u00fa\3\2\2\2\u0100T\3\2\2\2\u0101\u0105\5W,\2\u0102\u0104\5"+
		"W,\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106V\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\t\2\2\2"+
		"\u0109X\3\2\2\2\u010a\u010b\t\3\2\2\u010bZ\3\2\2\2\u010c\u010d\t\4\2\2"+
		"\u010d\\\3\2\2\2\u010e\u0112\5[.\2\u010f\u0111\5Y-\2\u0110\u010f\3\2\2"+
		"\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113^"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\5Y-\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119`\3\2\2\2"+
		"\u011a\u011c\5[.\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011eb\3\2\2\2\u011f\u0120\t\5\2\2\u0120"+
		"d\3\2\2\2\u0121\u0123\t\6\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127"+
		"\b\63\2\2\u0127f\3\2\2\2\u0128\u012a\7\17\2\2\u0129\u012b\7\f\2\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012e\7\f"+
		"\2\2\u012d\u0128\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\b\64\2\2\u0130h\3\2\2\2\13\2\u00ff\u0105\u0112\u0118\u011d\u0124"+
		"\u012a\u012d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}