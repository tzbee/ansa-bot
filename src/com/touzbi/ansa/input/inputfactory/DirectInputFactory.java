package com.touzbi.ansa.input.inputfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class DirectInputFactory implements InputFactory {
	private Collection<String> inputs = new ArrayList<String>();

	public DirectInputFactory(String... inputs) {
		this.inputs = Arrays.asList(inputs);
	}

	@Override
	public Collection<String> getInput() {
		return this.inputs;
	}
}
