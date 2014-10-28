package com.touzbi.ansatest.downloadtest;

import org.junit.Test;

import com.touzbi.ansa.command.startexternalapp.StartExternalAppCommandBuilder;

public class DownloadCommandBuilderTest {
	@Test
	public void test() {
		StartExternalAppCommandBuilder downloadCommandBuilder = new StartExternalAppCommandBuilder();

		downloadCommandBuilder.execute("https://www.google.com");
	}
}
