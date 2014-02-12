package com.touzbi.ansa.input.inputbuilder;

import java.util.Collection;

import com.touzbi.ansa.input.inputfactory.InputFactory;

public interface InputBuilder {
	void addInput(String input);

	void addInputs(Collection<String> inputs);

	void addInputFactory(InputFactory inputFactory);

	Collection<String> getInputs();

	void buildInputs();
}
