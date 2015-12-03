package com.test.pageobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {
	public static void main(String args[]){
		PropertyHelper ph = new PropertyHelper();
		System.out.println(System.getProperty("user.dir"));
		System.out.println(ph.getProperty("passwd"));
	}
	
	Properties property = new Properties();
	public String getProperty(String value){
		FileInputStream inStream = null;
		try {
			inStream = new FileInputStream("src/Login.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			property.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(value);
	}
}

