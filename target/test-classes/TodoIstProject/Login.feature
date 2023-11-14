Feature: Login on todoist
  Scenario: User logins on the main page
    Given User is on the main page
    When User types "Username" and "Password"
    Then User lands on the start page
