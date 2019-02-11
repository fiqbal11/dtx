package com.Prod.dtx_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DIF1 {
	
//////////Copying DIF1v2
	
	
WebDriver driver;
	
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
	
	@Test(priority = 1) 
		public void NavigateToTRANSCOM() 
	{	
    	//Selecting "Transportation Command Regulated Patient Movement" hyper link.
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/table/tbody/tr[3]/td[2]/a")).click();
		System.out.println("Selected TRANSCOM Logo linktest");          
	}
	
	@Test(priority = 2)
	public void LogintoProfile () {
        //click login TNB module 
        driver.findElement(By.xpath("//*[@id=\"sub-menu\"]/ul/li[2]/a")).click();
        
        //login
        driver.findElement(By.id("name")).sendKeys("Farooq");
        driver.findElement(By.name("passwrd")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/table/tbody/tr/td/table/tbody/tr[4]/td/input")).click();
        
        //enter
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
	}
	
	@Test(priority = 3)
	public void searchLeftNav() {
		 
        //click search LNB
        driver.findElement(By.xpath("//*[@id=\"landing-page\"]/div[1]/div[1]/ul/li[4]/div/a")).click();   
		driver.getTitle();
		System.out.println(driver.getTitle());
        System.out.println("I am awesome");
	}
	
	
	
	
	
	
	
	
	
	
}

