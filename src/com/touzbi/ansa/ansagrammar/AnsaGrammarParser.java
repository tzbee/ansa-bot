// Generated from AnsaGrammar.g4 by ANTLR 4.1
package com.touzbi.ansa.ansagrammar;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
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
			LINE_COMMENT = 5, DOWNLOAD = 6, HTTP_REQUEST = 7,
			GET_HTML_ATTRIBUTE = 8, SYSOUT = 9, PARAM_ID = 10,
			PARAM_DELIMITER = 11, QUOTED_STRING = 12, SINGLE_QUOTE = 13,
			WS = 14;
	public static final String[] tokenNames = { "<INVALID>", "')'", "','",
			"'('", "';'", "LINE_COMMENT", "'download'", "'httprequest'",
			"'gethtmlattribute'", "'sysout'", "PARAM_ID", "':'",
			"QUOTED_STRING", "'''", "WS" };
	public static final int RULE_init = 0, RULE_commandBlock = 1,
			RULE_commandId = 2, RULE_download = 3, RULE_httprequest = 4,
			RULE_gethtmlattribute = 5, RULE_sysout = 6, RULE_paramBlock = 7,
			RULE_paramList = 8, RULE_paramPair = 9, RULE_paramName = 10,
			RULE_paramValue = 11;
	public static final String[] ruleNames = { "init", "commandBlock",
			"commandId", "download", "httprequest", "gethtmlattribute",
			"sysout", "paramBlock", "paramList", "paramPair", "paramName",
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
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOWNLOAD)
						| (1L << HTTP_REQUEST) | (1L << GET_HTML_ATTRIBUTE) | (1L << SYSOUT))) != 0)) {
					{
						{
							setState(24);
							commandBlock();
							setState(25);
							match(4);
						}
					}
					setState(31);
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
				setState(32);
				commandId();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == 3) {
					{
						{
							setState(33);
							paramBlock();
						}
					}
					setState(38);
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
		public HttprequestContext httprequest() {
			return getRuleContext(HttprequestContext.class, 0);
		}

		public DownloadContext download() {
			return getRuleContext(DownloadContext.class, 0);
		}

		public GethtmlattributeContext gethtmlattribute() {
			return getRuleContext(GethtmlattributeContext.class, 0);
		}

		public SysoutContext sysout() {
			return getRuleContext(SysoutContext.class, 0);
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
			setState(43);
			switch (_input.LA(1)) {
			case SYSOUT:
				enterOuterAlt(_localctx, 1);
				{
					setState(39);
					sysout();
				}
				break;
			case GET_HTML_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
					setState(40);
					gethtmlattribute();
				}
				break;
			case HTTP_REQUEST:
				enterOuterAlt(_localctx, 3);
				{
					setState(41);
					httprequest();
				}
				break;
			case DOWNLOAD:
				enterOuterAlt(_localctx, 4);
				{
					setState(42);
					download();
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

	public static class DownloadContext extends ParserRuleContext {
		public TerminalNode DOWNLOAD() {
			return getToken(AnsaGrammarParser.DOWNLOAD, 0);
		}

		public DownloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_download;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterDownload(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitDownload(this);
		}
	}

	public final DownloadContext download() throws RecognitionException {
		DownloadContext _localctx = new DownloadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_download);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(45);
				match(DOWNLOAD);
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

	public static class HttprequestContext extends ParserRuleContext {
		public TerminalNode HTTP_REQUEST() {
			return getToken(AnsaGrammarParser.HTTP_REQUEST, 0);
		}

		public HttprequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_httprequest;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterHttprequest(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitHttprequest(this);
		}
	}

	public final HttprequestContext httprequest() throws RecognitionException {
		HttprequestContext _localctx = new HttprequestContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_httprequest);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(47);
				match(HTTP_REQUEST);
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

	public static class GethtmlattributeContext extends ParserRuleContext {
		public TerminalNode GET_HTML_ATTRIBUTE() {
			return getToken(AnsaGrammarParser.GET_HTML_ATTRIBUTE, 0);
		}

		public GethtmlattributeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_gethtmlattribute;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterGethtmlattribute(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitGethtmlattribute(this);
		}
	}

	public final GethtmlattributeContext gethtmlattribute()
			throws RecognitionException {
		GethtmlattributeContext _localctx = new GethtmlattributeContext(_ctx,
				getState());
		enterRule(_localctx, 10, RULE_gethtmlattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(49);
				match(GET_HTML_ATTRIBUTE);
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

	public static class SysoutContext extends ParserRuleContext {
		public TerminalNode SYSOUT() {
			return getToken(AnsaGrammarParser.SYSOUT, 0);
		}

		public SysoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sysout;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).enterSysout(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof AnsaGrammarListener)
				((AnsaGrammarListener) listener).exitSysout(this);
		}
	}

	public final SysoutContext sysout() throws RecognitionException {
		SysoutContext _localctx = new SysoutContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sysout);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(51);
				match(SYSOUT);
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
		enterRule(_localctx, 14, RULE_paramBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(53);
				match(3);
				setState(54);
				paramList();
				setState(55);
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
		enterRule(_localctx, 16, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(57);
				paramPair();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == 2) {
					{
						{
							setState(58);
							match(2);
							setState(59);
							paramPair();
						}
					}
					setState(64);
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
		enterRule(_localctx, 18, RULE_paramPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(65);
				paramName();
				setState(66);
				match(PARAM_DELIMITER);
				setState(67);
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
		public TerminalNode PARAM_ID() {
			return getToken(AnsaGrammarParser.PARAM_ID, 0);
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
		enterRule(_localctx, 20, RULE_paramName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(69);
				match(PARAM_ID);
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
		enterRule(_localctx, 22, RULE_paramValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(71);
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\20L\4\2\t\2\4\3\t"
			+ "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"
			+ "\f\t\f\4\r\t\r\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\7\3%\n\3"
			+ "\f\3\16\3(\13\3\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"
			+ "\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n?\n\n\f\n\16\nB\13\n\3\13\3\13\3\13"
			+ "\3\13\3\f\3\f\3\r\3\r\3\r\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2E\2\37"
			+ "\3\2\2\2\4\"\3\2\2\2\6-\3\2\2\2\b/\3\2\2\2\n\61\3\2\2\2\f\63\3\2\2\2\16"
			+ "\65\3\2\2\2\20\67\3\2\2\2\22;\3\2\2\2\24C\3\2\2\2\26G\3\2\2\2\30I\3\2"
			+ "\2\2\32\33\5\4\3\2\33\34\7\6\2\2\34\36\3\2\2\2\35\32\3\2\2\2\36!\3\2\2"
			+ "\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\"&\5\6\4\2#%\5\20"
			+ "\t\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2)."
			+ "\5\16\b\2*.\5\f\7\2+.\5\n\6\2,.\5\b\5\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2"
			+ "-,\3\2\2\2.\7\3\2\2\2/\60\7\b\2\2\60\t\3\2\2\2\61\62\7\t\2\2\62\13\3\2"
			+ "\2\2\63\64\7\n\2\2\64\r\3\2\2\2\65\66\7\13\2\2\66\17\3\2\2\2\678\7\5\2"
			+ "\289\5\22\n\29:\7\3\2\2:\21\3\2\2\2;@\5\24\13\2<=\7\4\2\2=?\5\24\13\2"
			+ "><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\23\3\2\2\2B@\3\2\2\2CD\5\26"
			+ "\f\2DE\7\r\2\2EF\5\30\r\2F\25\3\2\2\2GH\7\f\2\2H\27\3\2\2\2IJ\7\16\2\2"
			+ "J\31\3\2\2\2\6\37&-@";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}