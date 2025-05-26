package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumBasics {

	
	UiAutomator2Options options = new UiAutomator2Options();
    //AndroidDriver driver = new AndroidDriver(options);

	
	@BeforeTest
	public void setup() {
		
		//UiAutomator2Options options = new UiAutomator2Options();
        
    	options.setDeviceName("Ganesh");
        options.setPlatformVersion("12");
        options.setUdid("192.168.0.104:5555");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.sec.android.app.popupcalculator");
        options.setAppActivity("com.sec.android.app.popupcalculator.Calculator");
        //AndroidDriver driver = new AndroidDriver(options);
		
	}
	
    @Test
    public void calculate() throws MalformedURLException {
        
        AndroidDriver driver = new AndroidDriver(options);

        System.out.println("App launched successfully!");
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
