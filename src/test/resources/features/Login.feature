
Feature: Login verification



  Scenario: Loginwith pasitive credential
    Given user is on home page
    Then page title should be "Automation Exercise"
    When  user land into login page
    And  Verify "Login to your account" is visible
    And Enter correct email address and password
    |usermail|password|
    |suriyaece46@gmail.com|9894455921|
    Then Verify that "SURIYAPATHY" is visible
    When  click delete account button
    Then verify that account deleted is visible

 