@accountSummary
Feature: AccountSummary Feature
  Account summary page should have the title Zero – Account summary. Account
  summary page should have to following account types: Cash Accounts,
  Investment Accounts, Credit Accounts, Loan Accounts.
  Credit Accounts table must have columns Account, Credit Card and Balance.




  Background:
    Given user is on the login page
    When user enters username and password
    And user clicks on sign in button
    When user is on the home page


  Scenario: Navigate to the Account summary page
    When user clicks on the Online Banking option
    And  user clicks on the Account Summary
    When user is on the Account Summary page
    Then user should see the following list of Accounts

      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

    And user should see the following columns under the Credit Accounts

      | Account     |
      | Credit Card |
      | Balance     |










