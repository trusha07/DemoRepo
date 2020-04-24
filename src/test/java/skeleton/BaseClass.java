package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import utilities.readProperties;


public class BaseClass {

static WebDriver driver;
static readProperties prop  = new readProperties();
	
	
	public static WebDriver getDriver()
	{
		
		
		if(prop.getBrowserName().equals("Chrome"))
		{		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
		}
		
		if(prop.getBrowserName().equals("firefox"))
		{		
				driver = new FirefoxDriver();
		}
		
		return driver;
	}
	
	
	public static void ApplicationSetUp(WebDriver driver) throws InterruptedException
	{
		
		driver.manage().window().maximize();
		driver.get(prop.getApplicationURL());
		Thread.sleep(10000);
		
	}
	
	public static void CloseBrowserSession(WebDriver driver)
	{
		
		driver.quit();
	}

}
