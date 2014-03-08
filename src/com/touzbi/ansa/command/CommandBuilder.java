package com.touzbi.ansa.command;

import java.util.Collection;

import com.touzbi.ansa.inputfactory.InputFactory;

public interface CommandBuilder {
	/**
	 * Params handling
	 * 
	 * @param paramName
	 * @param paramValue
	 */

	void addParam(String paramName, String paramValue);

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

	void addCommandBuilder(CommandBuilder commandBuilder);
}
