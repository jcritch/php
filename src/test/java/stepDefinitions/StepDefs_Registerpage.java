package stepDefinitions;

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

    @When("^user opens Homepage$")
    public void user_opens_homepage() throws Exception {
        phpRegisterPage.OpenPHPURL();
    }

    @Then("^user navigates to the SignUp page$")
    public void user_navigates_to_the_signup_page() throws Exception {
        phpRegisterPage.goToSignUpPage();
    }

    
    @And("^user enters the First Name field with \"([^\"]*)\"$")
    public void user_enters_the_first_name_field_with_something(String strArg1) throws Exception {
        phpRegisterPage.enterFirstName();
    }

    @And("^user enters the Last Name field with \"([^\"]*)\"$")
    public void user_enters_the_last_name_field_with_something(String strArg1) throws Exception {
        phpRegisterPage.enterLastName();
    }

    @And("^user enters the Mobile Number field with \"([^\"]*)\"$")
    public void user_enters_the_mobile_number_field_with_something(String strArg1) throws Exception {
        phpRegisterPage.enterMobile();
    }

    @And("^user enters the Email field with \"([^\"]*)\"$")
    public void user_enters_the_email_field_with_something(String strArg1) throws Exception {
       phpRegisterPage.enterEmail();
    }

    @And("^user enters the Password field with \"([^\"]*)\"$")
    public void user_enters_the_password_field_with_something(String strArg1) throws Exception {
       phpRegisterPage.enterPassword();
    }

    @And("^user enters the Confirm Password field with \"([^\"]*)\"$")
    public void user_enters_the_confirm_password_field_with_something(String strArg1) throws Exception {
        phpRegisterPage.confirmPassword();
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