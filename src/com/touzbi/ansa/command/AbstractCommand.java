package com.touzbi.ansa.command;

import java.util.Arrays;
import java.util.Collection;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.touzbi.ansa.command.commandstrategy.CommandStrategy;

public abstract class AbstractCommand implements Command {
	private CommandStrategy commandStrategy = null;

	// Default params
	private static final String INPUT_PARAM = "input";
	private static final String OUTPUT_PARAM = "output";

	private Multimap<String, String> namedParams = ArrayListMultimap.create();

	public AbstractCommand(CommandStrategy commandStrategy) {
		this.commandStrategy = commandStrategy;
	}

	public AbstractCommand() {
	}

	@Override
	public void addParams(String paramName, Collection<String> paramValues) {
		this.namedParams.putAll(paramName, paramValues);
	}

	@Override
	public void addParams(String paramName, String... paramValues) {
		addParams(paramName, Arrays.asList(paramValues));
	}

	@Override
	public Collection<String> getParamValues(String paramName) {
		return this.namedParams.get(paramName);
	}

	@Override
	public void addInput(String... inputs) {
		addParams(INPUT_PARAM, inputs);
	}

	@Override
	public void addInput(Collection<String> inputs) {
		addParams(INPUT_PARAM, inputs);
	}

	@Override
	public void addOutput(String... output) {
		addParams(OUTPUT_PARAM, output);
	}

	@Override
	public void addOutput(Collection<String> output) {
		addParams(OUTPUT_PARAM, output);
	}

	@Override
	public Collection<String> getOutput() {
		return getParamValues(OUTPUT_PARAM);
	}

	@Override
	public Collection<String> getInput() {
		return getParamValues(INPUT_PARAM);
	}

	@Override
	public void execute() {
		addOutput(this.commandStrategy.execute(getInput()));
	}

	@Override
	public void setCommandStrategy(CommandStrategy commandStrategy) {
		this.commandStrategy = commandStrategy;
	}

	@Override
	public String toString() {
		return "inputs: " + getInput() + " - output: " + getOutput();
	}
}
