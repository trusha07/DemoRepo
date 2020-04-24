package skeleton;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;

import pages.registrationPage;




public class registrationPageDefinition {
	
	
	static WebDriver driver;
	
	

	@Then("^User Enters firstname and lastname as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enters_firstname_and_lastname_as_and(String firstname, String lastname) throws InterruptedException{
	   driver = BaseClass.getDriver();
	   BaseClass.ApplicationSetUp(driver);
	   registrationPage.EnterFirstNameLastName(driver, firstname, lastname);
	}

	@Then("^user Enters Email and new password as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enters_Email_and_new_password_as_and(String email, String newpassword){
		registrationPage.EnterEmailNewPassword(driver, email, newpassword);
	}

	@Then("^user selects birth day month year as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_selects_birth_day_month_year_as_and_and(String bday, String bmonth, String byear){
		registrationPage.EnterBirthDayMonthYear(driver, bday, bmonth, byear);
	}

	@Then("^user selects gender as \"([^\"]*)\"$")
	public void user_selects_gender_as(String gender){
		String genderValue;
		if(gender.equalsIgnoreCase("Female"))
		{
			genderValue = "1";
		}
		
		else if(gender.equalsIgnoreCase("Male"))
		{
			genderValue = "2";
		}
		
		else
		{
			genderValue = "3";
		}
		registrationPage.SelectGender(driver, genderValue);
	}

	@Then("^User Clicks on SignUp button$")
	public void user_Clicks_on_SignUp_button() throws InterruptedException{
		registrationPage.ClickOnSignUp(driver);
	}

	@Then("^User is on Login Page$")
	public void user_is_on_Login_Page(){
	    String pgTitle = driver.getTitle();
	    
	    Assert.assertTrue(pgTitle.contains("Successful"));
	    //BaseClass.CloseBrowserSession(driver);
	}
	
	@After
	public void CloseBrowserSession()
	{
		
		driver.close();
	}
}
