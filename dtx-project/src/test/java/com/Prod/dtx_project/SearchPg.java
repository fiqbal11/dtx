package com.Prod.dtx_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchPg extends DIF1v2 {
	
	
//Name and Reference Section	
	@Test(priority = 4) 
	public void SearchByPSRnumber() 
	{	
		driver.findElement(By.xpath("//*[@id='inc_ourref']")).clear();
		driver.findElement(By.xpath("//*[@id='inc_ourref']")).sendKeys("PSR-866");
		driver.findElement(By.name("btnSearch")).click();
	}
	@Test(priority = 5) 
	public void SearchByPSRnumberValidateResult() 
	{	
			//1. Validate Result
		
			//2. Press Back Btn
		driver.findElement(By.xpath("//*[@id='main-content']/div/div[3]/input")).click();
			//Clear or reselect Search??? NOt sure.
	}
	
	
	
	@Test(priority = 6)
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