Feature: User create

  Background: Login
    Given go to login page and login

    @params @ui
    Scenario: Create new user
      Given click and user button
      And enter firstname "Adil"
      And enter lastname "Emilbekov"
      And enter email "adika12@gmail.com"
      And enter bio 123456

  @params @ui
  Scenario: Create new user
    Given click and user button
    And enter firstname "Mike"
    And enter lastname "Tyson"
    And enter email "iron_mike@gmail.com"
    And enter bio 34214

  @params @ui
  Scenario: Create new user
    Given click and user button
    And enter firstname "John"
    And enter lastname "Snow"
    And enter email "white_wolf@gmail.com"
    And enter bio 53256

