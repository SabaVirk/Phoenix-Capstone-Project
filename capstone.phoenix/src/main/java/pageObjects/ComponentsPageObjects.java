package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


	public class ComponentsPageObjects extends Base {

		
		public ComponentsPageObjects() {
			PageFactory.initElements(driver, this);
		}
	
		@FindBy (xpath = "//a[text()='Components']")
		private WebElement componentsMainTab;
		
		@FindBy (xpath = "//a[contains(text(),'Trackballs')]")
		private WebElement miceAndTrackballs;
		
		@FindBy (xpath = "//a[contains(text(),'Monitors')]")
		private WebElement monitors;
		
		@FindBy (xpath = "//a[contains(text(),'Printers')]")
		private WebElement printers;
		
		@FindBy (xpath = "//a[contains(text(),'Scanners')]")
		private WebElement scanners;
		
		@FindBy (xpath = "//a[contains(text(),'Web')]")
		private WebElement webCameras;
		
		@FindBy (xpath = "//a[contains(text(),'All Components')]")
		private WebElement showAllComponents;
		
		@FindBy (xpath = "//i[@class='fa fa-home']")
		private WebElement homeIcon;
		
		@FindBy (xpath = "//a[text()='Laptops & Notebooks (5)']")
		private WebElement laptopsNotebooksTab;
		
		@FindBy (xpath = "//a[text()='Components (2)']")
		private WebElement componentsChildTab;
		
		@FindBy (xpath = "//li//div//div//ul//li//a[text()='Mice and Trackballs (0)']")
		private WebElement miceAndTrackballsTab;
		
		@FindBy (xpath = "//li//div//div//ul//li//a[contains(text(),'Monitors')]")
		private WebElement monitorsTab;
		
		@FindBy (xpath = "//li//div//div//ul//li//a[contains(text(),'Printers')]")
		private WebElement printersTab;
		
		@FindBy (xpath = "//li//div//div//ul//li//a[contains(text(),'Scanners')]")
		private WebElement scannersTab;
		
		@FindBy (xpath = "//li//div//div//ul//li//a[contains(text(),'Cameras')]")
		private WebElement webCamerasTab;
		
		@FindBy (xpath = "//a[contains(text(),'Tablets (1)')]")
		private WebElement tabletsTab;
		
		@FindBy (xpath = "//a[contains(text(),'Software (0)')]")
		private WebElement softwareTab;
		
		@FindBy (xpath = "//a[contains(text(),'Phones & PDAs ')]")
		private WebElement phonesPDAsTab;
		
		@FindBy (xpath = "//a[text()='Cameras (2)']")
		private WebElement camerasTab;
		
		@FindBy (xpath = "//a[text()='MP3 Players (4)']")
		private WebElement mp3PlayersTab;
		
		@FindBy (xpath = "//aside//div//div//div//div//a//img[@class='img-responsive']")
		private WebElement pcImageComponentsPAge;
		
		@FindBy (tagName = "//h2")
		private WebElement componentsTextInBold;
		
		@FindBy (tagName = "//h3")
		private WebElement refineSearchText;
		
		@FindBy (xpath= "//div[@id='content']//div//div//ul//li//a[contains(text(),'Mice')]")
		private WebElement mice;
		
		@FindBy (xpath = "//div[@id='content']//div//div//ul//li//a[contains(text(),'Monitors')]")
		private WebElement monitorsLis;
		
		@FindBy (xpath = "//div[@id='content']//div//div//ul//li//a[contains(text(),'Printers')]")
		private WebElement printersonside;
		
		@FindBy (xpath = "//div[@id='content']//div//div//ul//li//a[contains(text(),'Scanners')]")
		private WebElement scannersonside;
	
		
		
		
		
		
		
		
		
		
		
		
	
}
