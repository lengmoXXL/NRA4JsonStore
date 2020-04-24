// Generated from /Users/owly/Desktop/2. PieceWorks/2. Java/JsonPath4JsonStore/src/main/antlr/JsonPath.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, JSON_STRING=8, 
		NATRUAL_INTEGER=9, IDENTIFIER=10, WILDCARD=11, DIGIT=12, POSITIVEDIGIT=13, 
		LETTER=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "JSON_STRING", 
		"NATRUAL_INTEGER", "IDENTIFIER", "WILDCARD", "DIGIT", "POSITIVEDIGIT", 
		"LETTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'.'", "'..'", "'['", "']'", "','", "':'", null, null, null, 
		"'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "JSON_STRING", "NATRUAL_INTEGER", 
		"IDENTIFIER", "WILDCARD", "DIGIT", "POSITIVEDIGIT", "LETTER", "WS"
	};
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


	public JsonPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonPath.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\t\63\n\t\f\t\16\t\66"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\7\n=\n\n\f\n\16\n@\13\n\5\nB\n\n\3\13\3\13\3"+
		"\13\7\13G\n\13\f\13\16\13J\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\5\17S"+
		"\n\17\3\20\6\20V\n\20\r\20\16\20W\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\7\4\2$$^"+
		"^\3\2\62;\3\2\63;\4\2C\\c|\5\2\13\f\17\17\"\"\2`\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t(\3\2"+
		"\2\2\13*\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21\60\3\2\2\2\23A\3\2\2\2\25C"+
		"\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33O\3\2\2\2\35R\3\2\2\2\37U\3\2\2\2!"+
		"\"\7&\2\2\"\4\3\2\2\2#$\7\60\2\2$\6\3\2\2\2%&\7\60\2\2&\'\7\60\2\2\'\b"+
		"\3\2\2\2()\7]\2\2)\n\3\2\2\2*+\7_\2\2+\f\3\2\2\2,-\7.\2\2-\16\3\2\2\2"+
		"./\7<\2\2/\20\3\2\2\2\60\64\7$\2\2\61\63\n\2\2\2\62\61\3\2\2\2\63\66\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7$"+
		"\2\28\22\3\2\2\29B\7\62\2\2:>\5\33\16\2;=\5\31\r\2<;\3\2\2\2=@\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A9\3\2\2\2A:\3\2\2\2B\24\3\2\2"+
		"\2CH\5\35\17\2DG\5\35\17\2EG\5\31\r\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF"+
		"\3\2\2\2HI\3\2\2\2I\26\3\2\2\2JH\3\2\2\2KL\7,\2\2L\30\3\2\2\2MN\t\3\2"+
		"\2N\32\3\2\2\2OP\t\4\2\2P\34\3\2\2\2QS\t\5\2\2RQ\3\2\2\2S\36\3\2\2\2T"+
		"V\t\6\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\20\2\2"+
		"Z \3\2\2\2\n\2\64>AFHRW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}