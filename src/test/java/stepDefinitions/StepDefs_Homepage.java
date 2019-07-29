package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_Homepage;

public class StepDefs_Homepage {

		Page_Homepage phpHomepage = new Page_Homepage();
		
	    @Given("^I launch Chrome Browser$")
	    public void i_launch_chrome_browser() throws Exception {
	    	phpHomepage.launchBrowser();
	    }

	    @When("^I open PHP Homepage$")
	    public void i_open_php_homepage() throws Exception {
	    	phpHomepage.openPHPURL();
	    }

	    @Then("^I verify that the page displays search text box$")
	    public void i_verify_that_the_page_displays_search_text_box() throws Exception {
	    	phpHomepage.checkSearchBoxIsDisplayed();
	    }

	    @Then("^I verify that the page displays PHP Search button$")
	    public void the_page_displays_php_search_button() throws Exception {
	    	phpHomepage.checkSearchButtonIsDisplayed();
	    }

	}


