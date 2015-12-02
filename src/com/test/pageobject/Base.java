package com.test.pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	DesiredCapabilities capability;
	LoginPage loginPage;
	IOSDriver<?> driver;
//    public static InheritableThreadLocal<RemoteWebDriver> driver = new InheritableThreadLocal<RemoteWebDriver>();
	public Base() {
		this.setSeleniumGrid();
		driver.get("http://172.26.201.178:8080/kiwi-octane");
//		this.getDriver();
//		driver.get().navigate().to("http://172.26.201.178:8080/kiwi-octane/index-tui.jsp");
//		loginPage=PageFactory.initElements((IOSDriver)driver.get(), LoginPage.class);

	}
	public void setSeleniumGrid(){
		capability = new DesiredCapabilities();
        capability.setCapability(CapabilityType.BROWSER_NAME, "Safari");
        capability.setCapability("platformName", "iOS");
        //capability.setCapability("platformVersion", "7.1");
        capability.setCapability("platformVersion", "8.4");
//        capability.setCapability("platformVersion", "9.0");
        capability.setCapability("nativeWebTap", true);
        capability.setCapability("deviceName", "iPhone Simulator");
//        capability.setCapability("safariOpenLinksInBackground", "true");
        capability.setJavascriptEnabled(true);
        capability.setCapability("app",  "Safari");
    	 //driver;

    	try {
    		driver= new IOSDriver(new URL("http://10.13.16.37:44441/wd/hub"),capability);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


  	}
	
   /* public WebDriver getDriver() {
    	IOSDriver webDriver = (IOSDriver)driver.get();
        return webDriver;
    }*/
}
