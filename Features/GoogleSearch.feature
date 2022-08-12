Feature: feature to perform google search

  Scenario: Validate google search functionality
    Given User is on google search page
    When User enters text in search bar
    And User clicks search button
    Then User navigates to search result page

    
    