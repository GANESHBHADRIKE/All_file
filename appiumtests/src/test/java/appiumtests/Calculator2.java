package appiumtests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class Calculator2 {

	static AndroidDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			opencalculator();
			
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		

	}
	
	public static void opencalculator() throws MalformedURLException, URISyntaxException  {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Ganesh"); // Change this to your device name
        caps.setCapability("udid", "RZ8N60MM6EB");
        caps.setCapability("platformVersion", "12");
        
        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator"); // Package name of the calculator app
        caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator"); // Activity name of the calculator app
        
        
        //URL url = new URI("http://127.0.0.1:4723/wd/hub");
        //URI url = new URI("http://127.0.0.1:4723/wd/hub").toURL();
        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/wd/hub").toURL(), caps);
        
        System.out.println("application is launch");
			
			
		
	}

}
