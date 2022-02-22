package pageObjects;

import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utilities;

public class DesktopsPageObjects extends Base {

	public DesktopsPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	//------------Background-------------------
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValidateHomePage;
	
	@FindBy (xpath = "//a[text()='Desktops']") 
	private WebElement desktopsHomePage;
	
	@FindBy (xpath = "//a[text()='Show All Desktops']") 
	private WebElement showAllUnderDesktops;
	
	//-------------Verify All Items Present------------------------
	//there are 12 items(products) on the page
	
	@FindBy (tagName = "//h4")
	private WebElement allItemsTagName;
	
	//-------------------------------------------------------------
	
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeIconDesktopPage;

	@FindBy (xpath = "//div[@id='product-category']//child::ul//following-sibling::li//following::li//child::a[text()='Desktops']")
	private WebElement desktopBreadCrumb;
	
	@FindBy (xpath = "//aside//child::div//child::a[1]")
	private WebElement desktopList;
	
	@FindBy (xpath = "//aside//child::div//child::a[2]")
	private WebElement pcInList;
	
	@FindBy (xpath= "//aside//child::div//child::a[3]")
	private WebElement macBookInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[4]")
	private WebElement laptopsNotebooksInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[5]")
	private WebElement componentsInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[6]")
	private WebElement tabletsInList;

	@FindBy (xpath = "//aside//child::div//child::a[7]")
	private WebElement softwareInList;

	@FindBy (xpath = "//aside//child::div//child::a[8]")
	private WebElement phonesPDAsInList;

	@FindBy (xpath = "//aside//child::div//child::a[9]")
	private WebElement camerasInList;

	@FindBy (xpath = "//aside//child::div//child::a[10]")
	private WebElement mp3PlayersInList;

	@FindBy (xpath = "//aside//div//div//div//div//a//img[@class='img-responsive']")
	private WebElement pcImageDesktopsPAge;

	@FindBy (tagName = "//h2")
	private WebElement desktopTextInBold;

	@FindBy (xpath = "//img[@title='Desktops']")
	private WebElement pcSmallImage;

	@FindBy (xpath = "//p[contains(text(),'Example')]")
	private WebElement textUnderDesktops;

	@FindBy (tagName = "//h3")
	private WebElement refineSearchText;

	@FindBy (xpath = "//h3//following::div//div//ul//li//a[(text()='PC (0)')]")
	private WebElement pcSmallLinkUnderRefineSearch;
	
	@FindBy (xpath = "//h3//following::div//div//ul//li//a[(text()='Mac (1)')]")
	private WebElement macSmallLinkUnderRefineSearch;
	
	@FindBy (id = "//button[@id='list-view']")
	private WebElement listViewButton;
	
	@FindBy (id = "//button[@id='grid-view']")
	private WebElement gridViewButton;
	
	@FindBy (id = "//a[@id='compare-total']")
	private WebElement productCompareLinkText;
	
	@FindBy (xpath = "//label[text()='Sort By:']")
	private WebElement sortByText;
	
	@FindBy (id = "//select[@id='input-sort']")
	private WebElement sortBydropDown;
	//Select select = new Select (sortBydropDown);
	
	
	
	//---------------CanonEOS5D---------------------
	
