package com.PropertyCapsuleUtilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver startApplication(WebDriver driver, String browsername, String applicationURL)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(240,TimeUnit.SECONDS);
		driver.get(applicationURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(240,TimeUnit.SECONDS);
		
		return driver;
	}

	
	
	
	
	

}
