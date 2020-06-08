$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functional/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "\tIn order to do internet banking\n\tAs a valid Para Bank customer\n\tI want to login successfully",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am in the login page of the Para Bank Application",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Authenticate link",
  "keyword": "When "
});
formatter.step({
  "name": "I enter valid \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I should be taken to the Overview page. \u003cusername\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "\"tomsmith\"",
        "\"SuperSecretPassword!\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the login page of the Para Bank Application",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumber.stepsDefinition.HomePageSteps.i_am_in_the_login_page_of_the_Para_Bank_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Authenticate link",
  "keyword": "When "
});
formatter.match({
  "location": "cucumber.stepsDefinition.HomePageSteps.iClickOnAuthenticateLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"tomsmith\" and \"SuperSecretPassword!\"",
  "keyword": "And "
});
formatter.match({
  "location": "cucumber.stepsDefinition.HomePageSteps.i_enter_valid_credentials_(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be taken to the Overview page. \"tomsmith\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumber.stepsDefinition.HomePageSteps.i_should_be_taken_to_the_Overview_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/functional/Login1.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "\tIn order to do internet banking\n\tAs a valid Para Bank customer\n\tI want to login successfully",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am in the login page of the Para Bank Application",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Authenticate link",
  "keyword": "When "
});
formatter.step({
  "name": "I enter valid \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I should be taken to the Overview page. \u003cusername\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "\"tomsmith\"",
        "\"SuperSecretPassword!\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Successful",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the login page of the Para Bank Application",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumber.stepsDefinition.HomePageSteps.i_am_in_the_login_page_of_the_Para_Bank_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Authenticate link",
  "keyword": "When "
});
formatter.match({
  "location": "cucumber.stepsDefinition.HomePageSteps.iClickOnAuthenticateLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"tomsmith\" and \"SuperSecretPassword!\"",
  "keyword": "And "
});
formatter.match({
  "location": "cucumber.stepsDefinition.HomePageSteps.i_enter_valid_credentials_(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be taken to the Overview page. \"tomsmith\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumber.stepsDefinition.HomePageSteps.i_should_be_taken_to_the_Overview_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});