package com.touzbi.ansa.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.command.SequentialCommandComposite;
import com.touzbi.ansa.command.commandfactory.CommandFactory;

public abstract class AbstractApp implements App {
	private static final Logger LOGGER = LogManager.getLogger();

	private SequentialCommandComposite command;

	protected AbstractApp(CommandFactory commandFactory) {
		this.command = new SequentialCommandComposite(commandFactory);
	}

	@Override
	public void start() {
		LOGGER.info("Starting app...");

		this.command.execute();
	}
}
