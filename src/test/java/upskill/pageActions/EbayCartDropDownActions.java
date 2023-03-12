package upskill.pageActions;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.pageElements.EbayCartDropDownLocators;
import upskill.utilities.SetupDrivers;

public class EbayCartDropDownActions {
	
	EbayCartDropDownLocators EbayCartDropDownLocatorsObj;
	
	public EbayCartDropDownActions() {
		
		EbayCartDropDownLocatorsObj = new EbayCartDropDownLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartDropDownLocatorsObj);
	}
	
	
	
	public void switchNewWindow() { 
//	String firstwindow = SetupDrivers.driver.getWindowHandle();
//	
//	Set <String> all = SetupDrivers.driver.getWindowHandles();
//	for(String secondwindow : all) {
//		if(!secondwindow.equals(firstwindow)) {
//			SetupDrivers.driver.switchTo().window(secondwindow);	
//		}
//	}
	
	
	for(String winhandle: SetupDrivers.driver.getWindowHandles()) {
		SetupDrivers.driver.switchTo().window(winhandle);
	}
	}
	
	
	
	
	public void selectType() throws InterruptedException {	
		Thread.sleep(4000);
		Select type = new Select(EbayCartDropDownLocatorsObj.selectType);
		type.selectByValue("0");	
		Thread.sleep(2000);
	}
	
	public void selectSize() throws InterruptedException {	
		Select size = new Select(EbayCartDropDownLocatorsObj.selectSize);
		size.selectByValue("1");
		Thread.sleep(2000);
	}
	
	public void selectShade() throws InterruptedException {	
		Select shade = new Select(EbayCartDropDownLocatorsObj.selectShade);
		shade.selectByValue("15");
		Thread.sleep(2000);
	}
	
	public void typeQuantity() {
		EbayCartDropDownLocatorsObj.selectQuantity.clear();
		EbayCartDropDownLocatorsObj.selectQuantity.sendKeys("2");	
	}
	
	public void clickAddCart() {
		EbayCartDropDownLocatorsObj.addCart.click();	
	}

}
