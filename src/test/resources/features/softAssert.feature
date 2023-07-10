Feature: sample feature to demo soft assertion
  @soft
  Scenario: Sample scenario for soft assertion
    Given user is on Docuport login page
    When user enters credentials
      | username | b1g2_client@gmail.com |
      | password | Group2                |
    And user validates choose account pop up is visible
    And user chooses account from drop down
#    And user clicks login "continue" button
##    And user clicks login "home" button
##    And user clicks login "invitations" button