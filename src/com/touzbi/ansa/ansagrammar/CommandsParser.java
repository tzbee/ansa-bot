// Generated from Commands.g4 by ANTLR 4.1
package com.touzbi.ansa.ansagrammar;

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
public class CommandsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int DOWNLOAD = 1, HTTP_REQUEST = 2,
			GET_HTML_ATTRIBUTE = 3, SYSOUT = 4;
	public static final String[] tokenNames = { "<INVALID>", "'download'",
			"'httprequest'", "'gethtmlattribute'", "'sysout'" };
	public static final int RULE_commandId = 0, RULE_download = 1,
			RULE_httprequest = 2, RULE_gethtmlattribute = 3, RULE_sysout = 4;
	public static final String[] ruleNames = { "commandId", "download",
			"httprequest", "gethtmlattribute", "sysout" };

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
	public ATN getATN() {
		return _ATN;
	}

	public CommandsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
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
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).enterCommandId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).exitCommandId(this);
		}
	}

	public final CommandIdContext commandId() throws RecognitionException {
		CommandIdContext _localctx = new CommandIdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commandId);
		try {
			setState(14);
			switch (_input.LA(1)) {
			case SYSOUT:
				enterOuterAlt(_localctx, 1);
				{
					setState(10);
					sysout();
				}
				break;
			case GET_HTML_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
					setState(11);
					gethtmlattribute();
				}
				break;
			case HTTP_REQUEST:
				enterOuterAlt(_localctx, 3);
				{
					setState(12);
					httprequest();
				}
				break;
			case DOWNLOAD:
				enterOuterAlt(_localctx, 4);
				{
					setState(13);
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
			return getToken(CommandsParser.DOWNLOAD, 0);
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
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).enterDownload(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).exitDownload(this);
		}
	}

	public final DownloadContext download() throws RecognitionException {
		DownloadContext _localctx = new DownloadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_download);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(16);
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
			return getToken(CommandsParser.HTTP_REQUEST, 0);
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
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).enterHttprequest(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).exitHttprequest(this);
		}
	}

	public final HttprequestContext httprequest() throws RecognitionException {
		HttprequestContext _localctx = new HttprequestContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_httprequest);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(18);
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
			return getToken(CommandsParser.GET_HTML_ATTRIBUTE, 0);
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
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).enterGethtmlattribute(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).exitGethtmlattribute(this);
		}
	}

	public final GethtmlattributeContext gethtmlattribute()
			throws RecognitionException {
		GethtmlattributeContext _localctx = new GethtmlattributeContext(_ctx,
				getState());
		enterRule(_localctx, 6, RULE_gethtmlattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(20);
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
			return getToken(CommandsParser.SYSOUT, 0);
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
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).enterSysout(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).exitSysout(this);
		}
	}

	public final SysoutContext sysout() throws RecognitionException {
		SysoutContext _localctx = new SysoutContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sysout);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(22);
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\6\33\4\2\t\2\4\3"
			+ "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\4\3"
			+ "\4\3\5\3\5\3\6\3\6\3\6\2\7\2\4\6\b\n\2\2\30\2\20\3\2\2\2\4\22\3\2\2\2"
			+ "\6\24\3\2\2\2\b\26\3\2\2\2\n\30\3\2\2\2\f\21\5\n\6\2\r\21\5\b\5\2\16\21"
			+ "\5\6\4\2\17\21\5\4\3\2\20\f\3\2\2\2\20\r\3\2\2\2\20\16\3\2\2\2\20\17\3"
			+ "\2\2\2\21\3\3\2\2\2\22\23\7\3\2\2\23\5\3\2\2\2\24\25\7\4\2\2\25\7\3\2"
			+ "\2\2\26\27\7\5\2\2\27\t\3\2\2\2\30\31\7\6\2\2\31\13\3\2\2\2\3\20";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}