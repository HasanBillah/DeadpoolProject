package upskill.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SetupDrivers {
	
public static WebDriver driver;		//   //a[contains(@href,'quote.ashx?t=')]					
	
	public static void setupDriver(){

		WebDriverManager.chromedriver().setup();				
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--start-maximized");	// add arg to maximize browser		
		options.addArguments("--disable-notifications");	// add arg to disable notification
//		options.addArguments("--headless");					// headless execution
		driver = new ChromeDriver(options);					
		driver.get("https://www.ebay.com/");	
		
		
		
			
		
	}
	
	public static WebDriver getDriver(){
		return driver;										
	}
	
	public static void tearDownDriver(){
		driver.close();										
		driver.quit();										
	}

}
