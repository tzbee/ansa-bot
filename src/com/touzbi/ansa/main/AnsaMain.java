package com.touzbi.ansa.main;

import com.touzbi.ansa.commandstorage.AnsaCommandStorage;
import com.touzbi.ansa.commandstorage.CommandStorage;
import com.touzbi.ansa.inputfactory.BasicFileInputFactory;

public class AnsaMain {
	private static final String INPUT_CONFIG_FILE = "com/touzbi/ansatest/input.cfg";

	public static void main(String[] args) {
		CommandStorage commandStorage = AnsaCommandStorage.getInstance();

		for (String commandName : args) {
			commandStorage.getCommandByName(commandName).execute(
					new BasicFileInputFactory(INPUT_CONFIG_FILE, true));

		}
	}
}
