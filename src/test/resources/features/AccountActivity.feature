
Feature: Account Activity
  Account Activity page should have the title Zero – Account activity.
  In the Account drop down default option should be Savings.
  Account drop down should have the following options: Savings, Checking, Loan, Credit Card, Brokerage.
  Transactions table should have column names Date, Description, Deposit,
  Withdrawal.


  Background:
    Given user is logged in and on the home page

  @accountActivity
  Scenario: Navigate to the Account Activity page
    When user clicks on the Online Banking option
    And  user clicks on the Account Activity
    Then user should be on the Account Activity page
    And  user should see "Savings" as a default option on account dropdown
    And  the dropdown should have all the options visible
    And the transactions table should have column names as listed

      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |











