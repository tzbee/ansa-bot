package com.touzbi.ansa.util.separator;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

public class SplitDelimiterSeparator extends AbstractDelimiterSeparator {
	public SplitDelimiterSeparator(String delimiter) {
		super(delimiter);
	}

	@Override
	public Collection<String> separate(String str) {
		return Arrays.asList(Pattern.compile(this.delimiter).split(str));
	}
}
