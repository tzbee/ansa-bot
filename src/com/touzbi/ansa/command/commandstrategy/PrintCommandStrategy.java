package com.touzbi.ansa.command.commandstrategy;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

public class PrintCommandStrategy extends AbstractCommandStrategy {
	private PrintStream printStream;

	public PrintCommandStrategy(PrintStream printStream) {
		this.printStream = printStream;
	}

	@Override
	public Collection<String> execute(String input) {
		this.printStream.println(input);
		return Arrays.asList(input);
	}
}
