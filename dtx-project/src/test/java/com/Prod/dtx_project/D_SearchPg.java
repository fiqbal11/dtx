package com.Prod.dtx_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class D_SearchPg extends C_ProfileLogins {
	
	
	
	@Test(priority = 5)
	public void searchLeftNav() {
		 
        //click search LNB
        driver.findElement(By.xpath("//*[@id=\"landing-page\"]/div[1]/div[1]/ul/li[4]/div/a")).click();   
		driver.getTitle();
		System.out.println(driver.getTitle());
        System.out.println("I am awesome");
	}
	
	
	
	
//Name and Reference Section	
	@Test(priority = 6) 
	public void SearchByPSRnumber() 
	{	
		driver.findElement(By.xpath("//*[@id='inc_ourref']")).clear();
		driver.findElement(By.xpath("//*[@id='inc_ourref']")).sendKeys("PSR-866");
		driver.findElement(By.name("btnSearch")).click();
	}
	@Test(priority = 7) 
	public void SearchByPSRnumberValidateResult() 
	{	
			//1. Validate Result
		
			//2. Press Back Btn
		driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/input")).click();
			//Clear or reselect Search??? NOt sure.
	}
	
	
	
	@Test(priority = 8)
	public void SearchByDatixID()
	{
		//Search by Datix ID
		driver.findElement(By.id("recordid")).clear();
		driver.findElement(By.id("recordid")).sendKeys("1171");
		driver.findElement(By.name("btnSearch")).click();
		//ValidateResult
		
		//Press back btn
		driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/input")).click();

	}
	
	
	
	
	
}