package com.selenium.training.day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverExample {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Page Title :" + driver.getTitle());
		driver.quit();
	}
}
