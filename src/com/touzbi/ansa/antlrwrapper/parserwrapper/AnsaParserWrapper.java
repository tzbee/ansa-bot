package com.touzbi.ansa.antlrwrapper.parserwrapper;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.RecognitionException;

import com.touzbi.ansa.antlrgrammar.AnsaGrammarLexer;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser;
import com.touzbi.ansa.antlrgrammar.AnsaGrammarParser.InitContext;

public class AnsaParserWrapper extends AbstractParserWrapper {
	private AnsaGrammarParser ansaGrammarParser;

	public AnsaParserWrapper(String input) {
		super(new AnsaGrammarLexer(new ANTLRInputStream(input)));
		this.ansaGrammarParser = new AnsaGrammarParser(this.tokenStream);
	}

	@Override
	public InitContext init() throws RecognitionException {
		return this.ansaGrammarParser.init();
	}

	@Override
	public Parser getParser() {
		return this.ansaGrammarParser;
	}
}
