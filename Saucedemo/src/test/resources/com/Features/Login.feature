
@Login
Feature: Swag Labs Login Functionality
  I want to login the swap labs website

  @Validcredentilas
  Scenario: Valid Login
    Given I am on the Swag Labs login page
    When I enter "standard_user" as username
    And I enter "secret_sauce" as password
    And I click on the login button
    Then I should be redirected to the products page
    And quit the application
  @Invalid1
  Scenario:Invalid Login
    Given I am on the Swag Labs login page
    When I enter "" as username
    And I enter "secret_sauce" as password
    And I click on the login button
    Then I should see an error message
    And quit the application
  @Invalid2
  Scenario:Invalid Login username
    Given I am on the Swag Labs login page
    When I enter "standard_user" as username
    And I enter "" as passwordd
    And I click on the login button
    Then I should see an error message in password field
    And quit the application
  @Invalid3
  Scenario:Invalid Login username
    Given I am on the Swag Labs login page
    When I enter "standard" as username
    And I enter "1234" as passwordd
    And I click on the login button
    Then I should see an error message in both field
    And quit the application
    