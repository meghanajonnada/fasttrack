package stepDefinition;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import launchbrowser.Launch;
import method.Methods;

public class Launchstepdef extends Launch
{
	Methods a =new Methods(driver);
	@Given("^user opens \"(.*)\" user types \"(.*)\"$")
	public void user_opens_Facebook(String arg1,String arg2)
	{
		launch1(arg1,arg2);
				
			}
	@When("^user enters \"(.*)\" and \"(.*)\"$")
	
public void user_enters_credentials(String arg1, String arg2)
	{
		 a =new Methods(driver);
		//a.clearEmailTextBox();
		a.enterTextEmailTextBox(arg1);
		//a.clearpasswordTextBox();
		a.enterTextpasswordTextBox(arg2);
		a.loginpagevalidation();
		
	}
	@When("^user clicks on login$")
	public void user_clicks_on_login()
	{
	
	a.loginvalidation();
	a.clicksignin();
	}
	@When("^is on facebook home page$")
	public void user_is_on_home_page()
	{
		a.homepagevalidation();
	}
	
	

}
