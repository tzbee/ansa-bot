package com.touzbi.ansatest.downloadtest;

import org.junit.Test;

import com.touzbi.ansa.command.download.DownloadCommandBuilder;

public class DownloadCommandBuilderTest {
	@Test
	public void test() {
		DownloadCommandBuilder downloadCommandBuilder = new DownloadCommandBuilder();

		downloadCommandBuilder.execute("https://www.google.com");
	}
}
