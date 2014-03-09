// Generated from Primitive.g4 by ANTLR 4.1
package com.touzbi.ansa.generatedgrammar;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class Primitive extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int QUOTED_STRING = 1, WS = 2;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "QUOTED_STRING",
			"WS" };
	public static final String[] ruleNames = { "QUOTED_STRING", "STRING", "WS" };

	public Primitive(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "Primitive.g4";
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
		case 2:
			WS_action((RuleContext) _localctx, actionIndex);
			break;
		}
	}

	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\4\37\b\1\4\2\t\2"
			+ "\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\22\n\2\3\3\6\3\25"
			+ "\n\3\r\3\16\3\26\3\4\6\4\32\n\4\r\4\16\4\33\3\4\3\4\2\5\3\3\1\5\2\1\7"
			+ "\4\2\3\2\4\4\2\13\f\17\17\5\2\13\f\17\17\"\" \2\3\3\2\2\2\2\7\3\2\2\2"
			+ "\3\21\3\2\2\2\5\24\3\2\2\2\7\31\3\2\2\2\t\n\7)\2\2\n\13\5\5\3\2\13\f\7"
			+ ")\2\2\f\22\3\2\2\2\r\16\7$\2\2\16\17\5\5\3\2\17\20\7$\2\2\20\22\3\2\2"
			+ "\2\21\t\3\2\2\2\21\r\3\2\2\2\22\4\3\2\2\2\23\25\n\2\2\2\24\23\3\2\2\2"
			+ "\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\6\3\2\2\2\30\32\t\3\2\2"
			+ "\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2"
			+ "\35\36\b\4\2\2\36\b\3\2\2\2\6\2\21\26\33";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}