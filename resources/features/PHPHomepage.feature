Feature: PHP Homepage

Scenario: Check that the main elements on PHP Homepage are displayed
Given I launch Chrome Browser
When I open PHP Homepage
Then I verify that the page displays search text box
Then I verify that the page displays PHP Search button

Scenario: Check that the user can create an account
Given user launches Browser
When user opens Homepage
Then user navigates to the SignUp page
And user enters the First Name field with "fname"
And user enters the Last Name field with "lname"
And user enters the Mobile Number field with "mobile1"
And user enters the Email field with "fl@inmarsat.com"
And user enters the Password field with "password1"
And user enters the Confirm Password field with "password1"
And user clicks the SignUp button
Then verify account page opens

Scenario: Check that the user can login
Given user launches Chrome
When user opens PHP Landing page
Then user navigates to the Login Page
And user enters the email field with "fl@inmarsat.com"
And user enters the password field with "password1"
And user clicks the Login button
Then verify the user account page opens