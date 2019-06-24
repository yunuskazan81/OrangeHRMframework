#Author: syntax team   or john.smith@wellfargo.com
@sprint3
Feature: Login

  Background: 
    Given I see OrangeHrm logo

  @smoke1
  Scenario: Valid login
    When I enter valid username and password
    And I click login button
    Then I successfully logged in

  @regression @login
  Scenario: Invalid login
    When I enter invalid username and password
    And I click login button
    Then I see error message is displayed

@loginWithDataTable
  Scenario: Error message Validation
    When I enter invalid username and password then I see errorMessage
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Admin1   | Syntax123! | Invalid Credentials |
      
      
