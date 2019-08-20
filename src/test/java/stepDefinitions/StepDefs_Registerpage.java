package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import seleniumPages.Page_Registerpage;


public class StepDefs_Registerpage {

	Page_Registerpage phpRegisterPage = new Page_Registerpage();

	 @Given("^user launches Browser$")
	    public void user_launches_browser() throws Exception {
	        phpRegisterPage.LaunchBrowser();
	    }

	    @Then("^user navigates to the SignUp page$")
	    public void user_navigates_to_the_signup_page() throws Exception {
	       phpRegisterPage.goToSignUpPage();
	    }

	    @And("^user enters the Information$")
	    public void user_enters_the_information() throws Exception {
	        //phpRegisterPage.enterInformation();
	        phpRegisterPage.enterInformation();
	    }

	    @And("^user clicks the SignUp button$")
	    public void user_clicks_the_signup_button() throws Exception {
	        phpRegisterPage.SignUp();
	    }
	    @Then("^verify account page opens$")
	    public void verify_account_page_opens() throws Exception {
	        phpRegisterPage.AccountPageOpens();
	    }
}