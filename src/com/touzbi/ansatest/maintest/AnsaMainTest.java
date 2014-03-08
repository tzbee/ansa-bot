package com.touzbi.ansatest.maintest;

import org.junit.Test;

import com.touzbi.ansa.commandstorage.AnsaCommandStorage;
import com.touzbi.ansa.commandstorage.CommandStorage;
import com.touzbi.ansa.inputfactory.BasicFileInputFactory;

public class AnsaMainTest {

	@Test
	public void test() {
		CommandStorage commandStorage = AnsaCommandStorage.getInstance();

		commandStorage.getCommandByName("app").execute(
				new BasicFileInputFactory("input.cfg", false));
	}
}
