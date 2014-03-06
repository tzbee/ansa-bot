package com.touzbi.ansatest.maintest;

import org.junit.Test;

import com.touzbi.ansa.app.AnsaApp;
import com.touzbi.ansa.app.App;

public class AnsaMainTest {

	@Test
	public void test() {
		App app = new AnsaApp();

		app.start();
	}
}
