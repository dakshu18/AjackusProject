package com.PropertyCapsuleTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PropertyCapsulePages.BaseClass;
import com.PropertyCapsulePages.HomePage;

public class TestCases extends BaseClass{
	
	@Test (priority = 1)
	public void launchMapMaker() throws InterruptedException
	{
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.mapMakerTab();
	}
	
	@Test (priority = 2)
	public void launchTourBook() throws InterruptedException
	{
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.tourBooktab();
	}
	
	@Test (priority = 3)
	public void launchEnterPriseLogin() throws InterruptedException
	{
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.enterPriseLoginTab();
	}
}
