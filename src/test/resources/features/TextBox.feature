Feature: Profile Settings Textbox

  Agile Story:As a user, I should be able to change profile info settings under the Profile module
  Scenario: Positive login scenario
    Given  User is on textbox home page
    When user enter "username"
    And user write enter "email"
    And user  enters "currentAdress"
    Then user click to summit button