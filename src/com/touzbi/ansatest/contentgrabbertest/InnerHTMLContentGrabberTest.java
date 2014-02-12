package com.touzbi.ansatest.contentgrabbertest;

import org.junit.Test;

import com.touzbi.ansa.contentgrabber.ContentGrabber;
import com.touzbi.ansa.contentgrabber.InnerHTMLContentGrabber;

public class InnerHTMLContentGrabberTest {
	private static final String DOCUMENT = "<body><a class=\"theone\">yeah</a><a>oh</a>haha<script>prouuuut</script></body>";
	private static final String QUERY = "a.theone";

	@Test
	public void test() {
		ContentGrabber contentGrabber = new InnerHTMLContentGrabber(QUERY);

		System.out.println(contentGrabber.getContent(DOCUMENT));
	}
}
