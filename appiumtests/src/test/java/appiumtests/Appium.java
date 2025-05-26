package appiumtests;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Appium {
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException{
		
		UiAutomator2Options options  = new UiAutomator2Options();

		options.setCapability("platformName", "Android");
		options.setCapability("deviceName", "Ganesh"); // Change this to your device name
		options.setCapability("udid", "192.168.0.104:5555"
				+ "");
		options.setCapability("platformVersion", "12");
		options.setCapability("appPackage", "com.sec.android.app.popupcalculator"); // Package name of the calculator app
		options.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator"); // Activity name of the calculator app
		     
        System.out.println("Application launch....");
		

        System.out.println("Launching Calculator App...");
        AndroidDriver driver = new AndroidDriver(options);
        System.out.println("Calculator App Launched!");
        WebElement one = driver.findElement(By.xpath("//android.widget.Button[@content-desc='1']"));
        WebElement plus = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\'Plus\']"));
        WebElement four = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\'4\']"));
        WebElement equal = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\'Equal\']"));


        one.click();
        plus.click();
        four.click();
        equal.click();
        

		
	}

}



