package com.touzbi.ansa.input.inputbuilder;

import java.util.ArrayList;
import java.util.Collection;

import com.touzbi.ansa.input.inputfactory.InputFactory;

public class BasicInputBuilder implements InputBuilder {
	private Collection<String> inputs = new ArrayList<String>();
	private Collection<InputFactory> inputFactories = new ArrayList<InputFactory>();

	@Override
	public void addInput(String input) {
		this.inputs.add(input);
	}

	@Override
	public void addInputs(Collection<String> inputs) {
		this.inputs.addAll(inputs);
	}

	@Override
	public void addInputFactory(InputFactory inputFactory) {
		this.inputFactories.add(inputFactory);
	}

	@Override
	public Collection<String> getInputs() {
		return this.inputs;
	}

	@Override
	public void buildInputs() {
		for (InputFactory inputFactory : this.inputFactories) {
			this.inputs.addAll(inputFactory.getInput());
		}
	}
}