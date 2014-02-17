package com.touzbi.ansatest.commandtest;

import org.junit.Test;

import com.touzbi.ansa.command.Command;
import com.touzbi.ansa.command.SetInputCommand;

public class SetInputCommandTest {
	@Test
	public void test() {
		Command command = new SetInputCommand();

		command.addParams("text", "oh yeah", "haha");
		command.addParams("file", "com/touzbi/ansatest/input.cfg");

		command.execute();

		System.out.println(command.getOutput());
	}
}
