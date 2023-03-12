package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartDropDownLocators {
	
	
	
	
	
	@FindBy(xpath="//select [@selectboxlabel='Size Type']")
	public WebElement selectType;
	
	@FindBy(xpath="(//select[contains(@aria-label,'Please select a Size')])[2]")
	public WebElement selectSize;
	
	
	@FindBy(xpath="//select[@aria-label='Please select a Shade']")
	public WebElement selectShade;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement selectQuantity;
	
	
	@FindBy(xpath="//span[text()='Add to cart']")
	public WebElement addCart;
	

}
