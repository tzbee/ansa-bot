package com.touzbi.ansatest.maintest;

import org.junit.Test;

import com.touzbi.ansa.commandfactory.AnsaFileCommandFactory;
import com.touzbi.ansa.commandfactory.CommandFactory;
import com.touzbi.ansa.inputfactory.BasicFileInputFactory;

public class AnsaMainTest {

	@Test
	public void test() {
		CommandFactory commandFactory = new AnsaFileCommandFactory(false);

		commandFactory.getCommandByName("app").execute(
				new BasicFileInputFactory("com/touzbi/ansatest/input.cfg",
						false));
	}
}
