Feature: Application login
  @SmokeTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "john" and password "12345"
    Then Home page is populated
    And Cards displayed are "false"