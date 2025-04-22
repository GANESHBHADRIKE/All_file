package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Ganesh"); // Change this to your device name
        caps.setCapability("udid", "RZ8N60MM6EB");
        caps.setCapability("platformVersion", "12");
        caps.setCapability("automationName", "UiAutomator2");
        
//        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator"); // Package name of the calculator app
        caps.setCapability("appPackage", "in.amazon.mShop.android.shopping"); // Package name of the calculator app
//        caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator"); // Activity name of the calculator app
        caps.setCapability("appActivity", "com.amazon.mShop.navigation.MainActivity"); // Activity name of the calculator app
        
        System.out.println("Application launch....");
        
//        AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        

        // Initialize the Appium driver
        try {
        	AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

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
