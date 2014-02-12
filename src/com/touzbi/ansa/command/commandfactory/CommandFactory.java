package com.touzbi.ansa.command.commandfactory;

import java.util.Collection;

import com.touzbi.ansa.command.Command;

public interface CommandFactory {
	public Collection<Command> getCommands();
}
