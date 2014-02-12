package com.touzbi.ansatest.contentgrabbertest;

import org.junit.Test;

import com.touzbi.ansa.contentgrabber.ContentGrabber;
import com.touzbi.ansa.contentgrabber.TextContentGrabber;

public class TextContentGrabberTest {
	private static final String QUERY = "a";
	private static final String DOCUMENT = "<body><a>yeaaaaa</a></body>";

	@Test
	public void test() {
		ContentGrabber contentGrabber = new TextContentGrabber(QUERY);

		System.out.println(contentGrabber.getContent(DOCUMENT));
	}
}
