// Generated from C:/Users/teres/IdeaProjects/DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITES=1, COMMENT=2, INT_CONSTANT=3, CHAR_CONSTANT=4, REAL_CONSTANT=5, 
		ID=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITES", "COMMENT", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", 
			"MANTISSA", "EXPONENT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITES", "COMMENT", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", 
			"ID"
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


	public TSmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TSmm.g4"; }

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
		"\u0004\u0000\u0006q\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0004\u0000\u0013\b\u0000\u000b\u0000\f\u0000"+
		"\u0014\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u001d\b\u0001\n\u0001\f\u0001 \t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"(\b\u0001\n\u0001\f\u0001+\t\u0001\u0003\u0001-\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u00023\b\u0002\n\u0002\f\u00026\t"+
		"\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003E\b\u0003\n\u0003\f\u0003H\t\u0003\u0001"+
		"\u0003\u0003\u0003K\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004R\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005\u0001"+
		"\u0005\u0005\u0005^\b\u0005\n\u0005\f\u0005a\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005e\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006i\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007m\b\u0007\n\u0007\f\u0007p\t\u0007"+
		"\u0001\u001e\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0000\r\u0000\u000f\u0006\u0001\u0000\t\u0003\u0000\t\n\r"+
		"\r  \u0002\u0000\n\n\r\r\u0001\u000019\u0001\u000009\u0002\u0000nntt\u0002"+
		"\u0000EEee\u0002\u0000++--\u0003\u0000AZ__az\u0004\u000009AZ__az~\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0012"+
		"\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u00058\u0001\u0000"+
		"\u0000\u0000\u0007J\u0001\u0000\u0000\u0000\tQ\u0001\u0000\u0000\u0000"+
		"\u000bd\u0001\u0000\u0000\u0000\rf\u0001\u0000\u0000\u0000\u000fj\u0001"+
		"\u0000\u0000\u0000\u0011\u0013\u0007\u0000\u0000\u0000\u0012\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0012\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0006\u0000\u0000\u0000\u0017\u0002\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005/\u0000\u0000\u0019\u001a\u0005*\u0000"+
		"\u0000\u001a\u001e\u0001\u0000\u0000\u0000\u001b\u001d\t\u0000\u0000\u0000"+
		"\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f"+
		"!\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\"\u0005*\u0000"+
		"\u0000\"-\u0005/\u0000\u0000#$\u0005/\u0000\u0000$%\u0005/\u0000\u0000"+
		"%)\u0001\u0000\u0000\u0000&(\b\u0001\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,\u0018"+
		"\u0001\u0000\u0000\u0000,#\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0006\u0001\u0000\u0000/\u0004\u0001\u0000\u0000\u000004\u0007"+
		"\u0002\u0000\u000013\u0007\u0003\u0000\u000021\u0001\u0000\u0000\u0000"+
		"36\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000059\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000079\u00050\u0000"+
		"\u000080\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009\u0006\u0001"+
		"\u0000\u0000\u0000:;\u0005\'\u0000\u0000;<\t\u0000\u0000\u0000<K\u0005"+
		"\'\u0000\u0000=>\u0005\'\u0000\u0000>?\u0005\\\u0000\u0000?@\u0007\u0004"+
		"\u0000\u0000@K\u0005\'\u0000\u0000AB\u0005\'\u0000\u0000BF\u0005\\\u0000"+
		"\u0000CE\u0007\u0003\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0005\'\u0000\u0000J:\u0001"+
		"\u0000\u0000\u0000J=\u0001\u0000\u0000\u0000JA\u0001\u0000\u0000\u0000"+
		"K\b\u0001\u0000\u0000\u0000LR\u0003\u000b\u0005\u0000MN\u0003\u000b\u0005"+
		"\u0000NO\u0003\r\u0006\u0000OP\u0003\u0005\u0002\u0000PR\u0001\u0000\u0000"+
		"\u0000QL\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000R\n\u0001\u0000"+
		"\u0000\u0000Se\u0003\u0005\u0002\u0000TU\u0003\u0005\u0002\u0000UY\u0005"+
		".\u0000\u0000VX\u0003\u0005\u0002\u0000WV\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Ze\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0003\u0005\u0002"+
		"\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000bc\u0005.\u0000\u0000ce\u0003\u0005\u0002\u0000dS\u0001"+
		"\u0000\u0000\u0000dT\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000"+
		"e\f\u0001\u0000\u0000\u0000fh\u0007\u0005\u0000\u0000gi\u0007\u0006\u0000"+
		"\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u000e\u0001"+
		"\u0000\u0000\u0000jn\u0007\u0007\u0000\u0000km\u0007\b\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000o\u0010\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000\u000f\u0000\u0014\u001e),48FJQY_dhn\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}