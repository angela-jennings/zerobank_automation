Feature: Online banking login feature

  Scenario: Only authorized users should be able to login
    Given user is on home page and clicks to sign in button
    When user enters username "username" and password "password"
    And user clicks login button
    Then user should see "Account Summary" page

  Scenario: Non authorized users should see error message
    Given user is on home page and clicks to sign in button
    When user enters username "wrongUsername" and password "wrongPassword"
    And user clicks login button
    Then user should see "Login and/or password are wrong." error message

  Scenario: Username and password field cannot be empty
    Given user is on home page and clicks to sign in button
    When user enters username "" and password ""
    And user clicks login button
    Then user should see "Login and/or password are wrong." error message

