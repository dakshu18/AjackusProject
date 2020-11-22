package com.PropertyCapsuleUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	//object class
	Properties pro;
	
	//constructor
	public ConfigDataProvider()
	{
		
		File src = new File("./Config/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to load config file");
			
		}
		
	}

	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getStringURL()
	{
		return pro.getProperty("URL");
	}
}


