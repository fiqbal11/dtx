package com.Prod.dtx_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
	}
	
	@Test(priority = 1, groups = "title") 
		public void googletitletest() {
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}
	
	@Test(priority = 3, groups = "logo")
	public void googlelogotest () {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();		
	}
	
	@Test(priority = 2, groups = "linktest")
	public void mailLinktest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

}
