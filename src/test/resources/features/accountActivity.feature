Feature: Account activity functionality
Background:
  Given user is on home page and clicks to sign in button
  When user enters username "username" and password "password"
  And user clicks login button

Scenario: Account activity features
  And the user navigates to "Account Activity" tab
  Then user should see "Account Activity" page
