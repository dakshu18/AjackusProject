package com.PropertyCapsulePages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
	this.driver=driver;
	}
	
	
	@FindBy(xpath = "//*[@id = 'market-btn']") WebElement mapmaker;
	
	@FindBy(xpath = "//*[@id = 'manage-btn']") WebElement tourbook;
	
	@FindBy(xpath = "//a[@class='btn sign-up-btn enterprise-admin-btn']") WebElement enterpriselogin;
	
	
	public void mapMakerTab() throws InterruptedException
	{
	mapmaker.click();
	
	Thread.sleep(5000); //just used for showing the flow
	
	closingwindow();
	}
	
	public void tourBooktab() throws InterruptedException
	{
	tourbook.click();
	Thread.sleep(5000); //just used for showing the flow
	closingwindow();
	}
	
	public void enterPriseLoginTab() throws InterruptedException
	{
	enterpriselogin.click(); 
	Thread.sleep(5000); //just used for showing the flow
	driver.navigate().back();
	String s = driver.findElement(By.xpath("//div[contains (text (), 'Time kills deals. Stop wasting it.')]")).getText();
	String s1 = "Time kills deals. Stop wasting it.";
    assertEquals(s, s1);
	}
	
	private void closingwindow()
	{
	
	String mainwindow  = driver.getWindowHandle();
	Set<String> mapm = driver.getWindowHandles();
	ArrayList<String> arr = new ArrayList<String>(mapm);
	driver.switchTo().window(arr.get(1));
	driver.close();
	driver.switchTo().window(mainwindow);

	}
	

	
}

