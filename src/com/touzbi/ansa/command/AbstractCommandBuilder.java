package com.touzbi.ansa.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.touzbi.ansa.inputfactory.InputFactory;

public abstract class AbstractCommandBuilder implements CommandBuilder {
	private Map<String, String> params = new HashMap<String, String>();

	protected Collection<CommandBuilder> commandBuilders = new ArrayList<CommandBuilder>();

	@Override
	public void addParam(String paramName, String paramValue) {
		this.params.put(paramName, paramValue);
	}

	@Override
	public String getParamValue(String paramName) {
		return this.params.get(paramName);
	}

	@Override
	public Collection<String> execute(InputFactory inputFactory) {
		return execute(inputFactory.getInputs());
	}

	@Override
	public Collection<String> execute(Collection<String> inputs) {
		Collection<String> output = new ArrayList<String>();

		for (String input : inputs) {
			output.addAll(execute(input));
		}

		return output;
	}

	@Override
	public void addCommandBuilder(CommandBuilder commandBuilder) {
		this.commandBuilders.add(commandBuilder);
	}

	@Override
	public String toString() {
		return this.commandBuilders.toString();
	}
}
