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

	 @When("^user opens PHP Landing page$")
	    public void user_opens_php_landing_page() throws Exception {
        phpLoginPage.OpenPHPURL();
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
    //@And("^user enters the email field with \"([^\"]*)\"$")
    //public void user_enters_the_email_field_with_something(String strArg1) throws Exception {
        //phpLoginPage.enterEmail(strArg1);
    //}
    
    //@And("^user enters the password field with \"([^\"]*)\"$")
    //public void user_enters_the_password_field_with_something(String strArg1) throws Exception {
        //phpLoginPage.enterPassword(strArg1);
        
    //}

    @And("^user clicks the Login button$")
    public void user_clicks_the_login_button() throws Exception {
        phpLoginPage.Login();
    }
    
    @Then("^verify the user account page opens$")
    public void verify_the_user_account_page_opens() throws Exception {
        phpLoginPage.AccountPageOpens();
    }

}