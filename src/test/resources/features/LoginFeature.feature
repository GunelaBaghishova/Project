Feature: Docuport Login Logout Features

  Background: Will run for each scenario first
    Given user is on Docuport login page


 @regression @smoke
  Scenario: Login as a client
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then user should see the home page for client

@smoke
  Scenario: Login as a employee
    When user enters username for employee
    And user enters password for employee
    And user clicks login button
    Then user should see the home page for employee

  @smoke
  Scenario: Login as a advisor
    When user enters username for advisor
    And user enters password for advisor
    And user clicks login button
    Then user should see the home page for advisor


  Scenario: Login as an admin
    When user enters username for admin
    And user enters password for admin
    And user clicks login button
    Then user should see the home page for admin

