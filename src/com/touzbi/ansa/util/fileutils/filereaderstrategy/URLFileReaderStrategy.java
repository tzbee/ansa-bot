package com.touzbi.ansa.util.fileutils.filereaderstrategy;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.LogManager;
import java.util.zip.GZIPInputStream;

//Read a distant file based on its URL
//TODO Refactor the whole thing
public class URLFileReaderStrategy extends AbstractFileReaderStrategy {
	private static final Logger LOGGER = LogManager.getLogger();

	private static final String USER_AGENT_KEY = "User-Agent";
	private static final String USER_AGENT_VALUE = "Mozilla/5.0 (Windows NT 6.1; WOW64)"
			+ " AppleWebKit/537.11 (KHTML, like Gecko)"
			+ " Chrome/23.0.1271.95" + " Safari/537.11";

	private static final String LOCALE_KEY = "Accept-Language";
	private static final String LOCALE_VALUE = "en-US,en;q=0.8,fr;q=0.6";

	private static final String ENCODING_KEY = "Accept-Encoding";
	private static final String ENCODING_VALUE = "gzip,deflate,sdch";

	private static final String ACCEPT_KEY = "Accept";
	private static final String ACCEPT_VALUE = "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8";

	@Override
	public InputStream readToInputStream(String filePath) throws IOException {
		LOGGER.info("Reading file at URL {}..", filePath);

		InputStream is = null;
		URL url = null;

		try {
			url = new URL(filePath);
		} catch (MalformedURLException e) {
			// Handled later as IOException
		}

		URLConnection connection;
		try {
			connection = url.openConnection();
		} catch (NullPointerException e) {
			throw new IOException();
		}

		connection.setRequestProperty(USER_AGENT_KEY, USER_AGENT_VALUE);
		connection.setRequestProperty(LOCALE_KEY, LOCALE_VALUE);
		connection.setRequestProperty(ENCODING_KEY, ENCODING_VALUE);
		connection.setRequestProperty(ACCEPT_KEY, ACCEPT_VALUE);

		connection.connect();
		is = connection.getInputStream();

		// XXX To fix: Moche
		String encodingHeaderField = connection
				.getHeaderField("Content-Encoding");
		if (encodingHeaderField != null && encodingHeaderField.equals("gzip")) {
			is = new GZIPInputStream(is);
		}

		return is;
	}
}
