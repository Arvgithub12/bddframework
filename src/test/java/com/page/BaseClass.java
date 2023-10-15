package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.browserfactory;

public class BaseClass {
	public WebDriver driver;
	@BeforeClass
	public void Setup() {
		driver = browserfactory.startApplication(driver, "Chrome", "https://www.saucedemo.com");
	}
	
	@AfterClass
	public void teardown() {
		browserfactory.quitBrowser(driver);
	}
}
