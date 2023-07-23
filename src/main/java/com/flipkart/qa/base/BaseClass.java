package com.flipkart.qa.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.qa.util.Utility;

public class BaseClass {
	public static WebDriver driver;
	
	public static void lanuchBrowser() throws IOException
	{
		String bName=Utility.readConfigProp("browserName");
		if(bName.equalsIgnoreCase("chrome"))
		{
			Reporter.log("launching chromeBrowser", true);
			 driver=new ChromeDriver();
			
		}
		else if(bName.equalsIgnoreCase("firefox"))
		{
			Reporter.log("launching FireFoxBrowser", true);
		     driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(Utility.readConfigProp("url"));
		Utility.impliciteWait(driver, 5);
			
	}
	
}
