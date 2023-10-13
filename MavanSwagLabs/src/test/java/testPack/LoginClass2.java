package testPack;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.LoginPage2;

public class LoginClass2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\new floder selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		LoginPage2 logInPage = new LoginPage2(driver);
		
		logInPage.sendUserName();
		logInPage.sendPassword();
		logInPage.clickLogInButton();
		
//		HomePage homePage = new HomePage(driver);
//		homePage.clickOnMenuButton();
//		
//		HeaderOrMenuPage menuPage = new HeaderOrMenuPage(driver);
//		menuPage.clickOnAboutButton();
//		
//		AboutHeaderPage aboutHeadderPage = new AboutHeaderPage(driver);
//		aboutHeadderPage.clickSignInButton();
//		
//		ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(address.get(1));
//		
//		SignInOrLogInPage signInOrLogInPage = new SignInOrLogInPage(driver);
//		signInOrLogInPage.sendUserName("Pankaj");
//		signInOrLogInPage.sendPassword("Sahu");
//		signInOrLogInPage.clickOnRememberUserNameCheckBox();
//		signInOrLogInPage.clickOnLogInButton();
	}
}
