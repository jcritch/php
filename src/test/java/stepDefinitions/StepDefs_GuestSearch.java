package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_GuestSearch;
import seleniumPages.Page_Homepage;

public class StepDefs_GuestSearch {

	Page_GuestSearch phpGuestSearch = new Page_GuestSearch();
	
	@Given("^guest user launches Chrome Browser$")
    public void guest_user_launches_chrome_browser() throws Exception {
        phpGuestSearch.launchBrowser();
    }

    @When("^guest user opens Homepage$")
    public void guest_user_opens_homepage() throws Exception {
        phpGuestSearch.openPHPURL();
    }

    @Then("^guest user navigates to Hotels tab$")
    public void guest_user_navigates_to_hotels_tab() throws Exception {
        phpGuestSearch.gotoHotelSearch();
    }

    @And("^guest user enters the City/Hotel Name field with \"([^\"]*)\"$")
    public void guest_user_enters_the_cityhotel_name_field_with_something(String strArg1) throws Exception {
        phpGuestSearch.enterHotel();
    }

    @And("^guest user selects the choice from the City_Hotel dropdown$")
    public void guest_user_selects_the_choice_from_the_cityhotel_dropdown() throws Exception {
        phpGuestSearch.selectHotel();
    }

    @And("^guest user enters the Check In field with \"([^\"]*)\"$")
    public void guest_user_enters_the_check_in_field_with_something(String strArg1) throws Exception {
        phpGuestSearch.enterCheckIn();
    }

    @And("^guest user enters the Check Out field with \"([^\"]*)\"$")
    public void guest_user_enters_the_check_out_field_with_something(String strArg1) throws Exception {
       phpGuestSearch.enterCheckOut();
    }

    @And("^guest user clicks on the Guest Details field$")
    public void guest_user_clicks_on_the_guest_details_field() throws Exception {
        phpGuestSearch.enterGuests();
    }

    @And("^guest user clicks on the Search button$")
    public void guest_user_clicks_on_the_search_button() throws Exception {
       phpGuestSearch.hotelSearch();

		}

    @Then("^guest user should see the Result page$")
    public void guest_user_should_see_the_result_page() throws Exception {
       phpGuestSearch.hotelResults();
    }
}