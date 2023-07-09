Feature: Create a new client as an adviser
@NC
  Scenario:
    Given  User login as an advisor on Docuport
    And   User create a new client
    Then  Validate that new client created
    Then  Log out as an advisor
    Then  Log as a new client
