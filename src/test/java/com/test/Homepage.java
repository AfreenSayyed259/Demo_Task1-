package com.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utility.Baseclass;

public class Homepage extends Baseclass {
	
	/*Verify the functionality of AMOUNT header 
	 * of transaction table in home page
	 */
	
  @Test
  public void homePage() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("AfreenSayyed");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@id='log-in']")).click();
	  
	  Thread.sleep(2000);
	  
	  //User is on Homepage
	  
	  Actions builder=new Actions(driver);
	  WebElement amount=driver.findElement(By.xpath("//th[@class='text-right']"));
	  
	  //user move to AMOUNT header and click on that
	  builder.moveToElement(amount).click(amount).build().perform();
	  
	  Thread.sleep(2000);
	  
	  System.out.println("User clicked on AMOUNT header of transaction table");
	  
	  
  }
}