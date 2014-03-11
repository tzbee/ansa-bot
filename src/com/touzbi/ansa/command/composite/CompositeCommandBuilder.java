package com.touzbi.ansa.command.composite;

import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.command.AbstractCommandBuilder;
import com.touzbi.ansa.command.CommandBuilder;

public class CompositeCommandBuilder extends AbstractCommandBuilder {

	@Override
	public Collection<String> execute(String input) {
		Collection<String> inputs = Arrays.asList(input);

		for (CommandBuilder commandBuilder : this.commandBuilders) {
			inputs = commandBuilder.execute(inputs);
		}

		return inputs;
	}

	@Override
	public String toString() {
		return "Composite command: " + super.toString();
	}
}
