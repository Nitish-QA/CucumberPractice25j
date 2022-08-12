package stepDefinations;

import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	}

	@When("enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User entered username and password");
	}

	@And("clicks login button")
	public void clicks_on_login_button() {
		System.out.println("user clicked login button");
	}

	@Then(" navigated to home page")
	public void user_navigated_to_home_page() {
		System.out.println("user navigated to home page");
	}

}
