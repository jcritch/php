package seleniumPages;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import common.Page_BasePage;


public class Page_Homepage extends Page_BasePage {
	
	public void launchBrowser() throws IOException {
		driver = initializeDriver();	
		driver.get(prop.getProperty("url"));
		Log.error("This is a logging test for Homepage");
	}	
	
	public void openPHPURL() {
		driver.manage().window().maximize();
	}
	
	public void checkSearchBoxIsDisplayed() {
		System.out.println("Search box is displayed");
		
	}
	
	public void checkSearchButtonIsDisplayed() {
		System.out.println("Button is displayed");
		driver.close();
	}
}
