
  Feature: Users should be able to login
#Problem statement 1: consider that a candidate who has registered in the edureka portal
  # wants to update all the personal data and professional interests available in the portal.
    # Now the task is to write a selenium script to do the same and also explore the edureka portal.
#Steps:
#Login to Edureka
#Navigate to 'My Profile'
#Update professional and personal data
#Explore the blogs and navigate to the main page
#Portal logout
#    url ="https://www.edureka.co/signin"
    @wip
    Background: Navigate to url Edureka
      Given the user is on the home page
      When the user enters the valid credentials

    Scenario: Login as a user to Edureka
      Then the user should be able to go homepage
      And the title contains "Edureka"
      When the user clicks avatar icon
      And the user clicks "My Profile" in dropDown menu
      And update personal and profesional data
      And the user clicks "Blog"
#      And the user navigates to blogs
      And the user backs to homepage

