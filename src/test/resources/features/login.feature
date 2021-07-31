Feature: Online banking login feature

  Background:
    Given user is on home page and clicks to sign in button

  Scenario: Only authorized users should be able to login
    When user enters valid username
    And user enters valid password
    And user clicks login button
    Then user should see account summary page

    Scenario: Non authorized users should see error message
      When user enters invalid username or invalid password
      Then user should see error message

