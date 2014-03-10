// Generated from Commands.g4 by ANTLR 4.1
package com.touzbi.ansa.antlrgrammar;

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
	public static final int COMMAND_ID = 1;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "COMMAND_ID" };
	public static final String[] ruleNames = { "COMMAND_ID" };

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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\3\n\b\1\4\2\t\2\3"
			+ "\2\6\2\7\n\2\r\2\16\2\b\2\3\3\3\1\3\2\3\13\2\f\f\17\17\"\"$$))\61\61="
			+ "=??^^\n\2\3\3\2\2\2\3\6\3\2\2\2\5\7\n\2\2\2\6\5\3\2\2\2\7\b\3\2\2\2\b"
			+ "\6\3\2\2\2\b\t\3\2\2\2\t\4\3\2\2\2\4\2\b";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}