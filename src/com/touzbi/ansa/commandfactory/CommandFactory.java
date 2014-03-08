package com.touzbi.ansa.commandfactory;

import com.touzbi.ansa.command.CommandBuilder;

public interface CommandFactory {
	CommandBuilder getCommandByName(String commandName);
}
