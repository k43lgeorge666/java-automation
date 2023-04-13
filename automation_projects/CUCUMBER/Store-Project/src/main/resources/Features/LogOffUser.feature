Feature: Logout a user account

  Scenario: Logout for a user account is successfully completed
    Given user open the webapp
    When the user login in the web application
    And the user selects the Logout option
    Then the user should be logout successfully