package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;
import utilities.Utilities;

public class Retail_RegisterAffiliatePageObjects extends Base {

	public Retail_RegisterAffiliatePageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPasswordField;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agreeToTermsCheckBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//aside//a[1]")
	private WebElement myAccountSideColumn;
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement registerForAffiliateAccount;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement inputCompanyField;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement inputWebsiteField;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement inputTaxIDField;
	@FindBy(xpath = "//div[@class='radio']")
	private WebElement radioButtons;
	@FindBy(xpath = "//div[@class='radio'][1]")
	private WebElement chequeRadioButton;
	@FindBy (xpath="//input[@id='input-cheque']")
	private WebElement chequePayeeNameField;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUsCheckBox;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButtonRegisterAffiliate;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgRegisterAsAffiliate;

	public void clickOnRegister() throws IOException {
		Utilities.highlightelementRedBorder(register);
		Utilities.takeScreenShot("Retail-RA-Registerbutton");
		register.click();
	}

	public void enterFirstName(String firstname) throws IOException {
		Utilities.highlightelementRedBorder(firstNameField);
		firstNameField.sendKeys(firstname);
	}

	public void enterLastName(String lastname) throws IOException {
		Utilities.highlightelementRedBorder(lastNameField);
		lastNameField.sendKeys(lastname);
	}

	public void enterEmail(String email) throws IOException {
		Utilities.highlightelementRedBorder(emailField);
		emailField.sendKeys(email);
	}

	public void enterTelephoneNumber(String phonenumber) throws IOException {
		Utilities.highlightelementRedBorder(telephoneField);
		telephoneField.sendKeys(phonenumber);
	}

	public void enterPassword(String password) throws IOException {
		Utilities.highlightelementRedBorder(passwordField);
		passwordField.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) throws IOException {
		Utilities.highlightelementRedBorder(confirmPasswordField);
		confirmPasswordField.sendKeys(confirmPassword);
	}

	public void confirmTermsCheckBox() throws IOException {
		Utilities.highlightelementRedBorder(agreeToTermsCheckBox);
		Utilities.takeScreenShot("Retail-RA-RegisterDataEntered");
		agreeToTermsCheckBox.click();
	}

	public void clickOnContinueButton() throws IOException {
		Utilities.highlightelementRedBorder(continueButton);
		continueButton.click();
	}
	
	public void clickOnMyAccountLink () throws IOException {
		Utilities.highlightelementRedBorder(myAccountSideColumn);
		myAccountSideColumn.click();	
	}

	//When User click on ‘Register for an Affiliate Account’ link
	public void clickOnRegisterAffiliate() throws IOException {
		Utilities.highlightelementRedBorder(registerForAffiliateAccount);
		Utilities.takeScreenShot("Retail-Register-ClickRegister");
		registerForAffiliateAccount.click();
	}

	//And User fill affiliate form with below information
	public void enterCompanyName(String company) {
		inputCompanyField.sendKeys(company);
	}

	public void enterWebsite(String website) {
		inputWebsiteField.sendKeys(website);
	}

	public void enterTaxID(String taxID) {
		inputTaxIDField.sendKeys(taxID);
	}

	@SuppressWarnings("deprecation")
	public void enterPaymentMethod() {
		chequeRadioButton.click();
		boolean isSelected = chequeRadioButton.isSelected();
		boolean actualbln = true;

		try {
			Utilities.highlightelementRedBorder(chequeRadioButton);
			Assert.assertEquals(isSelected, actualbln);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	public void enterChequePayeeName (String paymentMethod) throws IOException {
		Utilities.highlightelementRedBorder(chequePayeeNameField);
		chequePayeeNameField.sendKeys(paymentMethod);
	}
	

	//And User check on About us check box
	public void checkAboutUsCheckBox() throws IOException {
		Utilities.highlightelementRedBorder(aboutUsCheckBox);
		Utilities.takeScreenShot("Retail-Register-AboutUsCheckBox");
		aboutUsCheckBox.click();
	}

	//And User click on Continue button Register Affiliate
	public void clickContinueButtonRegisterAffiliate() throws IOException {
		Utilities.highlightelementRedBorder(continueButtonRegisterAffiliate);
		Utilities.takeScreenShot("Retail-Register-ContinueButton");
		continueButtonRegisterAffiliate.click();
	}

	//Then User should see a success message register as affiliate
	@SuppressWarnings("deprecation")
	public void verifySuccessMsgRegisterAsAffiliate() throws IOException {
		Utilities.highlightelementRedBorder(successMsgRegisterAsAffiliate);
		Utilities.takeScreenShot("Retail-Register-SuccessMsgRegisterAffiliate");
		String expectedMsg = "Success: Your account has been successfully updated.";
		String actualMsg = (successMsgRegisterAsAffiliate.getText());
		Utilities.compareText(actualMsg, expectedMsg);
		Assert.assertEquals(expectedMsg, actualMsg);
		System.out.println(successMsgRegisterAsAffiliate.getText() + " Success Msg on UI ");
	}

}
