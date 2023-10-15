package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
	    Select v1 = new Select(ele);
	    v1.selectByValue("Portland");
	    Thread.sleep(2000);
	    WebElement ele2 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
	    Select v2 = new Select(ele2);
	    v2.selectByValue("London");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("inputName")).sendKeys("Arvind Singh");
	    driver.findElement(By.name("address")).sendKeys("Flat No 145, Greater Noida");
	    driver.findElement(By.name("city")).sendKeys("Noida");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("state")).sendKeys("UP");
	    driver.findElement(By.name("zipCode")).sendKeys("201908");
	    Thread.sleep(2000);
	    WebElement ele3 = driver.findElement(By.name("cardType"));
	    Select v3 = new Select(ele3);
	    v3.selectByValue("amex");
	    Thread.sleep(2000);
	    driver.findElement(By.name("creditCardNumber")).sendKeys("2113-2235-4456");
	    WebElement cardmonth = driver.findElement(By.name("creditCardMonth"));
	    cardmonth.clear();
	    cardmonth.sendKeys("08");
	    Thread.sleep(2000);
	    
	    WebElement cardyear = driver.findElement(By.name("creditCardYear"));
	    cardyear.clear();
	    cardyear.sendKeys("2026");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("nameOnCard")).sendKeys("ARVIND SINGH");
	    driver.findElement(By.name("rememberMe")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
	    
	    Thread.sleep(3000);
	}

}
