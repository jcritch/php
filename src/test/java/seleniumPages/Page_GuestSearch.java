package seleniumPages;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Page_BasePage;

//@Test(groups= {"search"})
public class Page_GuestSearch extends Page_BasePage {
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		
		driver = initializeDriver();	
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		//Log.error("Searchpage");
	}	
	
	@Test(priority = 1)
	public void gotoHotelSearch() {
		driver.findElement(By.xpath("//li[@class='active text-center']//a[@class='text-center']")).click();
		
	}
	@Test(priority = 2)
	public void enterHotelInformation() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Jennifer Critch\\eclipse-workspace\\PHPTravels\\resources\\phpdata.properties");
		prop.load(fis);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable((By.linkText("Search by Hotel or City Name")))).click();
		wait.until(ExpectedConditions.elementToBeClickable((By.linkText("Search by Hotel or City Name")))).sendKeys(prop.getProperty("city"));
		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']//ul[@class='select2-results']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select2-search']/input[@class='select2-input select2-focused']"))).sendKeys(Keys.ARROW_DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select2-search']/input[@class='select2-input select2-focused']"))).sendKeys(Keys.ENTER, Keys.TAB);	
		
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")))).click();
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")))).sendKeys(prop.getProperty("checkin"));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")))).sendKeys(Keys.TAB);
		
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@placeholder='Check out']")))).click();
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@placeholder='Check out']")))).sendKeys(prop.getProperty("checkout"));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@placeholder='Check out']")))).sendKeys(Keys.TAB);
		
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='htravellersInput']")))).click();
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='htravellersInput']")))).sendKeys(Keys.TAB);	
	}
	
	@Test(priority = 3)
	public void hotelSearch() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")))).click();
	}
	
	@Test(priority = 4)
	public void hotelResults() {
		
	
}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
