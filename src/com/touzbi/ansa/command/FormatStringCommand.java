package com.touzbi.ansa.command;

import java.util.Collection;

import com.google.common.base.Joiner;
import com.touzbi.ansa.util.stringformatter.CustomWrapperStringFormatter;
import com.touzbi.ansa.util.stringformatter.StringFormatter;

public class FormatStringCommand extends AbstractCommand {

	@Override
	public void execute() {
		Collection<String> prefix = getParamValues("prefix");
		Collection<String> suffix = getParamValues("suffix");

		// TODO Refactor JoinFormatter
		String fullPrefix = Joiner.on("").join(prefix);
		String fullSuffix = Joiner.on("").join(suffix);

		StringFormatter formatter = new CustomWrapperStringFormatter(
				fullPrefix, fullSuffix);

		for (String input : getInput()) {
			addOutput(formatter.format(input));
		}
	}

	@Override
	public String toString() {
		return "Format String command - " + super.toString();
	}
}
