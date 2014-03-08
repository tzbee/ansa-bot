package com.touzbi.ansa.commandstorage;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.commandfactory.AnsaFileCommandFactory;
import com.touzbi.ansa.commandfactory.CommandFactory;

public class AnsaCommandStorage implements CommandStorage {
	private static final Logger LOGGER = LogManager.getLogger();

	// Singleton
	private static AnsaCommandStorage instance = null;

	private Map<String, CommandBuilder> commands = new HashMap<String, CommandBuilder>();
	private CommandFactory commandFactory;

	private AnsaCommandStorage(boolean isFileRelativeToJar) {
		this.commandFactory = new AnsaFileCommandFactory(isFileRelativeToJar);
	}

	@Override
	public CommandBuilder getCommandByName(String commandName) {
		LOGGER.info("Getting command {}", commandName);

		if (this.commands.get(commandName) == null) {
			LOGGER.info("Command {} not found", commandName);
			loadCommand(commandName);
		}

		return this.commands.get(commandName);
	}

	@Override
	public void loadCommand(String commandName) {
		LOGGER.info("Loading command {}", commandName);

		this.commands.put(commandName,
				this.commandFactory.getCommandByName(commandName));

		LOGGER.info("Command {} loaded", commandName);
	}

	public static AnsaCommandStorage getInstance() {
		if (instance == null) {
			instance = new AnsaCommandStorage(true);
		}

		return instance;
	}

	@Override
	public String toString() {
		return this.commands.values().toString();
	}
}
