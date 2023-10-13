package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	@FindBy(xpath = "//div[text() = 'Sauce Labs Backpack']")
	private WebElement backpack;
	
	@FindBy(xpath = "//div[@ id='shopping_cart_container']")
	private WebElement cartLogo;
	
//	@FindBy(xpath = "")
//	private WebElement backpack;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBackPack(){
		backpack.click();
	}
	
	public void clickOnCartLogo(){
		cartLogo.click();
	}

}
