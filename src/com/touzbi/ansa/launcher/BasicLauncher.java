package com.touzbi.ansa.launcher;

import java.io.IOException;
import java.util.logging.LogManager;

public class BasicLauncher implements Launcher {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void launch(String command) {
		LOGGER.info("Launching command with sh...");

		String[] commands = new String[] { "/bin/sh", "-c", command };

		try {
			new ProcessBuilder(commands).start();
		} catch (IOException e) {
			LOGGER.error("Could not launch command {}", command);
		}
	}
}
