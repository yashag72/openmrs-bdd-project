#9 You will land on the patient details page. Verify top sections like given middle and family name, gender, dob and patient id.
#10. Click on sticky note and enter a random next message and click on check
#11. Verify "Patient is successfully added" tooltip on top right.
#12. Verify sticky note has been created/displayed
#13. Verify diagnoses, vitalis, latest observations, health trend summary, weight graph, appointments, recent visits, family, conditions, attachments, allergies
#14. Verify General Actions section
#15. Go back to home page

Feature: OpenMRS Login Feature

  Background: Login Background Steps
    Given user is already logged in

    Scenario: Verify Patient Details
      When user is on patient detail page
      And user verifies top section
      And user create a sticky note message
      And user verifies all of the visible components
      Then user goes back to home page