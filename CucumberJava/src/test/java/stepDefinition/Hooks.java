package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	public static WebDriver driver;
	
	@Before
    public void setUp() {
        System.out.println("Launching browser...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
	 @After
	    public void tearDown(Scenario scenario) {
	        if (scenario.isFailed()) {
	            // Take screenshot
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File source = ts.getScreenshotAs(OutputType.FILE);
	            String path = "screenshots/" + scenario.getName().replaceAll(" ", "_") + ".png";

	            try {
	                Files.createDirectories(Paths.get("screenshots"));
	                Files.copy(source.toPath(), Paths.get(path));
	                System.out.println("Screenshot saved to: " + path);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
