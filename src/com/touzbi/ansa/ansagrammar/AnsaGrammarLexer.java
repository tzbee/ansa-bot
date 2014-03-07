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

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class AnsaGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__3 = 1, T__2 = 2, T__1 = 3, T__0 = 4,
			LINE_COMMENT = 5, DOWNLOAD = 6, HTTP_REQUEST = 7,
			GET_HTML_ATTRIBUTE = 8, SYSOUT = 9, PARAM_ID = 10,
			PARAM_DELIMITER = 11, QUOTED_STRING = 12, SINGLE_QUOTE = 13,
			WS = 14;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "')'", "','",
			"'('", "';'", "LINE_COMMENT", "'download'", "'httprequest'",
			"'gethtmlattribute'", "'sysout'", "PARAM_ID", "':'",
			"QUOTED_STRING", "'''", "WS" };
	public static final String[] ruleNames = { "T__3", "T__2", "T__1", "T__0",
			"LINE_COMMENT", "DOWNLOAD", "HTTP_REQUEST", "GET_HTML_ATTRIBUTE",
			"SYSOUT", "PARAM_ID", "PARAM_DELIMITER", "QUOTED_STRING", "STRING",
			"SINGLE_QUOTE", "LETTER", "WS" };

	public AnsaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "AnsaGrammar.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4:
			LINE_COMMENT_action((RuleContext) _localctx, actionIndex);
			break;

		case 15:
			WS_action((RuleContext) _localctx, actionIndex);
			break;
		}
	}

	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\20~\b\1\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"
			+ "\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3\6"
			+ "\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"
			+ "\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"
			+ "\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13e\n\13\r\13\16\13"
			+ "f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\6\16p\n\16\r\16\16\16q\3\17\3\17\3\20\3"
			+ "\20\3\21\6\21y\n\21\r\21\16\21z\3\21\3\21\3q\22\3\3\1\5\4\1\7\5\1\t\6"
			+ "\1\13\7\2\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\2\1\35"
			+ "\17\1\37\2\1!\20\3\3\2\5\4\2\f\f\17\17\5\2//C\\c|\5\2\13\f\17\17\"\"\177"
			+ "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"
			+ "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"
			+ "\2\31\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2"
			+ "\2\t)\3\2\2\2\13+\3\2\2\2\r\66\3\2\2\2\17?\3\2\2\2\21K\3\2\2\2\23\\\3"
			+ "\2\2\2\25d\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33o\3\2\2\2\35s\3\2\2\2\37"
			+ "u\3\2\2\2!x\3\2\2\2#$\7+\2\2$\4\3\2\2\2%&\7.\2\2&\6\3\2\2\2\'(\7*\2\2"
			+ "(\b\3\2\2\2)*\7=\2\2*\n\3\2\2\2+,\7%\2\2,-\7%\2\2-\61\3\2\2\2.\60\n\2"
			+ "\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"
			+ "\61\3\2\2\2\64\65\b\6\2\2\65\f\3\2\2\2\66\67\7f\2\2\678\7q\2\289\7y\2"
			+ "\29:\7p\2\2:;\7n\2\2;<\7q\2\2<=\7c\2\2=>\7f\2\2>\16\3\2\2\2?@\7j\2\2@"
			+ "A\7v\2\2AB\7v\2\2BC\7r\2\2CD\7t\2\2DE\7g\2\2EF\7s\2\2FG\7w\2\2GH\7g\2"
			+ "\2HI\7u\2\2IJ\7v\2\2J\20\3\2\2\2KL\7i\2\2LM\7g\2\2MN\7v\2\2NO\7j\2\2O"
			+ "P\7v\2\2PQ\7o\2\2QR\7n\2\2RS\7c\2\2ST\7v\2\2TU\7v\2\2UV\7t\2\2VW\7k\2"
			+ "\2WX\7d\2\2XY\7w\2\2YZ\7v\2\2Z[\7g\2\2[\22\3\2\2\2\\]\7u\2\2]^\7{\2\2"
			+ "^_\7u\2\2_`\7q\2\2`a\7w\2\2ab\7v\2\2b\24\3\2\2\2ce\5\37\20\2dc\3\2\2\2"
			+ "ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\26\3\2\2\2hi\7<\2\2i\30\3\2\2\2jk\5\35"
			+ "\17\2kl\5\33\16\2lm\5\35\17\2m\32\3\2\2\2np\n\2\2\2on\3\2\2\2pq\3\2\2"
			+ "\2qr\3\2\2\2qo\3\2\2\2r\34\3\2\2\2st\7)\2\2t\36\3\2\2\2uv\t\3\2\2v \3"
			+ "\2\2\2wy\t\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b"
			+ "\21\3\2}\"\3\2\2\2\7\2\61fqz";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}