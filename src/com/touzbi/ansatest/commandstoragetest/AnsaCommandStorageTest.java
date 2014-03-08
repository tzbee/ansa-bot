package com.touzbi.ansatest.commandstoragetest;

import org.junit.Test;

import com.touzbi.ansa.commandstorage.AnsaCommandStorage;
import com.touzbi.ansa.commandstorage.CommandStorage;

public class AnsaCommandStorageTest {

	@Test
	public void test() {
		CommandStorage commandStorage = AnsaCommandStorage.getInstance();

		System.out.println(commandStorage.getCommandByName("app"));
	}
}
