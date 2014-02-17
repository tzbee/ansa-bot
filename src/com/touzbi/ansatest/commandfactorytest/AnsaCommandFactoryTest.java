package com.touzbi.ansatest.commandfactorytest;

import org.junit.Test;

import com.touzbi.ansa.command.commandfactory.AnsaCommandFactory;
import com.touzbi.ansa.command.commandfactory.CommandFactory;

public class AnsaCommandFactoryTest {
	private static final String PACKAGE_PATH = "com/touzbi/ansatest/";
	private static final String FILE_PATH = PACKAGE_PATH + "app.ansa";

	@Test
	public void test() {
		CommandFactory commandFactory = new AnsaCommandFactory(FILE_PATH, false);

		System.out.println("Commands: " + commandFactory.getCommands());
	}
}
