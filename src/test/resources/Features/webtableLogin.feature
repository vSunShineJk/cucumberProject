Feature: User should be able to login with valid credentials

  Background:
    Given user is on the login page of web table app
    Then user should see url contains order

  Scenario: Login scenario with one param
    #Given user is on the login page of web table app
    When user enters user name "Test"
    And user enters password "Tester"
    And user clicks to login button
#    Then user should see url contains order

  Scenario Outline: Login scenario with 2 param
    #Given user is on the login page of web table app
    When user enters user name "<Test>"
    And user enters password "<Tester>"
    And user clicks to login button
#    Then user should see url contains order
    Examples:
    | Test     | Tester     |
    | Test     | Tester     |

  @webTableApp
  Scenario: Login scenario with data table
    #Given user is on the login page of web table app
    When user enters below credentials
      | username | Test   |
      | password | Tester |
#    Then user should see url contains orders