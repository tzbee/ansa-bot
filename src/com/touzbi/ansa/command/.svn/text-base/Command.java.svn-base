package com.touzbi.ansa.command;

import java.util.Collection;

public interface Command {
	void addParams(String paramName, String... paramValues);

	void addParams(String paramName, Collection<String> paramValues);

	void addInput(String... inputs);

	void addInput(Collection<String> inputs);

	void addOutput(String... inputs);

	void addOutput(Collection<String> inputs);

	Collection<String> getParamValues(String paramName);

	Collection<String> getOutput();

	Collection<String> getInput();

	void execute();

}
