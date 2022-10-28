Feature: Wikipedia Search Functionality and verification

#  Scenario: Wikipedia Search Functionality Title Verification
#    Given user is on Wikipedia home page
#    When user types Steve Jobs in the wiki search box
#    And user clicks wiki search button
#    Then user sees Википедия in the wiki title

  Background:
    Given user is on Wikipedia home page

  Scenario: Wikipedia Search Functionality Title Verification
#    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Википедия" in the wiki title

    @scenarioOutlinePractice
  Scenario Outline: Wikipedia Search Functionality Title Verification
#    Given user is on Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user sees "<expectedTitle>" in the wiki title

    Examples:
    | searchValue    | expectedTitle |
    | Steve Jobs     | Steve Jobs    |
    | Bill Gates     | Bill Gates    |
    | Elon Musk      | Elon Musk     |
    | Chuck Norris   | Chuck Norris  |
