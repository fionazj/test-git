package com.test.pageobject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Base {
	DesiredCapabilities capability;
	LoginPage loginPage;
	public static WebDriver driver;
	String platform = null;
//    public static InheritableThreadLocal<RemoteWebDriver> driver = new InheritableThreadLocal<RemoteWebDriver>();
	public Base() {
		this.driverFactory();
		driver.get("http://172.26.201.178:8080/kiwi-octane");
		loginPage=PageFactory.initElements(driver ,LoginPage.class);

	}
	public void driverFactory(){


        if(platform.equalsIgnoreCase("Android")){
    		capability = new DesiredCapabilities();
            capability.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
            capability.setCapability("platformName", "Android");
            capability.setCapability("platformVersion", "4.4");
            capability.setCapability("nativeWebTap", true);
            capability.setCapability("deviceName", "");
            capability.setJavascriptEnabled(true);
        	try {
				driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capability);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else if(platform.equalsIgnoreCase("iphone")){
    		capability = new DesiredCapabilities();
            capability.setCapability(CapabilityType.BROWSER_NAME, "Safari");
            capability.setCapability("platformName", "iOS");
            //capability.setCapability("platformVersion", "7.1");
            capability.setCapability("platformVersion", "8.4");
//            capability.setCapability("platformVersion", "9.0");
            capability.setCapability("nativeWebTap", true);
            capability.setCapability("deviceName", "iPhone Simulator");
            capability.setJavascriptEnabled(true);
            capability.setCapability("app",  "Safari");
        	try {
        		driver= new IOSDriver(new URL("http://localhost:4723/wd/hub"),capability);

    		} catch (MalformedURLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
        }
    	
        }

  	}
	
   /* public WebDriver getDriver() {
    	IOSDriver webDriver = (IOSDriver)driver.get();
        return webDriver;
    }*/
}
