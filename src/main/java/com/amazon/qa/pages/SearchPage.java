package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SearchPage {
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox ;
	@FindBy(id="nav-search-submit-button")
	private WebElement searchButton;
	@FindBy(xpath="(//*[@class='a-section a-spacing-base'])[5]")
	private WebElement product;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnsearchbox()
	{
		Reporter.log("clicking on search box", true);
		searchbox.sendKeys("phy body wash for men");
		
	} 
	public void clickonsearchButton() throws IOException
	{
		Reporter.log("searching the product", true);
		searchButton.click();
	}
	public void clickOnProduct()
	{
		Reporter.log("Clicking on Product", true);
		product.click();
	}
//	public void getUserName()
//	{
//		
//	}

}
