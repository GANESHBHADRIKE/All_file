package appiumtests;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException{
		
		UiAutomator2Options options  = new UiAutomator2Options();
		
		options.setCapability("platformName", "Android");
		options.setCapability("deviceName", "Ganesh"); // Change this to your device name
		options.setCapability("udid", "RZ8N60MM6EB");
		options.setCapability("platformVersion", "12");
		options.setApp("C:\\Users\\Ganesh Bhadrike\\Downloads\\APKFiles\\resources\\ApiDemos-debug.apk");
        
		options.setCapability("appPackage", "com.sec.android.app.popupcalculator"); // Package name of the calculator app
		options.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator"); // Activity name of the calculator app
        
        System.out.println("Application launch....");
		
		
		//options.setDeviceName("Ganesh");
		AndroidDriver driver = new AndroidDriver(new URI ("http://127.0.0.1:4723").toURL(),options);
		
		
		
        }
		
		
	}


