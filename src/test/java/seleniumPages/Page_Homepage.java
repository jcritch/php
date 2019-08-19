package seleniumPages;


import static org.testng.Assert.assertTrue;




import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		Log.error("Homepage");
	}	
	//@Test(groups= {"home"})
	@Test
	public void openPHPURL() {
		driver.manage().window().maximize();
	}
	
	
	@AfterTest
	public void checkHotelLink() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.linkText("Search by Hotel or City Name")))).click();
		String bodyText = driver.findElement(By.linkText("Hotels")).getText();
		Assert.assertTrue(bodyText.contains("Hotels"));
		Log.error("Hotel link is displayed");
		driver.close();
		
	}
}
