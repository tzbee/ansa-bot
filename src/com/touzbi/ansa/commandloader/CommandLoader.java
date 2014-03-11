package com.touzbi.ansa.commandloader;

import com.touzbi.ansa.command.CommandBuilder;

public interface CommandLoader {

	/**
	 * Find a command given its name
	 * 
	 * @param commandName
	 * @return The command
	 */
	CommandBuilder getCommandByName(String commandName);

	/**
	 * Load a command given its name
	 * 
	 * @param commandName
	 */

	void loadCommandFactory(String commandName);
}
