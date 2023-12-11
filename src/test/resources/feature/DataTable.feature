@ui
Feature: Data Table example

  Background: user login
    Given go to login page and login


    Scenario: New user functionality
      Given click and user button
      And create new user with folliwing data
        | John  | Doe     | john@gmail.com  |
        | Nick  | Fury    | nick@gmail.com  |
        | Micke | Jackson | micke@gmail.com |

  @table @smoke @ui
Scenario: New user func
  Given click and user button
  And create new user with folliwing data pojo
    | firstname | lastname | email          |
    | john      | snow     | snow@gmail.com |
    | mike      | tyson    | mike@gmail.com |
    | elon      | musk     | elon@gmail.com |


