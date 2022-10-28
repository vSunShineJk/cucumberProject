Feature: Google search functionality
  User story: As a user, when I am on the google search page
  I should be able to search whatever I want, and see relevant information

  # @wip #  working in progress --> win
  Scenario: Search functionality result tile verification
    Given user is on Google search page
    When user types apple in the google search box and click enter
    Then user sees apple - Google Search is in the google title

  Scenario: Search functionality result tile verification
    Given user is on Google search page
    When user types "apple" in the google search box and click enter
    Then user sees "apple - Поиск в Google" is in the google title
