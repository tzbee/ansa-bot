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
			LINE_COMMENT = 5, GET_HTML_ELEMENT = 6, SYSOUT = 7, PARAM_ID = 8,
			PARAM_DELIMITER = 9, QUOTED_STRING = 10, SINGLE_QUOTE = 11,
			WS = 12;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "')'", "','",
			"'('", "';'", "LINE_COMMENT", "'gethtmlelement'", "'sysout'",
			"PARAM_ID", "':'", "QUOTED_STRING", "'''", "WS" };
	public static final String[] ruleNames = { "T__3", "T__2", "T__1", "T__0",
			"LINE_COMMENT", "GET_HTML_ELEMENT", "SYSOUT", "PARAM_ID",
			"PARAM_DELIMITER", "QUOTED_STRING", "STRING", "SINGLE_QUOTE",
			"LETTER", "WS" };

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

		case 13:
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16c\b\1\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"
			+ "\5\3\6\3\6\3\6\3\6\7\6,\n\6\f\6\16\6/\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"
			+ "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"
			+ "\t\6\tJ\n\t\r\t\16\tK\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\fU\n\f\r\f\16"
			+ "\fV\3\r\3\r\3\16\3\16\3\17\6\17^\n\17\r\17\16\17_\3\17\3\17\3V\20\3\3"
			+ "\1\5\4\1\7\5\1\t\6\1\13\7\2\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\2\1"
			+ "\31\r\1\33\2\1\35\16\3\3\2\5\4\2\f\f\17\17\5\2//C\\c|\5\2\13\f\17\17\""
			+ "\"d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"
			+ "\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\31\3\2\2"
			+ "\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2"
			+ "\2\2\r\62\3\2\2\2\17A\3\2\2\2\21I\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27T"
			+ "\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35]\3\2\2\2\37 \7+\2\2 \4\3\2\2\2!\""
			+ "\7.\2\2\"\6\3\2\2\2#$\7*\2\2$\b\3\2\2\2%&\7=\2\2&\n\3\2\2\2\'(\7%\2\2"
			+ "()\7%\2\2)-\3\2\2\2*,\n\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2"
			+ ".\60\3\2\2\2/-\3\2\2\2\60\61\b\6\2\2\61\f\3\2\2\2\62\63\7i\2\2\63\64\7"
			+ "g\2\2\64\65\7v\2\2\65\66\7j\2\2\66\67\7v\2\2\678\7o\2\289\7n\2\29:\7g"
			+ "\2\2:;\7n\2\2;<\7g\2\2<=\7o\2\2=>\7g\2\2>?\7p\2\2?@\7v\2\2@\16\3\2\2\2"
			+ "AB\7u\2\2BC\7{\2\2CD\7u\2\2DE\7q\2\2EF\7w\2\2FG\7v\2\2G\20\3\2\2\2HJ\5"
			+ "\33\16\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\22\3\2\2\2MN\7<\2\2"
			+ "N\24\3\2\2\2OP\5\31\r\2PQ\5\27\f\2QR\5\31\r\2R\26\3\2\2\2SU\n\2\2\2TS"
			+ "\3\2\2\2UV\3\2\2\2VW\3\2\2\2VT\3\2\2\2W\30\3\2\2\2XY\7)\2\2Y\32\3\2\2"
			+ "\2Z[\t\3\2\2[\34\3\2\2\2\\^\t\4\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3"
			+ "\2\2\2`a\3\2\2\2ab\b\17\3\2b\36\3\2\2\2\7\2-KV_";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}