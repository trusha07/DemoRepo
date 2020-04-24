package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class DriverSelection {

	private static WebDriver driver;

	public  static WebDriver getBrowser(String key)
	{
		switch(key)
		{
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", "D:\\VaidehiEclipse\\chromedriver.exe");
			driver=new ChromeDriver();
			return driver;
		case "ie"    :

			driver=new InternetExplorerDriver();
			return driver;
		default    :
			throw new UnsupportedOperationException("Invalid Key  "+ key);



		}


	}




}