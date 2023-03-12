package upskill.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.pageActions.EbayCartDropDownActions;

public class EbayCartSteps {
	
	EbayCartDropDownActions EbayCartDropDownActionsObj = new EbayCartDropDownActions();

	
	@When("Select Size")
	public void select_size() throws InterruptedException {
		EbayCartDropDownActionsObj.switchNewWindow();
		EbayCartDropDownActionsObj.selectType();
	   
	}

	@When("Select Men Size")
	public void select_men_size() throws InterruptedException {
		EbayCartDropDownActionsObj.selectSize();
	}

	@When("Select Shade")
	public void select_shade() throws InterruptedException {
		EbayCartDropDownActionsObj.selectShade();
	}

	@When("Select Quantity")
	public void select_quantity() {
		EbayCartDropDownActionsObj.typeQuantity();
	}

	@Then("Add to shopping cart")
	public void add_to_shopping_cart() {
		EbayCartDropDownActionsObj.clickAddCart();
	}

	
	
}
