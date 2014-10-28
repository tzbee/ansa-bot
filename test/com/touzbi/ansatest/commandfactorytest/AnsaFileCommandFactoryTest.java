package com.touzbi.ansatest.commandfactorytest;

import com.touzbi.ansa.commandfactory.AnsaFileCommandFactory;
import com.touzbi.ansa.commandfactory.CommandFactory;
import com.touzbi.ansa.commandloader.AnsaCommandLoader;

public class AnsaFileCommandFactoryTest {

	@Test
	public void test() {
		CommandFactory commandFactory = new AnsaFileCommandFactory(
				AnsaCommandLoader.getTestInstance(), false, "appp");

		commandFactory.getCommand().execute("http://youtube.com");
	}
}
