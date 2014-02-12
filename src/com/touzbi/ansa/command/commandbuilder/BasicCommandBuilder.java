package com.touzbi.ansa.command.commandbuilder;

import java.util.ArrayList;
import java.util.Collection;

import com.touzbi.ansa.command.Command;

public class BasicCommandBuilder implements CommandBuilder {
	private Collection<Command> commands = new ArrayList<Command>();

	@Override
	public void addCommand(Command command) {
		this.commands.add(command);
	}

	@Override
	public Collection<Command> getCommands() {
		return this.commands;
	}
}
