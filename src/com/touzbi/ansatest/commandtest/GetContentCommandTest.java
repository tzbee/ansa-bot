package com.touzbi.ansatest.commandtest;

import org.junit.Test;

import com.touzbi.ansa.command.Command;
import com.touzbi.ansa.command.GetContentCommand;

public class GetContentCommandTest {
	private static final String INPUT = "<html><head></head><body><a href=\"test\"></a></body></html>";
	private static final String PARAM_NAME = "link";

	@Test
	public void test() {
		Command command = new GetContentCommand();

		command.addParams(PARAM_NAME, "a");
		command.addInput(INPUT);

		command.execute();

		System.out.println(command.getOutput());
	}
}
