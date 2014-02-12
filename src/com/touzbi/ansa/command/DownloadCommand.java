package com.touzbi.ansa.command;

import com.touzbi.ansa.download.ChromeDownloadStrategy;
import com.touzbi.ansa.download.DownloadStrategy;

public class DownloadCommand extends AbstractCommand {
	private DownloadStrategy downloadStrategy = new ChromeDownloadStrategy();

	@Override
	public void execute() {
		this.downloadStrategy.download(getParamValues("input"));
	}
}
