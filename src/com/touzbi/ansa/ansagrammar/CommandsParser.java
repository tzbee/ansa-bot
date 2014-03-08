// Generated from Commands.g4 by ANTLR 4.1
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
public class CommandsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FORMAT=1, GET_CONTENT_BY_REGEX=2, GET_HTML_TEXT=3, DOWNLOAD=4, HTTP_REQUEST=5, 
		GET_HTML_ATTRIBUTE=6, SYSOUT=7;
	public static final String[] tokenNames = {
		"<INVALID>", "'format'", "'getcontentbyregex'", "'gethtmltext'", "'download'", 
		"'httprequest'", "'gethtmlattribute'", "'sysout'"
	};
	public static final int
		RULE_commandId = 0, RULE_format = 1, RULE_getcontentbyregex = 2, RULE_gethtmltext = 3, 
		RULE_download = 4, RULE_httprequest = 5, RULE_gethtmlattribute = 6, RULE_sysout = 7;
	public static final String[] ruleNames = {
		"commandId", "format", "getcontentbyregex", "gethtmltext", "download", 
		"httprequest", "gethtmlattribute", "sysout"
	};

	@Override
	public String getGrammarFileName() { return "Commands.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandIdContext extends ParserRuleContext {
		public GethtmltextContext gethtmltext() {
			return getRuleContext(GethtmltextContext.class,0);
		}
		public HttprequestContext httprequest() {
			return getRuleContext(HttprequestContext.class,0);
		}
		public DownloadContext download() {
			return getRuleContext(DownloadContext.class,0);
		}
		public GetcontentbyregexContext getcontentbyregex() {
			return getRuleContext(GetcontentbyregexContext.class,0);
		}
		public GethtmlattributeContext gethtmlattribute() {
			return getRuleContext(GethtmlattributeContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public SysoutContext sysout() {
			return getRuleContext(SysoutContext.class,0);
		}
		public CommandIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterCommandId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitCommandId(this);
		}
	}

	public final CommandIdContext commandId() throws RecognitionException {
		CommandIdContext _localctx = new CommandIdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commandId);
		try {
			setState(23);
			switch (_input.LA(1)) {
			case SYSOUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(16); sysout();
				}
				break;
			case GET_HTML_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(17); gethtmlattribute();
				}
				break;
			case GET_HTML_TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(18); gethtmltext();
				}
				break;
			case GET_CONTENT_BY_REGEX:
				enterOuterAlt(_localctx, 4);
				{
				setState(19); getcontentbyregex();
				}
				break;
			case HTTP_REQUEST:
				enterOuterAlt(_localctx, 5);
				{
				setState(20); httprequest();
				}
				break;
			case DOWNLOAD:
				enterOuterAlt(_localctx, 6);
				{
				setState(21); download();
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(22); format();
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

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(CommandsParser.FORMAT, 0); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitFormat(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(FORMAT);
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

	public static class GetcontentbyregexContext extends ParserRuleContext {
		public TerminalNode GET_CONTENT_BY_REGEX() { return getToken(CommandsParser.GET_CONTENT_BY_REGEX, 0); }
		public GetcontentbyregexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getcontentbyregex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterGetcontentbyregex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitGetcontentbyregex(this);
		}
	}

	public final GetcontentbyregexContext getcontentbyregex() throws RecognitionException {
		GetcontentbyregexContext _localctx = new GetcontentbyregexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_getcontentbyregex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(GET_CONTENT_BY_REGEX);
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

	public static class GethtmltextContext extends ParserRuleContext {
		public TerminalNode GET_HTML_TEXT() { return getToken(CommandsParser.GET_HTML_TEXT, 0); }
		public GethtmltextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gethtmltext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterGethtmltext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitGethtmltext(this);
		}
	}

	public final GethtmltextContext gethtmltext() throws RecognitionException {
		GethtmltextContext _localctx = new GethtmltextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gethtmltext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(GET_HTML_TEXT);
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

	public static class DownloadContext extends ParserRuleContext {
		public TerminalNode DOWNLOAD() { return getToken(CommandsParser.DOWNLOAD, 0); }
		public DownloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_download; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterDownload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitDownload(this);
		}
	}

	public final DownloadContext download() throws RecognitionException {
		DownloadContext _localctx = new DownloadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_download);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(DOWNLOAD);
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

	public static class HttprequestContext extends ParserRuleContext {
		public TerminalNode HTTP_REQUEST() { return getToken(CommandsParser.HTTP_REQUEST, 0); }
		public HttprequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httprequest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterHttprequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitHttprequest(this);
		}
	}

	public final HttprequestContext httprequest() throws RecognitionException {
		HttprequestContext _localctx = new HttprequestContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_httprequest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(HTTP_REQUEST);
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

	public static class GethtmlattributeContext extends ParserRuleContext {
		public TerminalNode GET_HTML_ATTRIBUTE() { return getToken(CommandsParser.GET_HTML_ATTRIBUTE, 0); }
		public GethtmlattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gethtmlattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterGethtmlattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitGethtmlattribute(this);
		}
	}

	public final GethtmlattributeContext gethtmlattribute() throws RecognitionException {
		GethtmlattributeContext _localctx = new GethtmlattributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gethtmlattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(GET_HTML_ATTRIBUTE);
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

	public static class SysoutContext extends ParserRuleContext {
		public TerminalNode SYSOUT() { return getToken(CommandsParser.SYSOUT, 0); }
		public SysoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterSysout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitSysout(this);
		}
	}

	public final SysoutContext sysout() throws RecognitionException {
		SysoutContext _localctx = new SysoutContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sysout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(SYSOUT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\t*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\2\n\2\4\6\b\n\f\16\20\2\2\'\2\31\3\2\2\2\4\33\3\2\2\2\6\35"+
		"\3\2\2\2\b\37\3\2\2\2\n!\3\2\2\2\f#\3\2\2\2\16%\3\2\2\2\20\'\3\2\2\2\22"+
		"\32\5\20\t\2\23\32\5\16\b\2\24\32\5\b\5\2\25\32\5\6\4\2\26\32\5\f\7\2"+
		"\27\32\5\n\6\2\30\32\5\4\3\2\31\22\3\2\2\2\31\23\3\2\2\2\31\24\3\2\2\2"+
		"\31\25\3\2\2\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\3\3\2\2\2"+
		"\33\34\7\3\2\2\34\5\3\2\2\2\35\36\7\4\2\2\36\7\3\2\2\2\37 \7\5\2\2 \t"+
		"\3\2\2\2!\"\7\6\2\2\"\13\3\2\2\2#$\7\7\2\2$\r\3\2\2\2%&\7\b\2\2&\17\3"+
		"\2\2\2\'(\7\t\2\2(\21\3\2\2\2\3\31";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}