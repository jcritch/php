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

    @Then("^guest user navigates to Hotels tab$")
    public void guest_user_navigates_to_hotels_tab() throws Exception {
        phpGuestSearch.gotoHotelSearch();
    }

    @And("^guest user enters the Information$")
    public void guest_user_enters_the_information() throws Exception {
      phpGuestSearch.enterHotelInformation();
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