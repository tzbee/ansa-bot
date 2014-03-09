package com.touzbi.ansa.util.separator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class SplitDelimiterSeparator extends AbstractDelimiterSeparator {
	public SplitDelimiterSeparator(String delimiter) {
		super(delimiter);
	}

	@Override
	public List<String> separate(String str) {
		return Arrays.asList(Pattern.compile(this.delimiter).split(str));
	}
}
