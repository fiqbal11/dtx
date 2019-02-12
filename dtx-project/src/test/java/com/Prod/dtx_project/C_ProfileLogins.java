package com.Prod.dtx_project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C_ProfileLogins extends B_DIF1v2{

	

	
	@Test(priority = 3)
	public void TC002logintoProfile () {
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
	
	@Test(priority = 4)
	public void profileLandedpg() {
		 driver.getTitle();
		 System.out.println(driver.getTitle());
 
	}
	
	
	
	
}
