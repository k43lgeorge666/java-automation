Feature: Login a user account

  Scenario: Login for a user account is successfully completed
    Given user open the web application
    When the user selects My Account tab option
    And the user selects the Login option
    And the user provides email and password
    Then the user should be logged successfully
