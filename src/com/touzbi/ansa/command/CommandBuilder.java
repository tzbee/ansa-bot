package com.touzbi.ansa.command;

import java.util.Collection;

import com.touzbi.ansa.inputfactory.InputFactory;

public interface CommandBuilder {
	/**
	 * Parameters handling
	 * 
	 * @param paramName
	 * @param paramValue
	 */

	CommandBuilder addParam(String paramName, String paramValue);

	String getParamValue(String paramName);

	/**
	 * Execute command
	 * 
	 * @param inputs
	 * @return results of the command
	 */

	Collection<String> execute(String input);

	Collection<String> execute(Collection<String> inputs);

	Collection<String> execute(InputFactory inputFactory);

	/**
	 * Add a command builder
	 * 
	 * @param commandBuilder
	 */

	CommandBuilder addCommandBuilders(Collection<CommandBuilder> commandBuilders);

	CommandBuilder addCommandBuilders(CommandBuilder... commandBuilders);
}
