package com.touzbi.ansa.command.download;

import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.command.AbstractCommandBuilder;
import com.touzbi.ansa.launcher.BasicLauncher;
import com.touzbi.ansa.launcher.Launcher;

public class DownloadCommandBuilder extends AbstractCommandBuilder {
	private static final String BASE_COMMAND_PARAM = "command";

	private Launcher launcher = new BasicLauncher();

	@Override
	public Collection<String> execute(String input) {
		this.launcher.launch(getParamValue(BASE_COMMAND_PARAM) + " " + input);
		return Arrays.asList(input);
	}

	@Override
	public String toString() {
		return "Download with " + getParamValue(BASE_COMMAND_PARAM);
	}
}
