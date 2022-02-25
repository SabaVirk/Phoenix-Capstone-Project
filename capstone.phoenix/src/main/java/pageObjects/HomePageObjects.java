package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

import core.Base;
import utilities.Utilities;


public class HomePageObjects extends Base {

	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValidateHomePage;
	
	//Currency	
	@FindBy(xpath = "//div[@class='btn-group']")
	private WebElement currencyDropdownHomePage;	
	@FindBy (xpath = "//button[text()='€ Euro']")
	private WebElement currencyOptionEuro;
	@FindBy (xpath = "//strong[text()='€']")
	private WebElement euroCurrencySymbol;
	
	//Shopping Cart
	@FindBy (xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCartHomePage;		
	@FindBy (xpath = "//div[@id='content']//p")
	private WebElement successMessage;

	
	//Given User is on Retail Website
	public void validateHomePage() throws IOException {
		String text = textToValidateHomePage.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		}else {
			logger.info("Text does not match!");
		} 
		String expectedText = "TEST ENVIRONMENT";
		Assert.assertEquals(expectedText, text);
		Utilities.highlightelementRedBorder(textToValidateHomePage);
		Utilities.takeScreenShot("Background-HomePage Validated");
	}
	
	//@Currency
	//When User click on Currency
	public void clickOnCurrencyButton () throws IOException  {
		Utilities.highlightelementRedBorder(currencyDropdownHomePage);
		currencyDropdownHomePage.click();
		Utilities.takeScreenShot("HomePage-Currency Button Clicked");
	}
	
	//And User Chose Euro from dropdown
	public void chooseEuro () throws IOException {
		Utilities.highlightelementRedBorder(currencyOptionEuro);
		Utilities.takeScreenShot("HomePage-Euro Chosen");
		Utilities.waitAndClickElement(currencyOptionEuro);	
	}
	
     //Then currency value should change to Euro
	public void currencyEuro () throws IOException {
		String text = euroCurrencySymbol.getText();
		if(text.equalsIgnoreCase("€")) {
			logger.info("Currency changed to Euro");
		}else {
			logger.info("Currency has not changed to euro");
		} 
		String actualStrEuroCurrency = euroCurrencySymbol.getText();
		String expectedStrEuroCurrency = "€";
		Assert.assertEquals(expectedStrEuroCurrency, actualStrEuroCurrency);
		Utilities.highlightelementRedBorder(euroCurrencySymbol);
		Utilities.takeScreenShot("HomePage-Currency Changed to Euro");
	}
	
	//@ShoppingCart
	//When User click on shopping cart
	public void clickOnShoppingCart() throws IOException, InterruptedException {
		shoppingCartHomePage.click();
		Utilities.highlightelementRedBorder(shoppingCartHomePage);
		Utilities.takeScreenShot("HomePage-Shopping Cart Clicked");
		Thread.sleep(500);
	}
	
	//Then “Your shopping cart is empty!” message should display
	public void successMsgEmptyShoppingCart () throws IOException {
		Utilities.highlightelementRedBorder(successMessage);
		Utilities.takeScreenShot("HomePage-Empty Shopping Cart");
		String actualMsg = successMessage.getText();
		String expectedMsg = "Your shopping cart is empty!";
		Utilities.compareText(actualMsg, expectedMsg);
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	
	
	
		
}
