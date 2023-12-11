Feature: Scenario Outline

  @ScenarioOutline @ui
  Scenario Outline: Login functionality
    Given user is on login page
    And user should enter email <"email">
    And user should enter password <"password">
    And  user clicks the login button
    Examples:
      | "email"   | "password"   |
      | "admin"   | "Admin1234!" |
      | "noAdmin" | "Admin1234!" |
      | "admin"   | "Admin123"   |
      | "test"    | "asdasdas"   |




