
@ui
Feature: Data Table example

  Background: user login
    Given go to login page and login

@table
    Scenario: New user functionality
      Given click add user button
      And fill up the fields with following data
        |      |         |                |  |
        | John | Doe     | john@gmail.com |  |
        | Nick | Lewis   | lews@gmail.com |  |
        | Mike | Jackson | mike@gmail.com |  |

  @table @smoke @ui
Scenario: New user func
  Given click add user button
  And create new user with following data pojo
    | firstname | lastname | email          |  |
    | john      | doe      | john@doe.com   |  |
    | mike      | tyson    | mike@gmail.com |  |
    | elon      | musk     | musk@sd.com    |  |
