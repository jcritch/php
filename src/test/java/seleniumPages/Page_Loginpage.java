package seleniumPages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import common.Page_BasePage;


//@Test(groups= {"login"})
public class Page_Loginpage extends Page_BasePage {
	@FindBy (xpath="//h3[@class='RTL']")
	private WebElement AccountName;
	//@Test
	public WebDriver driver;
	
	By email = By.xpath("//input[@placeholder='Email']");
	By password = By.xpath("//input[@placeholder='Password']");
	
	@BeforeTest
	public void LaunchBrowser() throws IOException{
		driver = initializeDriver();	
		driver.get(prop.getProperty("url"));
		Log.error("Loginpage");
	}
	@Test(priority = 1)
	public void OpenPHPURL() {
	
		driver.manage().window().maximize();
		
	}
	@Test(priority = 2)
	public void goToLoginPage() {
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]")).click();
	}
	@Test(priority = 3)
	public WebElement enterEmail() {
		
		return driver.findElement(email);
		
		}

	@Test(priority = 4)
	public WebElement enterPassword() {
		return driver.findElement(password);
		
		
	}
	
	@Test(priority = 5)
	public void Login() {
		
		WebElement element = driver.findElement(By.cssSelector("div:nth-child(6) div:nth-child(2) div.col-md-4.col-md-offset-4.col-sm-6.col-sm-offset-3 form:nth-child(1) > button.btn.btn-action.btn-lg.btn-block.loginbtn:nth-child(3)"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		
	}
	@Test(priority = 6)
	public void AccountPageOpens() {
		//new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(AccountName));
		
		//if (AccountName.getText().contains("lname")) {
			//Log.info("Account successfully created");
		//}
		//driver.close();
}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
