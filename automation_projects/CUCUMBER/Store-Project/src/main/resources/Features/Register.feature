Feature: register new user

  Scenario: register for new user is successfully completed
    Given user open the web page
    When the user goes to my account tab
    And the user selects the Register option
    And the user provides the required information
    Then the user should be notified that the account was created
