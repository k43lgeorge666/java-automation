Feature: Login User account

  Scenario: user is able to login successfully
    Given user open the web application
    When the user goes to the Sign_In option
    And the user provides the credentials
    Then the user account is logged successfully
