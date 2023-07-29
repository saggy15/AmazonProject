package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductPage {

	@FindBy(xpath="//*[@id='acrCustomerReviewText']")private WebElement rating;
	
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getProductRating()
	{
		String ProductRating = rating.getText();
		Reporter.log(ProductRating+" this is a Product rating", true);
	}
}
