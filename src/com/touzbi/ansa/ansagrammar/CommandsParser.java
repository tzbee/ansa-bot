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
		FORMAT=1, GET_CONTENT=2, HTTP_REQUEST=3, SYSOUT=4, INPUT=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'format'", "'getcontent'", "'httprequest'", "'sysout'", 
		"'setinput'"
	};
	public static final int
		RULE_commandId = 0, RULE_format = 1, RULE_getcontent = 2, RULE_httprequest = 3, 
		RULE_sysout = 4, RULE_input = 5;
	public static final String[] ruleNames = {
		"commandId", "format", "getcontent", "httprequest", "sysout", "input"
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
		public GetcontentContext getcontent() {
			return getRuleContext(GetcontentContext.class,0);
		}
		public HttprequestContext httprequest() {
			return getRuleContext(HttprequestContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
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
			setState(17);
			switch (_input.LA(1)) {
			case SYSOUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(12); sysout();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(13); input();
				}
				break;
			case HTTP_REQUEST:
				enterOuterAlt(_localctx, 3);
				{
				setState(14); httprequest();
				}
				break;
			case GET_CONTENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(15); getcontent();
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(16); format();
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
			setState(19); match(FORMAT);
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

	public static class GetcontentContext extends ParserRuleContext {
		public TerminalNode GET_CONTENT() { return getToken(CommandsParser.GET_CONTENT, 0); }
		public GetcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterGetcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitGetcontent(this);
		}
	}

	public final GetcontentContext getcontent() throws RecognitionException {
		GetcontentContext _localctx = new GetcontentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_getcontent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); match(GET_CONTENT);
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
		enterRule(_localctx, 6, RULE_httprequest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); match(HTTP_REQUEST);
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
		enterRule(_localctx, 8, RULE_sysout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(SYSOUT);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(CommandsParser.INPUT, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandsListener ) ((CommandsListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(INPUT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\7 \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\b\2\4\6\b\n\f\2\2\35\2\23\3"+
		"\2\2\2\4\25\3\2\2\2\6\27\3\2\2\2\b\31\3\2\2\2\n\33\3\2\2\2\f\35\3\2\2"+
		"\2\16\24\5\n\6\2\17\24\5\f\7\2\20\24\5\b\5\2\21\24\5\6\4\2\22\24\5\4\3"+
		"\2\23\16\3\2\2\2\23\17\3\2\2\2\23\20\3\2\2\2\23\21\3\2\2\2\23\22\3\2\2"+
		"\2\24\3\3\2\2\2\25\26\7\3\2\2\26\5\3\2\2\2\27\30\7\4\2\2\30\7\3\2\2\2"+
		"\31\32\7\5\2\2\32\t\3\2\2\2\33\34\7\6\2\2\34\13\3\2\2\2\35\36\7\7\2\2"+
		"\36\r\3\2\2\2\3\23";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}