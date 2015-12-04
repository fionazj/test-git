package com.test.pageobject;


public class TestCaseBase extends Base implements TestCase{
	Base base;

	public void beforeSuite() {
		System.out.println("hello");
		base =  new TestCaseBase();
	}

	public void beforeClass() {
		base =  new TestCaseBase();

	}

	public void beforeMethod() {
		// TODO Auto-generated method stub
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	public void afterMethod() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	public void afterClass() {
		// TODO Auto-generated method stub
		
	}

	public void afterSuite() {
		// TODO Auto-generated method stub
		
	}
	
}
