package com.touzbi.ansatest.maintest;

import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.commandloader.AnsaCommandLoader;
import com.touzbi.ansa.commandloader.CommandLoader;
import com.touzbi.ansa.inputfactory.BasicFileInputFactory;

public class AnsaMainTest {
	private static final String COMMAND_NAME = "app";
	private static final String CONFIG_FILE = "input.cfg";

	@Test
	public void test() {
		CommandLoader commandLoader = AnsaCommandLoader.getTestInstance();

		// Create the main command
		CommandBuilder command = commandLoader.getCommandByName(COMMAND_NAME);

		// Execute the command
		command.execute(new BasicFileInputFactory(CONFIG_FILE, false));
	}
}
