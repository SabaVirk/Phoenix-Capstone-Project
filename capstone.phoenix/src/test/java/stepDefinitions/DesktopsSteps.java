package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObjects;
import utilities.Utilities;

public class DesktopsSteps extends Base {

	DesktopsPageObjects desktopsPage = new DesktopsPageObjects();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() throws IOException {
		desktopsPage.clickOnDesktopsTab();
		logger.info("Desktops tab clicked Successfully!");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() throws IOException {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("Clicked on Show All Desktops Successfully!");
	}
	
	//@AllItems
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
		desktopsPage.allItemsPresent();
		Assert.assertFalse(desktopsPage.allItemsPresent());
		logger.info("All Items present on Desktop Page verified!");
	}

	//@HPLP3065
	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() throws IOException {
		desktopsPage.addToCartHPLP();
		logger.info("Add to cart HPLP clicked Successfully!");
	}

	@And("User select quantity 1")
	public void user_select_quantity() throws IOException, InterruptedException {
		desktopsPage.selectQuantityHPLP();
		logger.info("User selected quantity=1 Successfully!");
	}

	@And("User click add to Cart button HPLP Page")
	public void user_click_add_to_cart_button() throws IOException {
		desktopsPage.addToCartHPLPPage();
		logger.info("Add to cart clicked on HPLP page Successfully!");
	}

	@Then("User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart() throws IOException {
		desktopsPage.successMsgAddedToCartHPLP();
		logger.info("HPLP added to cart Successfully!");
	}

	//@CanonEOS5D
	@And("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() throws IOException {
		desktopsPage.addToCartCanonDesktopPage();
		logger.info("Add To cart Clicked Successfully!");
	}

	@And("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() throws IOException, InterruptedException {
		desktopsPage.selectColor();
		logger.info("Red Color Selected Successfully!");
	}

	@And("User select quantity of 1")
	public void user_select_quantity_of_1() throws IOException, InterruptedException {
		desktopsPage.selectQuantityCanon();
		logger.info("quantity 1 selected successfully!");
	}

	@And("User click add to Cart button Canon")
	public void user_click_add_to_cart_button_Canon() throws IOException {
		desktopsPage.addToCartCanonPage();
		logger.info("Add to cart button clicked successfully");
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart()
			throws IOException {
		desktopsPage.successMsgAddedToCartCanon();
		logger.info("Canon added to cart successfully!");
	}
	
	//@ReviewCanon
	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws IOException {
		desktopsPage.canonEOS5Ditem();
		logger.info("CanonEOS5D item clicked successfully!");
	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() throws IOException {
		desktopsPage.clickOnReviewLink();
		logger.info("Review link clicked successfully!");
	}

	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
			throws IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktopsPage.enterYourName(data.get(0).get("yourName"));
		desktopsPage.enterReview(data.get(0).get("yourReview"));
		desktopsPage.rating();
		logger.info("Review given Successfully!");
	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() throws IOException {
		desktopsPage.continueButton();
		logger.info("Continue button clicked successfully!");
	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval()
			throws IOException {
		desktopsPage.reviewSubmitted();
		logger.info("Review Success Message Succesful");
	}

}
