package com.touzbi.ansa.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.touzbi.ansa.inputfactory.InputFactory;

public abstract class AbstractCommandBuilder implements CommandBuilder {
	private Map<String, String> params = new HashMap<String, String>();

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
	public Collection<String> execute(InputFactory inputFactory) {
		return execute(inputFactory.getInputs());
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
	public CommandBuilder addCommandBuilders(
			Collection<CommandBuilder> commandBuilders) {
		this.commandBuilders.addAll(commandBuilders);
		return this;
	}

	@Override
	public CommandBuilder addCommandBuilders(CommandBuilder... commandBuilders) {
		return addCommandBuilders(Arrays.asList(commandBuilders));
	}

	@Override
	public String toString() {
		return this.commandBuilders.toString();
	}
}
