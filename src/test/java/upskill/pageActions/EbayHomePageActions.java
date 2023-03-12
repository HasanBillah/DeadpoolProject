package upskill.pageActions;

import org.openqa.selenium.support.PageFactory;

import upskill.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	public EbayHomePageActions() {
		
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}	
		public void typeShoes() {
			EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		}
		
		public void clickButton() {
			EbayHomePageLocatorsObj.btnSearch.click();
		}
		
		public void typePants() {
			EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Pants");
		}
		
		public void typeShirts() {
			EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shirts");
		}
		
		public void searchItems(String items) {
			EbayHomePageLocatorsObj.txtbxSearch.sendKeys(items);
			EbayHomePageLocatorsObj.btnSearch.click();
		}
		
		public void typeBigTallCottonTee() {
			EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
			EbayHomePageLocatorsObj.btnSearch.click();
		}

}
