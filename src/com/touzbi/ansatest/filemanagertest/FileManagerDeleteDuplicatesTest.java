package com.touzbi.ansatest.filemanagertest;

import java.io.File;

import org.junit.Test;

import com.touzbi.ansa.util.fileutils.duplicatehandler.FileDuplicatesHandler;
import com.touzbi.ansa.util.fileutils.duplicatehandler.FileSizeDuplicatesHandler;
import com.touzbi.ansa.util.fileutils.filemanager.FileManager;
import com.touzbi.ansa.util.fileutils.filemanager.MyFileManager;

public class FileManagerDeleteDuplicatesTest {
	private static final String FOLDER_PATH = "/home/touzbi/Downloads/test";

	@Test
	public void test() {
		FileDuplicatesHandler duplicateHandler = new FileSizeDuplicatesHandler();
		FileManager fileManager = new MyFileManager(duplicateHandler);

		// Delete folder duplicates based on size and checksum
		fileManager.deleteDirectoryDuplicates(new File(FOLDER_PATH));
	}
}
