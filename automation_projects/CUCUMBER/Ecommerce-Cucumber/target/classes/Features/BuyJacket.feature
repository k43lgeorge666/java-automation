Feature: buy a jacket

  Scenario: user buys a jacket successfully
    Given user open the web application
    When the user logs_in in the web page
    And the user goes to the jackets page
    And the user selects a jacket from the page
    And the user perform a checkout for the selected item
    Then the user should be notified that the buy was successful completed
