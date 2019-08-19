package seleniumPages;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		Log.error("Searchpage");
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
		
	}
	@Test
	public void selectHotel() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']//ul[@class='select2-results']"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select2-search']/input[@class='select2-input select2-focused']"))).sendKeys(Keys.ARROW_DOWN);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select2-search']/input[@class='select2-input select2-focused']"))).sendKeys(Keys.ENTER, Keys.TAB);	
	}
	
	@Test
	public void enterCheckIn() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")))).sendKeys("01/10/2019");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")))).sendKeys(Keys.TAB);
	}
	@Test
	public void enterCheckOut() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@placeholder='Check out']")))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@placeholder='Check out']")))).sendKeys("10/10/2019");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@placeholder='Check out']")))).sendKeys(Keys.TAB);
	}
	
	@Test
	public void enterGuests() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='htravellersInput']")))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='htravellersInput']")))).sendKeys(Keys.TAB);	
	}
	
	@Test
	public void hotelSearch() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable((By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")))).click();
	}
	
	@Test
	public void hotelResults() {
		//String actualText = "Property Location A stay at Row NYC places you in";
		//Assert.assertEquals(actualText, driver.findElement(By.xpath("//p[contains(text(),'Property Location A stay at Row NYC places you in')]")));
		
		Assert.assertTrue(driver.getPageSource().contains("Property Location A stay at Row NYC places"));
		
		boolean Error = driver.getPageSource().contains("Property Location A stay at Row NYC places");
	    if (Error == true)
	    {
	     Log.error("Row NYC Hotel is not available");
	    }
	    else
	    {
	     Log.error("Row NYC Hotel is available");
	    }
	
	
}
}
