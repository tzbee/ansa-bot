package com.touzbi.ansa.util.fileutils.filemanager;

import java.io.File;
import java.util.Collection;

public interface DirectoryManager {
	Collection<File> getDiretoryContent(File directoryPath);

	boolean deleteDirectoryContent(File folder);

	boolean deleteFile(File file);

	boolean deleteFiles(Collection<File> files);
}
