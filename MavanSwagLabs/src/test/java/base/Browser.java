package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserFiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
		
		
       public static WebDriver launchFirefox() {
		
		System.setProperty("webdriver.gecko123.driver", "src\\\\test\\\\resources\\\\BrowserFiles\\geckodriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
