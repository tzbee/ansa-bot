package com.touzbi.ansatest.inputfactorytest;

import org.junit.Test;

import com.touzbi.ansa.inputfactory.BasicFileInputFactory;
import com.touzbi.ansa.inputfactory.InputFactory;

public class BasicFileInputFactoryTest {
	private static final String FILE_PATH = "com/touzbi/ansatest/input.cfg";

	@Test
	public void test() {
		InputFactory inputFactory = new BasicFileInputFactory(FILE_PATH, false);
		System.out.println(inputFactory.getInputs());
	}
}
