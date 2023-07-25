package com.flipkart.qa.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.qa.util.Utility;

public class BaseClass {
	public static WebDriver driver;
	//static ChromeOptions opt;

	public static void launchBrowser() throws IOException
	{
		String bName=Utility.readConfigProp("browserName");
		if(bName.equalsIgnoreCase("chrome"))
		{
			//opt=new ChromeOptions();
			//opt.addArguments("incognito");
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
	public static void closeBrowser()
	{
		driver.quit();
		Utility.impliciteWait(driver, 5);
	}
	
}
