Feature: Update user information

  Background: Navigate to url Edureka
    Given the user is on the home page
    When the user enters the valid credentials

    @smoke
    Scenario: User updates to existing info
      When the user clicks avatar icon
      And the user clicks My Profile in dropDown menu
      And update personal and profesional data
      And the user clicks Save and Continue
      Then verify that name is updated to "Kate"
      And verify that experience is updated to year
      And verify that Designation is updated to "SDET"

