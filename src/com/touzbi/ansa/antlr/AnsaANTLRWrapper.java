package com.touzbi.ansa.antlr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.ansagrammarlistener.MyAnsaGrammarListener;
import com.touzbi.ansa.antlr.parserwrapper.AnsaParserWrapper;
import com.touzbi.ansa.command.CommandBuilder;

public class AnsaANTLRWrapper extends AbstractANTLRWrapper {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();

	public AnsaANTLRWrapper(String input, CommandBuilder commandBuilder) {
		super(new MyAnsaGrammarListener(commandBuilder), new AnsaParserWrapper(
				input));

	}
}
