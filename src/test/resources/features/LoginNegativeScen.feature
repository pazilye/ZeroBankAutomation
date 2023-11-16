@negativeScenario
Feature:Login feature negative scenario

  Users with wrong username or wrong password should not be able to login
  Users with blank username or password should not be able to login
  User should see error message "Login and/or password are wrong" when trying to login with invalid credentials

  Background:
    Given user is on the login page

  Scenario Outline: Login with invalid credentials
    When user enters invalid credentials "<Username>" and "<Password>"
    And user clicks on sign in button
    Then user should see error message "<message>"

    Examples:
      | Username | Password | message                          |
      | userName | password | Login and/or password are wrong. |
      |          | password | Login and/or password are wrong. |
      | username |          | Login and/or password are wrong. |
      | userNAME | password | Login and/or password are wrong. |
      | password | username | Login and/or password are wrong. |



