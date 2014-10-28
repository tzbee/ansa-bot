package com.touzbi.ansa.antlrwrapper.parserwrapper;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;


public abstract class AbstractParserWrapper implements ParserWrapper {
	private Lexer lexer;
	protected CommonTokenStream tokenStream;

	public AbstractParserWrapper(Lexer lexer) {
		this.lexer = lexer;
		this.tokenStream = new CommonTokenStream(this.lexer);
	}
}
