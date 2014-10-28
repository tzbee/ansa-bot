// Generated from Params.g4 by ANTLR 4.1
package com.touzbi.ansa.antlrgrammar;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class ParamsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__2 = 1, T__1 = 2, T__0 = 3, PARAM_DELIMITER = 4,
			QUOTED_STRING = 5, SINGLE_QUOTE = 6, WS = 7, ID = 8;
	public static final String[] tokenNames = { "<INVALID>", "')'", "','",
			"'('", "':'", "QUOTED_STRING", "'''", "WS", "ID" };
	public static final int RULE_paramBlock = 0, RULE_paramList = 1,
			RULE_paramPair = 2, RULE_paramName = 3, RULE_paramValue = 4,
			RULE_paramString = 5, RULE_paramRef = 6;
	public static final String[] ruleNames = { "paramBlock", "paramList",
			"paramPair", "paramName", "paramValue", "paramString", "paramRef" };

	@Override
	public String getGrammarFileName() {
		return "Params.g4";
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
	public ATN getATN() {
		return _ATN;
	}

	public ParamsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class ParamBlockContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class, 0);
		}

		public ParamBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_paramBlock;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).enterParamBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).exitParamBlock(this);
		}
	}

	public final ParamBlockContext paramBlock() throws RecognitionException {
		ParamBlockContext _localctx = new ParamBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_paramBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(14);
				match(3);
				setState(15);
				paramList();
				setState(16);
				match(1);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public ParamPairContext paramPair(int i) {
			return getRuleContext(ParamPairContext.class, i);
		}

		public List<ParamPairContext> paramPair() {
			return getRuleContexts(ParamPairContext.class);
		}

		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_paramList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).enterParamList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(18);
				paramPair();
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == 2) {
					{
						{
							setState(19);
							match(2);
							setState(20);
							paramPair();
						}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamPairContext extends ParserRuleContext {
		public ParamNameContext paramName() {
			return getRuleContext(ParamNameContext.class, 0);
		}

		public TerminalNode PARAM_DELIMITER() {
			return getToken(ParamsParser.PARAM_DELIMITER, 0);
		}

		public ParamValueContext paramValue() {
			return getRuleContext(ParamValueContext.class, 0);
		}

		public ParamPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_paramPair;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).enterParamPair(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).exitParamPair(this);
		}
	}

	public final ParamPairContext paramPair() throws RecognitionException {
		ParamPairContext _localctx = new ParamPairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(26);
				paramName();
				setState(27);
				match(PARAM_DELIMITER);
				setState(28);
				paramValue();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamNameContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(ParamsParser.ID, 0);
		}

		public ParamNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_paramName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).enterParamName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).exitParamName(this);
		}
	}

	public final ParamNameContext paramName() throws RecognitionException {
		ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(30);
				match(ID);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamValueContext extends ParserRuleContext {
		public ParamStringContext paramString() {
			return getRuleContext(ParamStringContext.class, 0);
		}

		public ParamRefContext paramRef() {
			return getRuleContext(ParamRefContext.class, 0);
		}

		public ParamValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_paramValue;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).enterParamValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).exitParamValue(this);
		}
	}

	public final ParamValueContext paramValue() throws RecognitionException {
		ParamValueContext _localctx = new ParamValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramValue);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 1);
				{
					setState(32);
					paramString();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
					setState(33);
					paramRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamStringContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() {
			return getToken(ParamsParser.QUOTED_STRING, 0);
		}

		public ParamStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_paramString;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).enterParamString(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).exitParamString(this);
		}
	}

	public final ParamStringContext paramString() throws RecognitionException {
		ParamStringContext _localctx = new ParamStringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramString);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(36);
				match(QUOTED_STRING);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamRefContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(ParamsParser.ID, 0);
		}

		public ParamRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_paramRef;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).enterParamRef(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ParamsListener)
				((ParamsListener) listener).exitParamRef(this);
		}
	}

	public final ParamRefContext paramRef() throws RecognitionException {
		ParamRefContext _localctx = new ParamRefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(38);
				match(ID);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\n+\4\2\t\2\4\3\t"
			+ "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3\3"
			+ "\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\5\6%\n\6"
			+ "\3\7\3\7\3\b\3\b\3\b\2\t\2\4\6\b\n\f\16\2\2%\2\20\3\2\2\2\4\24\3\2\2\2"
			+ "\6\34\3\2\2\2\b \3\2\2\2\n$\3\2\2\2\f&\3\2\2\2\16(\3\2\2\2\20\21\7\5\2"
			+ "\2\21\22\5\4\3\2\22\23\7\3\2\2\23\3\3\2\2\2\24\31\5\6\4\2\25\26\7\4\2"
			+ "\2\26\30\5\6\4\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2"
			+ "\2\32\5\3\2\2\2\33\31\3\2\2\2\34\35\5\b\5\2\35\36\7\6\2\2\36\37\5\n\6"
			+ "\2\37\7\3\2\2\2 !\7\n\2\2!\t\3\2\2\2\"%\5\f\7\2#%\5\16\b\2$\"\3\2\2\2"
			+ "$#\3\2\2\2%\13\3\2\2\2&\'\7\7\2\2\'\r\3\2\2\2()\7\n\2\2)\17\3\2\2\2\4"
			+ "\31$";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}