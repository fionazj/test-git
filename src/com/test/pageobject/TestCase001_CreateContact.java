package com.test.pageobject;

import io.appium.java_client.AppiumDriver;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase001_CreateContact extends TestCaseBase{
		@Test(groups = { "zj" })
		public void run(){
		loginPage.login("autotest3031@openwave.com", "p");
		}
		
		public static void main(String args[]){
			TestCase001_CreateContact tc = new TestCase001_CreateContact();
			tc.run();
		}
}
