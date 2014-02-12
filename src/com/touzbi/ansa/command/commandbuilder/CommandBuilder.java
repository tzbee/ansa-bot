package com.touzbi.ansa.command.commandbuilder;

import java.util.Collection;

import com.touzbi.ansa.command.Command;

public interface CommandBuilder {
	void addCommand(Command command);

	Collection<Command> getCommands();
}
