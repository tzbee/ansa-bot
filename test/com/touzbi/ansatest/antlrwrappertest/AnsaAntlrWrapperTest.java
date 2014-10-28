package com.touzbi.ansatest.antlrwrappertest;

import org.junit.Test;

import com.touzbi.ansa.antlrwrapper.AbstractANTLRWrapper;
import com.touzbi.ansa.antlrwrapper.AnsaANTLRWrapper;
import com.touzbi.ansa.command.composite.CompositeCommandBuilder;
import com.touzbi.ansa.commandloader.AnsaCommandLoader;
import com.touzbi.ansa.util.fileutils.filecontentwrapper.BasicFileContentWrapper;
import com.touzbi.ansa.util.fileutils.filecontentwrapper.FileContentWrapper;

public class AnsaAntlrWrapperTest {
	private static final String FILE_PATH = "appm.ansa";

	@Test
	public void test() {
		FileContentWrapper fileContentWrapper = new BasicFileContentWrapper(
				false);
		AbstractANTLRWrapper antlrWrapper = new AnsaANTLRWrapper(
				AnsaCommandLoader.getTestInstance(),
				fileContentWrapper.getFileContent(FILE_PATH),
				new CompositeCommandBuilder());

		System.out.println(antlrWrapper);
	}
}
