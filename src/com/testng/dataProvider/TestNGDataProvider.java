package com.testng.dataProvider;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("src/testDataProvider.xml");
		
		TestNG testng = new TestNG();
		testng.setTestSuites(list);
		testng.run();
	}
	
	//@Parameters({"para1","para2"})
	@Test(dataProvider="getData")
	public void paramTest(int i , String p){
		System.out.println("first param:"+i +" second param: "+ p);
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][]{{5,"five"},{6,"six"}};
	}
	
	
	@Test(dataProvider="client1", dataProviderClass=DataProviderSource.class,priority=2)
	public void client1Test(int p) {
		System.out.println("Client1 testing: Data(" + p + ")");
	}	
	
	@Test(dataProvider="client2", dataProviderClass=DataProviderSource.class)
	public void client2Test(Integer p) {
		System.out.println("Client2 testing: Data(" + p + ")");
	}	

}
