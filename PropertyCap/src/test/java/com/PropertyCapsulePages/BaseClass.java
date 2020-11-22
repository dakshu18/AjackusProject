package com.PropertyCapsulePages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.PropertyCapsuleUtilities.Browser;
import com.PropertyCapsuleUtilities.ConfigDataProvider;

public class BaseClass {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpConfig()
	{
		config = new ConfigDataProvider();
	}
	
	@BeforeClass 
	public void setp()
	{
		driver=Browser.startApplication(driver, config.getBrowser(),config.getStringURL());
		//driver=Browser.startApplication(driver,"Chrome", "https://www.propertycapsule.com/");
	}
		
	@AfterClass
	public void end()
	{
		driver.quit();
	}


	
	
}
