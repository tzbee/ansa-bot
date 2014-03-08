package com.touzbi.ansa.util.filemanager;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasicDirectoryManager implements DirectoryManager {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public boolean deleteDirectoryContent(File folder) {
		LOGGER.info("Removing directory {} content", folder);

		return deleteFiles(getDiretoryContent(folder));
	}

	@Override
	public Collection<File> getDiretoryContent(File folder) {
		LOGGER.info("Getting directory {}'s content...", folder);

		Collection<File> directoryContent = new HashSet<File>();

		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				directoryContent.addAll(getDiretoryContent(fileEntry));
			} else {
				directoryContent.add(fileEntry);
			}
		}

		return directoryContent;
	}

	@Override
	public boolean deleteFiles(Collection<File> files) {
		LOGGER.info("Removing multiple files");

		boolean allFileRemoved = false;

		for (File file : files) {
			allFileRemoved &= deleteFile(file);
		}

		return allFileRemoved;
	}

	@Override
	public boolean deleteFile(File file) {
		LOGGER.info("Removing file {}, size: {}", file.getName(), file.length());

		return file.delete();
	}
}
