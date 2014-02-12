package com.touzbi.ansatest.inputfactorytest;

import org.junit.Test;

import com.touzbi.ansa.input.inputfactory.FileInputFactory;
import com.touzbi.ansa.input.inputfactory.InputFactory;

public class FileInputFactoryTest {
	private static final String INPUT_FILE_PATH = "com/touzbi/ansatest/input.cfg";

	@Test
	public void test() {
		InputFactory inputFactory = new FileInputFactory(INPUT_FILE_PATH, false);

		System.out.println(inputFactory.getInput());
	}
}
