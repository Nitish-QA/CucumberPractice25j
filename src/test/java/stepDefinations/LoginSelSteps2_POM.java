package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;

public class LoginSelSteps2_POM {
	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "E:/Eclipse_Projects/CucumberFramework/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().getImplicitWaitTimeout();
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.get("https://example.testproject.io/web/");
		Thread.sleep(3000);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);

		Thread.sleep(3000);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickLogin();
		//driver.findElement(By.id("login")).click();
	}

	@Then("user is naviagted to the home page")
	public void user_is_naviagted_to_the_home_page() throws InterruptedException {
		home = new HomePage_PF(driver);
		home.verifyLogin();
		//driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

}
