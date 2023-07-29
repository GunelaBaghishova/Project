@LN
Feature: Validate received document page in docuport

  Background:
    Given  User login  home page on Docuport

  Scenario Outline:
  Login Docuport page as each user validation buttons
    When  User enters credential each  "<username>" and "<password>"
    And User click on  "Received docs" item
    Then Validate "Search" button is displayed
    Then Validate "Download" button is displayed
    Then Validate "Received docs" header is displayed
    When User clicks on "My uploads" item
    Then Validate "Search" button is displayed
    Then Validate "Download" button is displayed
    Then Validate "My uploads" header is displayed
    When User clicks on "1099 Form" item
    Then Validate "1099 Form" header is displayed
    When User clicks on "Reconciliations" item
    Then Validate "Reconciliations" header is displayed

    Examples:
      | username                  | password |
      | b1g2_advisor@gmail.com    | Group2   |
      | b1g2_client@gmail.com     | Group2   |
      | b1g2_supervisor@gmail.com | Group2   |
      | b1g2_employee@gmail.com   | Group2   |
