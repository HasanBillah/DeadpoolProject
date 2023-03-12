package upskill.pageActions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions() {
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoes() {
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
	}
	
	public void verifyPants() {
		EbaySearchResultLocatorsObj.txtPants.isDisplayed();
	}
	
	public void verifyShirts() {
		EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
	}
	
	public void clickNike() {
		EbaySearchResultLocatorsObj.brandNike.click();
	}
	
	public void clickAdidas() {
		EbaySearchResultLocatorsObj.brandAdidas.click();
	}
	
	public void clickUnbranded() {
		EbaySearchResultLocatorsObj.selectUnbranded.click();
	}
	
	public void filterBrand(String brand) {
		if(brand.equals("Adidas")) {
		EbaySearchResultLocatorsObj.brandAdidas.click();
		}
		
		else if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.brandNike.click();
		}
		
		else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.selectUnbranded.click();
		}
		
		else {
			System.out.println("Brand not found");
		}
		
		
	}
	
	public void verifyBrandItems(String brand) {
		
		    if(brand.equals("Adidas")) {
		    	Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());		
			}
			
			else if(brand.equals("Nike")){
				Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());	
			
			}
			
			else if(brand.equals("Unbranded")){
				Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
			}
			
			else {
				System.out.println("Brand not found");
			}
		
	}
	
	
	public void clickBigTallCottonTee() throws InterruptedException {
		Thread.sleep(4000);
		EbaySearchResultLocatorsObj.selectBigTallCottonTee.click();
		Thread.sleep(3000);
	}

}
