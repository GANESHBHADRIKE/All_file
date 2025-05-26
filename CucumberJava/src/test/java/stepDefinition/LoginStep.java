package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {


	WebDriver driver = Hooks.driver;
	
	
	
	@Given("user is on login page")
	public void loginpage()
	{
		System.out.println("this is a login page");
		driver.get("https://rahulshettyacademy.com/client/");
		
	}

	@When("user enters {string} and {string}")
	public void credentials(String email, String password) {

		System.out.println("Enter the username password");
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("userPassword")).sendKeys(password);
	}

	@And("clicks on login button")
	public void click() {

		System.out.println("Clicked");
		driver.findElement(By.id("login")).click();
	}



	@Then("user should be redirected to home page")
	public void dashboardpage() {

		System.out.println("home page");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
	}
	
}



