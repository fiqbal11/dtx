package com.Prod.dtx_project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class A_MainLandingPg extends TestBase {

	
	@Test(priority = 1) 
	public void TC001NavigateToTRANSCOM() 
	{	
		//Selecting "Transportation Command Regulated Patient Movement" hyper link.
	driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/table/tbody/tr[3]/td[2]/a")).click();
	System.out.println("Selected TRANSCOM Logo linktest");          
	}
	
	
	
}
