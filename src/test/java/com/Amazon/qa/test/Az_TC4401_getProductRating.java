package com.Amazon.qa.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.BaseClass;
import com.amazon.qa.pages.ProductPage;
import com.amazon.qa.pages.SearchPage;
import com.amazon.qa.util.Utility;

public class Az_TC4401_getProductRating extends BaseClass {
	//WebDriver driver;
	SearchPage Sp;
	ProductPage Pp;
	
	@BeforeClass
	public void openingBrowser() throws Throwable
	{	
		launchBrowser();
		Sp=new SearchPage(driver);
		Pp=new ProductPage(driver);
	}
	@BeforeMethod
	public void searchProduct() throws IOException, InterruptedException
	{
		Sp.clickOnsearchbox();
		Sp.clickonsearchButton();
//		Thread.sleep(2000);
		Sp.clickOnProduct();
		
	}
  @Test
  public void ProductRating() throws InterruptedException
  {
	  Thread.sleep(3000);
	  Set<String> winID = driver.getWindowHandles();
	  ArrayList<String> al = new ArrayList<>(winID);
	  driver.switchTo().window(al.get(1));
	  Utility.impliciteWait(driver, 3);
	  Pp.getProductRating();
  }
  
  @AfterMethod
  public void logout() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.close();
  }
  @AfterClass
  public void tearDown() throws InterruptedException
  {
	  closeBrowser();
	  Thread.sleep(3000);
  }
  }

