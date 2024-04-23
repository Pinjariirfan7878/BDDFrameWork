Feature: Application to login

		Background:
    And lauchBrowser
    When Enter the URL
    Then verify Login Page

    @SmokeTest @AdminDB
    Scenario: login with invalid creds
    Given user is on login page
    When user login into application with "admid" and "123456"
    Then Error message is Displayed
 
    @RegressionTest @NoramalDB
    Scenario: login with invalid creds for application
    Given user is on login page
    When user login into application with "user" and "654321"
    Then Error message is Displayed