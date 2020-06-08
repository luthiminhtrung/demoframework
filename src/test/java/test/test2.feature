Feature: Login Function
  As a valid user in banking system
  I can log in to the home page successfully
  Scenario: login successfully
    Given I am in the login page of the Para Bank Application
    When I enter valid credentials
    Then I should be taken to the Overview page

