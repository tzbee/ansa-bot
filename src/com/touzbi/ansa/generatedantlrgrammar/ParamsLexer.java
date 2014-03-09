// Generated from Params.g4 by ANTLR 4.1
package com.touzbi.ansa.generatedantlrgrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParamsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, PARAM_ID=4, PARAM_DELIMITER=5, QUOTED_STRING=6, 
		SINGLE_QUOTE=7, WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'('", "PARAM_ID", "':'", "QUOTED_STRING", "'''", "WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "PARAM_ID", "PARAM_DELIMITER", "QUOTED_STRING", 
		"STRING", "SINGLE_QUOTE", "LETTER", "WS"
	};


	public ParamsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Params.g4"; }

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
		case 9: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\n8\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\37\n\5\r\5\16\5 \3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\6\b*\n\b\r\b\16\b+\3\t\3\t\3\n\3\n\3\13\6\13\63\n\13\r\13\16"+
		"\13\64\3\13\3\13\3+\f\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\2\1\21\t"+
		"\1\23\2\1\25\n\2\3\2\5\4\2\f\f\17\17\5\2//C\\c|\5\2\13\f\17\17\"\"8\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\21\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t"+
		"\36\3\2\2\2\13\"\3\2\2\2\r$\3\2\2\2\17)\3\2\2\2\21-\3\2\2\2\23/\3\2\2"+
		"\2\25\62\3\2\2\2\27\30\7+\2\2\30\4\3\2\2\2\31\32\7.\2\2\32\6\3\2\2\2\33"+
		"\34\7*\2\2\34\b\3\2\2\2\35\37\5\23\n\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3"+
		"\2\2\2 !\3\2\2\2!\n\3\2\2\2\"#\7<\2\2#\f\3\2\2\2$%\5\21\t\2%&\5\17\b\2"+
		"&\'\5\21\t\2\'\16\3\2\2\2(*\n\2\2\2)(\3\2\2\2*+\3\2\2\2+,\3\2\2\2+)\3"+
		"\2\2\2,\20\3\2\2\2-.\7)\2\2.\22\3\2\2\2/\60\t\3\2\2\60\24\3\2\2\2\61\63"+
		"\t\4\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66"+
		"\3\2\2\2\66\67\b\13\2\2\67\26\3\2\2\2\6\2 +\64";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}