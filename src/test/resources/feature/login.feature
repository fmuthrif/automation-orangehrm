Feature: Login

  Scenario: User can do login
    Given User is in login page
    When User input username
    And User input password
    And User click login
    Then user redirect to dashboard page
  @Test
  Scenario: User can do logout
    Given User is in login page
    When User input username
    And User input password
    And User click login
    Then user redirect to dashboard page
    When User click dropdown account
    And User click logout
    Then User redirected to login page