package upskill.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.pageActions.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Then("Item list should have only shoes related products")
	public void item_list_should_have_only_shoes_related_products() {
		
		EbaySearchResultActionsObj.verifyShoes();
	   
	}
	
	@Then("Item list should have only pants related products")
	public void item_list_should_have_only_pants_related_products() {
		EbaySearchResultActionsObj.verifyPants();
	}
	
	@Then("Item list should have only shirts related products")
	public void item_list_should_have_only_shirts_related_products() {
		EbaySearchResultActionsObj.verifyShirts();
	}
	
	@When("Filter by {string}")
	public void filter_by(String brand) {
		EbaySearchResultActionsObj.filterBrand(brand);
		
	   
	}
	
	@Then("Item list should have products of {string}")
	public void item_list_should_have_products_of(String brand) {
		EbaySearchResultActionsObj.verifyBrandItems(brand);
	}
	
	@When("Select the first shirt on item list")
	public void select_the_first_shirt_on_item_list() throws InterruptedException {
		EbaySearchResultActionsObj.clickBigTallCottonTee();
	}

}
