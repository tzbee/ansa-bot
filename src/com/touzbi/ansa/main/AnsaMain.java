package com.touzbi.ansa.main;

import com.touzbi.ansa.app.AnsaApp;
import com.touzbi.ansa.app.App;

public class AnsaMain {
	private static final String ANSA_CONFIG_FILE_PATH = "app.ansa";

	public static void main(String[] args) {
		App app = new AnsaApp(ANSA_CONFIG_FILE_PATH, true);
		app.start();
	}
}
