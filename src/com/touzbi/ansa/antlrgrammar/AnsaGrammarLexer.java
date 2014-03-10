// Generated from AnsaGrammar.g4 by ANTLR 4.1
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
public class AnsaGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__3 = 1, T__2 = 2, T__1 = 3, T__0 = 4,
			LINE_COMMENT = 5, COMMAND_ID = 6, PARAM_ID = 7,
			PARAM_DELIMITER = 8, QUOTED_STRING = 9, SINGLE_QUOTE = 10, WS = 11;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "')'", "','",
			"'('", "';'", "LINE_COMMENT", "COMMAND_ID", "PARAM_ID", "':'",
			"QUOTED_STRING", "'''", "WS" };
	public static final String[] ruleNames = { "T__3", "T__2", "T__1", "T__0",
			"LINE_COMMENT", "COMMAND_ID", "PARAM_ID", "PARAM_DELIMITER",
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
		case 4:
			LINE_COMMENT_action((RuleContext) _localctx, actionIndex);
			break;

		case 12:
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\rP\b\1\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"
			+ "\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\6\3\6\3\7\6\7\62\n\7\r\7\16\7\63\3"
			+ "\b\6\b\67\n\b\r\b\16\b8\3\t\3\t\3\n\3\n\3\n\3\n\3\13\6\13B\n\13\r\13\16"
			+ "\13C\3\f\3\f\3\r\3\r\3\16\6\16K\n\16\r\16\16\16L\3\16\3\16\3C\17\3\3\1"
			+ "\5\4\1\7\5\1\t\6\1\13\7\2\r\b\1\17\t\1\21\n\1\23\13\1\25\2\1\27\f\1\31"
			+ "\2\1\33\r\3\3\2\6\4\2\f\f\17\17\13\2\f\f\17\17\"\"$$))\61\61==??^^\5\2"
			+ "//C\\c|\5\2\13\f\17\17\"\"R\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"
			+ "\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"
			+ "\2\27\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2"
			+ "\2\2\13%\3\2\2\2\r\61\3\2\2\2\17\66\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25"
			+ "A\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33J\3\2\2\2\35\36\7+\2\2\36\4\3\2\2"
			+ "\2\37 \7.\2\2 \6\3\2\2\2!\"\7*\2\2\"\b\3\2\2\2#$\7=\2\2$\n\3\2\2\2%&\7"
			+ "%\2\2&\'\7%\2\2\'+\3\2\2\2(*\n\2\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3"
			+ "\2\2\2,.\3\2\2\2-+\3\2\2\2./\b\6\2\2/\f\3\2\2\2\60\62\n\3\2\2\61\60\3"
			+ "\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\16\3\2\2\2\65\67\5"
			+ "\31\r\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\20\3\2\2\2:;"
			+ "\7<\2\2;\22\3\2\2\2<=\5\27\f\2=>\5\25\13\2>?\5\27\f\2?\24\3\2\2\2@B\n"
			+ "\2\2\2A@\3\2\2\2BC\3\2\2\2CD\3\2\2\2CA\3\2\2\2D\26\3\2\2\2EF\7)\2\2F\30"
			+ "\3\2\2\2GH\t\4\2\2H\32\3\2\2\2IK\t\5\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2"
			+ "LM\3\2\2\2MN\3\2\2\2NO\b\16\3\2O\34\3\2\2\2\b\2+\638CL";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}