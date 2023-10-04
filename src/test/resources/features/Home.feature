
Feature: E-commerce app
Background:
Given user is on home page

Scenario: home page title
When user gets the title of the page
Then page title should be "Automation Exercise"

Scenario: Signup/login page link
Then Signuplogin page password link should be displayed

Scenario: Login with correct credentials
Then user land into login page
When user enters username "suriyaece46@gmail.com"
And user enters password "9894455921"
And user clicks on Login button
Then user gets the title of the home page

 