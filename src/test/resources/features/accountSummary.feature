Feature: Account Summary Activity

  Background:
    Given user is on home page and clicks to sign in button
    When user enters username "username" and password "password"
    And user clicks login button

    Scenario: Checking the account summary page features
      And user should see "Account Summary" page
      Then Account Summary page should have the following account types
        | Cash Accounts       |
        | Investment Accounts |
        | Credit Accounts     |
        | Loan Accounts       |
      And Credit Accounts Table must have these columns
        | Account     |
        | Credit Card |
        | Balance     |