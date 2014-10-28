package com.touzbi.ansatest.inputfactorytest;

import com.touzbi.ansa.inputfactory.BasicFileInputFactory;
import com.touzbi.ansa.inputfactory.InputFactory;

public class FileInputFactoryTest {
	private static final String INPUT_FILE_PATH = "com/touzbi/ansatest/input.cfg";

	@Test
	public void test() {
		InputFactory inputFactory = new BasicFileInputFactory(INPUT_FILE_PATH,
				false);

		System.out.println(inputFactory.getInputs());
	}
}
