Feature: Login into the application

  Scenario: Successfully login
    Given user has an active account
    When he sends his valid credentials
    Then he should have access to manage his account