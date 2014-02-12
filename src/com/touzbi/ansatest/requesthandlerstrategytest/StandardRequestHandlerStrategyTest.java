package com.touzbi.ansatest.requesthandlerstrategytest;

import org.junit.Test;

import com.touzbi.ansa.requesthandlerstrategy.BasicRequestStrategy;
import com.touzbi.ansa.requesthandlerstrategy.RequestStrategy;

public class StandardRequestHandlerStrategyTest {
	private static final String URL = "http://kickass.to/batman-gotham-knight-2008-1080p-brrip-x264-yify-t6653319.html";

	@Test
	public void test() {
		RequestStrategy requestHandlerStrategy = new BasicRequestStrategy();

		System.out.println(requestHandlerStrategy.getPage(URL));
	}
}
