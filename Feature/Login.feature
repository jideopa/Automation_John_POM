@Login
Feature: Login

  Scenario: Successful Login

    Given user is on the login page
    When user enter a valid data
    Then user should be login