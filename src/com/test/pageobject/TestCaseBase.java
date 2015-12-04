package com.test.pageobject;


public class TestCaseBase extends Base implements TestCase{


	public void beforeSuite() {
		System.out.println("before suite");

	}

	public void beforeClass() {
		System.out.println("before class");

	}

	public void beforeMethod() {
		// TODO Auto-generated method stub
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	public void afterMethod() {
		// TODO Auto-generated method stub
	}

	public void afterClass() {
		System.out.println("after class");
		driver.quit();
	}

	public void afterSuite() {
		// TODO Auto-generated method stub
		System.out.println("after suite");
	}
	
}
