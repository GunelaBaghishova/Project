Feature: validate left navigate items of docuport for all users

  Background:
    Given User is on Docuport login page

@PR
  Scenario Outline: Docuport Login page Feature
    When user enters "<username>" and "<password>" for credentials for each user
    When user enter login button
    And user should see home page
    Then validate left navigate items of docuport for each user
      | Client          | Advisor         | Supervisor      | Employee        |
      | Home            | Home            | Home            | Home            |
      | Received docs   | Received docs   | Received docs   | Received docs   |
      | My uploads      | My uploads      | My uploads      | My uploads      |
      | Invitations     | Client          | Client          | Client          |
      | 1099 Form       | Invitations     | Users           | Users           |
      | Reconciliations | Users           | Leads           | Bookkeeping     |
      |                 | Leads           | Bookkeeping     | 1099 Form       |
      |                 | Bookkeeping     | 1099 Form       | Reconciliations |
      |                 | 1099 Form       | Reconciliations |                 |
      |                 | Reconciliations |                 |                 |

  Examples:
      | username                  | password |
      | b1g2_client@gmail.com     | Group2   |
      | b1g2_advisor@gmail.com    | Group2   |
      | b1g2_supervisor@gmail.com | Group2   |
      | b1g2_employee@gmail.com   | Group2   |
