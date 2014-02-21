package com.touzbi.ansatest.commandtest;

import org.junit.Test;

import com.touzbi.ansa.command.Command;
import com.touzbi.ansa.command.GetInnerHTMLCommand;

public class GetContentCommandTest {
	private static final String INPUT = "<html><head></head><body><a href=\"test\"></a></body></html>";
	private static final String PARAM_NAME = "html-element";

	@Test
	public void test() {
		Command command = new GetInnerHTMLCommand();

		command.addParams(PARAM_NAME, "a[href=test]");
		command.addInput(INPUT);

		command.execute();

		System.out.println(command.getOutput());
	}
}
