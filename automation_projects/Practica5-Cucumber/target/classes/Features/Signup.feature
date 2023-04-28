Feature: Register new user account

  Scenario: New user account is registered successfully
    Given user open the web page
    When the user goes to the create account tab
    And the user provides the required information
    Then the user should be notified that the account was created
