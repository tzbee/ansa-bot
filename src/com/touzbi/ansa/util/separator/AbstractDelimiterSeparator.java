package com.touzbi.ansa.util.separator;

public abstract class AbstractDelimiterSeparator implements Separator {
	protected String delimiter;

	public AbstractDelimiterSeparator(String delimiter) {
		this.delimiter = delimiter;
	}
}
