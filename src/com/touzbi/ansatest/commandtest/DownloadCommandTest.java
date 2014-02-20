package com.touzbi.ansatest.commandtest;

import org.junit.Test;

import com.touzbi.ansa.command.ChromeDownloadCommand;
import com.touzbi.ansa.command.Command;

public class DownloadCommandTest {
	@Test
	public void test() {
		Command command = new ChromeDownloadCommand();

		command.addInput("http://www.youtube.com", "http://www.google.com");

		command.execute();
	}
}
