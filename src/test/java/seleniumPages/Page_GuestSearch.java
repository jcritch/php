package seleniumPages;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.Page_BasePage;

//@Test(groups= {"search"})
public class Page_GuestSearch extends Page_BasePage {
	
	@Test
	public void launchBrowser() throws IOException {
		driver = initializeDriver();	
		driver.get(prop.getProperty("url"));
		Log.error("This is a logging test for Searchpage");
	}	
	@Test
	public void openPHPURL() {
		driver.manage().window().maximize();
	}
	@Test
	public void gotoHotelSearch() {
		driver.findElement(By.xpath("//li[@class='active text-center']//a[@class='text-center']")).click();
		
	}
	@Test
	public void enterHotel() {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.linkText("Search by Hotel or City Name")))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.linkText("Search by Hotel or City Name")))).sendKeys("New York");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']//ul[@class='select2-results']")))).isSelected();
		driver.close();
		
	}
}
