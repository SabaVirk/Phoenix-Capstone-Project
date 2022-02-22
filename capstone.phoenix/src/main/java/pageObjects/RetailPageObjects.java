package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

import core.Base;

public class RetailPageObjects extends Base {

	public RetailPageObjects() {
		PageFactory.initElements(driver, this);
	}

	// Background
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValiidateRetailpage;
	@FindBy(xpath = "//a[@title ='My Account']")
	private WebElement myAccountRetailPage;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButtonMyAccount;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement inputEmailFieldLoginpage;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement inputPasswordFieldLoginpage;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButtonLoginPage;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;
	

//	@FindBy(xpath = "//a[contains(text(),'Register')]")
//	private WebElement registerForAffiliateAccount;
//	@FindBy(xpath = "//input[@id='input-company']")
//	private WebElement inputCompanyField;
//	@FindBy(xpath = "//input[@id='input-website']")
//	private WebElement inputWebsiteField;
//	@FindBy(xpath = "//input[@id='input-tax']")
//	private WebElement inputTaxIDField;
//	@FindBy(xpath = "//div[@class='radio']")
//	private WebElement radioButtons;
//	@FindBy(xpath = "//div[@class='radio'][1]")
//	private WebElement chequeRadioButton;
//	@FindBy(xpath = "//div[@class='radio'][2]")
//	private WebElement payPalRadioButton;
//	@FindBy(xpath = "//div[@class='radio'][3]")
//	private WebElement bankTransferRadio;
//	@FindBy(xpath = "//input[@name='agree']")
//	private WebElement aboutUsCheckBox;
//	@FindBy(xpath = "//input[@class='btn btn-primary']")
//	private WebElement continueButtonRegisterAffiliate;
//	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
//	private WebElement successMsgRegisterAsAffiliate;

	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate')]")
	private WebElement editAffiliateLink;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioButton;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement inputBankNameField;
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement inputAbaNumberField;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement inputSwiftCodeField;
	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement inputAccountNameField;
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement inputAccountNumberField;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButtonEditAffiliate;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgEditAffiliate;

	@FindBy(xpath = "//a[contains(text(),'Edit your account')]")
	private WebElement editAccountInfoLink;
	@FindBy(id = "input-firstname")
	private WebElement inputFirstNameField;
	@FindBy(id = "input-lastname")
	private WebElement inputLastnameField;
	@FindBy(id = "input-email")
	private WebElement inputEmailField;
	@FindBy(id = "input-telephone")
	private WebElement inputTelephoneField;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButtonEditAccountInfo;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsgEditAccountInfo;
	

// Background
	// And User click on MyAccount
	public void clickOnmyAccount() throws IOException {
		Utilities.highlightelementRedBorder(myAccountRetailPage);
		Utilities.takeScreenShot("Retail-Background-myAccount");
		myAccountRetailPage.click();
	}

	// When User click on Login
	public void clickOnLogin() throws IOException {
		Utilities.highlightelementRedBorder(loginButtonMyAccount);
		Utilities.takeScreenShot("Retail-Background-LoginButton");
		loginButtonMyAccount.click();
	}

	// And User enter username and password 
	public void enterUserName(String username) throws IOException {
		Utilities.highlightelementRedBorder(inputEmailFieldLoginpage);
		inputEmailFieldLoginpage.sendKeys(username);
	}
	public void enterPassword(String password) throws IOException {
		Utilities.highlightelementRedBorder(inputPasswordFieldLoginpage);
		inputPasswordFieldLoginpage.sendKeys(password);
	}

	// And User click on Login button
	public void clickOnLoginButton() throws IOException {
		Utilities.highlightelementRedBorder(loginButtonLoginPage);
		Utilities.takeScreenShot("Background-Retail-LoginButtonLoginPage");
		loginButtonLoginPage.click();
	}

	// Then User should be logged in to MyAccount dashboard
	public void validatemyAccountDashboard() throws IOException {
		Utilities.highlightelementRedBorder(myAccountDashboard);
		Utilities.takeScreenShot("Background-Retail-MyAccountDashboard");
		String text = myAccountDashboard.getText();
		if (text.equalsIgnoreCase("My Account")) {
			logger.info("Text verified!");
		} else {
			logger.info("Text does not match!");
		}
	}

//@RegisterAsAffiliate
	// Scenario:Register as an Affiliate user with Cheque Payment Method

//	// When User click on ‘Register for an Affiliate Account’ link
//	public void clickOnRegisterAffiliate() throws IOException {
//		Utilities.highlightelementRedBorder(registerForAffiliateAccount);
//		Utilities.takeScreenShot("Retail-Register-ClickRegister");
//		registerForAffiliateAccount.click();
//	}

