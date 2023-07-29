#- login as an advisor
#- click on recieved documents
#- validate:
#1. search button is displayed
#2. download button is displayed
#3. Receieved docs is displayed
#- click on my uploads
#- validate
#1. search button is displayed
       #2. download button is displayed
#3. My Uploads is displayed

Feature: Validate received document page in docuport

  @GB
  Scenario Outline:
  Login Docuport page as each user validation buttons
    Given  User login  home page each  "<username>" and "<password>"
    When User click on  received documents each "<username>"
    Then Validate search,download,Received  button is displayed
      | Search        |
      | Download      |
      | Received docs |
    When User clicks on my upload button
    Then User validate search,download,MyUpload is displayed
      | Search    |
      | Download  |
      | My Upload |

    Examples:
      | username                  | password |
      | b1g2_advisor@gmail.com    | Group2   |
      | b1g2_client@gmail.com     | Group2   |
      | b1g2_supervisor@gmail.com | Group2   |
      | b1g2_employee@gmail.com   | Group2   |
