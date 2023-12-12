Feature: Add new payee under pay bills

  Background:
    Given user is logged in and on the home page
    When user clicks on the Online Banking option

  @addPayment
  Scenario Outline: Add a new payee
    When user clicks on the Pay Bills option
    And user clicks on the Add New Payee Tab to add new payment
    And user enters new payee in the "<Payee Name>" input
    And user enters address in the "<Payee Address>" input
    And user enters account type in the "<Account>" input
    And user enters the details in the "<Payee Details>" input
    When user clicks on Add button
    Then the user should see the success message

    Examples:

      | Payee Name                               | Payee Address                    | Account  | Payee Details |
      | The Law Offices of Hyde, Price & Scharks | 100 Same st, Anytown, USA, 10001 | Checking | XYZ account   |


