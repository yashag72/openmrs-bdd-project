Feature: OpenMRS Login Feature

  Background: Login Background Steps
    Given user is on login page


  @regression
  Scenario: Successful login
    When user familiarise with all of the items on the login webpage
    And user enters a valid username "admin"
    And user enters a valid password "Admin123"
    And user selects location
    And user clicks on the log in button
    And user should be logged in successfully
    Then user should verify all of the items on home page


  Scenario: Invalid credentials
    When user enters a valid username "admin"
    And user enters a valid password "admin123"
    And user selects location
    And user clicks on the log in button
    Then user should see an error message "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."
