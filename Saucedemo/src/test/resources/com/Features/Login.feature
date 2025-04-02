
@Login
Feature: Swag Labs Login Functionality
  I want to login the swap labs website

  @Validcredentilas, @chrome
  Scenario: Valid Login
    When I enter "standard_user" as username
    And I enter "secret_sauce" as password
    And I click on the login button
    Then I should be redirected to the products page
  @Invalid1, @chrome
  Scenario:Invalid Login
    When I enter "" as username
    And I enter "secret_sauce" as password
    And I click on the login button
    Then I should see an error message
  @Invalid2, @Firefox
  Scenario:Invalid Login username
    When I enter "standard_user" as username
    And I enter "" as passwordd
    And I click on the login button
    Then I should see an error message in password field
  @Invalid3, @Firefox
  Scenario:Invalid Login username
    When I enter "standard" as username
    And I enter "1234" as passwordd
    And I click on the login button
    Then I should see an error message in both field
    