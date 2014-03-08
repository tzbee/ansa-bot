package com.touzbi.ansatest.commandfactorytest;

import org.junit.Test;

import com.touzbi.ansa.commandfactory.AnsaFileCommandFactory;
import com.touzbi.ansa.commandfactory.CommandFactory;

public class AnsaFileCommandFactoryTest {

	@Test
	public void test() {
		CommandFactory commandFactory = new AnsaFileCommandFactory(false);

		commandFactory.getCommandByName("com/touzbi/ansatest/app2").execute(
				"http://youtube.com");
	}
}
