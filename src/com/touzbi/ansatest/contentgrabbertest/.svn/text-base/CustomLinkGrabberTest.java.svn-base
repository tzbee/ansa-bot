package com.touzbi.ansatest.contentgrabbertest;

import org.junit.Test;

import com.touzbi.ansa.contentgrabber.ContentGrabber;
import com.touzbi.ansa.contentgrabber.CustomLinkGrabber;

public class CustomLinkGrabberTest {
	private static final String INPUT = "<html><body><a href=\"http://yesyesyesno\"></a></body></html>";

	@Test
	public void test() {
		ContentGrabber contentGrabber = new CustomLinkGrabber("a");

		System.out.println(contentGrabber.getContent(INPUT));
	}
}
