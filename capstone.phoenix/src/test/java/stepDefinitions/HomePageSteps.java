package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;
import utilities.Utilities;

public class HomePageSteps extends Base {

	HomePageObjects homePage = new HomePageObjects();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
	homePage.validateHomePage();
	logger.info("Retail Website HomePage Validated Succesfully");
	}
	
	//@Currency
	@When("User click on Currency")
	public void user_click_on_currency() throws IOException {
	homePage.clickOnCurrencyButton();
	logger.info("Currency button was clicked successfully");
	}

	@And ("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws IOException {
	homePage.chooseEuro();
	logger.info("Euro was chosen as currency successfully");
	}

	@Then ("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
	homePage.currencyEuro();
	logger.info("Currency value changed to Euro Succesfully");
	}
	
	//@ShoppingCart
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws IOException, InterruptedException  {
	homePage.clickOnShoppingCart();
	logger.info("Shopping Cart Clicked Successfully!");
	}
	

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws IOException {
	homePage.successMsgEmptyShoppingCart();
	logger.info("Your shopping Cart is Empty Message Validated Successfully");	
	}
	
	
	
	
	


	
	
	
	
}
