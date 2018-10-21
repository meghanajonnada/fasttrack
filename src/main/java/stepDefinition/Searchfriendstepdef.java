package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import launchbrowser.Launch;
import method.Methods;

public class Searchfriendstepdef extends Launch {
	Methods a =new Methods(driver);
	
	 @When("^user searches for \"(.*)\"$")
	 public void user_searches_for(String arg1)
	 {
		 a =new Methods(driver);
		a.EnterFriend(arg1);
		a.entersearchFriend();
		
	 }
	 @When("^user clicks on friends profile$")
	 public void user_clicks_on_friends_profile() throws InterruptedException
	 {
		
		 a.searchfriendvalidation();
		 a.clickme();
		 }
	 @Then("^user sends him message \"(.*)\"$")
	 public void user_sends_him_message(String arg1)
	 {
	    a.clickmessage();
		a.enterEnterMessage(arg1);
		a.sendmessage();
		
		
	 }
	 
	 
	


}

