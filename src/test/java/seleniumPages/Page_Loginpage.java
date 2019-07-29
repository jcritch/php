package seleniumPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Page_BasePage;


@Test
public class Page_Loginpage extends Page_BasePage {
	
	
	public void LaunchBrowser() throws IOException{
		driver = initializeDriver();	
		driver.get(prop.getProperty("url"));
		Log.error("This is a logging test for Loginpage");
	}
	
	public void OpenPHPURL() {
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]")).click();
	}
	
	public void goToLoginPage() {
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]")).click();
	}
	
	public void enterEmail() {
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("fl@inmarsat.com");
	}

	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password1");
	}
	
	public void Login() {
		
		driver.findElement(By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']")).click();
	}
	
	public void AccountPageOpens() {
		System.out.println("The account page is open");
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='img-responsive go-right img-thumbnail']")).isDisplayed());
		driver.close();
		
}
	
}
