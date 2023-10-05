package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	@Given("valid Login url")
	public void valid_login_url() {
	 System.out.println("Login");
	}

	@When("Provided valid {string} and {string}")
	public void provided_valid_ankita_gmail_com_and_anki(String usernm , String password) {
		System.out.println("Enter username and Password " +usernm + " " + password);	
	    
	}
	

	@Then("user should be able to login and see home page")
	public void user_should_be_able_to_login_and_see_home_page() {
		System.out.println("Home Page");
	  
	}

	@And("check more outcomes")
	public void check_more_outcomes() {
	  
	}
}
