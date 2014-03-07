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
	public static final int DOWNLOAD = 1, HTTP_REQUEST = 2,
			GET_HTML_ATTRIBUTE = 3, SYSOUT = 4;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "'download'",
			"'httprequest'", "'gethtmlattribute'", "'sysout'" };
	public static final String[] ruleNames = { "DOWNLOAD", "HTTP_REQUEST",
			"GET_HTML_ATTRIBUTE", "SYSOUT" };

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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\68\b\1\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"
			+ "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"
			+ "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\2\6\3\3"
			+ "\1\5\4\1\7\5\1\t\6\1\3\2\2\67\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"
			+ "\3\2\2\2\3\13\3\2\2\2\5\24\3\2\2\2\7 \3\2\2\2\t\61\3\2\2\2\13\f\7f\2\2"
			+ "\f\r\7q\2\2\r\16\7y\2\2\16\17\7p\2\2\17\20\7n\2\2\20\21\7q\2\2\21\22\7"
			+ "c\2\2\22\23\7f\2\2\23\4\3\2\2\2\24\25\7j\2\2\25\26\7v\2\2\26\27\7v\2\2"
			+ "\27\30\7r\2\2\30\31\7t\2\2\31\32\7g\2\2\32\33\7s\2\2\33\34\7w\2\2\34\35"
			+ "\7g\2\2\35\36\7u\2\2\36\37\7v\2\2\37\6\3\2\2\2 !\7i\2\2!\"\7g\2\2\"#\7"
			+ "v\2\2#$\7j\2\2$%\7v\2\2%&\7o\2\2&\'\7n\2\2\'(\7c\2\2()\7v\2\2)*\7v\2\2"
			+ "*+\7t\2\2+,\7k\2\2,-\7d\2\2-.\7w\2\2./\7v\2\2/\60\7g\2\2\60\b\3\2\2\2"
			+ "\61\62\7u\2\2\62\63\7{\2\2\63\64\7u\2\2\64\65\7q\2\2\65\66\7w\2\2\66\67"
			+ "\7v\2\2\67\n\3\2\2\2\3\2";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}