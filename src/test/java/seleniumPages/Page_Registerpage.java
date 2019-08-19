package seleniumPages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Page_BasePage;

public class Page_Registerpage extends Page_BasePage{

	//public WebDriver driver;
	
	//By email = By.xpath("//input[@placeholder='Email']");
	//By password = By.xpath("//input[@placeholder='Password']");
	//@Test(groups= {"register"})
	@BeforeTest
	public void LaunchBrowser() throws IOException{
		driver = initializeDriver();	
		driver.get(prop.getProperty("url"));
		Log.error("Registerpage");
	}
	@Test(priority = 1)
	public void OpenPHPURL() {
	
		driver.manage().window().maximize();
		
	}
	@Test(priority = 2)
	public void goToSignUpPage() {
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")).click();
	}
	@Test(priority = 3)
	public void enterFirstName() {
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("fname");
		
		try {
		Assert.assertEquals("fname", driver.findElement(By.xpath("//input[@placeholder='First Name']")).getAttribute("fname"));
		Log.info("The input is correct");
		}catch (Throwable e) {
			Log.info("The input is not correct");
		}
			
	}
	@Test(priority = 4)
	public void enterLastName() {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("lname");
	}
	@Test(priority = 5)
	public void enterMobile() {
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("mobile1");
		
	}
	@Test(priority = 6)
	public void enterEmail() {
		//return driver.findElement(email);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("fl@inmarsat.com");
	}
	@Test(priority = 7)
	public void enterPassword() {
		//return driver.findElement(password);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password1");
	}
	@Test(priority = 8)
	public void confirmPassword() {
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("password1");	
	}
	@Test(priority = 9)
	public void SignUp() {
		WebElement element = driver.findElement(By.cssSelector("section.login:nth-child(3) div.container div.row div.col-md-6.col-md-offset-3.col-sm-6.col-sm-offset-3 div.panel.panel-default div.panel-body div:nth-child(1) form:nth-child(1) div.form-group:nth-child(9) > button.signupbtn.btn_full.btn.btn-action.btn-block.btn-lg"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		
	}
	
	@Test(priority = 10)
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
