// Generated from Commands.g4 by ANTLR 4.1
package com.touzbi.ansa.generatedgrammar;

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
	public static final int FORMAT = 1, GET_CONTENT_BY_REGEX = 2,
			GET_HTML_TEXT = 3, DOWNLOAD = 4, HTTP_REQUEST = 5,
			GET_HTML_ATTRIBUTE = 6, SYSOUT = 7;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "<INVALID>", "'format'",
			"'getcontentbyregex'", "'gethtmltext'", "'download'",
			"'httprequest'", "'gethtmlattribute'", "'print'" };
	public static final String[] ruleNames = { "FORMAT",
			"GET_CONTENT_BY_REGEX", "GET_HTML_TEXT", "DOWNLOAD",
			"HTTP_REQUEST", "GET_HTML_ATTRIBUTE", "SYSOUT" };

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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\tb\b\1\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"
			+ "\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"
			+ "\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"
			+ "\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"
			+ "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"
			+ "\3\b\3\b\3\b\3\b\3\b\2\t\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\3"
			+ "\2\2a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"
			+ "\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\30\3\2\2\2\7*\3\2\2\2\t\66\3\2\2"
			+ "\2\13?\3\2\2\2\rK\3\2\2\2\17\\\3\2\2\2\21\22\7h\2\2\22\23\7q\2\2\23\24"
			+ "\7t\2\2\24\25\7o\2\2\25\26\7c\2\2\26\27\7v\2\2\27\4\3\2\2\2\30\31\7i\2"
			+ "\2\31\32\7g\2\2\32\33\7v\2\2\33\34\7e\2\2\34\35\7q\2\2\35\36\7p\2\2\36"
			+ "\37\7v\2\2\37 \7g\2\2 !\7p\2\2!\"\7v\2\2\"#\7d\2\2#$\7{\2\2$%\7t\2\2%"
			+ "&\7g\2\2&\'\7i\2\2\'(\7g\2\2()\7z\2\2)\6\3\2\2\2*+\7i\2\2+,\7g\2\2,-\7"
			+ "v\2\2-.\7j\2\2./\7v\2\2/\60\7o\2\2\60\61\7n\2\2\61\62\7v\2\2\62\63\7g"
			+ "\2\2\63\64\7z\2\2\64\65\7v\2\2\65\b\3\2\2\2\66\67\7f\2\2\678\7q\2\289"
			+ "\7y\2\29:\7p\2\2:;\7n\2\2;<\7q\2\2<=\7c\2\2=>\7f\2\2>\n\3\2\2\2?@\7j\2"
			+ "\2@A\7v\2\2AB\7v\2\2BC\7r\2\2CD\7t\2\2DE\7g\2\2EF\7s\2\2FG\7w\2\2GH\7"
			+ "g\2\2HI\7u\2\2IJ\7v\2\2J\f\3\2\2\2KL\7i\2\2LM\7g\2\2MN\7v\2\2NO\7j\2\2"
			+ "OP\7v\2\2PQ\7o\2\2QR\7n\2\2RS\7c\2\2ST\7v\2\2TU\7v\2\2UV\7t\2\2VW\7k\2"
			+ "\2WX\7d\2\2XY\7w\2\2YZ\7v\2\2Z[\7g\2\2[\16\3\2\2\2\\]\7r\2\2]^\7t\2\2"
			+ "^_\7k\2\2_`\7p\2\2`a\7v\2\2a\20\3\2\2\2\3\2";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}