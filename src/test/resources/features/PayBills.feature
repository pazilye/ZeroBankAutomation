@positiveScen
Feature: Pay Bills Function
  As a user I should be able to fill out the inputs and see the successful message

  when user tries to make a payment without entering the amount or date,
  Please fill out this field message! should be displayed.
  Amount field should not accept alphabetical or special characters.
  Date field should not accept alphabetical characters.

  Background:
    Given user is on the login page
    When user enters username and password
    And user clicks on sign in button
    When user is on the home page

  Scenario: Navigate to the Pay Bills page
    When user clicks on the Online Banking option
    And user clicks on the Pay Bills option
    When user enters chooses "Bank of America" from Payee dropdown
    And user chooses one "Checking" in the Account dropdown
    And user enters amount "100000"
    When user fill out the Description input and clicks on the Pay button
    And user enters date "2023-12-31"
    Then user should see the success message










