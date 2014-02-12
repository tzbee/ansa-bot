package com.touzbi.ansa.util.separator;

public abstract class AbstractSeparator implements Separator {
	protected String delimiter;

	public AbstractSeparator(String delimiter) {
		this.delimiter = delimiter;
	}
}
