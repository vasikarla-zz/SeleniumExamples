package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelSample {

	public static void main(String[] args) {
		// Creating Driver
		FirefoxDriver driver = new FirefoxDriver();

		// Launching a Page
		driver.get("https://e2e.qbo.intuit.com");

		// Type UserName
		driver.findElement(By.xpath(".//*[@id='login']")).sendKeys("sudhaauto");
		driver.findElement(By.id("password")).sendKeys("sudhaaut0");
		driver.findElement(By.xpath(".//*[@id='LoginButton']")).click();

		driver.navigate().to("https://e2e.qbo.intuit.com/app/employees");

		driver.switchTo().defaultContent();
		driver.switchTo().frame("addonframe");
		driver.switchTo().frame("ifr");

		WebElement adamJohn = driver.findElement(By
				.xpath("//a[contains(text(),\"Adam, John\")]"));

		adamJohn.click();

		WebElement editEmployee = driver.findElement(By
				.xpath("//a[contains(text(),\"Edit employee\")]"));

		editEmployee.click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("addontrowserframe");

		driver.switchTo().frame("ifr");

		WebElement addDeduction = driver.findElement(By
				.xpath("//a[contains(text(),\"Add a new deduction\")]"));

		addDeduction.click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("addontrowserframe");

		driver.switchTo().frame("ifr");

		WebElement dropDown = driver
				.findElement(By
						.xpath("//div[@class='select']//select[contains(@id,\"dType\")]/.."));

		dropDown.click();

		WebElement option2 = driver
				.findElement(By
						.xpath("//div[contains(@class,'select')]//select[contains(@id,\"dType\")]/..//ul//li[contains(text(),'Garnishment')]"));

		option2.click();
	}
}
