package seleniumPages;


import static org.testng.Assert.assertTrue;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Page_BasePage;



public class Page_Homepage extends Page_BasePage {
	
	@Test
	//@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();	
		driver.get(prop.getProperty("url"));
		Log.error("This is a logging test for Homepage");
	}	
	//@Test(groups= {"home"})
	@Test
	public void openPHPURL() {
		driver.manage().window().maximize();
	}
	
	/*public void checkSearchBoxIsDisplayed() {
		System.out.println("Search box is displayed");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]"));
	}*/
	
	@AfterTest
	public void checkSearchButtonIsDisplayed() {
		String bodyText = driver.findElement(By.tagName("blog")).getText();
		Assert.assertTrue(bodyText.contains("blog"));
		Log.error("Blog image is displayed");
		driver.close();
		
	}
}
