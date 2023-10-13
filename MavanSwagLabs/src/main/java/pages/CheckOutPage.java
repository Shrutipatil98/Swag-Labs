package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	@FindBy (xpath = "//a[text() = 'CHECKOUT']")
	private WebElement checkOut;
	
	@FindBy (xpath = "//input[@ id='first-name']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@ id='last-name']")
	private WebElement lastName;
	
	@FindBy (xpath = "//input[@ id='postal-code']")
	private WebElement postalCode;
	
	@FindBy (xpath = "//input[@ type='submit']")
	private WebElement continueButton;
	
	@FindBy (xpath = "//a[text() = 'CANCEL']")
	private WebElement cancelButton;
	
	private JavascriptExecutor js;
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 js = (JavascriptExecutor)driver;
	}
	
	public void clickOnChekout() {
		checkOut.click();
	}
	
	public void sendFirstName(String Fname) {
		firstName.sendKeys(Fname);
	}
	
	public void sendLastName(String Lname) {
	    	lastName.sendKeys(Lname);
    }
	
    public void sendPostalCode(String Pcode) {
    	postalCode.sendKeys(Pcode);
	}
    
  
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public void clickOnCancelButton() {
		js.executeScript("window.scrollBy(0,500)");
		cancelButton.click();
	}

}
