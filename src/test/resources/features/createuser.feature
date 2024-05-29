
@CreateUserTest @RegressionTest @UiTest
Feature: User should be able to create user account
  Scenario: user can create an user account
    Given user is on the Automation Store Website
    When user create an account with required information
    Then account created successfully
    And user log out and close the browser