	// And User fill affiliate form with below information
//	public void enterCompanyName(String company) {
//		inputCompanyField.sendKeys(company);
//	}
//
//	public void enterWebsite(String website) {
//		inputWebsiteField.sendKeys(website);
//	}
//
//	public void enterTaxID(String taxID) {
//		inputTaxIDField.sendKeys(taxID);
//	}
//
//	public void enterPaymentMethod() {
//		boolean isSelected = chequeRadioButton.isSelected();
//		if (isSelected == false) {
//			chequeRadioButton.click();
//		}
//	}
//
//	// And User check on About us check box
//	public void checkAboutUsCheckBox() throws IOException {
//		Utilities.highlightelementRedBorder(aboutUsCheckBox);
//		Utilities.takeScreenShot("Retail-Register-AboutUsCheckBox");
//		aboutUsCheckBox.click();
//	}
//
//	// And User click on Continue button Register Affiliate
//	public void clickContinueButtonRegisterAffiliate() throws IOException {
//		Utilities.highlightelementRedBorder(continueButtonRegisterAffiliate);
//		Utilities.takeScreenShot("Retail-Register-ContinueButton");
//		continueButtonRegisterAffiliate.click();
//	}
//
//	// Then User should see a success message register as affiliate
//	public void verifySuccessMsgRegisterAsAffiliate() throws IOException {
//		Utilities.highlightelementRedBorder(successMsgRegisterAsAffiliate);
//		Utilities.takeScreenShot("Retail-Register-SuccessMsgRegisterAffiliate");
//		System.out.println(successMsgRegisterAsAffiliate.getText() + " Success Msg on UI ");
//	}

//@EditAffiliateInfo
	// Scenario: Edit your affiliate information from Cheque payment method to Bank
	// Transfer
	// When User click on ‘Edit your affiliate informationlink
	public void clickOnEditAffiliateInfo() throws IOException {
		Utilities.highlightelementRedBorder(editAffiliateLink);
		Utilities.takeScreenShot("Retail-EditAffiliate-link");
		editAffiliateLink.click();
	}

	// And user click on Bank Transfer radio button
	public void clickOnBankTransferRadio() {
		bankTransferRadioButton.click();
			boolean isSelected = bankTransferRadioButton.isSelected();
			boolean actualbln = true;

			try {
				Thread.sleep(1000);
				Utilities.highlightelementRedBorder(bankTransferRadioButton);
				Assert.assertEquals(actualbln, isSelected);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	

	// And User fill Bank information with below information
	public void enterBankName (String bankName) throws IOException {
		Utilities.highlightelementRedBorder(inputBankNameField);	
		inputBankNameField.sendKeys(bankName);
	}
	public void enterAbaNumber (String abaNumber) throws IOException {
		Utilities.highlightelementRedBorder(inputAbaNumberField);
		inputAbaNumberField.sendKeys(abaNumber);
	}
	public void enterSwiftCode (String swiftCode) throws IOException {
		Utilities.highlightelementRedBorder(inputSwiftCodeField);
		inputSwiftCodeField.sendKeys(swiftCode);
	}
	public void enterAccountName (String accountName) throws IOException {
		Utilities.highlightelementRedBorder(inputAccountNameField);
		inputAccountNameField.sendKeys(accountName);
	}
	public void enterAccountNumber (String accountNumber) throws IOException {
		Utilities.highlightelementRedBorder(inputAccountNumberField);
		inputAccountNumberField.sendKeys(accountNumber);
	}

	// And User click on Continue button Edit Affiliate
	public void clickOnContinueButtonEditAffiliate() throws IOException {
		Utilities.highlightelementRedBorder(continueButtonEditAffiliate);
		Utilities.takeScreenShot("Retail-EditAffiliate-ContinueButton");
		continueButtonEditAffiliate.click();

	}

	// Then User should see a success message edit affiliate information
	public void VerifySuccessMsgEditAffiliate() throws IOException {
		Utilities.highlightelementRedBorder(successMsgEditAffiliate);
		Utilities.takeScreenShot("Reatail-EditAffiliate-SuccessMsg");
		System.out.println(successMsgEditAffiliate.getText() + " This is Success Msg on UI");
	}

//@EditAccount
	// Scenario: Edit your account Information
	// When User click on ‘Edit your account information’ link
	public void clickOnEditAccountInfo() throws IOException {
		Utilities.highlightelementRedBorder(editAccountInfoLink);
		Utilities.takeScreenShot("Retail-EditAccountInfo-Link");
		editAccountInfoLink.click();
	}

	// And User modify below information
	public void enterFirstName (String firstname) {
		inputFirstNameField.clear();
		inputFirstNameField.sendKeys(firstname);
	}
	public void enterLastname (String lastName) {
		inputLastnameField.clear();
		inputLastnameField.sendKeys(lastName);
	}
	public void enterEmail (String email) {
		inputEmailField.clear();
		inputEmailField.sendKeys(email);
	}
	public void enterTelephoneNumber (String telephone) {
		inputTelephoneField.clear();
		inputTelephoneField.sendKeys(telephone);
	}

	// And User click on continue button Edit Account
	public void clickOnContinueButtonEditAccountInfo() throws IOException {
		Utilities.highlightelementRedBorder(continueButtonEditAccountInfo);
		Utilities.takeScreenShot("Retail-EditAccountInfo-ContinueButton");
		continueButtonEditAccountInfo.click();
	}

	// Then User should see a message ' Success: Your account has been successfully
	// updated.'
	public void verifySuccessMsgAccountUpdated(String succesMsgstring) throws IOException {
		Utilities.highlightelementRedBorder(successMsgEditAccountInfo);
		Utilities.takeScreenShot("Retail-EditAccountInfo-SuccessMsg");
		String actualMsg = successMsgEditAccountInfo.getText();
		if (actualMsg.equalsIgnoreCase(succesMsgstring)) {
			logger.info("Text verified!");
		} else {
			logger.info("Text does not match!");
		}
		Assert.assertEquals(succesMsgstring,actualMsg);

	}

}
