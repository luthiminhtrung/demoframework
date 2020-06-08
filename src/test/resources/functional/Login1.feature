Feature: Login Functionality 

	In order to do internet banking
	As a valid Para Bank customer
	I want to login successfully

# Scenario Example

Scenario Outline: Login Successful

Given I am in the login page of the Para Bank Application
	When I click on Authenticate link
	And I enter valid <username> and <password>
	Then I should be taken to the Overview page. <username>

Examples:
|username|password|
|"tomsmith"|"SuperSecretPassword!"|