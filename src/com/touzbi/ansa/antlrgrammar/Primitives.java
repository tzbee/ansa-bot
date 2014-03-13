// Generated from Primitives.g4 by ANTLR 4.1
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
public class Primitives extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int QUOTED_STRING = 1, SINGLE_QUOTE = 2, WS = 3,
			ID = 4;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "QUOTED_STRING",
			"'''", "WS", "ID" };
	public static final String[] ruleNames = { "QUOTED_STRING", "STRING",
			"SINGLE_QUOTE", "LETTER", "NUMBER", "WS", "ID" };

	public Primitives(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "Primitives.g4";
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
		case 5:
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\6\60\b\1\4\2\t\2"
			+ "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\6"
			+ "\3\27\n\3\r\3\16\3\30\3\4\3\4\3\5\3\5\3\6\6\6 \n\6\r\6\16\6!\3\7\6\7%"
			+ "\n\7\r\7\16\7&\3\7\3\7\3\b\3\b\6\b-\n\b\r\b\16\b.\3\30\t\3\3\1\5\2\1\7"
			+ "\4\1\t\2\1\13\2\1\r\5\2\17\6\1\3\2\6\4\2\f\f\17\17\5\2//C\\c|\3\2\62;"
			+ "\5\2\13\f\17\17\"\"\61\2\3\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"
			+ "\2\3\21\3\2\2\2\5\26\3\2\2\2\7\32\3\2\2\2\t\34\3\2\2\2\13\37\3\2\2\2\r"
			+ "$\3\2\2\2\17,\3\2\2\2\21\22\5\7\4\2\22\23\5\5\3\2\23\24\5\7\4\2\24\4\3"
			+ "\2\2\2\25\27\n\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\30\26\3"
			+ "\2\2\2\31\6\3\2\2\2\32\33\7)\2\2\33\b\3\2\2\2\34\35\t\3\2\2\35\n\3\2\2"
			+ "\2\36 \t\4\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\f\3\2"
			+ "\2\2#%\t\5\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b"
			+ "\7\2\2)\16\3\2\2\2*-\5\t\5\2+-\5\13\6\2,*\3\2\2\2,+\3\2\2\2-.\3\2\2\2"
			+ ".,\3\2\2\2./\3\2\2\2/\20\3\2\2\2\b\2\30!&,.";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}