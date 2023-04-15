package upskill.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {

	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement btnSearch;
	
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement myEbayButton;
	
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement summaryButton; 
}
