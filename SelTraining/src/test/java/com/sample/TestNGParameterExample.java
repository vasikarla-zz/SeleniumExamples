package com.sample;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterExample {

	@Test
	@Parameters("foo")
	public void readingParamValuesFromTestNGSuite(@Optional String foo) {
		// System.out.println("Parameter Read From TestNG :" + foo);
		System.out.println("Property from Maven :"
				+ System.getProperty("foo", foo));
	}
}
