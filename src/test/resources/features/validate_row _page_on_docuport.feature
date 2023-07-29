@T20
Feature: Validate row per page for adviser in Docuport
  Scenario: User login as an advisor in Docuport
    Given User is on Docuport login page
    When User enters credential as adviser
    |username| b1g2_advisor@gmail.com|
    |password|Group2                 |
    When User clicks "Leads" button
    Then Validate that Rows Per Page shows by default 10
    And  Change Rows Per Page to 5
    When  User clicks "Users" button
    Then Validate that Rows Per Page shows by default 10
    And  Change Rows Per Page to 5
    Then Validate that after changing it is showing 5



    #  - login as an advisor
    #  - click leads
    #  - Validate that Rows Per Page shows by default 10
    #  - Change Rows Per Page to 5
    #  - Click Users
    #  - Validate that Rows per page shows by default 10
    #  - change rows per page to 5
    #  - validate that after changing it is showing 5