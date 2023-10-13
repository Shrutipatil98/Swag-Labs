package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueShoppingPage {
	
	@FindBy (xpath = "//a[text() = 'Continue Shopping']")
	private WebElement continueShopping;
	
	public ContinueShoppingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContinueShopping() {
		continueShopping.click();
	}

}
