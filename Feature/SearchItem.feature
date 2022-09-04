Feature: Search item
@Search
  Scenario: successful search
    Given user enter valid text on the search box
    Then a search result should appear