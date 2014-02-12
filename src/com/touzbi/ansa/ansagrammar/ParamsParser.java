// Generated from Params.g4 by ANTLR 4.1
package com.touzbi.ansa.ansagrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParamsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, PARAM_ID=6, PARAM_DELIMITER=7, 
		QUOTED_STRING=8, SINGLE_QUOTE=9, WS=10;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "','", "'['", "'('", "PARAM_ID", "':'", "QUOTED_STRING", 
		"'''", "WS"
	};
	public static final int
		RULE_paramBlock = 0, RULE_paramList = 1, RULE_paramPair = 2, RULE_paramName = 3, 
		RULE_paramValues = 4, RULE_paramValue = 5;
	public static final String[] ruleNames = {
		"paramBlock", "paramList", "paramPair", "paramName", "paramValues", "paramValue"
	};

	@Override
	public String getGrammarFileName() { return "Params.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParamsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParamBlockContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).enterParamBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).exitParamBlock(this);
		}
	}

	public final ParamBlockContext paramBlock() throws RecognitionException {
		ParamBlockContext _localctx = new ParamBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_paramBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(5);
			setState(13); paramList();
			setState(14); match(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public ParamPairContext paramPair(int i) {
			return getRuleContext(ParamPairContext.class,i);
		}
		public List<ParamPairContext> paramPair() {
			return getRuleContexts(ParamPairContext.class);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); paramPair();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(17); match(3);
				setState(18); paramPair();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamPairContext extends ParserRuleContext {
		public ParamNameContext paramName() {
			return getRuleContext(ParamNameContext.class,0);
		}
		public TerminalNode PARAM_DELIMITER() { return getToken(ParamsParser.PARAM_DELIMITER, 0); }
		public ParamValuesContext paramValues() {
			return getRuleContext(ParamValuesContext.class,0);
		}
		public ParamPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).enterParamPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).exitParamPair(this);
		}
	}

	public final ParamPairContext paramPair() throws RecognitionException {
		ParamPairContext _localctx = new ParamPairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); paramName();
			setState(25); match(PARAM_DELIMITER);
			setState(26); paramValues();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamNameContext extends ParserRuleContext {
		public TerminalNode PARAM_ID() { return getToken(ParamsParser.PARAM_ID, 0); }
		public ParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).enterParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).exitParamName(this);
		}
	}

	public final ParamNameContext paramName() throws RecognitionException {
		ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(PARAM_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamValuesContext extends ParserRuleContext {
		public ParamValueContext paramValue(int i) {
			return getRuleContext(ParamValueContext.class,i);
		}
		public List<ParamValueContext> paramValue() {
			return getRuleContexts(ParamValueContext.class);
		}
		public ParamValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).enterParamValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).exitParamValues(this);
		}
	}

	public final ParamValuesContext paramValues() throws RecognitionException {
		ParamValuesContext _localctx = new ParamValuesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramValues);
		int _la;
		try {
			setState(42);
			switch (_input.LA(1)) {
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); paramValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); match(4);
				setState(32); paramValue();
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(33); match(3);
					setState(34); paramValue();
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40); match(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamValueContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(ParamsParser.QUOTED_STRING, 0); }
		public ParamValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).enterParamValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamsListener ) ((ParamsListener)listener).exitParamValue(this);
		}
	}

	public final ParamValueContext paramValue() throws RecognitionException {
		ParamValueContext _localctx = new ParamValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\f\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6"+
		"&\n\6\f\6\16\6)\13\6\3\6\3\6\5\6-\n\6\3\7\3\7\3\7\2\b\2\4\6\b\n\f\2\2"+
		"-\2\16\3\2\2\2\4\22\3\2\2\2\6\32\3\2\2\2\b\36\3\2\2\2\n,\3\2\2\2\f.\3"+
		"\2\2\2\16\17\7\7\2\2\17\20\5\4\3\2\20\21\7\4\2\2\21\3\3\2\2\2\22\27\5"+
		"\6\4\2\23\24\7\5\2\2\24\26\5\6\4\2\25\23\3\2\2\2\26\31\3\2\2\2\27\25\3"+
		"\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32\33\5\b\5\2\33\34\7"+
		"\t\2\2\34\35\5\n\6\2\35\7\3\2\2\2\36\37\7\b\2\2\37\t\3\2\2\2 -\5\f\7\2"+
		"!\"\7\6\2\2\"\'\5\f\7\2#$\7\5\2\2$&\5\f\7\2%#\3\2\2\2&)\3\2\2\2\'%\3\2"+
		"\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\3\2\2+-\3\2\2\2, \3\2\2\2,!\3"+
		"\2\2\2-\13\3\2\2\2./\7\n\2\2/\r\3\2\2\2\5\27\',";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}