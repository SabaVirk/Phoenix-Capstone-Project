package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;
import utilities.Utilities;

public class LaptopsNotebooksPageObjects extends Base {

	public LaptopsNotebooksPageObjects() {
		PageFactory.initElements(driver, this);
	}


	//Nav Bar
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNotebooksNavBar;
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops')]")
	private WebElement showAllLaptopsNoteBooks;

	//MacBook
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookLinkText;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[8]")
	private WebElement addToCartMacBook;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement add2cartMacbookPage;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgMacbook;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement totalCartBlackButton;
	@FindBy(xpath = "(//button)[6]")
	private WebElement blackButtonShoppingCart;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-xs']")
	private WebElement redRemoveFromCartButton;

	//Product Comparison	
	@FindBy(xpath = "//button[@onclick=\"compare.add('43');\"]")
	private WebElement addToCompareMacBook;
	@FindBy(xpath = "//button[@onclick=\"compare.add('44');\"]")
	private WebElement macBookAirAddToCompare;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgMacbookAir;
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productComparisonLink;
	@FindBy (xpath = "//div[@id='content']")
	private WebElement prodCompChart;
	@FindBy (xpath = "//h1[text()='Product Comparison']")
	private WebElement textTovalidateProdComparison;

	//MacBook Air
	@FindBy(xpath = "(//button[@type='button'])[17]")
	private WebElement macBookAirAddToCart;
	@FindBy(xpath = "(//button[@type='button'])[18]")
	private WebElement macBookAirAddTowishList;
	
	//MacBook Pro
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProItem;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPrice;
	
	//Sony Vaio
	@FindBy(xpath = "//button[@onclick=\"wishlist.add('46');\"]") 
	private WebElement sonyAddTowishList;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement loginMsgSonyVaio;


	//When User click on Laptop & NoteBook tab
	public void clickOnLaptopNotebook() throws IOException {
		Utilities.highlightelementRedBorder(laptopsNotebooksNavBar);
		Utilities.takeScreenShot("Background-LTNB-laptopNav Bar");
		laptopsNotebooksNavBar.click();
	}

	//And User click on Show all Laptop & NoteBook option
	public void clickOnShowAllLaptop() throws IOException {
		Utilities.highlightelementRedBorder(showAllLaptopsNoteBooks);
		Utilities.takeScreenShot("Background-LTNB-ShowAllLPNB");
		showAllLaptopsNoteBooks.click();
	}
	
	//@Macbook
	//And User click on MacBook item
	public void clickOnMacBook() throws IOException {
		Utilities.scrolldownPage();
		Utilities.highlightelementRedBorder(macBookLinkText);
		Utilities.takeScreenShot("LTNB-Mac-clickonMacBook");
		macBookLinkText.click();
	}

	//And User click add to Cart button
	public void clickOnAddToCartMacBook() throws IOException {
		Utilities.highlightelementRedBorder(add2cartMacbookPage);
		Utilities.takeScreenShot("LTNB-Mac-addToCartmackBook");
		add2cartMacbookPage.click();
	}

	//Then User should see a message for Macbook 'Success: You have added MacBook to your shopping cart!'
	@SuppressWarnings("deprecation")
	public void successMsgMacBook(String strSuccessMessage) throws IOException {
		Utilities.highlightelementRedBorder(successMsgMacbook);
		Utilities.takeScreenShot("LTNB-Mac-successMsg");
		String actualSuccessMsg = successMsgMacbook.getText();
		String strString = actualSuccessMsg.substring(0, 54);
		Utilities.compareText(actualSuccessMsg, strString);
		Assert.assertEquals(strSuccessMessage, strString);
	}

	//And User should see '1 item(s) - $602.00' showed to the cart
	@SuppressWarnings("deprecation")
	public void validateItem602InCart(String strCartTotal) throws IOException {
		Utilities.highlightelementRedBorder(totalCartBlackButton);
		Utilities.takeScreenShot("LTNB-Mac-602 in Cart");
		String actualCartTotal = totalCartBlackButton.getText();
		Utilities.compareText(actualCartTotal, strCartTotal);
		Assert.assertEquals(strCartTotal, actualCartTotal);
	}

