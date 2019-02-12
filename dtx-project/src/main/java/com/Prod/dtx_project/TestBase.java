package com.Prod.dtx_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class TestBase {

	public static WebDriver driver;
	
//InitializationSwitchStatment

			@BeforeClass
			public void MainSetup()  
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe");
				driver = new ChromeDriver();		
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("http://dod.datixweb.co.uk/demo");
			}
	
	
	   @BeforeMethod 
			public void Print()
	   {
		   //"Sting = methodName + Pass"
		   System.out.println("Pass");
		   
	   }
	
	   
	   @AfterClass
		public void LogOutCloseTC00Z()
	   {
	   driver.findElement(By.xpath("//*[@id='sub-menu']/ul/li[7]/a")).click();
	   driver.close();
	   }
	   
}
