Feature: Search by keyword

  Scenario: Searching for a term
    Given Roger is on the store
    When he searches for "t-shirts"
    Then all the result titles should contain the word "t-shirts"