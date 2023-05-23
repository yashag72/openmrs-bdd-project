#16. Click on Find Patient Record tab
#17. Verify title, and top elements on the find patient record page
#18. Search the newly created patient by its ID
#19. Verify the result shows up on the table, verify identifier information, name, gender, age and birthdate.
#20. Go back to home page

Feature: OpenMRS Login Feature

  Background: Login Background Steps
    Given user is already logged in


  Scenario: Search for Patient Record
    When user is on home page
    And user clicks on Find Patient Record tab
    And user searches patient by its ID
    And user verifies found information
    Then user goes back to home page