	@FindBy (xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5Dlinktext;
	
	@FindBy (xpath = "//button[@onclick=\"cart.add('30', '1');\"]")
	private WebElement addToCartCanonEOS5D;
	//  //button[@onclick="cart.add('30', '1');"]
	// //*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]
	
	
	@FindBy (xpath = "//select[@id='input-option226']")
	private WebElement selectColorOptionCanon;
	// //select[@id='input-option226']
	
	@FindBy (xpath = "//select[@id='input-option226']")
    private WebElement selectColorDropdown;
	@FindBy (xpath = "//select[@id='input-option226']//option[2]")
	private WebElement selectRedColor;
	//Select objSelect = new Select(driver.findElement(By.id("Seacrch-box")));
	//Select.selectByIndex(2);
	
	
	@FindBy (xpath = "//input[@type='text' and @name='quantity']")
	private WebElement inputQuantityCanon;
	////input[@type='text' and @name='quantity']
	////input[@id='input-quantity' and @class='form-control']
	
	@FindBy (xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartCanon;
	
	@FindBy (xpath = "//div[contains(text(),'Success: You have added ')]")
	private WebElement successMsgCanonEOS5D;
	
	
	//------------------ReviewCanon-------------------
	
	//@FindBy (xpath = "//a[text()='Canon EOS 5D']")
	//private WebElement canonEOS5Dlinktext;
	
	@FindBy (xpath = "//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	@FindBy (xpath = "//input[@id='input-name']")
	private WebElement inputYourNameField;
	
	@FindBy (id = "input-review")
	private WebElement inputReviewField;
	
	@FindBy (xpath = "//input[@value='1']")
	private WebElement ratingradioButton1;
	@FindBy (xpath = "//input[@value='2']")
	private WebElement ratingradioButton2;
	@FindBy (xpath = "//input[@value='3']")
	private WebElement ratingradioButton3;
	@FindBy (xpath = "//input[@value='4']")
	private WebElement ratingradioButton4;
	@FindBy (xpath = "//input[@value='5']")
	private WebElement ratingradioButton5;

	
	@FindBy (xpath = "//button[@id='button-review']")
	private WebElement continueButtonCanonReviewPage;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgReviewPosted;
	
	//----------------HP LP--------------------------
	
	@FindBy (xpath = "//button[@onclick=\"cart.add('47', '1');\"]")
	private WebElement addToCartHPLP3065desktopPage;
	
	@FindBy (xpath = "//input[@type='text' and @id='input-quantity']")
	private WebElement inputQuantityHPLP;
	
	@FindBy (xpath = "//button[@id='button-cart']")
	private WebElement addTocartHPLPpage;
	
	@FindBy (xpath = "//div[contains(text(),'Success: You have added') ]")
	private WebElement successMsgHPLP;
	// //div[@class='alert alert-success alert-dismissible']
	
	//------------------AllItems----------------
	
	@FindBy (tagName = "a")
	private List<WebElement> DesktopUIElementswithTagA;
	
	
  //-----------------------METHODS------------------------------------
	//Background
	//--------User click on Desktops tab-------
	public void clickOnDesktopsTab () throws IOException {
		Utilities.highlightelementRedBorder(desktopsHomePage);
		Utilities.takeScreenShot("Desktops-Desktop Tab Clicked");
	    desktopsHomePage.click();	
	}
	
	//-----User click on Show all desktops------
	public void clickOnShowAllDesktops () throws IOException {
		Utilities.highlightelementRedBorder(showAllUnderDesktops);
		Utilities.takeScreenShot("Desktop-Show All Items On Desktop Page");
		showAllUnderDesktops.click();	
	}
	
	//-----User should see all items are present in Desktop page-----
	public boolean allItemsPresent () {
		
		List <WebElement> desktopUI = DesktopUIElementswithTagA;
		System.out.println(desktopUI.size() + " Size of Element in UI");
		for (WebElement element : desktopUI ) {
			logger.info(element.getText()+ " Text Name of each UI Element");
			
		} return false;
		
		
	}
	
	//Scenario: User add HP LP3065  from Desktop tab to the cart
	//------------User click  ADD TO CART option on ‘HP LP3065’ item 
	public void addToCartHPLP () throws IOException {
		Utilities.highlightelementRedBorder(addToCartHPLP3065desktopPage);
		Utilities.takeScreenShot("Desktops-HPLP-Add To Cart Clicked");
		addToCartHPLP3065desktopPage.click();
	}
	
	//-----------User select quantity 1----------
	public void selectQuantityHPLP () throws InterruptedException, IOException {
		Utilities.scrolldownPage();
		inputQuantityHPLP.clear();
		Thread.sleep(1000);
		inputQuantityHPLP.sendKeys("1");	
		Utilities.highlightelementRedBorder(inputQuantityHPLP);
		Utilities.takeScreenShot("Desktops-HPLP-Quantity 1 Selected");
		
	}
	
	//----------User click add to Cart button-------
	public void addToCartHPLPPage() throws IOException {
		Utilities.highlightelementRedBorder(addTocartHPLPpage);
		Utilities.takeScreenShot("Desktops-HPLP-Added to Cart");
		addTocartHPLPpage.click();
	}
	
	//----------User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’-------
	public void successMsgAddedToCartHPLP() throws IOException {
		Utilities.scrollUpPage();
		String actualMsg = successMsgHPLP.getText();
		String strString = actualMsg.substring(0, 56);
		String expectedMsg= "Success: You have added HP LP3065 to your shopping cart!";
		System.out.println(expectedMsg+ "expected text");
		System.out.println(successMsgHPLP.getText()+ "actual text");
		Utilities.compareText(strString, expectedMsg);
		Assert.assertEquals(strString, expectedMsg);
		if(strString.equalsIgnoreCase("Success: You have added HP LP3065 to your shopping cart!")) {
			logger.info("Text verified!");
		}else {
			logger.info("Text does not match!");
		} 
		Utilities.highlightelementRedBorder(successMsgHPLP);
		Utilities.takeScreenShot("Desktops-HPLP-Success Msg");
	}
	//Canon
	//Scenario: User add Canon EOS 5D from Desktops tab to the cart
	//-------User click  ADD TO CART option on ‘Canon EOS 5D’ item
	public void addToCartCanonDesktopPage () throws IOException {
		Utilities.highlightelementRedBorder(addToCartCanonEOS5D);
		Utilities.takeScreenShot("Desktops-Canon-Desktop Page Add to Cart");
		addToCartCanonEOS5D.click();
		
	}
	//------And User select color from dropdown ‘Red’-----
	public void selectColor () throws InterruptedException, IOException {
		Utilities.scrolldownPage();
		selectColorDropdown.click();
		Select colorSelect = new Select(selectColorDropdown);
		colorSelect.selectByVisibleText("Red");
		Utilities.highlightelementRedBorder(selectColorDropdown);
		Utilities.takeScreenShot("Desktops-Canon-Red Color Selected");
	
		
		
	}
	//----- And User select quantity of 1 -----
	public void selectQuantityCanon() throws InterruptedException, IOException {
		Utilities.highlightelementRedBorder(inputQuantityCanon);
		inputQuantityCanon.clear();
		Thread.sleep(1000);
		inputQuantityCanon.sendKeys("1");
		Utilities.highlightelementRedBorder(inputQuantityCanon);
		Utilities.takeScreenShot("Desktops-Canon-Quantity=1 Selected");
		
	}
	//----- And User click add to Cart button Canon-----
	public void addToCartCanonPage() throws IOException {
		Utilities.highlightelementRedBorder(addToCartCanon);
		Utilities.takeScreenShot("Desktops-Canon-Add to Cart");
		addToCartCanon.click();
		
	}
	//----- Then User should see a message ‘Success: You have added Canon EOS 5D Camera to your shopping cart!’-----
	public void successMsgAddedToCartCanon() throws IOException {
		Utilities.scrollUpPage();
		String actualMsg = successMsgCanonEOS5D.getText();
		String strString = actualMsg.substring(0, 66);
		String expectedMsg= "Success: You have added Canon EOS 5D Camera to your shopping cart!";
		System.out.println(expectedMsg+ " expected text");
		System.out.println(successMsgCanonEOS5D.getText()+ " actual text");
		System.out.println(strString+ " substring ");
		Utilities.compareText(strString, expectedMsg);
		Assert.assertEquals(strString, expectedMsg);
		Utilities.highlightelementRedBorder(successMsgCanonEOS5D);
		Utilities.takeScreenShot("Desktops-Canon-Success Msg");
	}
	//Review
	//----- And User click on Canon EOS 5D item ------
	public void canonEOS5Ditem () throws IOException {
		Utilities.highlightelementRedBorder(canonEOS5Dlinktext);
		Utilities.takeScreenShot("Desktops-Canon-Item Clicked");
		canonEOS5Dlinktext.click();
	}
	//----- And User click on write a review link -----
	public void clickOnReviewLink () throws IOException {
		Utilities.scrolldownPage();
		Utilities.highlightelementRedBorder(writeReviewLink);
		Utilities.takeScreenShot("Desktops-Canon-Review Link Clicked");
		writeReviewLink.click();
		
	}
	//----- And user fill the review information -----
	public void enterYourName (String yourName) {
		inputYourNameField.sendKeys(yourName);
	}
	
	public void enterReview (String review) {
	inputReviewField.sendKeys(review);
	
	}
	public void rating () throws IOException {
		ratingradioButton4.click();
		Utilities.takeScreenShot("Desktops-Canon-Review Info Entered");
	}
	//----- And User click on Continue Button -----
	public void continueButton () throws IOException {
		Utilities.highlightelementRedBorder(continueButtonCanonReviewPage);
		Utilities.takeScreenShot("Desktops-Canon-Review Continue Button");
		continueButtonCanonReviewPage.click();
	}
	//----- Success Msg -----
	public void reviewSubmitted () throws IOException {
		Utilities.highlightelementRedBorder(successMsgReviewPosted);
		Utilities.takeScreenShot("Desktops-Canon-Review Posted");
		String actualMsg = successMsgReviewPosted.getText();
		//String strString = actualMsg.substring(0, 56);
		String expectedMsg= "Thank you for your review. It has been submitted to the webmaster for approval.";
		System.out.println(expectedMsg+ "expected text");
		System.out.println(successMsgReviewPosted.getText()+ "actual text");
		Assert.assertEquals(actualMsg, expectedMsg);
		Utilities.compareText(actualMsg, expectedMsg);
		
		
		
	}
}
