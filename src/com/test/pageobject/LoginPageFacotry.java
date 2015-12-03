package com.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPageFacotry {
	@FindBy(xpath="//input[@class='x-input-el x-form-field x-input-text']")
	 WebElement userName;
	 
	
	@FindBy(xpath="//input[@class='x-input-el x-form-field x-input-password']")
	 WebElement passwd;
	
	@FindBy(xpath="//div[contains(@class,'ow-login-loginBtn')]")
	 WebElement loginButton;
	
	@FindBy(xpath="//div[contains(@id,'simplelistitem')][1]")
	WebElement firstMail;
}
