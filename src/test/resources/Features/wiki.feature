Feature: Wikipedia Search Functionality and verification

  Scenario: Wikipedia Search Functionality Title Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Википедия" in the wiki title