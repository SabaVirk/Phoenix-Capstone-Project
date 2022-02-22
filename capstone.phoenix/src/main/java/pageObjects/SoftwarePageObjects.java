package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObjects extends Base {

	public SoftwarePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//aside//child::div//child::a[contains(text(),'Desktops')]")
	private WebElement desktopInList;
	
	@FindBy (xpath = "//div[@class='list-group']//child::a[2]")
	private WebElement laptopsNotebooksInList;
	
	@FindBy (xpath = "//div[@class='list-group']//child::a[3]")
	private WebElement componentsInList;
	
	@FindBy (xpath = "//div[@class='list-group']//child::a[4]")
	private WebElement tabletsInList;
	
	@FindBy (xpath = "//div[@class='list-group']//child::a[5]")
	private WebElement softwareInList;
	
	@FindBy (xpath = "//div[@class='list-group']//child::a[6]")
	private WebElement phonePDAsInList;
	
	@FindBy (xpath = "//div[@class='list-group']//child::a[7]")
	private WebElement cameraInList;
	
	@FindBy (xpath = "//div[@class='list-group']//child::a[8]")
	private WebElement mp3InList;
	
	@FindBy (xpath = "//img[@class='img-responsive']")
	private WebElement pcImageOnLeftSide;
	
	@FindBy (tagName = "//h2")
	private WebElement softwareTextInBold;
	
	@FindBy (xpath = "//p[contains(text(),'There')]")
	private WebElement textMessageUnderSoftware;
	
	@FindBy (className = "//a[@class='btn btn-primary']")
	private WebElement continueButton;
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
