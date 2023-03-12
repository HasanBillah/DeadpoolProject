package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	@FindBy(xpath="//span[text()='Shoes']")
	public WebElement txtShoes;
	
	@FindBy(xpath="//span[text()='Pants']")
	public WebElement txtPants;
	
	@FindBy(xpath="//span[text()='Shirts']")
	public WebElement txtShirts;
	
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement brandNike;
	
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement brandAdidas;
	
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement selectUnbranded;
	
	@FindBy(xpath="//span[text()='Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With & without pockets. MADE IN USA']")
	public WebElement selectBigTallCottonTee;

}
