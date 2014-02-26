package com.touzbi.ansatest.commandtest;

import org.junit.Test;

import com.touzbi.ansa.command.Command;
import com.touzbi.ansa.command.HTTPRequestCommand;

public class HTTPRequestCommmandTest {
	@Test
	public void test() {
		Command command = new HTTPRequestCommand();
		command.addInput("http://www.google.fi", "http://www.imdb.com");
		command.execute();

		System.out.println(command.getOutput());
	}
}
