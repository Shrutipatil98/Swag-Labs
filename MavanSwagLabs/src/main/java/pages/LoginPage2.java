package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement logInButton;
	
	
//	Constructor
	public LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	method
	
	public void sendUserName() {
		userName.sendKeys("standard_user");
	}
	
	public void sendPassword() {
		password.sendKeys("secret_sauce");
	}
	
	public void clickLogInButton() {
		logInButton.click();
	}
}
