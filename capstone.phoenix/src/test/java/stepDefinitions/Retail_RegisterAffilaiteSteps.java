package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.Retail_RegisterAffiliatePageObjects;

public class Retail_RegisterAffilaiteSteps extends Base{
	
	Retail_RegisterAffiliatePageObjects retailRegisterAffiliatePage = new Retail_RegisterAffiliatePageObjects();

	
	@And("user click on register button")
	public void user_click_on_register_button() throws IOException {
		retailRegisterAffiliatePage.clickOnRegister();
		logger.info("Register button was clicked successfully");
	}

	@And("user fill registeration form with information below")
	public void user_fill_registeration_form_with_information_below(DataTable dataTable) throws IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailRegisterAffiliatePage.enterFirstName(data.get(0).get("firstname"));
		retailRegisterAffiliatePage.enterLastName(data.get(0).get("lastname"));
		retailRegisterAffiliatePage.enterEmail(data.get(0).get("email"));
		retailRegisterAffiliatePage.enterTelephoneNumber(data.get(0).get("telephone"));
		retailRegisterAffiliatePage.enterPassword(data.get(0).get("password"));
		retailRegisterAffiliatePage.enterConfirmPassword(data.get(0).get("confirmPassword"));
		logger.info("User data entered successfully");
	}

	@And("user click on agree to terms checkbox")
	public void user_click_on_agree_to_terms_checkbox() throws IOException {
		retailRegisterAffiliatePage.confirmTermsCheckBox();
		logger.info("Agree to terms check box selected successfully");
	}

	@And("user click on continue button")
	public void user_click_on_continue_button() throws IOException {
		retailRegisterAffiliatePage.clickOnContinueButton();
		logger.info("Continue button clicked successfully");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	@And ("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() throws IOException {
		retailRegisterAffiliatePage.clickOnMyAccountLink();
		retailRegisterAffiliatePage.clickOnRegisterAffiliate();
		logger.info("Clicked On register For Affiliate Successfully!");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws IOException  {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailRegisterAffiliatePage.enterCompanyName(data.get(0).get("company"));
		retailRegisterAffiliatePage.enterWebsite(data.get(0).get("website"));
		retailRegisterAffiliatePage.enterTaxID(data.get(0).get("taxID"));
		retailRegisterAffiliatePage.enterChequePayeeName(data.get(0).get("paymentMethod"));
		logger.info("Register Info Entered Successfully!");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() throws IOException {
		retailRegisterAffiliatePage.checkAboutUsCheckBox();
		logger.info("About Us ChechBox Checked Successfully!");
	}

	@When("User click on Continue button Register Affiliate")
	public void user_click_on_continue_button_register_affiliate() throws IOException {
		retailRegisterAffiliatePage.clickContinueButtonRegisterAffiliate();
		logger.info("Continue Button Clicked Successfully!");
	}

	@Then("User should see a success message register as affiliate")
	public void user_should_see_a_success_message_register_as_affiliate() throws IOException {
		retailRegisterAffiliatePage.verifySuccessMsgRegisterAsAffiliate();
		logger.info("SuccessMsg Present on UI Verified!");
	}

	
	
	
	
	
}
