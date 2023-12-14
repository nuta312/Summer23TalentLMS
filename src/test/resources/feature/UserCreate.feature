Feature: User create

  Background: Login
#    Given user is on login page
#    And user should enter username or email
#    And user name should enter password
#    When user clicks the login button
#    Then user should successfully login     ли

  Given go to login page and login

    @params @ui
    Scenario: Create new user
      Given click add user button
      And enter firstname "Aibike"
      And enter lastname "Imanbaeva"
      And enter email "123@123.com"
      And enter bio 123456

  @params @ui
  Scenario: Create new user
    Given click add user button
    And enter firstname "Aida"
    And enter lastname "sadyrkulova"
    And enter email "aida@123.com"
    And enter bio 455612

  @params @ui
  Scenario: Create new user
    Given click add user button
    And enter firstname "Adil"
    And enter lastname "Emilbekov"
    And enter email "adil@123.com"
    And enter bio 784512