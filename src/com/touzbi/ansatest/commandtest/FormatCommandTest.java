package com.touzbi.ansatest.commandtest;

import org.junit.Test;

import com.touzbi.ansa.command.Command;
import com.touzbi.ansa.command.FormatStringCommand;
import com.touzbi.ansa.util.stringformatter.CustomWrapperStringFormatter;

public class FormatCommandTest {
	@Test
	public void test() {
		Command command = new FormatStringCommand(
				new CustomWrapperStringFormatter("http://www.", ".com"));

		command.addInput("test1", "test2");
		command.execute();

		System.out.println(command.getOutput());
	};
}
