package com.testng.dataProvider;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class DataProviderParametersIntegrationExample {
	@Test(dataProvider="TestType", dataProviderClass=DataProviderSource.class)
	public void integrationTest(String data) {
		System.out.println("Integration testing: Data(" + data + ")");
	}
	
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("src/testDataProvider.xml");
		
		TestNG testng = new TestNG();
		testng.setTestSuites(list);
		testng.run();
	}
}
