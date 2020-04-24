package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readProperties {

	Properties prop;
	public readProperties()
	{
		try {
			File src = new File("./Configuration/config.property");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public String getApplicationURL()
	{
		
		String appliURL = prop.getProperty("appURL");
		return appliURL;
	}
	
		public String getBrowserName()
	{
		
		String testBrowser = prop.getProperty("browser");
		return testBrowser;
	}
}
