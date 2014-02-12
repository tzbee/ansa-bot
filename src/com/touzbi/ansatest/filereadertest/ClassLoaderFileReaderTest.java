package com.touzbi.ansatest.filereadertest;

import org.junit.Test;

import com.touzbi.ansa.util.filereaderstrategy.ClassPathRelativeFileReaderStrategy;
import com.touzbi.ansa.util.filereaderstrategy.FileReaderStrategy;

public class ClassLoaderFileReaderTest {
	private static final String FILE_PATH = "com/touzbi/ansatest/input.cfg";

	@Test
	public void test() {
		FileReaderStrategy fileReader = new ClassPathRelativeFileReaderStrategy();

		System.out.println(fileReader.readToString(FILE_PATH));
	}
}
