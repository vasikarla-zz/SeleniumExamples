package com.selenium.training.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithControls {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.kayak.com/flights");

		driver.findElementById("origin").sendKeys("SFO");
		driver.findElementById("destination").sendKeys("AUS");

		driver.findElementById("travel_dates-start-tab").sendKeys("07/20/2015");
		driver.findElementById("travel_dates-start-tab").sendKeys(Keys.ENTER);

		driver.findElementById("depart_date").sendKeys("08/20/2015");
		driver.findElementById("depart_date").sendKeys(Keys.ENTER);

		driver.findElementById("fdimgbutton").click();
	}
}
