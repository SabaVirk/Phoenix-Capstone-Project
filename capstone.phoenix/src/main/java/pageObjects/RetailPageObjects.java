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
	

	//Background
	//And User click on MyAccount
	public void clickOnmyAccount() throws IOException {
		Utilities.highlightelementRedBorder(myAccountRetailPage);
		Utilities.takeScreenShot("Retail-Background-myAccount");
		myAccountRetailPage.click();
	}

	//When User click on Login
	public void clickOnLogin() throws IOException {
		Utilities.highlightelementRedBorder(loginButtonMyAccount);
		Utilities.takeScreenShot("Retail-Background-LoginButton");
		loginButtonMyAccount.click();
	}

	//And User enter username and password 
	public void enterUserName(String username) throws IOException {
		Utilities.highlightelementRedBorder(inputEmailFieldLoginpage);
		inputEmailFieldLoginpage.sendKeys(username);
	}
	public void enterPassword(String password) throws IOException {
		Utilities.highlightelementRedBorder(inputPasswordFieldLoginpage);
		inputPasswordFieldLoginpage.sendKeys(password);
	}

	//And User click on Login button
	public void clickOnLoginButton() throws IOException {
		Utilities.highlightelementRedBorder(loginButtonLoginPage);
		Utilities.takeScreenShot("Background-Retail-LoginButtonLoginPage");
		loginButtonLoginPage.click();
	}

	//Then User should be logged in to MyAccount dashboard
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


	//@EditAffiliateInfo
	// When User click on ‘Edit your affiliate informationlink
	public void clickOnEditAffiliateInfo() throws IOException {
		Utilities.highlightelementRedBorder(editAffiliateLink);
		Utilities.takeScreenShot("Retail-EditAffiliate-link");
		editAffiliateLink.click();
	}

	//And user click on Bank Transfer radio button
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
	

	//And User fill Bank information with below information
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

	//And User click on Continue button Edit Affiliate
	public void clickOnContinueButtonEditAffiliate() throws IOException {
		Utilities.highlightelementRedBorder(continueButtonEditAffiliate);
		Utilities.takeScreenShot("Retail-EditAffiliate-ContinueButton");
		continueButtonEditAffiliate.click();

	}

	//Then User should see a success message edit affiliate information
	public void VerifySuccessMsgEditAffiliate() throws IOException {
		Utilities.highlightelementRedBorder(successMsgEditAffiliate);
		Utilities.takeScreenShot("Reatail-EditAffiliate-SuccessMsg");
		System.out.println(successMsgEditAffiliate.getText() + " This is Success Msg on UI");
	}

	//@EditAccount
	//When User click on ‘Edit your account information’ link
	public void clickOnEditAccountInfo() throws IOException {
		Utilities.highlightelementRedBorder(editAccountInfoLink);
		Utilities.takeScreenShot("Retail-EditAccountInfo-Link");
		editAccountInfoLink.click();
	}

	//And User modify below information
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

	//And User click on continue button Edit Account
	public void clickOnContinueButtonEditAccountInfo() throws IOException {
		Utilities.highlightelementRedBorder(continueButtonEditAccountInfo);
		Utilities.takeScreenShot("Retail-EditAccountInfo-ContinueButton");
		continueButtonEditAccountInfo.click();
	}

	//Then User should see a message ' Success: Your account has been successfully updated.'
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
