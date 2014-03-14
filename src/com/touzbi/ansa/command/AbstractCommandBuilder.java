package com.touzbi.ansa.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.touzbi.ansa.inputfactory.InputFactory;

public abstract class AbstractCommandBuilder implements CommandBuilder {

	// Command Parameters
	private Map<String, String> params = new HashMap<String, String>();

	// Children Commands
	protected Collection<CommandBuilder> commandBuilders = new ArrayList<CommandBuilder>();

	@Override
	public CommandBuilder addParam(String paramName, String paramValue) {
		this.params.put(paramName, paramValue);
		return this;
	}

	@Override
	public String getParamValue(String paramName) {
		return this.params.get(paramName) != null ? this.params.get(paramName)
				: "";
	}

	@Override
	public Collection<String> execute(InputFactory... inputFactories) {
		Collection<String> inputs = new ArrayList<String>();

		for (InputFactory inputFactory : inputFactories) {
			inputs.addAll(inputFactory.getInputs());
		}

		return execute(inputs);
	}

	@Override
	public Collection<String> execute(Collection<String> inputs) {
		Collection<String> outputs = new ArrayList<String>();

		for (String input : inputs) {
			outputs.addAll(execute(input));
		}

		return outputs;
	}

	@Override
	public CommandBuilder addChildrenCommands(
			Collection<CommandBuilder> commands) {
		this.commandBuilders.addAll(commands);
		return this;
	}

	@Override
	public CommandBuilder addChildrenCommands(CommandBuilder... commands) {
		return addChildrenCommands(Arrays.asList(commands));
	}

	@Override
	public Collection<CommandBuilder> getChildrenCommands() {
		return new ArrayList<CommandBuilder>(this.commandBuilders);
	}

	@Override
	public String toString() {
		return this.commandBuilders.toString();
	}
}
