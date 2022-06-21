Feature: Application Login
  Background:
    Given Validate the browser
    When Browser is triggered
    Then Check if the browser is started
  @RegTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "Tondi" and password "84344"
    Then Home page is populated
    And Cards displayed are "true"

  @SmokeTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "john" and password "12345"
    Then Home page is populated
    And Cards displayed are "false"

  @SmokeTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "James" and password "bond007"
    Then Home page is populated
    And Cards displayed are "false"

  @SanityTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with following details
      |Jenny| abcd | jenny@abcd.co.za | South Africa | 0123127788 |
    Then Home page is populated
    And Cards displayed are "false"

  @RegTest
  Scenario Outline: Home page default login
    Given User is on landing page
    When User login into application with <username> and password <password>
    Then Home page is populated
    And Cards displayed are "false"

    Examples:
      | username | password |
      | user1 | pass1 |
      | user2 | pass2 |
      | user3 | pass3 |
      | user4 | pass4 |