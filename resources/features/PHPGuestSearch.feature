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

Scenario: Check that a Guest User can search Tours
Given guest user launches Chrome Browser
When guest user opens Homepage
Then guest user navigates to Tours tab
And guest user enters the City Name field with "New York"
And guest user selects the choice from the City dropdown
And guest user enters the Check In field with "01/10/2019"
And guest user clicks on the Guest Details field 
And guest user clicks on the Select field 
And guest user selects the choice from the Select field 
And guest user clicks on the Search button
Then guest user should see the Result page