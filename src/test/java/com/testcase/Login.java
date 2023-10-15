package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.BaseClass;
import com.page.LoginPage;

public class Login extends BaseClass {
	
	@Test
	public void Loginapp() {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.logintoSaucedemo("standard_user", "secret_sauce");
	}
}
