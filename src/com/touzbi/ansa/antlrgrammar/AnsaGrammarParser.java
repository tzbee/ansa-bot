// Generated from AnsaGrammar.g4 by ANTLR 4.1
package com.touzbi.ansa.antlrgrammar;

import java.util.List;

import org.antlr.v4.runtime.Parser;
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
public class AnsaGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__3 = 1, T__2 = 2, T__1 = 3, T__0 = 4,
			LINE_COMMENT = 5, PARAM_DELIMITER = 6, QUOTED_STRING = 7,
			SINGLE_QUOTE = 8, WS = 9, ID = 10;
	public static final String[] tokenNames = { "<INVALID>", "')'", "','",
			"'('", "';'", "LINE_COMMENT", "':'", "QUOTED_STRING", "'''", "WS",
			"ID" };
	public static final int RULE_init = 0, RULE_commandBlock = 1,
			RULE_commandId = 2, RULE_paramBlock = 3, RULE_paramList = 4,
			RULE_paramPair = 5, RULE_paramName = 6, RULE_paramValue = 7;
	public static final String[] ruleNames = { "init", "commandBlock",
			"commandId", "paramBlock", "paramList", "paramPair", "paramName",
			"paramValue" };

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
	public ATN getATN() {
		return _ATN;
	}

	public AnsaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public CommandBlockContext commandBlock(int i) {
			return getRuleContext(CommandBlockContext.class, i);
		}

		public List<CommandBlockContext> commandBlock() {
			return getRuleContexts(CommandBlockContext.class);
		}

		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_init;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterInit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == ID) {
					{
						{
							setState(16);
							commandBlock();
							setState(17);
							match(4);
						}
					}
					setState(23);
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

	public static class CommandBlockContext extends ParserRuleContext {
		public ParamBlockContext paramBlock(int i) {
			return getRuleContext(ParamBlockContext.class, i);
		}

		public CommandIdContext commandId() {
			return getRuleContext(CommandIdContext.class, 0);
		}

		public List<ParamBlockContext> paramBlock() {
			return getRuleContexts(ParamBlockContext.class);
		}

		public CommandBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_commandBlock;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterCommandBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitCommandBlock(this);
		}
	}

	public final CommandBlockContext commandBlock() throws RecognitionException {
		CommandBlockContext _localctx = new CommandBlockContext(_ctx,
				getState());
		enterRule(_localctx, 2, RULE_commandBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(24);
				commandId();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == 3) {
					{
						{
							setState(25);
							paramBlock();
						}
					}
					setState(30);
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

	public static class CommandIdContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(AnsaGrammarParser.ID, 0);
		}

		public CommandIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_commandId;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterCommandId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitCommandId(this);
		}
	}

	public final CommandIdContext commandId() throws RecognitionException {
		CommandIdContext _localctx = new CommandIdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commandId);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(31);
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
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterParamBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitParamBlock(this);
		}
	}

	public final ParamBlockContext paramBlock() throws RecognitionException {
		ParamBlockContext _localctx = new ParamBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(33);
				match(3);
				setState(34);
				paramList();
				setState(35);
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
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterParamList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(37);
				paramPair();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == 2) {
					{
						{
							setState(38);
							match(2);
							setState(39);
							paramPair();
						}
					}
					setState(44);
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
			return getToken(AnsaGrammarParser.PARAM_DELIMITER, 0);
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
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterParamPair(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitParamPair(this);
		}
	}

	public final ParamPairContext paramPair() throws RecognitionException {
		ParamPairContext _localctx = new ParamPairContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(45);
				paramName();
				setState(46);
				match(PARAM_DELIMITER);
				setState(47);
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
			return getToken(AnsaGrammarParser.ID, 0);
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
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterParamName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitParamName(this);
		}
	}

	public final ParamNameContext paramName() throws RecognitionException {
		ParamNameContext _localctx = new ParamNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(49);
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
		public TerminalNode QUOTED_STRING() {
			return getToken(AnsaGrammarParser.QUOTED_STRING, 0);
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
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterParamValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitParamValue(this);
		}
	}

	public final ParamValueContext paramValue() throws RecognitionException {
		ParamValueContext _localctx = new ParamValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(51);
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\f8\4\2\t\2\4\3\t"
			+ "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"
			+ "\n\2\f\2\16\2\31\13\2\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3\5\3"
			+ "\5\3\5\3\5\3\6\3\6\3\6\7\6+\n\6\f\6\16\6.\13\6\3\7\3\7\3\7\3\7\3\b\3\b"
			+ "\3\t\3\t\3\t\2\n\2\4\6\b\n\f\16\20\2\2\62\2\27\3\2\2\2\4\32\3\2\2\2\6"
			+ "!\3\2\2\2\b#\3\2\2\2\n\'\3\2\2\2\f/\3\2\2\2\16\63\3\2\2\2\20\65\3\2\2"
			+ "\2\22\23\5\4\3\2\23\24\7\6\2\2\24\26\3\2\2\2\25\22\3\2\2\2\26\31\3\2\2"
			+ "\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32\36\5\6\4"
			+ "\2\33\35\5\b\5\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2"
			+ "\37\5\3\2\2\2 \36\3\2\2\2!\"\7\f\2\2\"\7\3\2\2\2#$\7\5\2\2$%\5\n\6\2%"
			+ "&\7\3\2\2&\t\3\2\2\2\',\5\f\7\2()\7\4\2\2)+\5\f\7\2*(\3\2\2\2+.\3\2\2"
			+ "\2,*\3\2\2\2,-\3\2\2\2-\13\3\2\2\2.,\3\2\2\2/\60\5\16\b\2\60\61\7\b\2"
			+ "\2\61\62\5\20\t\2\62\r\3\2\2\2\63\64\7\f\2\2\64\17\3\2\2\2\65\66\7\t\2"
			+ "\2\66\21\3\2\2\2\5\27\36,";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}