package com.touzbi.ansa.antlr.parserwrapper;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

import com.touzbi.ansa.generatedgrammar.AnsaGrammarParser.InitContext;

public interface ParserWrapper {
	InitContext init() throws RecognitionException;

	Parser getParser();
}
