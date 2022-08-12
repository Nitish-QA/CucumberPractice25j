package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_PF {
	
	
	@FindBy(id="name")
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_password;
	@FindBy(id="login")
	WebElement txt_loginbtn;
	
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_username.sendKeys(password);
	}
	public void enterUsername(String logi) {
		txt_username.sendKeys(username);
	}
	
	
	

}
