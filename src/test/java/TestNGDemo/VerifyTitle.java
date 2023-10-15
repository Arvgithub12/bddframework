package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test
	public void CheckTitle()
	{
	  String expectedTitle = "Swag Labs";
	  String actualTitle =  driver.getTitle();
	  
	  if(expectedTitle.equals(actualTitle))
	  {
		  System.out.println("Correct Title");
	  }
	  else 
	  {
		  System.out.println("Incorrect Title");
	  }
			 
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
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
