Feature: OpenMRS Login Feature

  Background: Login Background Steps
    Given user is on login page
    When user clicks on sign in link

  @regression @smoke
  Scenario: Successful login
    When user enters a valid username "admin"
    And user enters a valid password "Admin123"
    And user selects location
    And user clicks on the log in button
    Then user should be logged in successfully

  @regression @smoke
  Scenario: Invalid credentials
    When user enters a valid username "admin"
    And user enters a valid password "admin123"
    And user selects location
    And user clicks on the log in button
    Then user should see an error message "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."
