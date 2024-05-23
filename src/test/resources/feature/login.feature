Feature: Login
  @Test
  Scenario: User can do login
    Given User is in login page
    When User input username
    And User input password
    And User click login
    Then user redirect to dashboard page