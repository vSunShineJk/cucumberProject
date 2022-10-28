Feature: User should be able to login with valid credentials

  Scenario: Login scenario with one param
    Given user is on the login page of web table app
    When user enters user name "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains order

  @webTableApp
  Scenario Outline: Login scenario with one param
    Given user is on the login page of web table app
    When user enters user name "<Test>"
    And user enters password "<Tester>"
    And user clicks to login button
    Then user should see url contains order
    Examples:
    | Test     | Tester     |
    |
