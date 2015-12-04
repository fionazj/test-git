package com.test.pageobject;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestCase001_CreateContact extends TestCaseBase{
//		@Test
//		public void run(){
//		loginPage.login("autotest3031@openwave.com", "p");
//	//	loginPage.swipeFirstMail();
//		}

		
		public static void main(String args[]){
//			TestCase001_CreateContact tc = new TestCase001_CreateContact();
//			tc.run();
			TestNG testng = new TestNG();
			List<String> suites = new ArrayList<String>();
			suites.add("src/testNG.xml");
			testng.setTestSuites(suites);
			testng.run();
		}
}
