Feature: Wikipedia Search Functionality

  #1. User is on Wikipedia home page
  #2. User types Steve Jobs in the wiki search box
  #3. User clicks wiki search button
  #4. User sees Steve Jobs is in the wiki title
@practice
  Scenario Outline: Wikipedia Search Functionality for Steve Jobs;
    Given  User is on Wikipedia home page
    When   User types "<SearchWord>" in the wiki search box
    And    User clicks wiki search button
    Then   User sees "<SearchWord>" is in the wiki "<verificationText>"

  Examples:
  |SearchWord  |verificationText|
  |Steve Jobs |wiki title|
  |Steve Jobs |main header|
  |Steve Jobs |img header|


