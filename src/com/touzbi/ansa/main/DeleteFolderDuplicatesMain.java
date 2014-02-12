package com.touzbi.ansa.main;

import java.io.File;

import com.touzbi.ansa.util.filemanager.FileManager;
import com.touzbi.ansa.util.filemanager.MyFileManager;
import com.touzbi.ansa.util.filemanager.duplicatehandler.FileDuplicatesHandler;
import com.touzbi.ansa.util.filemanager.filecomparator.SizeFileComparator;

/**
 * Delete duplicated files in a folder based on their size
 * 
 * @author touzbi
 */
public class DeleteFolderDuplicatesMain {
	public static void main(String[] args) {
		FileManager fileManager = new MyFileManager(new FileDuplicatesHandler(
				new SizeFileComparator()));

		for (String arg : args) {
			fileManager.deleteDirectoryDuplicates(new File(arg));
		}
	}
}
