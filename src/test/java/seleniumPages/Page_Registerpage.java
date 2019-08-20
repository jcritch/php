package seleniumPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Page_BasePage;

public class Page_Registerpage extends Page_BasePage{
	
	
	//@Test(groups= {"register"})
	@BeforeTest
	public void LaunchBrowser() throws IOException{
	
		driver = initializeDriver();	
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		//Log.error("Registerpage");
	}
	
	@Test(priority = 1)
	public void goToSignUpPage() {
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")).click();
	}
	@Test(priority = 2)
	public void enterInformation() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Jennifer Critch\\eclipse-workspace\\PHPTravels\\resources\\phpdata.properties");
		prop.load(fis);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(prop.getProperty("mobile"));
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(prop.getProperty("password"));	
				
	}
	@Test(priority = 3)
	public void SignUp() {
		WebElement element = driver.findElement(By.cssSelector("section.login:nth-child(3) div.container div.row div.col-md-6.col-md-offset-3.col-sm-6.col-sm-offset-3 div.panel.panel-default div.panel-body div:nth-child(1) form:nth-child(1) div.form-group:nth-child(9) > button.signupbtn.btn_full.btn.btn-action.btn-block.btn-lg"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		
	}
	
	@Test(priority = 4)
	public void AccountPageOpens() {
		//System.out.println("The account page is open");
		//Assert.assertTrue(driver.findElement(By.xpath("//img[@class='img-responsive go-right img-thumbnail']")).isDisplayed());
		//driver.close();
		
}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
