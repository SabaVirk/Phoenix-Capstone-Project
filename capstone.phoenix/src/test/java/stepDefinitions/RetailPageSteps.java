package stepDefinitions;

import java.io.IOException;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObjects;

public class RetailPageSteps extends Base {

	RetailPageObjects retailPage = new RetailPageObjects();

	// Background
	@Given("User click  on MyAccount")
	public void user_click_on_my_account() throws IOException {
		retailPage.clickOnmyAccount();
		logger.info("My Account Clicked Successfully");
	}

	@When("User click on Login")
	public void user_click_on_login() throws IOException {
		retailPage.clickOnLogin();
		logger.info("Login Clicked Successfully!");
	}

	@And("User enter username and password")
	public void user_enter_username_and_password(DataTable dataTable) throws IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterUserName(data.get(0).get("username"));
		retailPage.enterPassword(data.get(0).get("password"));
		logger.info("username and password entered successfiully!");

	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws IOException {
		retailPage.clickOnLoginButton();
		logger.info("Loging Button Clicked Successsfully!");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
		retailPage.validatemyAccountDashboard();
		logger.info("User is logged into MyAccount Dashboard validated!");
	}

	// RegisterAsAffiliate
//	@And ("User click on Continue button My Account Page")
//	
//	@And ("User click on ‘Register for an Affiliate Account’ link")
//	public void user_click_on_register_for_an_affiliate_account_link() throws IOException {
//		retailPage.clickOnRegisterAffiliate();
//		logger.info("Clicked On register For Affiliate Successfully!");
//	}
//
//	@When("User fill affiliate form with below information")
//	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
//		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
//		retailPage.enterCompanyName(data.get(0).get("company"));
//		retailPage.enterWebsite(data.get(0).get("website"));
//		retailPage.enterTaxID(data.get(0).get("taxID"));
//		retailPage.enterPaymentMethod();
//		logger.info("Register Info Entered Successfully!");
//	}
//
//	@When("User check on About us check box")
//	public void user_check_on_about_us_check_box() throws IOException {
//		retailPage.checkAboutUsCheckBox();
//		logger.info("About Us ChechBox Checked Successfully!");
//	}
//
//	@When("User click on Continue button Register Affiliate")
//	public void user_click_on_continue_button_register_affiliate() throws IOException {
//		retailPage.clickContinueButtonRegisterAffiliate();
//		logger.info("Continue Button Clicked Successfully!");
//	}
//
//	@Then("User should see a success message register as affiliate")
//	public void user_should_see_a_success_message_register_as_affiliate() throws IOException {
//		retailPage.verifySuccessMsgRegisterAsAffiliate();
//		logger.info("SuccessMsg Present on UI Verified!");
//	}

	// EditAffiliateInfo

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() throws IOException {
		retailPage.clickOnEditAffiliateInfo();
		logger.info("Edit Affiliate Link Clicked Successfully!");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws IOException {
		retailPage.clickOnBankTransferRadio();
		logger.info("bank Transfer Radio Button Clicked Successfully!");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterBankName(data.get(0).get("bankName"));
		retailPage.enterAbaNumber(data.get(0).get("abaNumber"));
		retailPage.enterSwiftCode(data.get(0).get("swiftCode"));
		retailPage.enterAccountName(data.get(0).get("accountName"));
		retailPage.enterAccountNumber(data.get(0).get("accountNumber"));
		logger.info("Edit Affiliate Information Filled Successfully!");
	}

	@When("User click on Continue button Edit Affiliate")
	public void user_click_on_continue_button_edit_affiliate() throws IOException {
		retailPage.clickOnContinueButtonEditAffiliate();
		logger.info("Continue Button Clicked Successfully!");
	}

	@Then("User should see a success message edit affiliate information")
	public void user_should_see_a_success_message_edit_affiliate_information() throws IOException {
		retailPage.VerifySuccessMsgEditAffiliate();
		logger.info("Success Msg Verified!");
	}

	// EditAccountInfo
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() throws IOException {
		retailPage.clickOnEditAccountInfo();
		logger.info("Edit Account Information Link Clicked Successfully!");
	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPage.enterFirstName(data.get(0).get("firstname"));
		retailPage.enterLastname(data.get(0).get("lastName"));
		retailPage.enterEmail(data.get(0).get("email"));
		retailPage.enterTelephoneNumber(data.get(0).get("telephone"));
		logger.info("Edit Account Info Entered Successfully!");
	}

	@When("User click on continue button Edit Account")
	public void user_click_on_continue_button_edit_account() throws IOException {
		retailPage.clickOnContinueButtonEditAccountInfo();
		logger.info("Continue Button Clicked Successfully!");
	}

	@Then("User should see a message for account {string}")
	public void user_should_see_a_message(String succesMsgstring) throws IOException {
		retailPage.verifySuccessMsgAccountUpdated(succesMsgstring);
		logger.info("Success Msg Account Updated verified Successfully!");
	}

}
