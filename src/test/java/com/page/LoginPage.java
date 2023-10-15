package com.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver Idriver) {
		Idriver = driver;
	}
	
	@FindBy(id = "user-name")
	WebElement uname;
	
	@FindBy(id = "password")
	WebElement pswd;
	
	@FindBy(id = "login-button")
	WebElement button;
	
	public void logintoSaucedemo(String username, String password) {
		try {
			Thread.sleep(2000);
			
		} catch(InterruptedException e) {
			
		}
		uname.sendKeys(username);
		pswd.sendKeys(password);
		button.click();
	}
}

