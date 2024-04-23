
Feature: Application to login

		Background:
    Given Connect to Data Base 
    And lauchBrowser
    When Enter the URL
    Then verify Login Page

    @SmokeTest
    Scenario: login with invalid creds
    Given user is on login page
    When user login into application with "admid" and "123456"
    Then Error message is Displayed
 
    #reuse code
    @RegressionTest
    Scenario: login with invalid creds for application
    Given user is on login page
    When user login into application with "user" and "654321"
    Then Error message is Displayed
    
    #parameterization
    @SmokeTest
    Scenario Outline: login with invalid creds for application
    Given user is on login page
    When user login into application with <User> and <Password> combination
    Then Error message is Displayed
    
    Examples:
    | User  | Password |
    |Irfan  | 1234567  |
    |Idrish | 12345    |
    
    #Regex expression
    @SmokeTest
    Scenario Outline: login with invalid creds for application
    Given user is on login page
    When user login into application with <User> and <Password> combination
    Then Error message is Displayed
    
    Examples:
    | User  | Password |
    | 1111  | 1234567  |
    | 2222  | 12345    |
    
    #List of Data in Steps
    @MobileTest
    Scenario Outline: login with invalid creds for application
    Given user is on login page
    When Fill All details 
    |Irfan|
    |Pinjari |
    |23|
    |23/09/93|
    Then Error message is Displayed
    
    
    
    
    