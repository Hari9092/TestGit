package org.appium.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApplicationLanch {
	
	static AndroidDriver androidDriver;
	
	public  static void main(String[] args) throws MalformedURLException {
		
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName","moto");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("app", "C:\\Users\\harip\\Downloads\\phonepe_Spoof_Apk_apkfun.org.apk");
	
	
	URL url = new URL("http://localhost:4723/wd/hub");
	
	androidDriver = new AndroidDriver(url, capabilities);
	
	
	
	
	}

}

