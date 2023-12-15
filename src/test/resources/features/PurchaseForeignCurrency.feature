Feature: Purchase Foreign Currency

  Background:
    Given user is logged in and on the home page
    When user clicks on the Online Banking option
    And  user clicks on the Pay Bills option

    @currencies
  Scenario: Available currencies
    When the user accesses the Purchase foreign currency cash tab
    Then following currencies should be available
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Hong Kong (dollar)    |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Sweden (krona)        |
      | Singapore (dollar)    |
      | Thailand (baht)       |


      @currencyNegativeScen
  Scenario: Error message for not selecting currency
    Given the user accesses the Purchase foreign currency cash tab
    When user tries to calculate cost without selecting a currency
    Then error message alert should be displayed

     @valueNegativeScen
  Scenario: Error message for not entering value
    Given the user accesses the Purchase foreign currency cash tab
    And the user chooses one of the currencies from the currency dropdown
    When user tries to calculate cost without entering a value
    Then error message alert should be displayed
