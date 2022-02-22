package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNotebooksPageObjects;

public class LaptopsNotebooksSteps extends Base {

	LaptopsNotebooksPageObjects laptopsNotebooks = new LaptopsNotebooksPageObjects();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws IOException {
		laptopsNotebooks.clickOnLaptopNotebook();
		logger.info("Laptop & Notebooks clicked Successfully!");
	}

	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws IOException {
		laptopsNotebooks.clickOnShowAllLaptop();
		logger.info("Show All Laptops & Notebooks Clicked Successfully!");
	}

	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() throws IOException {
		laptopsNotebooks.clickOnMacBook();
		logger.info("Macbook Item Clicked Successfully!");
	}

	@And("User click add to Cart button MacBook Page")
	public void user_click_add_to_cart_button() throws IOException {
		laptopsNotebooks.clickOnAddToCartMacBook();
		logger.info("Add to Cart Button Clicked Successfully!");
	}

	@Then("User should see a message for Macbook {string}")
	public void user_should_see_a_message(String string) throws IOException {
		System.out.println("string from stepDefinition method: " + string);
		laptopsNotebooks.successMsgMacBook(string);
		logger.info("Success Msg Macbook Verified!");
	}

	@And("User should see {string} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(String string) throws IOException {
		laptopsNotebooks.validateItem602InCart(string);
		logger.info("Item 602 Showed In Cart Verified!");
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() throws IOException {
		laptopsNotebooks.clickonCartOptionMacBook();
		logger.info("Cart Button Clicked Successfully!");

	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws IOException {
		laptopsNotebooks.clickOnRedxButton();
		logger.info("Remove from cart button clicked Successfully!");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws IOException {
		laptopsNotebooks.verifyCartTotalAfterRemovingItem(string);
		logger.info("Item removed from cart and cart shows O item verified!");
	}

	@And("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException, IOException {
		laptopsNotebooks.clickOnProdCompMacBook();
		logger.info("Prodcut Comparison Macbook Clicked Successfully!");
	}

	@And("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws IOException {
		laptopsNotebooks.clickOnProdCompMacbookAir();
		logger.info("Prodcut Comparison Macbook Air Clicked Successfully!");
	}

	@Then("User should see a message for MacBook Air {string}")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison(String string)
			throws IOException {
		System.out.println("string from stepDefinition method: " + string);
		laptopsNotebooks.successMsgMacbookAirToProdComp(string);
		logger.info("Success Msg MacBook Air Added to Product Compariosn Verified!");

	}

	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws IOException {
		laptopsNotebooks.clickOnProductComparison();
		logger.info("ProductComparison Link Clicked Successfully!");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException {
		laptopsNotebooks.productComparisonChart();
		logger.info("Product Comparison Chart is Displayed");
	}

	@And("User click on heart icon to add ‘Sony VAIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() throws IOException {
		laptopsNotebooks.clickOnHearIconSony();
		logger.info("Heart Icon Sony VAIO clicked Successfully!");
	}

	@Then("User should get a message for Sony {string}")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list(String string)
			throws IOException, InterruptedException {
		laptopsNotebooks.msgNeedLoginSony(string);
		logger.info("Login Required Msg Got Successfully!");
	}

	@And("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() throws IOException {
		laptopsNotebooks.clickOnMacBookPro();
		logger.info("MacBook Pro Clicked Successfully!");

	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(String string) throws IOException {
		laptopsNotebooks.pricetagMacBookPro(string);
		logger.info("MacBook Pro Price Verified Successfully!");

	}

}
