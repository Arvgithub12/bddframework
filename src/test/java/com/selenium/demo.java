package com.selenium;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("The title of the current page=:" + driver.getTitle());
		
		
		
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		// Set<String> windowid = driver.getWindowHandles();

		// List<String> windowlist = new ArrayList<String>(windowid);

		// String pwindow = windowlist.get(0);
		// System.out.println("The Parent window id is=:" + pwindow);

		// String cwindow = windowlist.get(1);
		// System.out.println("The child window id =:" + cwindow);
		
		// System.out.println("The title of the current page=:" + driver.getTitle());
		// Thread.sleep(5000);
		
		driver.close();	
	}

}
