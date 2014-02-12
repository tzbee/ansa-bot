// Generated from AnsaGrammar.g4 by ANTLR 4.1
package com.touzbi.ansa.ansagrammar;
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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, LINE_COMMENT=7, GET_CONTENT=8, 
		HTTP_REQUEST=9, SYSOUT=10, INPUT=11, PARAM_ID=12, PARAM_DELIMITER=13, 
		QUOTED_STRING=14, SINGLE_QUOTE=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "','", "'['", "'('", "';'", "LINE_COMMENT", "'getcontent'", 
		"'httprequest'", "'sysout'", "'setinput'", "PARAM_ID", "':'", "QUOTED_STRING", 
		"'''", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "LINE_COMMENT", "GET_CONTENT", 
		"HTTP_REQUEST", "SYSOUT", "INPUT", "PARAM_ID", "PARAM_DELIMITER", "QUOTED_STRING", 
		"STRING", "SINGLE_QUOTE", "LETTER", "WS"
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
		case 6: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\22\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\7\b8\n\b\f\b\16\b;\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\6\rg\n\r\r\r\16\rh\3\16\3\16\3\17\3\17\3\17\3\17\3\20\6\20r\n\20\r\20"+
		"\16\20s\3\21\3\21\3\22\3\22\3\23\6\23{\n\23\r\23\16\23|\3\23\3\23\2\24"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\2\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\2\1!\21\1#\2\1%\22\3\3\2\5\4\2\f\f\17"+
		"\17\4\2C\\c|\5\2\13\f\17\17\"\"\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2!\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2"+
		"\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21>\3\2\2\2\23I\3\2\2\2\25"+
		"U\3\2\2\2\27\\\3\2\2\2\31f\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37q\3\2\2\2"+
		"!u\3\2\2\2#w\3\2\2\2%z\3\2\2\2\'(\7_\2\2(\4\3\2\2\2)*\7+\2\2*\6\3\2\2"+
		"\2+,\7.\2\2,\b\3\2\2\2-.\7]\2\2.\n\3\2\2\2/\60\7*\2\2\60\f\3\2\2\2\61"+
		"\62\7=\2\2\62\16\3\2\2\2\63\64\7%\2\2\64\65\7%\2\2\659\3\2\2\2\668\n\2"+
		"\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2"+
		"<=\b\b\2\2=\20\3\2\2\2>?\7i\2\2?@\7g\2\2@A\7v\2\2AB\7e\2\2BC\7q\2\2CD"+
		"\7p\2\2DE\7v\2\2EF\7g\2\2FG\7p\2\2GH\7v\2\2H\22\3\2\2\2IJ\7j\2\2JK\7v"+
		"\2\2KL\7v\2\2LM\7r\2\2MN\7t\2\2NO\7g\2\2OP\7s\2\2PQ\7w\2\2QR\7g\2\2RS"+
		"\7u\2\2ST\7v\2\2T\24\3\2\2\2UV\7u\2\2VW\7{\2\2WX\7u\2\2XY\7q\2\2YZ\7w"+
		"\2\2Z[\7v\2\2[\26\3\2\2\2\\]\7u\2\2]^\7g\2\2^_\7v\2\2_`\7k\2\2`a\7p\2"+
		"\2ab\7r\2\2bc\7w\2\2cd\7v\2\2d\30\3\2\2\2eg\5#\22\2fe\3\2\2\2gh\3\2\2"+
		"\2hf\3\2\2\2hi\3\2\2\2i\32\3\2\2\2jk\7<\2\2k\34\3\2\2\2lm\5!\21\2mn\5"+
		"\37\20\2no\5!\21\2o\36\3\2\2\2pr\n\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2t \3\2\2\2uv\7)\2\2v\"\3\2\2\2wx\t\3\2\2x$\3\2\2\2y{\t\4\2\2"+
		"zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\23\3\2\177&"+
		"\3\2\2\2\7\29hs|";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}