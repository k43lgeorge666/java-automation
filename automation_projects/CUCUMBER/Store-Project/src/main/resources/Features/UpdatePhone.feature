Feature: Update phone from a user account

  Scenario: Update the phone for a user account is successfully completed
    Given user open the web Page
    When the user login into the web application
    And the user selects the Edit Account option
    And the user write the new phone number
    Then the phone number from the account should be updated