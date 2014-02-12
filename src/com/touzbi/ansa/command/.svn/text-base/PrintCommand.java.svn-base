package com.touzbi.ansa.command;

import java.io.PrintStream;

public class PrintCommand extends AbstractCommand {
	private PrintStream printStream;

	public PrintCommand(PrintStream printStream) {
		this.printStream = printStream;
	}

	@Override
	public void execute() {
		int counter = 0;

		for (String url : getParamValues("input")) {
			this.printStream.println(counter++ + " - " + url);
		}
	}
}
