package com.touzbi.ansa.util.fileutils.filecontentwrapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.touzbi.ansa.util.fileutils.filereaderstrategy.ClassPathRelativeFileReaderStrategy;
import com.touzbi.ansa.util.fileutils.filereaderstrategy.FileReaderStrategy;
import com.touzbi.ansa.util.fileutils.filereaderstrategy.JarDirectoryRelativeFileReaderStrategy;

public class BasicFileContentWrapper implements FileContentWrapper {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();

	protected FileReaderStrategy fileReader;

	public BasicFileContentWrapper(boolean isRelativeToJar) {
		this.fileReader = isRelativeToJar ? new JarDirectoryRelativeFileReaderStrategy()
				: new ClassPathRelativeFileReaderStrategy();
	}

	@Override
	public String getFileContent(String filePath) {
		return this.fileReader.readToString(filePath);
	}
}
