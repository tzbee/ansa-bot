// Generated from MyGrammar.g4 by ANTLR 4.1
package com.touzbi.projectxtest.antlrtest;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, CONTENTGRABBER=5, HTTPREQUEST=6, INT=7, 
		COMMAND=8, WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "'='", "';'", "'contentgrabber'", "'httprequest'", 
		"INT", "'command'", "WS"
	};
	public static final int
		RULE_init = 0, RULE_instruction = 1, RULE_commandkey = 2, RULE_commandId = 3, 
		RULE_contentgrabbercommand = 4, RULE_httprequestcommand = 5;
	public static final String[] ruleNames = {
		"init", "instruction", "commandkey", "commandId", "contentgrabbercommand", 
		"httprequestcommand"
	};

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12); instruction();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMAND );
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

	public static class InstructionContext extends ParserRuleContext {
		public CommandkeyContext commandkey() {
			return getRuleContext(CommandkeyContext.class,0);
		}
		public CommandIdContext commandId() {
			return getRuleContext(CommandIdContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); commandkey();
			setState(18); match(3);
			setState(19); commandId();
			setState(20); match(4);
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

	public static class CommandkeyContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode COMMAND() { return getToken(MyGrammarParser.COMMAND, 0); }
		public CommandkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCommandkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCommandkey(this);
		}
	}

	public final CommandkeyContext commandkey() throws RecognitionException {
		CommandkeyContext _localctx = new CommandkeyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commandkey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(COMMAND);
			setState(23); match(INT);
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

	public static class CommandIdContext extends ParserRuleContext {
		public HttprequestcommandContext httprequestcommand() {
			return getRuleContext(HttprequestcommandContext.class,0);
		}
		public ContentgrabbercommandContext contentgrabbercommand() {
			return getRuleContext(ContentgrabbercommandContext.class,0);
		}
		public CommandIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCommandId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCommandId(this);
		}
	}

	public final CommandIdContext commandId() throws RecognitionException {
		CommandIdContext _localctx = new CommandIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commandId);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case HTTPREQUEST:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); httprequestcommand();
				}
				break;
			case CONTENTGRABBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); contentgrabbercommand();
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

	public static class ContentgrabbercommandContext extends ParserRuleContext {
		public TerminalNode CONTENTGRABBER() { return getToken(MyGrammarParser.CONTENTGRABBER, 0); }
		public ContentgrabbercommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentgrabbercommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterContentgrabbercommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitContentgrabbercommand(this);
		}
	}

	public final ContentgrabbercommandContext contentgrabbercommand() throws RecognitionException {
		ContentgrabbercommandContext _localctx = new ContentgrabbercommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_contentgrabbercommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(CONTENTGRABBER);
			setState(30); match(2);
			setState(31); match(1);
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

	public static class HttprequestcommandContext extends ParserRuleContext {
		public TerminalNode HTTPREQUEST() { return getToken(MyGrammarParser.HTTPREQUEST, 0); }
		public HttprequestcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httprequestcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterHttprequestcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitHttprequestcommand(this);
		}
	}

	public final HttprequestcommandContext httprequestcommand() throws RecognitionException {
		HttprequestcommandContext _localctx = new HttprequestcommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_httprequestcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(HTTPREQUEST);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\13&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5\36\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\2\b\2\4\6\b\n\f\2\2!\2\17\3\2\2\2\4\23\3\2\2\2\6\30\3\2\2\2\b\35\3"+
		"\2\2\2\n\37\3\2\2\2\f#\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2"+
		"\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24\25\7\5\2"+
		"\2\25\26\5\b\5\2\26\27\7\6\2\2\27\5\3\2\2\2\30\31\7\n\2\2\31\32\7\t\2"+
		"\2\32\7\3\2\2\2\33\36\5\f\7\2\34\36\5\n\6\2\35\33\3\2\2\2\35\34\3\2\2"+
		"\2\36\t\3\2\2\2\37 \7\7\2\2 !\7\4\2\2!\"\7\3\2\2\"\13\3\2\2\2#$\7\b\2"+
		"\2$\r\3\2\2\2\4\21\35";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}