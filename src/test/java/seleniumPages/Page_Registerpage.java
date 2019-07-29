package seleniumPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.Page_BasePage;

public class Page_Registerpage extends Page_BasePage{

	public void LaunchBrowser() throws IOException{
		driver = initializeDriver();	
		driver.get(prop.getProperty("url"));
		Log.error("This is a logging test for Registerpage");
	}
	
	public void OpenPHPURL() {
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")).click();
	}
	
	public void goToSignUpPage() {
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")).click();
	}
	
	public void enterFirstName() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("fname");
	}
	
	public void enterLastName() {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("lname");
	}
	
	public void enterMobile() {
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("mobile1");
		
	}
	public void enterEmail() {
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("fl@inmarsat.com");
	}
	
	public void enterPassword() {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password1");
	}
	
	public void confirmPassword() {
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("password1");	
	}
	
	public void SignUp() {
		WebElement element = driver.findElement(By.cssSelector("section.login:nth-child(3) div.container div.row div.col-md-6.col-md-offset-3.col-sm-6.col-sm-offset-3 div.panel.panel-default div.panel-body div:nth-child(1) form:nth-child(1) div.form-group:nth-child(9) > button.signupbtn.btn_full.btn.btn-action.btn-block.btn-lg"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		
	}
	
	
	public void AccountPageOpens() {
		System.out.println("The account page is open");
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='img-responsive go-right img-thumbnail']")).isDisplayed());
		driver.close();
		
}
}
