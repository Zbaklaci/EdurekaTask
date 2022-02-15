
  Feature: Explore Blogs and back to the home page

    Background: Navigate to url Edureka
      Given the user is on the home page
      When the user enters the valid credentials
      When the user clicks avatar icon
      And the user clicks My Profile in dropDown menu
      And update personal and profesional data
      And the user clicks Save and Continue

      Scenario: Explore the blogs and navigate to the main page
        When the user clicks Blog
        Then the user should be able to go Blog page
        And the user explores to blogs
        And the user should be able to back homepage
        And the user clicks avatar icon
        And the user clicks log out in dropDown menu
        And log out portal


