// Generated from Commands.g4 by ANTLR 4.1
package com.touzbi.ansa.ansagrammar;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class CommandsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int GET_HTML_ELEMENT = 1, SYSOUT = 2;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>",
			"'gethtmlelement'", "'sysout'" };
	public static final String[] ruleNames = { "GET_HTML_ELEMENT", "SYSOUT" };

	public CommandsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "Commands.g4";
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\4\35\b\1\4\2\t\2"
			+ "\4\3\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"
			+ "\3\3\3\3\3\3\3\3\3\3\3\3\3\2\4\3\3\1\5\4\1\3\2\2\34\2\3\3\2\2\2\2\5\3"
			+ "\2\2\2\3\7\3\2\2\2\5\26\3\2\2\2\7\b\7i\2\2\b\t\7g\2\2\t\n\7v\2\2\n\13"
			+ "\7j\2\2\13\f\7v\2\2\f\r\7o\2\2\r\16\7n\2\2\16\17\7g\2\2\17\20\7n\2\2\20"
			+ "\21\7g\2\2\21\22\7o\2\2\22\23\7g\2\2\23\24\7p\2\2\24\25\7v\2\2\25\4\3"
			+ "\2\2\2\26\27\7u\2\2\27\30\7{\2\2\30\31\7u\2\2\31\32\7q\2\2\32\33\7w\2"
			+ "\2\33\34\7v\2\2\34\6\3\2\2\2\3\2";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}