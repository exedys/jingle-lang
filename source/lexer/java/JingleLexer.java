// Generated from JingleLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JingleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, VAR=2, CONST=3, DISPLAY=4, IF=5, ELSE=6, FOR=7, TRUE=8, FALSE=9, 
		FUNC=10, LET=11, ASSIGN=12, EQUALS=13, PLUS=14, MINUS=15, MULTIPLY=16, 
		DIVIDE=17, LESSTHAN=18, GREATERTHAN=19, NOTEQUAL=20, BANG=21, COMMA=22, 
		SEMICOLON=23, LBRACKET=24, RBRACKET=25, LBRACE=26, RBRACE=27, LSQRBRACKET=28, 
		RSQRBRACKET=29, ARROW=30, FLOAT=31, STRING=32, BOOLEAN=33, NULL=34, CHAR=35, 
		INT=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "COMMENT", "VAR", "CONST", "DISPLAY", "IF", "ELSE", "FOR", "TRUE", 
			"FALSE", "FUNC", "LET", "ASSIGN", "EQUALS", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "LESSTHAN", "GREATERTHAN", "NOTEQUAL", "BANG", "COMMA", "SEMICOLON", 
			"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LSQRBRACKET", "RSQRBRACKET", 
			"ARROW", "FLOAT", "STRING", "BOOLEAN", "NULL", "CHAR", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'var'", null, "'display'", "'if'", "'else'", "'for'", "'true'", 
			"'false'", "'func'", "'let'", "':'", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'<'", "'>'", "'!='", "'!'", "','", "';'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'->'", "'float'", "'string'", "'bool'", "'null'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "VAR", "CONST", "DISPLAY", "IF", "ELSE", "FOR", "TRUE", 
			"FALSE", "FUNC", "LET", "ASSIGN", "EQUALS", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "LESSTHAN", "GREATERTHAN", "NOTEQUAL", "BANG", "COMMA", "SEMICOLON", 
			"LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LSQRBRACKET", "RSQRBRACKET", 
			"ARROW", "FLOAT", "STRING", "BOOLEAN", "NULL", "CHAR", "INT"
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


	public JingleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JingleLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00df\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\5\3T\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5h\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\6&\u00d7\n&\r&\16&\u00d8\3"+
		"&\3&\3&\5&\u00de\n&\2\2\'\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13"+
		"\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63"+
		"\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&\3\2\3\3\2\62;\2\u00e3\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\3M\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rq\3\2"+
		"\2\2\17t\3\2\2\2\21y\3\2\2\2\23}\3\2\2\2\25\u0082\3\2\2\2\27\u0088\3\2"+
		"\2\2\31\u008d\3\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2"+
		"\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u009f"+
		"\3\2\2\2+\u00a1\3\2\2\2-\u00a4\3\2\2\2/\u00a6\3\2\2\2\61\u00a8\3\2\2\2"+
		"\63\u00aa\3\2\2\2\65\u00ac\3\2\2\2\67\u00ae\3\2\2\29\u00b0\3\2\2\2;\u00b2"+
		"\3\2\2\2=\u00b4\3\2\2\2?\u00b6\3\2\2\2A\u00b9\3\2\2\2C\u00bf\3\2\2\2E"+
		"\u00c6\3\2\2\2G\u00cb\3\2\2\2I\u00d0\3\2\2\2K\u00dd\3\2\2\2MN\t\2\2\2"+
		"N\4\3\2\2\2OT\7%\2\2PT\13\2\2\2QR\7\61\2\2RT\7\61\2\2SO\3\2\2\2SP\3\2"+
		"\2\2SQ\3\2\2\2T\6\3\2\2\2UV\7x\2\2VW\7c\2\2WX\7t\2\2X\b\3\2\2\2YZ\7e\2"+
		"\2Z[\7q\2\2[\\\7p\2\2\\]\7u\2\2]h\7v\2\2^h\13\2\2\2_`\7e\2\2`a\7q\2\2"+
		"ab\7p\2\2bc\7u\2\2cd\7v\2\2de\7c\2\2ef\7p\2\2fh\7v\2\2gY\3\2\2\2g^\3\2"+
		"\2\2g_\3\2\2\2h\n\3\2\2\2ij\7f\2\2jk\7k\2\2kl\7u\2\2lm\7r\2\2mn\7n\2\2"+
		"no\7c\2\2op\7{\2\2p\f\3\2\2\2qr\7k\2\2rs\7h\2\2s\16\3\2\2\2tu\7g\2\2u"+
		"v\7n\2\2vw\7u\2\2wx\7g\2\2x\20\3\2\2\2yz\7h\2\2z{\7q\2\2{|\7t\2\2|\22"+
		"\3\2\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7w\2\2\u0080\u0081\7g\2\2\u0081"+
		"\24\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085"+
		"\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087\26\3\2\2\2\u0088\u0089\7h\2\2\u0089"+
		"\u008a\7w\2\2\u008a\u008b\7p\2\2\u008b\u008c\7e\2\2\u008c\30\3\2\2\2\u008d"+
		"\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\32\3\2\2\2\u0091"+
		"\u0092\7<\2\2\u0092\34\3\2\2\2\u0093\u0094\7?\2\2\u0094\36\3\2\2\2\u0095"+
		"\u0096\7-\2\2\u0096 \3\2\2\2\u0097\u0098\7/\2\2\u0098\"\3\2\2\2\u0099"+
		"\u009a\7,\2\2\u009a$\3\2\2\2\u009b\u009c\7\61\2\2\u009c&\3\2\2\2\u009d"+
		"\u009e\7>\2\2\u009e(\3\2\2\2\u009f\u00a0\7@\2\2\u00a0*\3\2\2\2\u00a1\u00a2"+
		"\7#\2\2\u00a2\u00a3\7?\2\2\u00a3,\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5.\3"+
		"\2\2\2\u00a6\u00a7\7.\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7=\2\2\u00a9\62"+
		"\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad"+
		"\66\3\2\2\2\u00ae\u00af\7}\2\2\u00af8\3\2\2\2\u00b0\u00b1\7\177\2\2\u00b1"+
		":\3\2\2\2\u00b2\u00b3\7]\2\2\u00b3<\3\2\2\2\u00b4\u00b5\7_\2\2\u00b5>"+
		"\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7\u00b8\7@\2\2\u00b8@\3\2\2\2\u00b9\u00ba"+
		"\7h\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7c\2\2\u00bd"+
		"\u00be\7v\2\2\u00beB\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7i\2\2"+
		"\u00c5D\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7q\2"+
		"\2\u00c9\u00ca\7n\2\2\u00caF\3\2\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7"+
		"w\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7n\2\2\u00cfH\3\2\2\2\u00d0\u00d1"+
		"\7e\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"J\3\2\2\2\u00d5\u00d7\5\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00de\3\2\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00de\7v\2\2\u00dd\u00d6\3\2\2\2\u00dd"+
		"\u00da\3\2\2\2\u00deL\3\2\2\2\7\2Sg\u00d8\u00dd\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}