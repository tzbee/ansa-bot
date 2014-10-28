package com.touzbi.ansa.antlrwrapper;

import java.util.logging.LogManager;

import com.touzbi.ansa.antlrwrapper.parserwrapper.AnsaParserWrapper;
import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.commandloader.CommandLoader;
import com.touzbi.ansa.grammarlistener.BasicAnsaGrammarListener;

public class AnsaANTLRWrapper extends AbstractANTLRWrapper {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();

	public AnsaANTLRWrapper(CommandLoader commandStorage, String input,
			CommandBuilder commandBuilder) {
		super(new BasicAnsaGrammarListener(commandStorage, commandBuilder),
				new AnsaParserWrapper(input));

	}
}
