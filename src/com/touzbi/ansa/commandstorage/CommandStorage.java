package com.touzbi.ansa.commandstorage;

import com.touzbi.ansa.command.CommandBuilder;

public interface CommandStorage {
	CommandBuilder getCommandByName(String commandName);

	void loadCommand(String commandName);
}
