package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import seleniumPages.Page_Loginpage;


public class StepDefs_Loginpage {

	Page_Loginpage phpLoginPage = new Page_Loginpage();
	
	 @Given("^user launches Chrome$")
	    public void user_launches_chrome() throws Exception {
        phpLoginPage.LaunchBrowser();
    }

    @Then("^user navigates to the Login Page$")
    public void user_navigates_to_the_login_page() throws Exception {
       phpLoginPage.goToLoginPage();
    }

    @And("^user enters (.+) and (.+) Login information$")
    public void user_enters_and_login_information(String email, String password) throws Exception {
    	phpLoginPage.enterEmail().sendKeys(email);
        phpLoginPage.enterPassword().sendKeys(password);
    }
    
    @And("^user clicks the Login button$")
    public void user_clicks_the_login_button() throws Exception {
        phpLoginPage.Login();
    }
    
    @Then("^verify the user account page opens$")
    public void verify_the_user_account_page_opens() throws Exception {
        phpLoginPage.AccountPageOpens();
    }

}