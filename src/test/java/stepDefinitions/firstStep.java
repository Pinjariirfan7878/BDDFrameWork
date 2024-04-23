package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstStep {
	
	@Given("Connect to Data Base")
	public void connect_to_data_base() 
	{
		System.out.println("1111**********************111");
	    System.out.println("Data Base Connected ");
	}
	@Given("lauchBrowser")
	public void lauch_browser() {
		 System.out.println("Browser Launched"); 
	}
	@When("Enter the URL")
	public void enter_the_url() {
		 System.out.println("Entered URL");
	}
	@Then("verify Login Page")
	public void verify_login_page() {
		 System.out.println("Verification of login page is Passed");
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
	System.out.println("user is on login page");
	}
	@Then("Error message is Displayed")
	public void error_message_is_displayed() {
		System.out.println("Error message is Displayed");  
	}
	@When("user login into application with {string} and {string}")
	public void user_login_into_application_with_and(String user, String password) {
	   System.out.println("Username : "+user+" and password : "+password);
	}
	@When("^user login into application with (.+) and (.+) combination$")
	public void user_login_into_application_with_and_combination(String user, String password) {
		System.err.println("Username : "+user+" and password : "+password);
	}
	@When("Fill All details")
	public void fill_all_details(List<String> data) {
	    for(String d : data) {
	    	System.out.println("Data ===> "+d);
	    	System.out.println("First Commint By X");
	    }
	}
}
