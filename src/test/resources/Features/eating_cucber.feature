Feature: Eating too many cucumber may not be good for you
  user story: Eating too much of any thing may not be good for you

  @smoke
  Scenario: Eating a few is not a problem
    Given John is hungry
    When he eats some cucumber
    Then he will be full
