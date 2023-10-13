package testPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pages.AddToCartPage;
import pages.CheckOutPage;
import pages.ContinueShoppingPage;
import pages.HomePage;
import pages.LoginPage2;
import pages.LogoutPage;

public class VerifyCheckoutAndConyinueShoopingTestng extends Browser {
	
	private WebDriver driver;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName) {
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browserName.equals("Chrome"))
		{
			driver = launchChrome();
			driver.get("https://www.saucedemo.com/v1/");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
//		if(browserName.equals("chrome"))
//		{
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\new floder selenium\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		driver.get("https://www.saucedemo.com/v1/");
////		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
//		}
//		
//		
//		if(browserName.equals("Firefox"))
//		{
//		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\FireFox\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//		}
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
	}
	
	@BeforeMethod
	public void LoginAndAddToCart() {
		LoginPage2 logInPage = new LoginPage2(driver);
		logInPage.sendUserName();
		logInPage.sendPassword();
		logInPage.clickLogInButton();
	}
	
	@Test(priority = 1)
	public void toVerifyCheckoutPage() throws InterruptedException {
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnBackPack();
		addToCartPage.clickOnCartLogo();
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		checkOutPage.clickOnChekout();
		checkOutPage.sendFirstName("Shruti");
		checkOutPage.sendLastName("Patil");
		checkOutPage.sendPostalCode("345123");
		checkOutPage.clickOnContinueButton();
		Thread.sleep(2000);
		checkOutPage.clickOnCancelButton();

	}
	
	@Test(priority = 2)
	public void toVerifyContinueShopping() throws InterruptedException {
		AddToCartPage addToCartPage = new AddToCartPage(driver);
		addToCartPage.clickOnBackPack();
		addToCartPage.clickOnCartLogo();
		Thread.sleep(2000);
		ContinueShoppingPage continueShoppingPage = new ContinueShoppingPage(driver);
		continueShoppingPage.clickOnContinueShopping();
	
	}
	
	@AfterMethod
	public void LogoutFromApplication() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMenuButton();
		
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.clickOnLogoutButton();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
