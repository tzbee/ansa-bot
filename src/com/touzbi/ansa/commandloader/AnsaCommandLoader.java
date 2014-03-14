package com.touzbi.ansa.commandloader;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.command.CommandBuilder;
import com.touzbi.ansa.commandfactory.AnsaFileCommandFactory;
import com.touzbi.ansa.commandfactory.CommandFactory;
import com.touzbi.ansa.commandfactory.FilterCommandFactory;
import com.touzbi.ansa.commandfactory.FormatStringCommandFactory;
import com.touzbi.ansa.commandfactory.GetContentByRegexQueryFactory;
import com.touzbi.ansa.commandfactory.GetHTMLAttributeCommandFactory;
import com.touzbi.ansa.commandfactory.GetHTMLElementTextContentFactory;
import com.touzbi.ansa.commandfactory.HTTPRequestCommandFactory;
import com.touzbi.ansa.commandfactory.PrintCommandFactory;
import com.touzbi.ansa.commandfactory.StartExternalAppCommandFactory;

/**
 * Singleton Command Loader
 * 
 * @author touzbi
 */

public class AnsaCommandLoader implements CommandLoader {
	private static final Logger LOGGER = LogManager.getLogger();

	// Singleton
	private static AnsaCommandLoader instance = null;
	private static AnsaCommandLoader testInstance = null;

	private final Map<String, CommandFactory> commandMap = new HashMap<String, CommandFactory>();

	private boolean isFileRelativeToJar;

	private AnsaCommandLoader(boolean isFileRelativeToJar) {
		this.isFileRelativeToJar = isFileRelativeToJar;

		initCommandMap();
	}

	private void initCommandMap() {
		this.commandMap.put("httprequest", new HTTPRequestCommandFactory());
		this.commandMap.put("print", new PrintCommandFactory());
		this.commandMap.put("regex", new GetContentByRegexQueryFactory());
		this.commandMap.put("getattribute",
				new GetHTMLAttributeCommandFactory());
		this.commandMap.put("gethtmltext",
				new GetHTMLElementTextContentFactory());
		this.commandMap.put("start", new StartExternalAppCommandFactory());
		this.commandMap.put("format", new FormatStringCommandFactory());
		this.commandMap.put("filter", new FilterCommandFactory());
	}

	public static AnsaCommandLoader getInstance() {
		if (instance == null) {
			instance = new AnsaCommandLoader(true);
		}
		return instance;
	}

	public static AnsaCommandLoader getTestInstance() {
		if (testInstance == null) {
			testInstance = new AnsaCommandLoader(false);
		}
		return testInstance;
	}

	@Override
	public CommandBuilder getCommandByName(String commandName) {
		CommandFactory commandFactory = this.commandMap.get(commandName);

		if (commandFactory == null) {
			loadCommandFactory(commandName);
		}

		return this.commandMap.get(commandName).getCommand();
	}

	@Override
	public void loadCommandFactory(String commandName) {
		LOGGER.info("Loading command {}", commandName);

		this.commandMap.put(commandName, new AnsaFileCommandFactory(this,
				this.isFileRelativeToJar, commandName));

		LOGGER.info("Command {} loaded", commandName);
	}

	@Override
	public String toString() {
		return this.commandMap.toString();
	}
}
