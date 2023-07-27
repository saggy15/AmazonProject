package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.amazon.qa.util.Utility;

public class LoginPage {
	@FindBy(xpath="//a[text()='Login']")
private WebElement loginButton;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mobileNum;
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement requestOTP;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnLoginButton()
	{
		Reporter.log("clicking on loging button", true);
		loginButton.click();
	}
	public void enterMobileNum() throws IOException
	{
		Reporter.log("Entering mobile Number", true);
		mobileNum.sendKeys(Utility.readConfigProp("mobileNumber"));
	}
	public void clickOnRequestForOTP()
	{
		Reporter.log("Clicking on RequestOTP", true);
		requestOTP.click();
	}
	public void getUserName()
	{
		
	}

}
