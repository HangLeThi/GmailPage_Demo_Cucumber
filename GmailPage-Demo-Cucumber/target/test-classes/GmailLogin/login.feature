#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: login to system
  in order to do...
  As an user
  I would like to login to system

  @tag1
  Scenario Outline: SignIn Gmail
    Given I am on https://accounts.google.com
    And I maximize gmail page
    When I enter my email <Email>
    And I click the next button
    And I enter my password <Password>
    And I click the signIn button
    Then I see an alert message is <Message>
    And I close my browser

    Examples: 
      | Email                  | Password   | Message                                         |
      | hang.buitech@gmail.com |            | Please enter your password.                     |
      |                        |            | Please enter your email.                        |
      | dsfdf                  |            | Please enter a valid email address.             |
      | hang.buitech@gmail.com | buitech123 |                                                 |
      | hang.buitech@gmail.com | afff       | The email and password you entered don't match. |
