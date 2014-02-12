package com.touzbi.ansatest.checksumtest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import org.junit.Test;

public class FileChecksumTest {
	private static final String PATH1 = "/home/touzbi/Downloads/test/test1.txt";
	private static final String PATH2 = "/home/touzbi/Downloads/test/test2.txt";
	private static final String PATH3 = "/home/touzbi/Downloads/test/test3.txt";

	@Test
	public void test() {
		doIt(PATH1);

		System.out.println();

		doIt(PATH2);

		System.out.println();

		doIt(PATH3);
	}

	private void doIt(String filePath) {
		System.out.println(filePath);
		displayBytes(filePath);
		System.out.println();
		System.out.println("Checksum " + getChecksum(getBytes(filePath)));
	}

	private static void displayBytes(String filePath) {
		int counter = 0;

		for (byte b : getBytes(filePath)) {
			System.out.print(b + " ");
			counter++;

			if (counter > 15) {
				System.out.println();
				counter = 0;
			}
		}
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
