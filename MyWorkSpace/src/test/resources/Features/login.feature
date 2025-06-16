Feature: Feature to test login page

  Scenario: Check login is successful
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page
