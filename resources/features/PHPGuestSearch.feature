Feature: PHP Guest Search

Scenario: Check that a Guest User can search Hotels
Given guest user launches Chrome Browser
When guest user opens Homepage
Then guest user navigates to Hotels tab
And guest user enters the City/Hotel Name field with "New York"
And guest user selects the choice from the City_Hotel dropdown
And guest user enters the Check In field with "01/10/2019"
And guest user enters the Check Out field with "07/10/2019"
And guest user clicks on the Guest Details field 
And guest user clicks on the Search button
Then guest user should see the Result page
