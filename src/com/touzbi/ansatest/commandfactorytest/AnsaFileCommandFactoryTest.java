package com.touzbi.ansatest.commandfactorytest;

import org.junit.Test;

import com.touzbi.ansa.commandfactory.AnsaFileCommandFactory;
import com.touzbi.ansa.commandfactory.CommandFactory;

public class AnsaFileCommandFactoryTest {

	@Test
	public void test() {
		CommandFactory commandFactory = new AnsaFileCommandFactory(
				"com/touzbi/ansatest/", false);

		commandFactory.getCommandByName("app2").execute("http://youtube.com");
	}
}
