package com.touzbi.ansa.command.download;

import java.util.Arrays;
import java.util.Collection;

import com.touzbi.ansa.command.AbstractCommandBuilder;
import com.touzbi.ansa.launcher.BasicLauncher;
import com.touzbi.ansa.launcher.Launcher;

public class DownloadCommandBuilder extends AbstractCommandBuilder {
	// XXX Using chromium for now
	private static final String BASE_COMMAND = "chromium-browser";

	private Launcher launcher = new BasicLauncher();

	@Override
	public Collection<String> execute(String input) {
		this.launcher.launch(BASE_COMMAND + " " + input);
		return Arrays.asList(input);
	}

	@Override
	public String toString() {
		return "Download";
	}
}
