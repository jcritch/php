Feature: PHP Guest Search

Scenario: Check that a Guest User can search Hotels
Given guest user launches Chrome Browser
When guest user opens Homepage
Then guest user navigates to Hotels tab
And guest user enters the Information
And guest user clicks on the Search button
Then guest user should see the Result page

Scenario: Check that a Guest User can search Tours
Given guest user launches Chrome Browser
When guest user opens Homepage
Then guest user navigates to Tours tab
And guest user enters the Tour Information 
And guest user clicks on the Search button
Then guest user should see the Result page