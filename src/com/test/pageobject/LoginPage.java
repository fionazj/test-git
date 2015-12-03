package com.test.pageobject;

import org.openqa.selenium.WebDriverException;

public class LoginPage extends LoginPageFacotry {
	public void login(String name, String pwd){
		try {
			userName.clear();
			userName.sendKeys(name);
			passwd.clear();
			passwd.sendKeys(pwd);
			loginButton.click();
		} catch (WebDriverException ex) {
			throw ex;
		}
	}
	
	public void swipeFirstMail(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Base.driver.scrollTo("29734");
		}
}
