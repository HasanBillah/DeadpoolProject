package upskill.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.pageActions.EbayHomePageActions;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("Open Ebay Homepage")
	public void open_ebay_homepage() {
	    
	}

	@When("Search for shoes")
	public void search_for_shoes() {
		EbayHomePageActionsObj.typeShoes();
	}
	
	@When("Click on search button")
	public void click_on_search_button() {
		EbayHomePageActionsObj.clickButton();
	    
	}
	
	@When("Search for Pants")
	public void search_for_pants() {
		EbayHomePageActionsObj.typePants();
	}

	@When("Search for shirts")
	public void search_for_shirts() {
		EbayHomePageActionsObj.typeShirts();
	}
	
	@Given("Search for {string}")
	public void search_for(String items) {
		
		EbayHomePageActionsObj.searchItems(items);
	   
	}
	
	
	@Given("Search for Big Tall Cotton Tee")
	public void search_for_big_tall_cotton_tee() {
		EbayHomePageActionsObj.typeBigTallCottonTee();
	}
	
	@When("Mouse Hover to MyEbay Summary")
	public void mouse_hover_to_my_ebay_summary() {
		EbayHomePageActionsObj.mouseHoverMyEbay();
	}

	@Then("Click on Summary")
	public void click_on_summary() {
		EbayHomePageActionsObj.clickSummary(); 
	}

	


}
