package com.touzbi.ansatest.filecomparatortest;

import java.io.File;

import org.junit.Test;

import com.touzbi.ansa.util.filemanager.filecomparator.ChecksumFileComparator;
import com.touzbi.ansa.util.filemanager.filecomparator.FileComparator;

public class ChecksumFileComparatorTest {
	private static final String HOME = "/home/touzbi/Downloads/test/";
	private static final File FILE1 = new File(HOME + "1");
	private static final File FILE2 = new File(HOME + "3");

	@Test
	public void test() {
		FileComparator fileComparator = new ChecksumFileComparator();

		System.out.println(fileComparator.compare(FILE1, FILE2));
	}
}
