package com.touzbi.ansa.util.filemanager.filecomparator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

/**
 * @author touzbi File comparator using the checksums of the files to determine
 *         whether they are equal or not
 * 
 */
public class ChecksumFileComparator implements FileComparator {
	@Override
	public int compare(File file1, File file2) {
		return (int) (getChecksum(getBytes(file1.getAbsolutePath())) - getChecksum(getBytes(file2
				.getAbsolutePath())));
	}

	private static byte[] getBytes(String filePath) {
		Path path = Paths.get(filePath);
		byte[] data = null;

		try {
			data = Files.readAllBytes(path);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}

		return data;
	}

	private static long getChecksum(byte[] b) {
		Checksum checksum = new CRC32();
		checksum.update(b, 0, b.length);
		return checksum.getValue();
	}
}
