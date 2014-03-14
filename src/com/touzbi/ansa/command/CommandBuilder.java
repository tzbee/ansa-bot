package com.touzbi.ansa.command;

import java.util.Collection;

import com.touzbi.ansa.inputfactory.InputFactory;
import com.touzbi.ansa.param.paramfactory.ParamFactory;

public interface CommandBuilder {

	/**
	 * Parameters handling
	 * 
	 * @param paramName
	 * @param paramValue
	 */

	CommandBuilder addParam(String paramName, String paramValue);

	CommandBuilder addParam(String paramName, ParamFactory paramFactory);

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
	 * Command Structure
	 * 
	 * @param commandBuilder
	 */

	CommandBuilder addChildrenCommands(Collection<CommandBuilder> commands);

	CommandBuilder addChildrenCommands(CommandBuilder... commands);

	Collection<CommandBuilder> getChildrenCommands();

	CommandBuilder getParentCommand();

	void setParentCommand(CommandBuilder parentCommand);

}
