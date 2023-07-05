Feature: Scenario outline practice

  Scenario Outline: Google search for capital cities
    Given user is on Google search page
    When user searches for the "<country>"
    Then user should see the "<capital>" in the result
    Examples:
    |country|capital|
    |Azerbaijan|Baku|
    |Ukraine   |Kyiv|
    |Afghanistan|Kabul|
    |USA        |Washington|
    |Turkey     |Ankara|


#scenario is using data table, and scenario outline is using Examples, scenario outline will run all steps as many times as we have examples, scenario will run ones, but step that has table will run as many times as we have options in table