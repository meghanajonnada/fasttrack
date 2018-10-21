package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import launchbrowser.Launch;
import method.Methods;

public class Iconsstepdef extends Launch {
	Methods a =new Methods(driver);
	


@When("^user clicks on home$")
public void user_clicks_on_home()
{
	 a =new Methods(driver);
	a.clickhome();
}
@When("^user clicks on settings$")
public void user_clicks_on_settings() throws InterruptedException
{
	a.clicksettings();
} 
@Then("^user clicks on logout$")
public void user_clicks_on_logout() throws InterruptedException {
	a.clicksettings();
	a.clickLogout();
}
@When("^user selects Activitylog$")
public void user_selects_activity_log() throws InterruptedException
{
	a.clickactivitylog();
}
@Then("^user must view Activity log page$")
public void user_must_view_activitylog() {
	a.Activitylogvalidation();
}
}
