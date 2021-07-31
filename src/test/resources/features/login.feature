Feature: Online banking login feature

  Scenario: Only authorized users should be able to login
    Given user is on home page and clicks to sign in button
    When user enters valid username
    And user enters valid password
    And user clicks login button
    Then user should see account summary page

    Scenario: Non authorized users should see error message
      Given user is on home page and clicks to sign in button
      When user enters invalid username or invalid password
      Then user should see error message

