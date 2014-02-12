package com.touzbi.ansatest.contentgrabbertest;

import org.junit.Test;

import com.touzbi.ansa.contentgrabber.ContentGrabber;
import com.touzbi.ansa.contentgrabber.RegexContentGrabber;

@SuppressWarnings("unused")
public class RegexContentGrabberTest {
	private static final String REGEX1 = "..><.";

	private static final String HTML_DOCUMENT = "<html>" + "<head>" + "</head>"
			+ "<body>" + "<script>" + "<p>test</p>" + "</script>" + "</body>"
			+ "</html>";

	private static final String REGEX2 = "\\D+";

	private static final String STR = "popo18";

	@Test
	public void test() {
		ContentGrabber contentGrabber = new RegexContentGrabber(REGEX2);

		System.out.println(contentGrabber.getContent(STR));
	}
}
