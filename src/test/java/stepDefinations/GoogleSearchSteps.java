package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("User is on google search page")
	public void user_is_on_google_search_page() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:/Eclipse_Projects/CucumberFramework/Drivers/chromedriver.exe"); driver =
		 * new ChromeDriver();
		 * 
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().getImplicitWaitTimeout();
		 * driver.get("https://www.google.com");
		 */
	   
	   
	   
	}

	@When("User enters text in search bar")
	public void user_enters_text_in_search_bar() {
	   driver.findElement(By.name("q")).sendKeys("Top Movies Hindi");
	}

	@When("User clicks search button")
	public void user_clicks_search_button() {
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("User navigates to search result page")
	public void user_navigates_to_search_result_page() {
	   
	}


}
