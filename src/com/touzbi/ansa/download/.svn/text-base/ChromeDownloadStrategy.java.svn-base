package com.touzbi.ansa.download;

import java.util.Collection;

import com.touzbi.ansa.launcher.BasicLauncher;
import com.touzbi.ansa.launcher.Launcher;

public class ChromeDownloadStrategy extends AbstractDownloadStrategy {
	private static final String BASE_COMMAND = "chromium-browser";

	private Launcher launcher = new BasicLauncher();

	@Override
	public void download(Collection<String> urls) {
		String fullCommand = BASE_COMMAND;

		for (String url : urls) {
			fullCommand += " " + url;
		}

		this.launcher.launch(fullCommand);
	}
}
