package appiumtests;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Appium {
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException{
		
		//UiAutomator2Options options  = new UiAutomator2Options();
			DesiredCapabilities options = new DesiredCapabilities();
//		
//		
//		options.setCapability("platformName", "Android");
//		options.setCapability("deviceName", "Ganesh"); // Change this to your device name
//		options.setCapability("udid", "RZ8N60MM6EB");
//		options.setCapability("platformVersion", "12");
//        
//		options.setCapability("appPackage", "com.sec.android.app.popupcalculator"); // Package name of the calculator app
//		options.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator"); // Activity name of the calculator app
		
	
		
//        
        System.out.println("Application launch....");
		
		
		//options.setDeviceName("Ganesh");
		//AndroidDriver driver = new AndroidDriver(new URI ("http://127.0.0.1:4723").toURL(),options);
		
		
		try {
			WebDriver driver = new RemoteWebDriver(new URI ("http://0.0.0.0:4723").toURL(),options);

            // Wait for the app to launch (optional)
            Thread.sleep(5000);

            // Your test code goes here

            // Close the driver session
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
	}

}



