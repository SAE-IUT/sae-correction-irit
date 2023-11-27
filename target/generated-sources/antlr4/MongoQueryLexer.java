// Generated from MongoQuery.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MongoQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AGGREGATE=5, MATCH=6, PROJECT=7, LOOKUP=8, 
		DOT=9, COLON=10, COMMA=11, ASTERISK=12, LEFT_BRACES=13, RIGHT_BRACES=14, 
		LEFT_BRACKET=15, RIGHT_BRACKET=16, LEFT_PARENTHESES=17, RIGHT_PARENTHESES=18, 
		DQUOTE=19, SQUOTE=20, EQ=21, NEQ=22, GT=23, GTE=24, LT=25, LTE=26, IN=27, 
		NIN=28, AND=29, OR=30, NOT=31, NOR=32, BOOLEAN_TRUE=33, BOOLEAN_FALSE=34, 
		INTEGER_VALUE=35, DECIMAL_VALUE=36, IDENTIFIER=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "AGGREGATE", "MATCH", "PROJECT", "LOOKUP", 
			"DOT", "COLON", "COMMA", "ASTERISK", "LEFT_BRACES", "RIGHT_BRACES", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "DQUOTE", "SQUOTE", 
			"EQ", "NEQ", "GT", "GTE", "LT", "LTE", "IN", "NIN", "AND", "OR", "NOT", 
			"NOR", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "INTEGER_VALUE", "DECIMAL_VALUE", 
			"IDENTIFIER", "WS", "DECIMAL_DIGITS", "DIGIT", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'from'", "'localField'", "'foreignField'", "'as'", "'aggregate'", 
			"'$match'", "'$project'", "'$lookup'", "'.'", "':'", "','", "'*'", "'{'", 
			"'}'", "'['", "']'", "'('", "')'", "'\"'", "'''", "'$eq'", "'$ne'", "'$gt'", 
			"'$gte'", "'$lt'", "'$lte'", "'$in'", "'$nin'", "'$and'", "'$or'", "'$not'", 
			"'$nor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "AGGREGATE", "MATCH", "PROJECT", "LOOKUP", 
			"DOT", "COLON", "COMMA", "ASTERISK", "LEFT_BRACES", "RIGHT_BRACES", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "DQUOTE", "SQUOTE", 
			"EQ", "NEQ", "GT", "GTE", "LT", "LTE", "IN", "NIN", "AND", "OR", "NOT", 
			"NOR", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "INTEGER_VALUE", "DECIMAL_VALUE", 
			"IDENTIFIER", "WS"
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


	public MongoQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MongoQuery.g4"; }

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
		"\u0004\u0000&\u0128\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u00ed"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u00fa\b!\u0001\"\u0004\"\u00fd\b\"\u000b\"\f\"\u00fe\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0004$\u0106\b$\u000b$\f$\u0107\u0001%\u0004"+
		"%\u010b\b%\u000b%\f%\u010c\u0001%\u0001%\u0001&\u0004&\u0112\b&\u000b"+
		"&\f&\u0113\u0001&\u0001&\u0005&\u0118\b&\n&\f&\u011b\t&\u0001&\u0001&"+
		"\u0004&\u011f\b&\u000b&\f&\u0120\u0003&\u0123\b&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0000\u0000)\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\u0000O\u0000Q\u0000\u0001\u0000\u0003\u0003"+
		"\u0000\t\n\r\r  \u0001\u000009\u0002\u0000AZaz\u0131\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0001S\u0001\u0000\u0000\u0000\u0003X\u0001\u0000\u0000\u0000\u0005c"+
		"\u0001\u0000\u0000\u0000\u0007p\u0001\u0000\u0000\u0000\ts\u0001\u0000"+
		"\u0000\u0000\u000b}\u0001\u0000\u0000\u0000\r\u0084\u0001\u0000\u0000"+
		"\u0000\u000f\u008d\u0001\u0000\u0000\u0000\u0011\u0095\u0001\u0000\u0000"+
		"\u0000\u0013\u0097\u0001\u0000\u0000\u0000\u0015\u0099\u0001\u0000\u0000"+
		"\u0000\u0017\u009b\u0001\u0000\u0000\u0000\u0019\u009d\u0001\u0000\u0000"+
		"\u0000\u001b\u009f\u0001\u0000\u0000\u0000\u001d\u00a1\u0001\u0000\u0000"+
		"\u0000\u001f\u00a3\u0001\u0000\u0000\u0000!\u00a5\u0001\u0000\u0000\u0000"+
		"#\u00a7\u0001\u0000\u0000\u0000%\u00a9\u0001\u0000\u0000\u0000\'\u00ab"+
		"\u0001\u0000\u0000\u0000)\u00ad\u0001\u0000\u0000\u0000+\u00b1\u0001\u0000"+
		"\u0000\u0000-\u00b5\u0001\u0000\u0000\u0000/\u00b9\u0001\u0000\u0000\u0000"+
		"1\u00be\u0001\u0000\u0000\u00003\u00c2\u0001\u0000\u0000\u00005\u00c7"+
		"\u0001\u0000\u0000\u00007\u00cb\u0001\u0000\u0000\u00009\u00d0\u0001\u0000"+
		"\u0000\u0000;\u00d5\u0001\u0000\u0000\u0000=\u00d9\u0001\u0000\u0000\u0000"+
		"?\u00de\u0001\u0000\u0000\u0000A\u00ec\u0001\u0000\u0000\u0000C\u00f9"+
		"\u0001\u0000\u0000\u0000E\u00fc\u0001\u0000\u0000\u0000G\u0100\u0001\u0000"+
		"\u0000\u0000I\u0105\u0001\u0000\u0000\u0000K\u010a\u0001\u0000\u0000\u0000"+
		"M\u0122\u0001\u0000\u0000\u0000O\u0124\u0001\u0000\u0000\u0000Q\u0126"+
		"\u0001\u0000\u0000\u0000ST\u0005f\u0000\u0000TU\u0005r\u0000\u0000UV\u0005"+
		"o\u0000\u0000VW\u0005m\u0000\u0000W\u0002\u0001\u0000\u0000\u0000XY\u0005"+
		"l\u0000\u0000YZ\u0005o\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005a\u0000"+
		"\u0000\\]\u0005l\u0000\u0000]^\u0005F\u0000\u0000^_\u0005i\u0000\u0000"+
		"_`\u0005e\u0000\u0000`a\u0005l\u0000\u0000ab\u0005d\u0000\u0000b\u0004"+
		"\u0001\u0000\u0000\u0000cd\u0005f\u0000\u0000de\u0005o\u0000\u0000ef\u0005"+
		"r\u0000\u0000fg\u0005e\u0000\u0000gh\u0005i\u0000\u0000hi\u0005g\u0000"+
		"\u0000ij\u0005n\u0000\u0000jk\u0005F\u0000\u0000kl\u0005i\u0000\u0000"+
		"lm\u0005e\u0000\u0000mn\u0005l\u0000\u0000no\u0005d\u0000\u0000o\u0006"+
		"\u0001\u0000\u0000\u0000pq\u0005a\u0000\u0000qr\u0005s\u0000\u0000r\b"+
		"\u0001\u0000\u0000\u0000st\u0005a\u0000\u0000tu\u0005g\u0000\u0000uv\u0005"+
		"g\u0000\u0000vw\u0005r\u0000\u0000wx\u0005e\u0000\u0000xy\u0005g\u0000"+
		"\u0000yz\u0005a\u0000\u0000z{\u0005t\u0000\u0000{|\u0005e\u0000\u0000"+
		"|\n\u0001\u0000\u0000\u0000}~\u0005$\u0000\u0000~\u007f\u0005m\u0000\u0000"+
		"\u007f\u0080\u0005a\u0000\u0000\u0080\u0081\u0005t\u0000\u0000\u0081\u0082"+
		"\u0005c\u0000\u0000\u0082\u0083\u0005h\u0000\u0000\u0083\f\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005$\u0000\u0000\u0085\u0086\u0005p\u0000\u0000"+
		"\u0086\u0087\u0005r\u0000\u0000\u0087\u0088\u0005o\u0000\u0000\u0088\u0089"+
		"\u0005j\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u008b\u0005c"+
		"\u0000\u0000\u008b\u008c\u0005t\u0000\u0000\u008c\u000e\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005$\u0000\u0000\u008e\u008f\u0005l\u0000\u0000\u008f"+
		"\u0090\u0005o\u0000\u0000\u0090\u0091\u0005o\u0000\u0000\u0091\u0092\u0005"+
		"k\u0000\u0000\u0092\u0093\u0005u\u0000\u0000\u0093\u0094\u0005p\u0000"+
		"\u0000\u0094\u0010\u0001\u0000\u0000\u0000\u0095\u0096\u0005.\u0000\u0000"+
		"\u0096\u0012\u0001\u0000\u0000\u0000\u0097\u0098\u0005:\u0000\u0000\u0098"+
		"\u0014\u0001\u0000\u0000\u0000\u0099\u009a\u0005,\u0000\u0000\u009a\u0016"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005*\u0000\u0000\u009c\u0018\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005{\u0000\u0000\u009e\u001a\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0005}\u0000\u0000\u00a0\u001c\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005[\u0000\u0000\u00a2\u001e\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0005]\u0000\u0000\u00a4 \u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005(\u0000\u0000\u00a6\"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		")\u0000\u0000\u00a8$\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\"\u0000"+
		"\u0000\u00aa&\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\'\u0000\u0000"+
		"\u00ac(\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005$\u0000\u0000\u00ae\u00af"+
		"\u0005e\u0000\u0000\u00af\u00b0\u0005q\u0000\u0000\u00b0*\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005$\u0000\u0000\u00b2\u00b3\u0005n\u0000\u0000"+
		"\u00b3\u00b4\u0005e\u0000\u0000\u00b4,\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005$\u0000\u0000\u00b6\u00b7\u0005g\u0000\u0000\u00b7\u00b8\u0005t"+
		"\u0000\u0000\u00b8.\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005$\u0000\u0000"+
		"\u00ba\u00bb\u0005g\u0000\u0000\u00bb\u00bc\u0005t\u0000\u0000\u00bc\u00bd"+
		"\u0005e\u0000\u0000\u00bd0\u0001\u0000\u0000\u0000\u00be\u00bf\u0005$"+
		"\u0000\u0000\u00bf\u00c0\u0005l\u0000\u0000\u00c0\u00c1\u0005t\u0000\u0000"+
		"\u00c12\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005$\u0000\u0000\u00c3\u00c4"+
		"\u0005l\u0000\u0000\u00c4\u00c5\u0005t\u0000\u0000\u00c5\u00c6\u0005e"+
		"\u0000\u0000\u00c64\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005$\u0000\u0000"+
		"\u00c8\u00c9\u0005i\u0000\u0000\u00c9\u00ca\u0005n\u0000\u0000\u00ca6"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005$\u0000\u0000\u00cc\u00cd\u0005"+
		"n\u0000\u0000\u00cd\u00ce\u0005i\u0000\u0000\u00ce\u00cf\u0005n\u0000"+
		"\u0000\u00cf8\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005$\u0000\u0000\u00d1"+
		"\u00d2\u0005a\u0000\u0000\u00d2\u00d3\u0005n\u0000\u0000\u00d3\u00d4\u0005"+
		"d\u0000\u0000\u00d4:\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005$\u0000"+
		"\u0000\u00d6\u00d7\u0005o\u0000\u0000\u00d7\u00d8\u0005r\u0000\u0000\u00d8"+
		"<\u0001\u0000\u0000\u0000\u00d9\u00da\u0005$\u0000\u0000\u00da\u00db\u0005"+
		"n\u0000\u0000\u00db\u00dc\u0005o\u0000\u0000\u00dc\u00dd\u0005t\u0000"+
		"\u0000\u00dd>\u0001\u0000\u0000\u0000\u00de\u00df\u0005$\u0000\u0000\u00df"+
		"\u00e0\u0005n\u0000\u0000\u00e0\u00e1\u0005o\u0000\u0000\u00e1\u00e2\u0005"+
		"r\u0000\u0000\u00e2@\u0001\u0000\u0000\u0000\u00e3\u00ed\u00051\u0000"+
		"\u0000\u00e4\u00e5\u0005t\u0000\u0000\u00e5\u00e6\u0005r\u0000\u0000\u00e6"+
		"\u00e7\u0005u\u0000\u0000\u00e7\u00ed\u0005e\u0000\u0000\u00e8\u00e9\u0005"+
		"T\u0000\u0000\u00e9\u00ea\u0005R\u0000\u0000\u00ea\u00eb\u0005U\u0000"+
		"\u0000\u00eb\u00ed\u0005E\u0000\u0000\u00ec\u00e3\u0001\u0000\u0000\u0000"+
		"\u00ec\u00e4\u0001\u0000\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000\u0000"+
		"\u00edB\u0001\u0000\u0000\u0000\u00ee\u00fa\u00050\u0000\u0000\u00ef\u00f0"+
		"\u0005f\u0000\u0000\u00f0\u00f1\u0005a\u0000\u0000\u00f1\u00f2\u0005l"+
		"\u0000\u0000\u00f2\u00f3\u0005s\u0000\u0000\u00f3\u00fa\u0005e\u0000\u0000"+
		"\u00f4\u00f5\u0005F\u0000\u0000\u00f5\u00f6\u0005A\u0000\u0000\u00f6\u00f7"+
		"\u0005L\u0000\u0000\u00f7\u00f8\u0005S\u0000\u0000\u00f8\u00fa\u0005E"+
		"\u0000\u0000\u00f9\u00ee\u0001\u0000\u0000\u0000\u00f9\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000\u00faD\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0003O\'\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ffF\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0003M&\u0000\u0101H\u0001\u0000\u0000\u0000\u0102\u0106\u0003"+
		"Q(\u0000\u0103\u0106\u0003O\'\u0000\u0104\u0106\u0005_\u0000\u0000\u0105"+
		"\u0102\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"J\u0001\u0000\u0000\u0000\u0109\u010b\u0007\u0000\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0006%\u0000\u0000\u010fL\u0001\u0000"+
		"\u0000\u0000\u0110\u0112\u0003O\'\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0119\u0005.\u0000\u0000\u0116\u0118\u0003O\'\u0000\u0117"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119"+
		"\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u0123\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c"+
		"\u011e\u0005.\u0000\u0000\u011d\u011f\u0003O\'\u0000\u011e\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001"+
		"\u0000\u0000\u0000\u0122\u0111\u0001\u0000\u0000\u0000\u0122\u011c\u0001"+
		"\u0000\u0000\u0000\u0123N\u0001\u0000\u0000\u0000\u0124\u0125\u0007\u0001"+
		"\u0000\u0000\u0125P\u0001\u0000\u0000\u0000\u0126\u0127\u0007\u0002\u0000"+
		"\u0000\u0127R\u0001\u0000\u0000\u0000\u000b\u0000\u00ec\u00f9\u00fe\u0105"+
		"\u0107\u010c\u0113\u0119\u0120\u0122\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}