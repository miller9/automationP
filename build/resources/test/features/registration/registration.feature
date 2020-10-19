Feature: Accessing registration page

  Scenario: Create an account
    Given user is not registered
    When he writes his email to register
    Then he should have access to the form