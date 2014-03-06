package com.touzbi.ansa.command.format;

import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.command.AbstractCommandBuilder;
import com.touzbi.ansa.util.stringformatter.CustomWrapperStringFormatter;

public class FormatStringCommand extends AbstractCommandBuilder {
	private static final String PREFIX_PARAM = "prefix";
	private static final String SUFFIX_PARAM = "suffix";

	@Override
	public Collection<String> execute(String input) {
		return Arrays.asList(new CustomWrapperStringFormatter(
				getParamValue(PREFIX_PARAM), getParamValue(SUFFIX_PARAM))
				.format(input));
	}

	@Override
	public String toString() {
		return "Format String command - " + super.toString();
	}
}
