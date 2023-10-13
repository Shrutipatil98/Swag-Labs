package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.HomePage;
import pages.LoginPage2;
import pages.LogoutPage;

public class LogoutClass {
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
		
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMenuButton();
		
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.clickOnLogoutButton();
		
	}

}
