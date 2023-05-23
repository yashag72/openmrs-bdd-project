Feature: OpenMRS Login Feature

  Background: Login Background Steps
    Given user is already logged in

#  7. On the registration page, very the title and fill out the demographics, contact info, relationships sections
#  8. Once you have filled out the sections, verify once again the patient information is correct before clicking the confirm button.

    Scenario: User Registration
      When user is on register a patient page
      And user enters all of the required info
      And user verifies all of the information
      Then user clicks confirm button

