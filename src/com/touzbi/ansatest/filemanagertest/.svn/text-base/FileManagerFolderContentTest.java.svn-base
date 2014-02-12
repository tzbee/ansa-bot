package com.touzbi.ansatest.filemanagertest;

import java.io.File;

import org.junit.Test;

import com.touzbi.ansa.util.filemanager.FileManager;
import com.touzbi.ansa.util.filemanager.MyFileManager;
import com.touzbi.ansa.util.filemanager.duplicatehandler.FileDuplicatesHandler;
import com.touzbi.ansa.util.filemanager.duplicatehandler.FileSizeDuplicatesHandler;

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
