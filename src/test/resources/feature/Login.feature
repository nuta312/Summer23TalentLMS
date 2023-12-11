@ui
Feature: Login


@smoke
  Scenario: Login with valid credentials
    Given user is on login page
    And user should enter username or email
    And user should enter password
    When user clicks the login button
    Then user should successfully login

  @smoke
  Scenario: Login with valid username and invalid password
    Given user is on login page
    And user should enter valid username or email
    And user should enter invalid password
    When user clicks the login button
    Then user cant login


