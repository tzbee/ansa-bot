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

	Collection<String> execute(InputFactory... inputFactories);

	/**
	 * Add children commands to this command
	 * 
	 * @param commandBuilder
	 */

	CommandBuilder addChildrenCommands(Collection<CommandBuilder> commands);

	CommandBuilder addChildrenCommands(CommandBuilder... commands);

	Collection<CommandBuilder> getChildrenCommands();
}
