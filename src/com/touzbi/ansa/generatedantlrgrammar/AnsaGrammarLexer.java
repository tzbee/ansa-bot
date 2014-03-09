// Generated from AnsaGrammar.g4 by ANTLR 4.1
package com.touzbi.ansa.generatedantlrgrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnsaGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, LINE_COMMENT=5, FORMAT=6, GET_CONTENT_BY_REGEX=7, 
		GET_HTML_TEXT=8, DOWNLOAD=9, HTTP_REQUEST=10, GET_HTML_ATTRIBUTE=11, SYSOUT=12, 
		PARAM_ID=13, PARAM_DELIMITER=14, QUOTED_STRING=15, SINGLE_QUOTE=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "';'", "LINE_COMMENT", "'format'", "'getcontentbyregex'", 
		"'gethtmltext'", "'download'", "'httprequest'", "'gethtmlattribute'", 
		"'print'", "PARAM_ID", "':'", "QUOTED_STRING", "'''", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "LINE_COMMENT", "FORMAT", "GET_CONTENT_BY_REGEX", 
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

		case 18: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\7\6\66\n\6\f\6\16\69\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u008f\n\16\r\16\16\16\u0090\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\6\21\u009a\n\21\r\21\16\21\u009b\3\22\3"+
		"\22\3\23\3\23\3\24\6\24\u00a3\n\24\r\24\16\24\u00a4\3\24\3\24\3\u009b"+
		"\25\3\3\1\5\4\1\7\5\1\t\6\1\13\7\2\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\2\1#\22\1%\2\1\'\23\3\3\2\5\4"+
		"\2\f\f\17\17\5\2//C\\c|\5\2\13\f\17\17\"\"\u00a9\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3"+
		"\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r<\3\2\2\2\17C\3\2\2\2\21U"+
		"\3\2\2\2\23a\3\2\2\2\25j\3\2\2\2\27v\3\2\2\2\31\u0087\3\2\2\2\33\u008e"+
		"\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0099\3\2\2\2#\u009d\3\2\2"+
		"\2%\u009f\3\2\2\2\'\u00a2\3\2\2\2)*\7+\2\2*\4\3\2\2\2+,\7.\2\2,\6\3\2"+
		"\2\2-.\7*\2\2.\b\3\2\2\2/\60\7=\2\2\60\n\3\2\2\2\61\62\7%\2\2\62\63\7"+
		"%\2\2\63\67\3\2\2\2\64\66\n\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\b\6\2\2;\f\3\2\2\2<=\7h\2\2="+
		">\7q\2\2>?\7t\2\2?@\7o\2\2@A\7c\2\2AB\7v\2\2B\16\3\2\2\2CD\7i\2\2DE\7"+
		"g\2\2EF\7v\2\2FG\7e\2\2GH\7q\2\2HI\7p\2\2IJ\7v\2\2JK\7g\2\2KL\7p\2\2L"+
		"M\7v\2\2MN\7d\2\2NO\7{\2\2OP\7t\2\2PQ\7g\2\2QR\7i\2\2RS\7g\2\2ST\7z\2"+
		"\2T\20\3\2\2\2UV\7i\2\2VW\7g\2\2WX\7v\2\2XY\7j\2\2YZ\7v\2\2Z[\7o\2\2["+
		"\\\7n\2\2\\]\7v\2\2]^\7g\2\2^_\7z\2\2_`\7v\2\2`\22\3\2\2\2ab\7f\2\2bc"+
		"\7q\2\2cd\7y\2\2de\7p\2\2ef\7n\2\2fg\7q\2\2gh\7c\2\2hi\7f\2\2i\24\3\2"+
		"\2\2jk\7j\2\2kl\7v\2\2lm\7v\2\2mn\7r\2\2no\7t\2\2op\7g\2\2pq\7s\2\2qr"+
		"\7w\2\2rs\7g\2\2st\7u\2\2tu\7v\2\2u\26\3\2\2\2vw\7i\2\2wx\7g\2\2xy\7v"+
		"\2\2yz\7j\2\2z{\7v\2\2{|\7o\2\2|}\7n\2\2}~\7c\2\2~\177\7v\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2\2\u0082\u0083\7d\2\2\u0083"+
		"\u0084\7w\2\2\u0084\u0085\7v\2\2\u0085\u0086\7g\2\2\u0086\30\3\2\2\2\u0087"+
		"\u0088\7r\2\2\u0088\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2"+
		"\u008b\u008c\7v\2\2\u008c\32\3\2\2\2\u008d\u008f\5%\23\2\u008e\u008d\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\34\3\2\2\2\u0092\u0093\7<\2\2\u0093\36\3\2\2\2\u0094\u0095\5#\22\2\u0095"+
		"\u0096\5!\21\2\u0096\u0097\5#\22\2\u0097 \3\2\2\2\u0098\u009a\n\2\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\"\3\2\2\2\u009d\u009e\7)\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\t\3\2\2\u00a0&\3\2\2\2\u00a1\u00a3\t\4\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\b\24\3\2\u00a7(\3\2\2\2\7\2\67\u0090\u009b\u00a4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}