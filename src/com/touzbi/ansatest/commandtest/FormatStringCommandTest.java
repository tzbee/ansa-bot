package com.touzbi.ansatest.commandtest;

import org.junit.Test;

import com.touzbi.ansa.command.Command;
import com.touzbi.ansa.command.FormatStringCommand;

public class FormatStringCommandTest {
	@Test
	public void test() {
		Command command = new FormatStringCommand();

		command.addParams("prefix", "http://www.", "huhuhu");
		command.addParams("suffix", ".com");
		command.addInput("test1", "test2");
		command.execute();

		System.out.println(command.getOutput());
	};
}
