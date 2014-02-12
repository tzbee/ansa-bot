package com.touzbi.ansatest.filecontentwrappertest;

import org.junit.Test;

import com.touzbi.ansa.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.filecontentwrapper.FileContentWrapper;

public class BasicFileContentWrapperTest {
	@Test
	public void test() {
		FileContentWrapper fileContentWrapper = new BasicFileContentWrapper(
				false);

		System.out.println(fileContentWrapper
				.getFileContent("com/touzbi/ansatest/app.ansa"));
	}
}
