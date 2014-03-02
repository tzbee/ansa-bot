package com.touzbi.ansa.command;

import java.util.Collection;

import com.touzbi.ansa.command.commandstrategy.CommandStrategy;

public interface Command {

	/**
	 * Add parameters to the command
	 * 
	 * @param paramName
	 *            name of the parameter
	 * @param paramValues
	 *            values of the parameter
	 */
	void addParams(String paramName, String... paramValues);

	void addParams(String paramName, Collection<String> paramValues);

	Collection<String> getParamValues(String paramName);

	/**
	 * Add input to the command
	 * 
	 * @param inputs
	 *            inputs
	 */
	void addInput(String... inputs);

	void addInput(Collection<String> inputs);

	Collection<String> getInput();

	/**
	 * Add output to the command
	 * 
	 * @param outputs
	 */

	void addOutput(String... outputs);

	void addOutput(Collection<String> outputs);

	Collection<String> getOutput();

	/**
	 * Execute the command
	 */
	void execute();

	void setCommandStrategy(CommandStrategy commandStrategy);
}
