package com.touzbi.ansatest.configtest;

import org.junit.Test;

import com.touzbi.ansa.command.commandfactory.AnsaCommandFactory;
import com.touzbi.ansa.command.commandfactory.CommandFactory;

public class AnsaConfigFactoryTest {
	private static final String PACKAGE_PATH = "com/touzbi/ansatest/";
	private static final String FILE_PATH = PACKAGE_PATH + "app.ansa";

	@Test
	public void test() {
		CommandFactory configFactory = new AnsaCommandFactory(FILE_PATH, false);

		System.out.println("Commands: " + configFactory.getCommands());
	}
}
