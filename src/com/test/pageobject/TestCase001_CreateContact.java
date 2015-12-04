package com.test.pageobject;


import org.testng.annotations.Test;

public class TestCase001_CreateContact extends TestCaseBase{
		@Test
		public void run(){
		loginPage.login("autotest3031@openwave.com", "p");
		}
		

}
