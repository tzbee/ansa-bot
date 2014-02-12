package com.touzbi.ansa.util.stringformatter;

import java.util.Arrays;
import java.util.Collection;

public class StringFormatterComposite implements StringFormatter {
	private Collection<StringFormatter> stringFormatters;

	public StringFormatterComposite(StringFormatter... stringFormatters) {
		this.stringFormatters = Arrays.asList(stringFormatters);
	}

	@Override
	public String format(String str) {
		String formattedString = str;

		for (StringFormatter stringFormatter : this.stringFormatters) {
			formattedString = stringFormatter.format(formattedString);
		}

		return formattedString;
	}
}
