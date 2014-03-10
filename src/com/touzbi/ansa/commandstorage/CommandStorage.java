package com.touzbi.ansa.commandstorage;

import com.touzbi.ansa.command.CommandBuilder;

public interface CommandStorage {

	/**
	 * Retrieve a command from the storage given its name
	 * 
	 * @param commandName
	 * @return The command
	 */
	CommandBuilder getCommandByName(String commandName);

	/**
	 * Load a command in the storage given its name
	 * 
	 * @param commandName
	 */
	void loadCommand(String commandName);
}
