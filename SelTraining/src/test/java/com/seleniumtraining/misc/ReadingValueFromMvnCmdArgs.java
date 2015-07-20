package com.seleniumtraining.misc;

import org.testng.annotations.Test;

public class ReadingValueFromMvnCmdArgs {

	@Test
	public void HowToReadValuesFromMvnCmdLine() {
		System.out.println("This is sample text");
		System.out.println(System.getProperty("buildVersion",
				"This is the default value"));
		System.out.println(System.getenv("buildVersion"));
	}
}
