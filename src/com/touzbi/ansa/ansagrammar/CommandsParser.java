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
	public static final int GET_HTML_ELEMENT = 1, SYSOUT = 2;
	public static final String[] tokenNames = { "<INVALID>",
			"'gethtmlelement'", "'sysout'" };
	public static final int RULE_commandId = 0, RULE_gethtmlelement = 1,
			RULE_sysout = 2;
	public static final String[] ruleNames = { "commandId", "gethtmlelement",
			"sysout" };

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
		public GethtmlelementContext gethtmlelement() {
			return getRuleContext(GethtmlelementContext.class, 0);
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
			setState(8);
			switch (_input.LA(1)) {
			case SYSOUT:
				enterOuterAlt(_localctx, 1);
				{
					setState(6);
					sysout();
				}
				break;
			case GET_HTML_ELEMENT:
				enterOuterAlt(_localctx, 2);
				{
					setState(7);
					gethtmlelement();
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

	public static class GethtmlelementContext extends ParserRuleContext {
		public TerminalNode GET_HTML_ELEMENT() {
			return getToken(CommandsParser.GET_HTML_ELEMENT, 0);
		}

		public GethtmlelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_gethtmlelement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).enterGethtmlelement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CommandsListener)
				((CommandsListener) listener).exitGethtmlelement(this);
		}
	}

	public final GethtmlelementContext gethtmlelement()
			throws RecognitionException {
		GethtmlelementContext _localctx = new GethtmlelementContext(_ctx,
				getState());
		enterRule(_localctx, 2, RULE_gethtmlelement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(10);
				match(GET_HTML_ELEMENT);
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
		enterRule(_localctx, 4, RULE_sysout);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(12);
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

	public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\4\21\4\2\t\2\4\3"
			+ "\t\3\4\4\t\4\3\2\3\2\5\2\13\n\2\3\3\3\3\3\4\3\4\3\4\2\5\2\4\6\2\2\16\2"
			+ "\n\3\2\2\2\4\f\3\2\2\2\6\16\3\2\2\2\b\13\5\6\4\2\t\13\5\4\3\2\n\b\3\2"
			+ "\2\2\n\t\3\2\2\2\13\3\3\2\2\2\f\r\7\3\2\2\r\5\3\2\2\2\16\17\7\4\2\2\17"
			+ "\7\3\2\2\2\3\n";
	public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN
			.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}