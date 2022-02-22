package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
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
	//--------------Currency------------------
	@FindBy(xpath = "//div[@class='btn-group']")
	private WebElement currencyDropdownHomePage;
	// //div[@class='btn-group']//span
	// //div[@class='btn-group']
	
	@FindBy (xpath = "//span[text()='Currency']")
	private WebElement CurrencyTextHomePage;	
	@FindBy (xpath = "//strong[text()='$']")
	private WebElement $signHomePage;
	@FindBy (xpath = "//button[text()='€ Euro']")
	private WebElement currencyOptionEuro;
	@FindBy (xpath = "//strong[text()='€']")
	private WebElement euroCurrencySymbol;
	@FindBy (xpath = "//button[text()='£ Pound Sterling']")
	private WebElement currencyOptionPound;
	@FindBy (xpath = "//button[text()='$ US Dollar']")
	private WebElement currencyOptionUSDollar;
	
	//-------------Contact--------------------
	
	@FindBy (xpath = "//i[@class='fa fa-phone']")
	private WebElement contactButtonHomePage;
	
	@FindBy (xpath = "//h1[text()='Contact Us']")
	private WebElement contactUsTextBold;
	
	@FindBy (tagName = "//h3")
	private WebElement ourLocationText;
	
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValidateHomePage;
	
	@FindBy (tagName ="//address")
	private WebElement addressText;
	
	@FindBy (xpath = "//strong[text()='Telephone']")
	private WebElement telephoneText;
	
	@FindBy (xpath = "//legend[text()='Contact Form']")
	private WebElement contactFormText;
	
	@FindBy (id = "//input[@id='input-name']")
	private WebElement inputnameField;
	
	@FindBy (id = "//input[@id='input-email']")
	private WebElement inputEmailField;
	
	@FindBy (xpath = "//textarea[@id='input-enquiry']")
	private WebElement inputEnquiryField;
	
	@FindBy (className = "//input[@class='btn btn-primary']")
	private WebElement submitButton;
	
	//-------------My Account------------------
	
	@FindBy (xpath = "//a[@title ='My Account']")
	private WebElement myAccountHomePage;
	
	@FindBy (xpath = "//a[text()='Register']")
	private WebElement registerButtonMyAccount;
	
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement loginButtonMyAccount;
	
	//Login
	
	@FindBy (xpath = "//h2[text()='New Customer']")
	private WebElement newCustomerText;
	
	@FindBy (xpath = "//strong[contains(text(),'Register')]")
	private WebElement registerAccTextBold;
	
	@FindBy (xpath = "//p[contains(text(),'By creating')]")
	private WebElement newAccountDescText;
	
	@FindBy (className = "//a[@class='btn btn-primary']")
	private WebElement continueButtonNewCustomer;;
	
	@FindBy (xpath = "//h2[text()='Returning Customer']")
	private WebElement returningCutomerTextBold;
	
	@FindBy (xpath = "//strong[contains(text(),'I')]")
	private WebElement returningsmalltext;
	
	@FindBy (id = "//input[@id='input-email']")
	private WebElement inputEmailFieldLoginpage;
	
	@FindBy (id = "//input[@id='input-password']")
	private WebElement inputPasswordFieldLoginpage;
	
	@FindBy (linkText = ("Forgotten Password"))
	private WebElement forgorPasswordLoginpage;
	
	@FindBy (className = "//input[@class='btn btn-primary']")
	private WebElement loginButtonLoginPage;
	
	
	//-------------WishList--------------------
	
	@FindBy (xpath = "//i[@class='fa fa-heart']")
	private WebElement wishListHomePage;
	
	@FindBy (tagName = "//h2")
	private WebElement newCustomerTextBold;
	
	@FindBy (xpath = "//strong[text()='Register Account']")
	private WebElement registerAccountTextBold;
	
	@FindBy (xpath = "//p[contains(text(),'By creating')]")
	private WebElement newCustomerDescText;
	
	@FindBy (xpath = "//a[text()='Continue']")
	private WebElement newCustomerContinueButton;
	
	//---------------Shopping Cart---------------
	
	@FindBy (xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCartHomePage;
	
	@FindBy (id = "//div[@id='content']//child::h1")
	private WebElement shoppingCartTextBold;
	
	@FindBy (xpath = "//div[@id='content']//p")
	private WebElement successMessage;
	//  //div[@id='content']//p
	
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continueButtonShoppingCart;
	
	//-----------------CheckOut------------------
	
	@FindBy (xpath = "//span[text()='Checkout']")
	private WebElement checkOutButtonHomePage;
	
	//--------------Blue Navigation Bar----------
	
	@FindBy (id = "//div[@id='logo']")
	private WebElement testEnvironmentText;
	
	@FindBy (name = "//input[@name='search']")
	private WebElement inputSearchBox;
	
	@FindBy (className = "//i[@class='fa fa-search']")
	private WebElement searchButton;
	
	@FindBy (id = "//span[@id='cart-total']")
	private WebElement cartTotalText;
	
	@FindBy (xpath = "//div[starts-with(@class,'btn-group btn')]")
	private WebElement cartTotalButton;
	
	@FindBy (xpath = "//a[text()='Desktops']")
	private WebElement desktopsHomePage;
	
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNotebooksHomePage;
	
	@FindBy (xpath = "//a[text()='Components']")
	private WebElement componentsHomePage;
	
	@FindBy (xpath = "//a[text()='Tablets']")
	private WebElement tabletsHomePage;
	
	@FindBy (xpath = "//a[text()='Software']")
	private WebElement softwareHomePage;
	
	@FindBy (xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesPDAHomePage;
	
	@FindBy (xpath = "//a[text()='Cameras']")
	private WebElement camerasHomePage;
	
	@FindBy (xpath = "//a[text()='MP3 Players']")
	private WebElement MP3PlayersHomePage;
	
	//---------------------------------------------
	
	@FindBy (id = "//div[@id='slideshow0']") //big image that keeps on changing
	private WebElement imageFrame;
	
	//---------------Featured---------------------
	
	@FindBy (xpath ="//h3[text()='Featured']")
	private WebElement featuredText;
	
	@FindBy (xpath = "//img[@title='MacBook']")
	private WebElement macBookImageHomePage;
	
	@FindBy (linkText = ("MacBook"))
	private WebElement macBookLinkText;
	
	@FindBy (xpath = "//p[contains(text(),'Intel Core 2 Duo ')]")
	private WebElement macBookText;
	
	@FindBy (id = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/p[2]/text()") //copied
	private WebElement macBookPrice;
	
	@FindBy (xpath = "//span[@class='price-tax' and text()='Ex Tax: $500.00']") //price can changed so not a good idea
	private WebElement macBookPriceExTax;

	@FindBy (xpath = "//div[@id='content']//div[1]//div[1]//div[3]//button[1]") 
	private WebElement macBookAddToCart;
	
	@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[3]//button[2]") 
	private WebElement macBookAddToWishList;
	
	@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[3]//button[3]") 
	private WebElement macBookCompareButton;
	//----------------------------------------
	@FindBy (xpath = "//img[@title='iPhone']")
	private WebElement iPhoneImage;
	
	@FindBy (linkText = ("iPhone"))
	private WebElement iPhoneLinktext;
	
	@FindBy (xpath = "//p[contains(text(),'iPhone is a revolution')]")
	private WebElement iPhoneText;
	
	@FindBy (xpath = "//p[contains(text(),'$123.20')]") //price can change so its not a good idea
	private WebElement iPhonePrice;
	
	@FindBy (xpath = "//span[text()='Ex Tax: $101.00']") //price can be changed so its not good idea
	private WebElement iPhonePriceExTax;
	
	@FindBy (xpath = "//div[@id='content']//div[2]//div[2]//div[3]//button[1]") 
	private WebElement iPhoneAddToCart;
	
	@FindBy (xpath = "////div[@id='content']//div[2]//div[2]//div[3]//button[2]")
	private WebElement iPhoneAddToWishlist;

	@FindBy (xpath = "//div[@id='content']//div[2]//div[2]//div[3]//button[3]")
	private WebElement iPhoneCompareButton;
	
	//------------------------------------
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[1]/a/img") //copied
	private WebElement appleCinemaImage;
	
	@FindBy (partialLinkText = ("Apple Cinema"))
	private WebElement appleCinemaLinkText;
	
	@FindBy (xpath = "//p[contains(text(),'	The 30-inch Apple')]")
	private WebElement appleCinemaText;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/p[2]/span[1]") //copied
	private WebElement appleCinemaPriceNew;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/p[2]/span[2]") //copied
	private WebElement appleCinemaPriceOld;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/p[2]/span[3]") //copied
	private WebElement appleCinemaPriceExTax;
	
	@FindBy(xpath = "//div[@id='content']//div[2]//div[3]//div[3]//button[1]") 
	private WebElement appleCinemaAddToCart;
	
	@FindBy (xpath = "//div[@id='content']//div[2]//div[3]//div[3]//button[2]")
	private WebElement appleCinemaAddToWishlist;
	
	@FindBy (xpath = "//div[@id='content']//div[2]//div[3]//div[3]//button[3]") 
	private WebElement appleCinemaCompareButton;
	
	//------------------------------------------
	

	@FindBy (xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canonImage;
	
	@FindBy (partialLinkText = ("Canon"))
	private WebElement canonLinkText;
	
	@FindBy (xpath = "//p[contains(text(), 'Canon')]")
	private WebElement canonText;
	
	@FindBy (xpath ="//*[@id=\"content\"]/div[2]/div[4]/div/div[2]/p[2]/span[1]") //copied
	private WebElement canonPriceNew;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[4]/div/div[2]/p[2]/span[2]") //copied
	private WebElement canonPriceOld;
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[4]/div/div[2]/p[2]/span[3]") //copied
	private WebElement canonPriceExTax;
	
	@FindBy(xpath = "//div[@id='content']//div[2]//div[4]//div[3]//button[1]") 
	private WebElement canonAddToCart;
	
	@FindBy (xpath = "//div[@id='content']//div[2]//div[4]//div[3]//button[2]")
	private WebElement canonAddToWishlist;
	
	@FindBy (xpath = "//div[@id='content']//div[2]//div[4]//div[3]//button[3]") 
	private WebElement canonCompareButton;
	
	//--------------------Footer--------------------------
	//Information
	@FindBy (xpath = "//h5[contains(text(),'Information')]")
	private WebElement informationTextFooter;
	
	@FindBy (xpath = "//a[contains(text(),'About Us')]")
	private WebElement aboutUsFooter;
	
	@FindBy (xpath = "//a[contains(text(),'Delivery Information')]")
	private WebElement deliveryInformationFooter;
	
	@FindBy (xpath = "//a[contains(text(),'Privacy')]")
	private WebElement privacyPolicyFooter;
	
	@FindBy (xpath = "//a[contains(text(),'Terms')]")
	private WebElement termConditionsFooter;
	
	//Customer Service
	
	@FindBy (xpath = "//h5[contains(text(),'Customer')]")
	private WebElement cutomerServiceTextFooter;
	
	@FindBy (partialLinkText = ("Contact"))
	private WebElement contacUsFooter;
	
	@FindBy (linkText = ("Returns"))
	private WebElement returnsFooter;
	
	@FindBy (partialLinkText = ("Site"))
	private WebElement siteMapFooter;
	
	//Extras
	
	@FindBy (xpath = "//h5[text()='Extras']")
	private WebElement extrasTextFooter;
	
	@FindBy (linkText = ("Brands"))
	private WebElement brandsFooter;
	
	@FindBy (partialLinkText = ("Gift"))
	private WebElement fitCertificatesFooter;
	
	@FindBy (linkText = ("Affiliate"))
	private WebElement affiliateFooter;
	
	@FindBy (linkText = ("Specials"))
	private WebElement specialsFooter;
	
	//My Account
	
	@FindBy (xpath = "//h5[contains(text(),'My Account')]")
	private WebElement myAccountParentFooter;
	
	@FindBy (xpath = "//a[text()= 'My Account']")
	private WebElement myAccountChildFooter;
	
	@FindBy (partialLinkText = ("Order"))
	private WebElement orderHistoryFooter;
	
	@FindBy (xpath = "//a[contains(text(), 'Wish List')]")
	private WebElement wishListFooter;
	
	@FindBy (xpath = "//a[text()='Newsletter']")
	private WebElement newsletterFooter;
	
	//Bottom
	
	@FindBy (xpath = "//p[text()='Powered By ']")
	private WebElement textBottomPageFooter;
	
	@FindBy (xpath = "//a[text()='OpenCart']")
	private WebElement openCartLinkFooter;
	
	//----------------------------------------------------------------
	
	
	//-----------Given User is on Retail Website----------------
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
	
	//----------When User click on Currency---------------- 
	public void clickOnCurrencyButton () throws IOException  {
		Utilities.highlightelementRedBorder(currencyDropdownHomePage);
		currencyDropdownHomePage.click();
		Utilities.takeScreenShot("HomePage-Currency Button Clicked");
	}
	
	
	//----------And User Chose Euro from dropdown--------------
	public void chooseEuro () throws IOException {
		Utilities.highlightelementRedBorder(currencyOptionEuro);
		Utilities.takeScreenShot("HomePage-Euro Chosen");
		Utilities.waitAndClickElement(currencyOptionEuro);
	
	}
	
     //---------Then currency value should change to Euro------------
	
//	public boolean currencyEuro (){
//		
//	
//		if(euroCurrencySymbol.isDisplayed())
//			return true;
//		else
//			return false;
//	}
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
	

	
	//----------------When User click on shopping cart-------------
	public void clickOnShoppingCart() throws IOException, InterruptedException {
		shoppingCartHomePage.click();
		Utilities.highlightelementRedBorder(shoppingCartHomePage);
		Utilities.takeScreenShot("HomePage-Shopping Cart Clicked");
		Thread.sleep(500);
	}
	
	
	
	//Then “Your shopping cart is empty!” message should display
//	public void validatShoppingcartEmpty () {
//		String text = yourCartIsEmptyMsg.getText();
//		if(text.equalsIgnoreCase("Your shopping cart is empty!")) {  //Your shopping cart is empty!
//																	//text does not match coming in logger
//			logger.info("Text verified!");
//		} else {
//			logger.info("Text does not match!");
//		}
//	}
	
//	public void validatShoppingcartEmpty () {
//	  
//		String actualMsg = successMessage.getText();
//		String strString = actualMsg.substring(0, 28);
//		String expectedMsg = "Your shopping cart is empty!";
//		Utilities.highlightelementBackground(successMessage); //didnot highlight
//		Utilities.compareText(actualMsg, expectedMsg);
//		{
//		if (actualMsg==expectedMsg) 
//			logger.info("Text Verified!");
//	    } 
//	       logger.info("Text does not match!");      //still getting text does not match
//	 
//	} 
//			
//	public void verifySuccessMessage(String strSuccessMessage) {
//		String actualSuccessMssg = successMessage.getText();
//		String strString = actualSuccessMssg.substring(0, 54);
//		Assert.assertEquals(strSuccessMessage, strString);
//	}
	
	
	public void successMsgEmptyShoppingCart () throws IOException {
		Utilities.highlightelementRedBorder(successMessage);
		Utilities.takeScreenShot("HomePage-Empty Shopping Cart");
		String actualMsg = successMessage.getText();
		String expectedMsg = "Your shopping cart is empty!";
		Utilities.compareText(actualMsg, expectedMsg);
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	
	
	
	

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
