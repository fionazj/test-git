package com.test.pageobject;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;


public class LoginPageFacotry {

	@iOSFindBy(xpath="//input[@class='x-input-el x-form-field x-input-text']")
	 WebElement userName;
	 
	
	@iOSFindBy(xpath="//input[@class='x-input-el x-form-field x-input-password']")
	 WebElement passwd;
	
	@iOSFindBy(xpath="//div[contains(@class,'ow-login-loginBtn')]")
	 WebElement loginButton;

}
