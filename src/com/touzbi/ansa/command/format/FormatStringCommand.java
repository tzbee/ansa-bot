package com.touzbi.ansa.command.format;

import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.command.AbstractCommandBuilder;
import com.touzbi.ansa.util.stringformatter.CustomWrapperStringFormatter;

public class FormatStringCommand extends AbstractCommandBuilder {
	private static final String PREFIX_PARAM = "prefix";
	private static final String SUFFIX_PARAM = "suffix";

	protected String getPrefixParam() {
		return getParamValue(PREFIX_PARAM);
	}

	protected String getSuffixParam() {
		return getParamValue(SUFFIX_PARAM);
	}

	@Override
	public Collection<String> execute(String input) {
		return Arrays.asList(new CustomWrapperStringFormatter(getPrefixParam(),
				getSuffixParam()).format(input));
	}

	@Override
	public String toString() {
		return "Format string";
	}
}
