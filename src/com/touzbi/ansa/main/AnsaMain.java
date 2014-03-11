package com.touzbi.ansa.main;

import com.touzbi.ansa.commandloader.AnsaCommandLoader;
import com.touzbi.ansa.commandloader.CommandLoader;
import com.touzbi.ansa.inputfactory.BasicFileInputFactory;

public class AnsaMain {
	private static final String INPUT_CONFIG_FILE = "input.cfg";

	public static void main(String[] args) {
		CommandLoader commandLoader = AnsaCommandLoader.getInstance();

		for (String commandName : args) {
			commandLoader.getCommandByName(commandName).execute(
					new BasicFileInputFactory(INPUT_CONFIG_FILE, true));

		}
	}
}
