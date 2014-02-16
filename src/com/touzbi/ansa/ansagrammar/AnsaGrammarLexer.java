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
	public static final int T__5 = 1, T__4 = 2, T__3 = 3, T__2 = 4, T__1 = 5,
			T__0 = 6, LINE_COMMENT = 7, FORMAT = 8, GET_CONTENT = 9,
			HTTP_REQUEST = 10, SYSOUT = 11, INPUT = 12, PARAM_ID = 13,
			PARAM_DELIMITER = 14, QUOTED_STRING = 15, SINGLE_QUOTE = 16,
			WS = 17;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "']'", "')'",
			"','", "'['", "'('", "';'", "LINE_COMMENT", "'format'",
			"'getcontent'", "'httprequest'", "'sysout'", "'setinput'",
			"PARAM_ID", "':'", "QUOTED_STRING", "'''", "WS" };
	public static final String[] ruleNames = { "T__5", "T__4", "T__3", "T__2",
			"T__1", "T__0", "LINE_COMMENT", "FORMAT", "GET_CONTENT",
			"HTTP_REQUEST", "SYSOUT", "INPUT", "PARAM_ID", "PARAM_DELIMITER",
			"QUOTED_STRING", "STRING", "SINGLE_QUOTE", "LETTER", "WS" };

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
		case 6:
			LINE_COMMENT_action((RuleContext) _localctx, actionIndex);
			break;

		case 18:
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23\u0089\b\1\4\2"
			+ "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
			+ "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
			+ "\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"
			+ "\3\7\3\b\3\b\3\b\3\b\7\b:\n\b\f\b\16\b=\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3"
			+ "\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"
			+ "\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"
			+ "\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16p\n\16\r\16\16\16q\3"
			+ "\17\3\17\3\20\3\20\3\20\3\20\3\21\6\21{\n\21\r\21\16\21|\3\22\3\22\3\23"
			+ "\3\23\3\24\6\24\u0084\n\24\r\24\16\24\u0085\3\24\3\24\2\25\3\3\1\5\4\1"
			+ "\7\5\1\t\6\1\13\7\1\r\b\1\17\t\2\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"
			+ "\33\17\1\35\20\1\37\21\1!\2\1#\22\1%\2\1\'\23\3\3\2\5\4\2\f\f\17\17\4"
			+ "\2C\\c|\5\2\13\f\17\17\"\"\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"
			+ "\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"
			+ "\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"
			+ "\2\37\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2"
			+ "\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21@\3\2\2\2\23G\3"
			+ "\2\2\2\25R\3\2\2\2\27^\3\2\2\2\31e\3\2\2\2\33o\3\2\2\2\35s\3\2\2\2\37"
			+ "u\3\2\2\2!z\3\2\2\2#~\3\2\2\2%\u0080\3\2\2\2\'\u0083\3\2\2\2)*\7_\2\2"
			+ "*\4\3\2\2\2+,\7+\2\2,\6\3\2\2\2-.\7.\2\2.\b\3\2\2\2/\60\7]\2\2\60\n\3"
			+ "\2\2\2\61\62\7*\2\2\62\f\3\2\2\2\63\64\7=\2\2\64\16\3\2\2\2\65\66\7%\2"
			+ "\2\66\67\7%\2\2\67;\3\2\2\28:\n\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<"
			+ "\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\b\b\2\2?\20\3\2\2\2@A\7h\2\2AB\7q\2\2B"
			+ "C\7t\2\2CD\7o\2\2DE\7c\2\2EF\7v\2\2F\22\3\2\2\2GH\7i\2\2HI\7g\2\2IJ\7"
			+ "v\2\2JK\7e\2\2KL\7q\2\2LM\7p\2\2MN\7v\2\2NO\7g\2\2OP\7p\2\2PQ\7v\2\2Q"
			+ "\24\3\2\2\2RS\7j\2\2ST\7v\2\2TU\7v\2\2UV\7r\2\2VW\7t\2\2WX\7g\2\2XY\7"
			+ "s\2\2YZ\7w\2\2Z[\7g\2\2[\\\7u\2\2\\]\7v\2\2]\26\3\2\2\2^_\7u\2\2_`\7{"
			+ "\2\2`a\7u\2\2ab\7q\2\2bc\7w\2\2cd\7v\2\2d\30\3\2\2\2ef\7u\2\2fg\7g\2\2"
			+ "gh\7v\2\2hi\7k\2\2ij\7p\2\2jk\7r\2\2kl\7w\2\2lm\7v\2\2m\32\3\2\2\2np\5"
			+ "%\23\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\34\3\2\2\2st\7<\2\2t\36"
			+ "\3\2\2\2uv\5#\22\2vw\5!\21\2wx\5#\22\2x \3\2\2\2y{\n\2\2\2zy\3\2\2\2{"
			+ "|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\"\3\2\2\2~\177\7)\2\2\177$\3\2\2\2\u0080"
			+ "\u0081\t\3\2\2\u0081&\3\2\2\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2"
			+ "\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"
			+ "\3\2\2\2\u0087\u0088\b\24\3\2\u0088(\3\2\2\2\7\2;q|\u0085";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}