	//And User click on cart option
	public void clickonCartOptionMacBook() throws IOException {
		Utilities.highlightelementRedBorder(totalCartBlackButton);
		Utilities.takeScreenShot("LTNB-Mac-Click On Black Cart");
		totalCartBlackButton.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//And user click on red X button to remove the item from cart
	public void clickOnRedxButton() throws IOException {
		Utilities.highlightelementRedBorder(redRemoveFromCartButton);
		Utilities.takeScreenShot("LTNB-Mac-Remove from Cart Button");
		Utilities.waitAndClickElement(redRemoveFromCartButton);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Then item should be removed and cart should show '0 item(s) - $0.00'
	@SuppressWarnings("deprecation")
	public void verifyCartTotalAfterRemovingItem(String strCartTotalAfterRemove) throws IOException {
		Utilities.highlightelementRedBorder(totalCartBlackButton);
		Utilities.takeScreenShot("LTNB-Mac-O Item in Cart");
		String actualCartTotal = totalCartBlackButton.getText();
		System.out.println("actual cart total after removing: =======" + actualCartTotal);
		Assert.assertEquals(strCartTotalAfterRemove, actualCartTotal);
		Utilities.compareText(strCartTotalAfterRemove, actualCartTotal);
		System.out.println(actualCartTotal);
	}
	
	//@ProductComparison
	//And User click on product comparison icon on ‘MacBook’
	public void clickOnProdCompMacBook() throws IOException {
		Utilities.highlightelementRedBorder(addToCompareMacBook);
		Utilities.takeScreenShot("LTNB-ProdComp-Add to Compare MacBook");
		addToCompareMacBook.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//And User click on product comparison icon on ‘MacBook Air’
	public void clickOnProdCompMacbookAir() throws IOException {
		Utilities.highlightelementRedBorder(macBookAirAddToCompare); 
		Utilities.takeScreenShot("LTNB-ProdComp-Add To Compare MacBook Air");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		macBookAirAddToCompare.click();
	}

	//Then User should see a message for MacBook Air 'Success: You have added MacBook Air to your product comparison!'
	@SuppressWarnings("deprecation")
	public void successMsgMacbookAirToProdComp(String strSuccessMessage ) throws IOException {
		Utilities.scrollUpPage();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utilities.highlightelementRedBorder(successMsgMacbookAir);
		Utilities.takeScreenShot("LPNB-ProdComp-successMSg MacAir");
		String actualMsg = successMsgMacbookAir.getText();
		String strString = actualMsg.substring(0, 63);
		System.out.println(strString+ "  subString text");
		System.out.println(successMsgMacbookAir.getText() + " actual text");
		Utilities.compareText(strSuccessMessage, strString);
		Assert.assertEquals(strSuccessMessage, strString);
	}

	//And User click on Product comparison link
	public void clickOnProductComparison() throws IOException {
		Utilities.highlightelementRedBorder(productComparisonLink);
		Utilities.takeScreenShot("LTNB-ProdComp-ProductComparison Link");
		productComparisonLink.click();
	}

	//Then User should see Product Comparison Chart
	@SuppressWarnings("deprecation")
	public void productComparisonChart() throws IOException {
		prodCompChart.isDisplayed();
		boolean isDisplayed = prodCompChart.isDisplayed();
		if (isDisplayed==true) {
			Assert.assertTrue(prodCompChart.isDisplayed());
		}
		Utilities.takeScreenShot("LTNB-ProdComp- ProductComparisonChart-1");
		Utilities.scrolldownPage();
		Utilities.takeScreenShot("LTNB- ProdComp- ProductComparisonChart-2");
	}

	//@SonyVAIOWishList
	//And User click on heart icon to add ‘Sony VAIO’ laptop to wish list
	public void clickOnHearIconSony() throws IOException {
		Utilities.scrolldownPage();
		Utilities.highlightelementRedBorder(sonyAddTowishList);
		Utilities.takeScreenShot("LTNB-Sony-Add To WishList");
		sonyAddTowishList.click();
	}

	//Then User should get a message for Sony
	@SuppressWarnings("deprecation")
	public void msgNeedLoginSony(String strLoginMsg) throws IOException, InterruptedException {
		Utilities.scrollUpPage();
		Thread.sleep(1000);
		Utilities.highlightelementRedBorder(loginMsgSonyVaio);
		Utilities.takeScreenShot("LTNB-Sony-Login Required Msg");
		String actualMsg = loginMsgSonyVaio.getText();
		String strString = actualMsg.substring(0, 72);
		String expectedMsg = "You must login or create an account to save Sony VAIO to your wish list!";
		System.out.println(expectedMsg + "expected text");
		System.out.println(loginMsgSonyVaio.getText() + "actual text");
		Assert.assertEquals(strLoginMsg, strString);
		Utilities.compareText(strLoginMsg, strString);
	}
	
	//@MacBookPro
	//And User click on ‘MacBook Pro’ item
	public void clickOnMacBookPro() throws IOException {
		Utilities.scrolldownPage();
		Utilities.highlightelementRedBorder(macBookProItem);
		Utilities.takeScreenShot("LTNB-MacBookPro-Item Clicked");
		macBookProItem.click();
	}

	//Then User should see ‘$2,000.00’ price tag is present on UI.
	@SuppressWarnings("deprecation")
	public void pricetagMacBookPro(String strPrice) throws IOException {
		String price = macBookProPrice.getText();
		if (price.equalsIgnoreCase("$2,000.00")) {
			logger.info("Price $2,000.00 Verified!");
		} else {
			logger.info("Price $2,000.00 is not present on UI");
		}
		Assert.assertEquals(strPrice, price);
		Utilities.highlightelementRedBorder(macBookProPrice);
		Utilities.takeScreenShot("LTNB-MacbookPro-Price");
	}

}
