// Generated from AnsaGrammar.g4 by ANTLR 4.1
package com.touzbi.ansa.ansagrammar;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnsaGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, LINE_COMMENT=5, GET_CONTENT_BY_REGEX=6, 
		GET_HTML_TEXT=7, DOWNLOAD=8, HTTP_REQUEST=9, GET_HTML_ATTRIBUTE=10, SYSOUT=11, 
		PARAM_ID=12, PARAM_DELIMITER=13, QUOTED_STRING=14, SINGLE_QUOTE=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "';'", "LINE_COMMENT", "'getcontentbyregex'", "'gethtmltext'", 
		"'download'", "'httprequest'", "'gethtmlattribute'", "'sysout'", "PARAM_ID", 
		"':'", "QUOTED_STRING", "'''", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "LINE_COMMENT", "GET_CONTENT_BY_REGEX", 
		"GET_HTML_TEXT", "DOWNLOAD", "HTTP_REQUEST", "GET_HTML_ATTRIBUTE", "SYSOUT", 
		"PARAM_ID", "PARAM_DELIMITER", "QUOTED_STRING", "STRING", "SINGLE_QUOTE", 
		"LETTER", "WS"
	};


	public AnsaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AnsaGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 17: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\22\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6\64"+
		"\n\6\f\6\16\6\67\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\6\r\u0087\n\r\r\r\16\r\u0088\3\16\3\16\3\17\3\17\3\17\3\17\3\20\6\20"+
		"\u0092\n\20\r\20\16\20\u0093\3\21\3\21\3\22\3\22\3\23\6\23\u009b\n\23"+
		"\r\23\16\23\u009c\3\23\3\23\3\u0093\24\3\3\1\5\4\1\7\5\1\t\6\1\13\7\2"+
		"\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\2\1!\21\1#\2\1%\22\3\3\2\5\4\2\f\f\17\17\5\2//C\\c|\5\2\13\f\17\17\""+
		"\"\u00a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2"+
		"\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r:\3\2\2\2\17"+
		"L\3\2\2\2\21X\3\2\2\2\23a\3\2\2\2\25m\3\2\2\2\27~\3\2\2\2\31\u0086\3\2"+
		"\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u0091\3\2\2\2!\u0095\3\2\2\2"+
		"#\u0097\3\2\2\2%\u009a\3\2\2\2\'(\7+\2\2(\4\3\2\2\2)*\7.\2\2*\6\3\2\2"+
		"\2+,\7*\2\2,\b\3\2\2\2-.\7=\2\2.\n\3\2\2\2/\60\7%\2\2\60\61\7%\2\2\61"+
		"\65\3\2\2\2\62\64\n\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\b\6\2\29\f\3\2\2\2:;\7i\2\2;<"+
		"\7g\2\2<=\7v\2\2=>\7e\2\2>?\7q\2\2?@\7p\2\2@A\7v\2\2AB\7g\2\2BC\7p\2\2"+
		"CD\7v\2\2DE\7d\2\2EF\7{\2\2FG\7t\2\2GH\7g\2\2HI\7i\2\2IJ\7g\2\2JK\7z\2"+
		"\2K\16\3\2\2\2LM\7i\2\2MN\7g\2\2NO\7v\2\2OP\7j\2\2PQ\7v\2\2QR\7o\2\2R"+
		"S\7n\2\2ST\7v\2\2TU\7g\2\2UV\7z\2\2VW\7v\2\2W\20\3\2\2\2XY\7f\2\2YZ\7"+
		"q\2\2Z[\7y\2\2[\\\7p\2\2\\]\7n\2\2]^\7q\2\2^_\7c\2\2_`\7f\2\2`\22\3\2"+
		"\2\2ab\7j\2\2bc\7v\2\2cd\7v\2\2de\7r\2\2ef\7t\2\2fg\7g\2\2gh\7s\2\2hi"+
		"\7w\2\2ij\7g\2\2jk\7u\2\2kl\7v\2\2l\24\3\2\2\2mn\7i\2\2no\7g\2\2op\7v"+
		"\2\2pq\7j\2\2qr\7v\2\2rs\7o\2\2st\7n\2\2tu\7c\2\2uv\7v\2\2vw\7v\2\2wx"+
		"\7t\2\2xy\7k\2\2yz\7d\2\2z{\7w\2\2{|\7v\2\2|}\7g\2\2}\26\3\2\2\2~\177"+
		"\7u\2\2\177\u0080\7{\2\2\u0080\u0081\7u\2\2\u0081\u0082\7q\2\2\u0082\u0083"+
		"\7w\2\2\u0083\u0084\7v\2\2\u0084\30\3\2\2\2\u0085\u0087\5#\22\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\32\3\2\2\2\u008a\u008b\7<\2\2\u008b\34\3\2\2\2\u008c\u008d"+
		"\5!\21\2\u008d\u008e\5\37\20\2\u008e\u008f\5!\21\2\u008f\36\3\2\2\2\u0090"+
		"\u0092\n\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094 \3\2\2\2\u0095\u0096\7)\2\2\u0096\"\3\2"+
		"\2\2\u0097\u0098\t\3\2\2\u0098$\3\2\2\2\u0099\u009b\t\4\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\b\23\3\2\u009f&\3\2\2\2\7\2\65\u0088\u0093"+
		"\u009c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}