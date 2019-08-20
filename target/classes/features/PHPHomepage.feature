Feature: PHP Homepage

Scenario: Check that the main elements on PHP Homepage are displayed
Given I launch Chrome Browser
When I open PHP Homepage
Then I verify that the Hotels link is displayed

Scenario: Check that the user can create an account
Given user launches Browser
When user opens Homepage
Then user navigates to the SignUp page
And user enters the Information
And user clicks the SignUp button
Then verify account page opens

Scenario Outline: Check that the user can login
Given user launches Chrome
When user opens PHP Landing page
Then user navigates to the Login Page
And user enters <email> and <password> Login information 
And user clicks the Login button
Then verify the user account page opens

Examples:
|email				|password	|
|fl@inmarsat.com	|password1	|




