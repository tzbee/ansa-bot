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
			LINE_COMMENT = 5, PARAM_DELIMITER = 6, QUOTED_STRING = 7,
			SINGLE_QUOTE = 8, WS = 9, ID = 10;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "')'", "','",
			"'('", "';'", "LINE_COMMENT", "':'", "QUOTED_STRING", "'''", "WS",
			"ID" };
	public static final String[] ruleNames = { "T__3", "T__2", "T__1", "T__0",
			"LINE_COMMENT", "PARAM_DELIMITER", "QUOTED_STRING", "STRING",
			"SINGLE_QUOTE", "LETTER", "NUMBER", "WS", "ID" };

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

		case 11:
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\fQ\b\1\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"
			+ "\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\6"
			+ "\t8\n\t\r\t\16\t9\3\n\3\n\3\13\3\13\3\f\6\fA\n\f\r\f\16\fB\3\r\6\rF\n"
			+ "\r\r\r\16\rG\3\r\3\r\3\16\3\16\6\16N\n\16\r\16\16\16O\39\17\3\3\1\5\4"
			+ "\1\7\5\1\t\6\1\13\7\2\r\b\1\17\t\1\21\2\1\23\n\1\25\2\1\27\2\1\31\13\3"
			+ "\33\f\1\3\2\6\4\2\f\f\17\17\5\2//C\\c|\3\2\62;\5\2\13\f\17\17\"\"S\2\3"
			+ "\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"
			+ "\2\17\3\2\2\2\2\23\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37"
			+ "\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\60\3\2\2\2\17\62\3\2\2\2"
			+ "\21\67\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27@\3\2\2\2\31E\3\2\2\2\33M\3\2"
			+ "\2\2\35\36\7+\2\2\36\4\3\2\2\2\37 \7.\2\2 \6\3\2\2\2!\"\7*\2\2\"\b\3\2"
			+ "\2\2#$\7=\2\2$\n\3\2\2\2%&\7%\2\2&\'\7%\2\2\'+\3\2\2\2(*\n\2\2\2)(\3\2"
			+ "\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\b\6\2\2/\f\3"
			+ "\2\2\2\60\61\7<\2\2\61\16\3\2\2\2\62\63\5\23\n\2\63\64\5\21\t\2\64\65"
			+ "\5\23\n\2\65\20\3\2\2\2\668\n\2\2\2\67\66\3\2\2\289\3\2\2\29:\3\2\2\2"
			+ "9\67\3\2\2\2:\22\3\2\2\2;<\7)\2\2<\24\3\2\2\2=>\t\3\2\2>\26\3\2\2\2?A"
			+ "\t\4\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\30\3\2\2\2DF\t\5\2\2"
			+ "ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\r\3\2J\32\3\2\2"
			+ "\2KN\5\25\13\2LN\5\27\f\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3"
			+ "\2\2\2P\34\3\2\2\2\t\2+9BGMO";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}