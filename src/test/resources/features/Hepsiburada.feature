Feature: Hepsiburada search functionality and verifications

Scenario: Hepsiburada Search Functionality Title Verification

    Given User is on Hepsiburada home page
    When User type "ıphone13" in the wiki search box
    And User clicks search
    And  User clicks hepsi search button
    Then User see "ıphone13" is in the wiki title