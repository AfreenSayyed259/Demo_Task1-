package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utility.Baseclass;

public class login extends Baseclass {

	/* Verify the functionality of Login page of Demo app
	 * 
	 */
	@Test
	public void loginpage () throws Exception {
	WebElement txt_username=driver.findElement(By.xpath("//input[@id='username']"));
	//this is to check whether the username field is displayed or not
	//this test runs If the condition is TRUE
	Assert.assertTrue(txt_username.isDisplayed()); 
    txt_username.sendKeys("AfreenSayyed");
	
	Thread.sleep(2000);
	
	WebElement txt_pass=driver.findElement(By.xpath("//input[@id='password']"));
	Assert.assertTrue(txt_pass.isDisplayed());
	txt_pass.sendKeys("123");
	
	Thread.sleep(2000);
	
	//to click on checkbox
	WebElement txt_check=driver.findElement(By.xpath("//*[@class='form-check-input']"));
	Assert.assertTrue(txt_check.isEnabled());
	txt_check.click();
	
	Thread.sleep(3000);
	
	//user clicks on login button
	WebElement btn_login=driver.findElement(By.xpath("//button[@id='log-in']"));
	btn_login.click();
	
	
	}
}
