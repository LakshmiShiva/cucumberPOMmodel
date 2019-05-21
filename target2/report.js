$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/UsersLakshmi/CloneTry/eclipse-workspace/cucumber/src/test/resources/feature/pay.feature");
formatter.feature({
  "name": "Test the pay bill plan functionality",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test the customerid field with valid data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in paybill page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user fill the field with valid data in paybill page\"\u003ccusid\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user clicks the submit button",
  "keyword": "When "
});
formatter.step({
  "name": "the plan should generated for paybill report page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "cusid"
      ]
    },
    {
      "cells": [
        "517708"
      ]
    },
    {
      "cells": [
        "619896"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test the customerid field with valid data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in paybill page",
  "keyword": "Given "
});
formatter.match({
  "location": "paydetailsmain.the_user_is_in_paybill_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill the field with valid data in paybill page\"517708\"",
  "keyword": "When "
});
formatter.match({
  "location": "paydetailsmain.the_user_fill_the_field_with_valid_data_in_paybill_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "addcust.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the plan should generated for paybill report page",
  "keyword": "Then "
});
formatter.match({
  "location": "paydetailsmain.the_plan_should_generated_for_paybill_report_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test the customerid field with valid data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in paybill page",
  "keyword": "Given "
});
formatter.match({
  "location": "paydetailsmain.the_user_is_in_paybill_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill the field with valid data in paybill page\"619896\"",
  "keyword": "When "
});
formatter.match({
  "location": "paydetailsmain.the_user_fill_the_field_with_valid_data_in_paybill_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "addcust.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the plan should generated for paybill report page",
  "keyword": "Then "
});
formatter.match({
  "location": "paydetailsmain.the_plan_should_generated_for_paybill_report_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test the field with incorrect data",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in paybill page",
  "keyword": "Given "
});
formatter.match({
  "location": "paydetailsmain.the_user_is_in_paybill_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill all the fields by using invalid data in paybill page",
  "rows": [
    {
      "cells": [
        "525898"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "paydetailsmain.the_user_fill_all_the_fields_by_using_invalid_data_in_paybill_page(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "addcust.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error should generate the error in paybill page",
  "keyword": "Then "
});
formatter.match({
  "location": "paydetailsmain.the_error_should_generate_the_error_in_paybill_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});