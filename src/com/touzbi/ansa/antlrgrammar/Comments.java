// Generated from Comments.g4 by ANTLR 4.1
package com.touzbi.ansa.antlrgrammar;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class Comments extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int LINE_COMMENT = 1;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "LINE_COMMENT" };
	public static final String[] ruleNames = { "LINE_COMMENT" };

	public Comments(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "Comments.g4";
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
		case 0:
			LINE_COMMENT_action((RuleContext) _localctx, actionIndex);
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\3\20\b\1\4\2\t\2"
			+ "\3\2\3\2\3\2\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\2\3\3\3\2\3\2\3\4\2"
			+ "\f\f\17\17\20\2\3\3\2\2\2\3\5\3\2\2\2\5\6\7%\2\2\6\7\7%\2\2\7\13\3\2\2"
			+ "\2\b\n\n\2\2\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\16"
			+ "\3\2\2\2\r\13\3\2\2\2\16\17\b\2\2\2\17\4\3\2\2\2\4\2\13";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}