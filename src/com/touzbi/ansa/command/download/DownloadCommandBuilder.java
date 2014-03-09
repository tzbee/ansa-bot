package com.touzbi.ansa.command.download;

import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.command.AbstractCommandBuilder;
import com.touzbi.ansa.launcher.BasicLauncher;
import com.touzbi.ansa.launcher.Launcher;

public class DownloadCommandBuilder extends AbstractCommandBuilder {
	private static final String BASE_COMMAND_PARAM = "command";

	// Launcher strategy to use
	private Launcher launcher = new BasicLauncher();

	protected String getDownloadCommand() {
		return getParamValue(BASE_COMMAND_PARAM);
	}

	@Override
	public Collection<String> execute(String input) {
		this.launcher.launch(getDownloadCommand() + " " + input);
		return Arrays.asList(input);
	}

	@Override
	public String toString() {
		return "Download with " + getDownloadCommand();
	}
}
