package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.AddToCartPage;
import pages.ContinueShoppingPage;
import pages.LoginPage2;

public class ContinueShoppingClass {
	public static void main(String[] args) throws InterruptedException {
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
		
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnBackPack();
		addToCartPage.clickOnCartLogo();
		
		Thread.sleep(2000);
		
		ContinueShoppingPage continueShoppingPage = new ContinueShoppingPage(driver);
		continueShoppingPage.clickOnContinueShopping();
		
	}

}
