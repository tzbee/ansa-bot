package com.touzbi.ansa.util.filemanager;

import java.io.File;
import java.util.Collection;

public interface FileManager {
	Collection<File> getDiretoryContent(File folder);

	boolean deleteFile(File file);

	boolean deleteFiles(Collection<File> files);

	boolean deleteDirectoryContent(File folder);

	void deleteDirectoryDuplicates(File folder);

	Collection<Collection<File>> getDirectoryDuplicates(File folder);
}
