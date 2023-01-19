package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
     public WebDriver driver;
     
	@BeforeMethod
	
	public void browserOpen() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); // launch the browser
		driver.get("https://sakshingp.github.io/assignment/login.html"); //open the url
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
		
		@AfterMethod
		
		public void browserClose() {
		driver.close();	
			
		}
		
	}
	
