package com.touzbi.ansa.commandstorage;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.command.httprequest.HTTPRequestCommandBuilder;
import com.touzbi.ansa.command.print.SysoutCommandBuilder;
import com.touzbi.ansa.commandfactory.AnsaFileCommandFactory;
import com.touzbi.ansa.commandfactory.CommandFactory;

/**
 * Singleton Command Storage
 * 
 * @author touzbi
 */
public class AnsaCommandStorage implements CommandStorage {
	private static final Logger LOGGER = LogManager.getLogger();

	// XXX To do better
	private static final boolean FILE_RELATIVE_TO_JAR = false;

	// Singleton
	private static AnsaCommandStorage instance = null;

	private Map<String, CommandBuilder> commands = new HashMap<String, CommandBuilder>();
	private CommandFactory commandFactory;

	private AnsaCommandStorage(boolean isFileRelativeToJar) {
		this.commandFactory = new AnsaFileCommandFactory(isFileRelativeToJar);

		// Built in commands
		addCommand("httprequest", new HTTPRequestCommandBuilder());
		addCommand("print", new SysoutCommandBuilder());
	}

	public static AnsaCommandStorage getInstance() {
		if (instance == null) {
			instance = new AnsaCommandStorage(FILE_RELATIVE_TO_JAR);
		}

		return instance;
	}

	protected void addCommand(String commandName, CommandBuilder commandBuilder) {
		this.commands.put(commandName, commandBuilder);
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

	@Override
	public String toString() {
		return this.commands.values().toString();
	}
}
