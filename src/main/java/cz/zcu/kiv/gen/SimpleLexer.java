package cz.zcu.kiv.gen;// Generated from /home/markovda/Skola/repos/simple/src/main/resources/Simple.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Const", "If", "Switch", "Case", "Default", "Func", 
			"Int", "Bool", "Void", "For", "In", "While", "Else", "Do", "Instanceof", 
			"Return", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "Equal", 
			"EqualSign", "Plus", "Minus", "Star", "Div", "Mod", "And", "Or", "Question", 
			"Colon", "Semi", "Comma", "BooleanLiteral", "Identifier", "Nondigit", 
			"Digit", "NonzeroDigit", "NonzeroConstant", "DigitSequence", "NonzeroDigitSequence", 
			"Sign", "Whitespace", "Newline"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u013c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u010b"+
		"\n,\3-\3-\7-\u010f\n-\f-\16-\u0112\13-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\7\61\u011c\n\61\f\61\16\61\u011f\13\61\3\62\6\62\u0122\n\62\r\62\16\62"+
		"\u0123\3\63\6\63\u0127\n\63\r\63\16\63\u0128\3\64\3\64\3\65\6\65\u012e"+
		"\n\65\r\65\16\65\u012f\3\65\3\65\3\66\3\66\5\66\u0136\n\66\3\66\5\66\u0139"+
		"\n\66\3\66\3\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2_\2a/c\60e\61"+
		"g\2i\62k\63\3\2\7\4\2C\\c|\3\2\62;\3\2\63;\4\2--//\4\2\13\13\"\"\2\u013f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2i\3"+
		"\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5r\3\2\2\2\7t\3\2\2\2\tv\3\2\2\2\13|\3\2"+
		"\2\2\r\177\3\2\2\2\17\u0086\3\2\2\2\21\u008b\3\2\2\2\23\u0093\3\2\2\2"+
		"\25\u0098\3\2\2\2\27\u009c\3\2\2\2\31\u00a1\3\2\2\2\33\u00a6\3\2\2\2\35"+
		"\u00aa\3\2\2\2\37\u00ad\3\2\2\2!\u00b3\3\2\2\2#\u00b8\3\2\2\2%\u00bb\3"+
		"\2\2\2\'\u00c6\3\2\2\2)\u00cd\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3\2\2\2/\u00d3"+
		"\3\2\2\2\61\u00d5\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9\3\2\2\2\67\u00db\3"+
		"\2\2\29\u00de\3\2\2\2;\u00e0\3\2\2\2=\u00e3\3\2\2\2?\u00e6\3\2\2\2A\u00e8"+
		"\3\2\2\2C\u00ea\3\2\2\2E\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00f0\3\2\2\2K"+
		"\u00f2\3\2\2\2M\u00f6\3\2\2\2O\u00f9\3\2\2\2Q\u00fb\3\2\2\2S\u00fd\3\2"+
		"\2\2U\u00ff\3\2\2\2W\u010a\3\2\2\2Y\u010c\3\2\2\2[\u0113\3\2\2\2]\u0115"+
		"\3\2\2\2_\u0117\3\2\2\2a\u0119\3\2\2\2c\u0121\3\2\2\2e\u0126\3\2\2\2g"+
		"\u012a\3\2\2\2i\u012d\3\2\2\2k\u0138\3\2\2\2mn\7o\2\2no\7c\2\2op\7k\2"+
		"\2pq\7p\2\2q\4\3\2\2\2rs\7#\2\2s\6\3\2\2\2tu\7\62\2\2u\b\3\2\2\2vw\7e"+
		"\2\2wx\7q\2\2xy\7p\2\2yz\7u\2\2z{\7v\2\2{\n\3\2\2\2|}\7k\2\2}~\7h\2\2"+
		"~\f\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7y\2\2\u0081\u0082\7k\2\2\u0082"+
		"\u0083\7v\2\2\u0083\u0084\7e\2\2\u0084\u0085\7j\2\2\u0085\16\3\2\2\2\u0086"+
		"\u0087\7e\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2"+
		"\u008a\20\3\2\2\2\u008b\u008c\7f\2\2\u008c\u008d\7g\2\2\u008d\u008e\7"+
		"h\2\2\u008e\u008f\7c\2\2\u008f\u0090\7w\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7v\2\2\u0092\22\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7w\2\2\u0095\u0096"+
		"\7p\2\2\u0096\u0097\7e\2\2\u0097\24\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7p\2\2\u009a\u009b\7v\2\2\u009b\26\3\2\2\2\u009c\u009d\7d\2\2\u009d\u009e"+
		"\7q\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7n\2\2\u00a0\30\3\2\2\2\u00a1\u00a2"+
		"\7x\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7f\2\2\u00a5"+
		"\32\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\34\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\36\3\2\2\2\u00ad"+
		"\u00ae\7y\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7n\2\2"+
		"\u00b1\u00b2\7g\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7n\2"+
		"\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7"+
		"f\2\2\u00b9\u00ba\7q\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7q\2\2"+
		"\u00c4\u00c5\7h\2\2\u00c5&\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2"+
		"\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc"+
		"\7p\2\2\u00cc(\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7"+
		"+\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7]\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7_"+
		"\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7}\2\2\u00d6\62\3\2\2\2\u00d7\u00d8"+
		"\7\177\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7>\2\2\u00da\66\3\2\2\2\u00db"+
		"\u00dc\7>\2\2\u00dc\u00dd\7?\2\2\u00dd8\3\2\2\2\u00de\u00df\7@\2\2\u00df"+
		":\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e2\7?\2\2\u00e2<\3\2\2\2\u00e3\u00e4"+
		"\7?\2\2\u00e4\u00e5\7?\2\2\u00e5>\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7@\3"+
		"\2\2\2\u00e8\u00e9\7-\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7/\2\2\u00ebD\3\2"+
		"\2\2\u00ec\u00ed\7,\2\2\u00edF\3\2\2\2\u00ee\u00ef\7\61\2\2\u00efH\3\2"+
		"\2\2\u00f0\u00f1\7\'\2\2\u00f1J\3\2\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4"+
		"\7P\2\2\u00f4\u00f5\7F\2\2\u00f5L\3\2\2\2\u00f6\u00f7\7Q\2\2\u00f7\u00f8"+
		"\7T\2\2\u00f8N\3\2\2\2\u00f9\u00fa\7A\2\2\u00faP\3\2\2\2\u00fb\u00fc\7"+
		"<\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7=\2\2\u00feT\3\2\2\2\u00ff\u0100\7."+
		"\2\2\u0100V\3\2\2\2\u0101\u0102\7v\2\2\u0102\u0103\7t\2\2\u0103\u0104"+
		"\7w\2\2\u0104\u010b\7g\2\2\u0105\u0106\7h\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7n\2\2\u0108\u0109\7u\2\2\u0109\u010b\7g\2\2\u010a\u0101\3\2\2"+
		"\2\u010a\u0105\3\2\2\2\u010bX\3\2\2\2\u010c\u0110\5[.\2\u010d\u010f\5"+
		"[.\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111Z\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\t\2\2\2"+
		"\u0114\\\3\2\2\2\u0115\u0116\t\3\2\2\u0116^\3\2\2\2\u0117\u0118\t\4\2"+
		"\2\u0118`\3\2\2\2\u0119\u011d\5_\60\2\u011a\u011c\5]/\2\u011b\u011a\3"+
		"\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"b\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\5]/\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124d\3\2\2\2"+
		"\u0125\u0127\5_\60\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129f\3\2\2\2\u012a\u012b\t\5\2\2\u012b"+
		"h\3\2\2\2\u012c\u012e\t\6\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\b\65\2\2\u0132j\3\2\2\2\u0133\u0135\7\17\2\2\u0134\u0136\7\f\2\2\u0135"+
		"\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0139\7\f"+
		"\2\2\u0138\u0133\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\b\66\2\2\u013bl\3\2\2\2\13\2\u010a\u0110\u011d\u0123\u0128\u012f"+
		"\u0135\u0138\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}