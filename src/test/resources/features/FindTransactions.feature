Feature: Find Transactions in Account Activity

  Background:
    Given user is logged in and on the home page
    When user clicks on the Online Banking option
    And  user clicks on the Account Activity

    @description
  Scenario: Search description
    When the user accesses the Find Transactions tab
    And  the user enters description as "ONLINE"
    And clicks find
    Then results table should only show descriptions containing "ONLINE"
    When the user enters description "OFFICE"
    And clicks find
    Then results table should only show descriptions containing input "OFFICE"


    @caseInsensitive
  Scenario: Search description case insensitive
    Given the user accesses the Find Transactions tab
    And  the user enters description as "ONLINE"
    And clicks find
    Then results table should only show descriptions containing "ONLINE"
    When the user enters description in lower-case "online"
    And clicks find
    Then results table should also show descriptions containing "ONLINE"


    @type
  Scenario: Type
    Given the user accesses the Find Transactions tab
    And clicks find
    Then results table should show at least one result under Deposit
    Then results table should show at least one result under Withdrawal
    When user selects type "Deposit" and clicks find
    Then results table should show at least one result under Deposit
    When user selects type withdrawal "Withdrawal"
    Then results table should show at least one result under Withdrawal
