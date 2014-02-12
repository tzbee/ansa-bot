package com.touzbi.ansa.command;

import com.touzbi.ansa.util.stringformatter.StringFormatter;

public class FormatStringCommand extends AbstractCommand {
	private StringFormatter stringFormatter;

	public FormatStringCommand(StringFormatter stringFormatter) {
		this.stringFormatter = stringFormatter;
	}

	@Override
	public void execute() {
		for (String input : getParamValues("input")) {
			addParams("output", this.stringFormatter.format(input));
		}
	}

	@Override
	public String toString() {
		return "Create URL command: " + this.stringFormatter;
	}
}
