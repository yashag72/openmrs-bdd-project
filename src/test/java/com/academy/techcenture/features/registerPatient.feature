Feature: OpenMRS Login Feature

  Background: Login Background Steps
    Given user is already logged

#  7. On the registration page, very the title and fill out the demographics, contact info, relationships sections
#  8. Once you have filled out the sections, verify once again the patient information is correct before clicking the confirm button.
    @UserRegistration
    Scenario: User Registration
      When user is on register a patient page
      And user enters "<first_name>" in the firstname input
      And user enters "<last_name>" in the lastname input

#      And user verifies all of the information
#      Then user clicks confirm button

