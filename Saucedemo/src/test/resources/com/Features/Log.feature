@Login
Feature: Swag Labs Login Functionality
  I want to login to the Swag Labs website

  @chrome @ValidCredentials
  Scenario Outline: Valid and Invalid Login
    When I enter "<username>" as username1
    And I enter "<password>" as password1
    And I click on the login button1
    Then I should <outcome>

    Examples:
      | username        | password       | outcome                                  |
      | standard_user  | secret_sauce   | be redirected to the products pagee       |
      |                | secret_sauce   | see an error messagee                     |
      | standard_user  |                | see an error message in password fieldd   |
      | standard       | 1234           | see an error message in both fieldsd      |
