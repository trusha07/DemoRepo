package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registrationPage {

	static WebDriver driver;
	static By fName = By.name("firstname");
	static By lName = By.name("lastname");
	static By email = By.name("reg_email__");
	static By newPassword = By.name("reg_passwd__");
	static By dd = By.name("birthday_day");
	static By mm = By.name("birthday_month");
	static By yy = By.name("birthday_year");
	static By gender = By.name("sex");
	static By signUpBtn = By.name("websubmit");
	
	
	public registrationPage(WebDriver driver)
	{
		
		registrationPage.driver = driver;
		System.out.println("Inside constructor - " + driver);
	}
	
	public static void EnterFirstNameLastName(WebDriver driver, String userFName, String userLName) 
	{
		driver.findElement(fName).sendKeys(userFName);
		driver.findElement(lName).sendKeys(userLName);
	}
	
	public static void EnterEmailNewPassword(WebDriver driver, String emailId, String newPass) 
	{
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(newPassword).sendKeys(newPass);
	}
	
	public static void EnterBirthDayMonthYear(WebDriver driver, String dayValue, String monthValue, String yearValue) 
	{
		Select bDay = new Select(driver.findElement(dd));
		bDay.selectByValue(dayValue);
		
		Select bMonth = new Select(driver.findElement(mm));
		bMonth.selectByValue(monthValue);
		
		Select bYear = new Select(driver.findElement(yy));
		bYear.selectByValue(yearValue);
	}
	
	public static void SelectGender(WebDriver driver, String userGenderValue)// passing 2 
	{
		List<WebElement> gndr = driver.findElements(gender);
		//gndr.size = 3 --------- 3 radio buttons. Index starts from 0
		for(int i = 0; i<gndr.size();i++)
		{
			WebElement uGender = gndr.get(i);
			String genderValue = uGender.getAttribute("value"); //2
			if(genderValue.equals(userGenderValue))
			{
				uGender.click();
				break;
			}
		}
		
	}
	
	public static void ClickOnSignUp(WebDriver driver) throws InterruptedException 
	{
		driver.findElement(signUpBtn).click();
		Thread.sleep(3000);
	}
}
