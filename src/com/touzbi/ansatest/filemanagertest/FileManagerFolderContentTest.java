package com.touzbi.ansatest.filemanagertest;

import java.io.File;

import org.junit.Test;

import com.touzbi.ansa.util.fileutils.duplicatehandler.FileDuplicatesHandler;
import com.touzbi.ansa.util.fileutils.duplicatehandler.FileSizeDuplicatesHandler;
import com.touzbi.ansa.util.fileutils.filemanager.FileManager;
import com.touzbi.ansa.util.fileutils.filemanager.MyFileManager;

public class FileManagerFolderContentTest {
	private static final String FOLDER_PATH = "/home/touzbi/Downloads/test";

	@Test
	public void test() {
		FileDuplicatesHandler duplicateHandler = new FileSizeDuplicatesHandler();
		FileManager fileManager = new MyFileManager(duplicateHandler);

		// List folder content
		listFolderContent(fileManager);
	}

	private static void listFolderContent(FileManager fileManager) {
		for (File file : fileManager.getDiretoryContent(new File(FOLDER_PATH))) {
			System.out.println(file);
		}
	}
}
