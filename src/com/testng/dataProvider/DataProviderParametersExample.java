package com.testng.dataProvider;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class DataProviderParametersExample {
	@Test(dataProvider="scenarioData", dataProviderClass=DataProviderSource.class)
	public void scenario1(String scenarioData) {
		System.out.println("Scenario testing: Data(" + scenarioData + ")");
	}
	
	@Test(dataProvider="scenarioData", dataProviderClass=DataProviderSource.class)
	public void scenario2(String scenarioData) {
		System.out.println("Scenario testing: Data(" + scenarioData + ")");
	}
	
	@Test(dataProvider="scenarioData", dataProviderClass=DataProviderSource.class)
	public void commonScenarios(String scenarioData) {
		System.out.println("Common Scenarios testing: Data(" + scenarioData + ")");
	}
	
	
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("src/testDataProvider.xml");
		
		TestNG testng = new TestNG();
		testng.setTestSuites(list);
		testng.run();
	}
}
