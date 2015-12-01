package com.test.pageobject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public interface TestCase {
	@BeforeSuite
	public void beforeSuite();

    @BeforeClass
    public void beforeClass();

    @BeforeMethod
    public void beforeMethod();
    
    @Test
    public void run();
    
    @AfterMethod
    public void afterMethod();

    @AfterClass
    public void afterClass();

	@AfterSuite
	public void afterSuite();

}
