package com.Prod.dtx_project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//https://www.guru99.com/all-about-testng-and-selenium.html
@Test
public class Guru99 {

	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe";
	    public WebDriver driver; 
	    public String expected = null;
	    public String actual = null;
	    
	        @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching browser"); 
System.setProperty("webdriver.chrome.driver", driverPath);
	          driver= new ChromeDriver();
	          driver.get(baseUrl);
	      }
	      
	      @BeforeMethod
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	      }
	          @Test(priority = 0)
	      public void register(){
	          driver.findElement(By.linkText("REGISTER")).click() ;
	          expected = "Register: Mercury Tours";
	          actual = driver.getTitle();
	          Assert.assertEquals(actual, expected);
	      }
	          @Test(priority = 1)
	      public void support() {
	            driver.findElement(By.linkText("SUPPORT")).click() ;
	            expected = "Under Construction: Mercury Tours";
	            actual = driver.getTitle();
	            Assert.assertEquals(actual, expected);
	      }
	          
	          @Test(priority = 2)
	      public void register2(){
	          driver.findElement(By.linkText("REGISTER")).click() ;
	          expected = "Register: Mercury Tours";
	          actual = driver.getTitle();
	          Assert.assertEquals(actual, expected);     
	      }
	          
	          @Test(priority = 3)
	      public void Formfill() {
	            driver.findElement(By.name("firstName")).sendKeys("hello");
	            driver.findElement(By.name("lastName")).sendKeys("hello");
	            driver.findElement(By.name("address1")).sendKeys("hello");

	      }

	          
	}
	
	

