package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyURL {

	WebDriver driver;
	@BeforeMethod
	public void Setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void VerifyMYURL() {
		
		  String expectedURL = "https://www.saucedemo.com/";
		  String actualURL =  driver.getCurrentUrl();
		  
		  if(expectedURL.equals(actualURL))
		  {
			  System.out.println("Correct URL");
		  }
		  else 
		  {
			  System.out.println("Incorrect URL");
		  }
				 
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}

}
