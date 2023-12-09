Feature: Navigating to specific accounts in Accounts Activity

  Background:
    Given the user is logged in
    When user clicks on the Online Banking option
    And user clicks on the Account Summary

    @savings
  Scenario: Savings account redirect
    When the user clicks on Savings link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Savings selected

    @brokerage
  Scenario: Brokerage account redirect
    When the user clicks on Brokerage link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Brokerage selected

     @checking
  Scenario: Checking account redirect
    When the user clicks on Checking link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Checking selected

    @credit
  Scenario: Credit Card account redirect
    When the user clicks on Credit card link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Credit Card selected

    @loan
  Scenario: Loan account redirect
    When the user clicks on Loan link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Loan selected
