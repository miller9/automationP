Feature: Failed login into the application

  Scenario: Failed login
    Given user hasn't an active account
    When he sends his credentials
    Then he should not have access to the platform