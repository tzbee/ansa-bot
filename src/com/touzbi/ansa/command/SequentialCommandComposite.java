package com.touzbi.ansa.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.command.commandfactory.CommandFactory;

public class SequentialCommandComposite extends AbstractCommand {
	private Collection<Command> commands;

	public SequentialCommandComposite(CommandFactory commandFactory) {
		this.commands = commandFactory.getCommands();
	}

	public SequentialCommandComposite(Collection<Command> commands) {
		this.commands = commands;
	}

	public SequentialCommandComposite(Command... commands) {
		this(new ArrayList<Command>(Arrays.asList(commands)));
	}

	@Override
	public void execute() {
		Collection<String> inputs = getInput();

		for (Command command : this.commands) {
			command.addInput(inputs);
			command.execute();
			inputs = command.getOutput();
		}

		addOutput(inputs);
	}

	public void addCommand(Command command) {
		this.commands.add(command);
	}
}
