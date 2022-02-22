package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObjects extends Base {

	public TabletsPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Tablets']")
	private WebElement tabletsNavBar; 
	
	@FindBy (xpath = "//aside//child::div//child::a[contains(text(),'Desktops')]")
	private WebElement desktopsInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[2]")
	private WebElement laptopsAndNotebooksInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[3]")
	private WebElement componentsInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[4]")
	private WebElement tabletsInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[5]")
	private WebElement softwareInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[6]")
	private WebElement phonePDAsInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[7]")
	private WebElement camerasInList;
	
	@FindBy (xpath = "//aside//child::div//child::a[8]")
	private WebElement mp3PlayersInList;
	
	@FindBy (xpath = "//aside//div//div//div//div//a//img[@class='img-responsive']")
	private WebElement pcImageOnTabletsPage;
	
	@FindBy (tagName = "//h2")
	private WebElement desktopTextInBold;
	
	@FindBy (xpath = "//i[@class='fa fa-th-list']")
	private WebElement listButton;
	
	@FindBy (id = "//button[@id='grid-view']")
	private WebElement gridviewButton;
	
	@FindBy (xpath = "//div[@class='form-group']")
	private WebElement productCompareLink;
	
	@FindBy (xpath = "//label[contains(text(),'Sort By:')]")
	private WebElement SortByTetx;
	
	@FindBy (id = "//select[@id='input-sort']")
	private WebElement sortByDefaultButton;
	
	@FindBy (id = "//select[@id='input-sort']//option[1]")
	private WebElement defaultSelectTab;
	
	@FindBy (id = "//select[@id='input-sort']//option[2]")
	private WebElement optionNameAtoZ;
	
	@FindBy (id = "//select[@id='input-sort']//option[3]")
	private WebElement optionNameZtoA;
	
	@FindBy (id = "//select[@id='input-sort']//option[4]")
	private WebElement priceLowtoHigh;
	
	@FindBy (id = "//select[@id='input-sort']//option[5]")
	private WebElement priceHightoLow;
	
	@FindBy (id = "//select[@id='input-sort']//option[6]")
	private WebElement optionRatingHighest;
	
	@FindBy (id = "//select[@id='input-sort']//option[7]")
	private WebElement optionRatingLowest;
	
	@FindBy (id = "//select[@id='input-sort']//option[8]")
	private WebElement optionModelAtoZ;
	
	@FindBy (id = "//select[@id='input-sort']//option[9]")
	private WebElement optionModelZtoA;
	
	@FindBy (xpath = "//label[contains(text(),'Show')]")
	private WebElement showButtontext;
	
	@FindBy (id = "//select[@id='input-limit']")
	private WebElement inputBoxDefault;
	
	@FindBy (id = "//select[@id='input-limit']//option[1]")
	private WebElement option15;
	
	@FindBy (id = "//select[@id='input-limit']//option[2]")
	private WebElement option25;
	
	@FindBy (id = "//select[@id='input-limit']//option[3]")
	private WebElement option50;
	
	@FindBy (id = "//select[@id='input-limit']//option[4]")
	private WebElement option75;
	
	@FindBy (id = "//select[@id='input-limit']//option[5]")
	private WebElement option100;
	
	@FindBy (tagName = "//h4")
	private WebElement samsungGalaxyTextInBold;
	
	@FindBy (xpath = "//p[contains(text(),'Samsung')]")
	private WebElement samsungDescriptionText;
	
	@FindBy (xpath = "//p[@class='price' and contains(text(),'241')]")
	private WebElement priceIncluTax;
	
	@FindBy (className = "//span[@class='price-tax']")
	private WebElement priceExTax;
	
	@FindBy (xpath = "//img[@class='img-responsive']//parent::a//parent::div[@class='image']")
	private WebElement samsungTabletImage;
	
	@FindBy (xpath = "//span[text()='Add to Cart']")
	private WebElement addToCartButton;
	
	@FindBy (xpath = "//i[@class='fa fa-exchange']")
	private WebElement compareButton;
	
	
	
	
	
	
	
	
	
	
	
	
}
