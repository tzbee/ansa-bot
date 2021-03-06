package com.touzbi.ansa.antlrwrapper;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.InitContext;
import com.touzbi.ansa.antlrwrapper.parserwrapper.ParserWrapper;

public abstract class AbstractANTLRWrapper {
	private ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
	private ParseTreeListener parseTreeListener;
	private ParserWrapper parserWrapper;
	private InitContext parseTree;

	public AbstractANTLRWrapper(ParseTreeListener parseTreeListener,
			ParserWrapper parserWrapper) {
		this.parseTreeListener = parseTreeListener;
		this.parserWrapper = parserWrapper;
		this.parseTree = this.parserWrapper.init();

		// Walk the tree
		this.parseTreeWalker.walk(this.parseTreeListener, this.parseTree);
	}

	@Override
	public String toString() {
		return this.parseTree.toStringTree(this.parserWrapper.getParser())
				.toString();
	}
}
