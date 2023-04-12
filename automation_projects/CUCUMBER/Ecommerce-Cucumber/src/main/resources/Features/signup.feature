Feature: user sign up

  Scenario: user sign up successfully
    Given user open the web page
    When the user goes to the create account tab
    And the user provides the required information
    Then the user should be notified that the account was created


