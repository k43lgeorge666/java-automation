Feature: user login

  Scenario: user login successfully
    Given user open the webapp
    When the user goes to Sign In tab
    And the user provides email and password
    Then the user should be logged successfully

