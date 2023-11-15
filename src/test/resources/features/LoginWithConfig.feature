@positiveScenario
  Feature: Login Feature

  User Story: As an authorized user, when I login with valid credentials, I should see Account summary page.

  # Credentials come from configuration properties file

  Background:
  Given user is on the login page

    Scenario:
      When user enters username and password
      And user enters clicks on sign in button
      Then user should see Settings button on the top right corner