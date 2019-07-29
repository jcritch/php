package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_BasePage {

	//public static WebDriver driver;
	public static Logger Log = LogManager.getLogger(Page_BasePage.class.getName());
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Jennifer Critch\\eclipse-workspace\\PHPTravels\\resources\\phpdata.properties");
		prop.load(fis);
		prop.getProperty("browser");
		//String browsername = prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver",  "C:\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		return driver;
		

	}
}
