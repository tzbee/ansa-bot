package com.touzbi.ansa.command.main;

import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.command.AbstractCommandBuilder;
import com.touzbi.ansa.command.CommandBuilder;

public class MainCommandBuilder extends AbstractCommandBuilder {

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
		return "Main command builder " + super.toString();
	}
}
