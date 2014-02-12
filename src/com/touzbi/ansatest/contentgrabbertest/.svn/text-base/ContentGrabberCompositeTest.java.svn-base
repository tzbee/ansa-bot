package com.touzbi.ansatest.contentgrabbertest;

import org.junit.Test;

import com.touzbi.ansa.contentgrabber.ContentGrabber;
import com.touzbi.ansa.contentgrabber.ContentGrabberComposite;
import com.touzbi.ansa.contentgrabber.CustomLinkGrabber;
import com.touzbi.ansa.contentgrabber.RegexContentGrabber;

public class ContentGrabberCompositeTest {
	private static final String INPUT = "<html><body><a href=\"http://yesyesyesno\"></a></body></html>";

	private static final ContentGrabber[] CONTENTGRABBERS = {
			new CustomLinkGrabber("a"), new RegexContentGrabber("//.*") };

	@Test
	public void test() {
		ContentGrabber contentGrabber = new ContentGrabberComposite(
				CONTENTGRABBERS);

		System.out.println(contentGrabber.getContent(INPUT));
	}
}
