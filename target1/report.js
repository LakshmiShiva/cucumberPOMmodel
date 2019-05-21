$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/AddTariff.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test the reset button",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in addTrafic page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user fill all the fields \"\u003crent\u003e\",\"\u003clocalmin\u003e\",\"\u003cintermin\u003e\",\"\u003csmspack\u003e\",\"\u003cminutecharges\u003e\",\"\u003cintercharges\u003e\",\"\u003csmscharges\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user click reset button",
  "keyword": "When "
});
formatter.step({
  "name": "the form should be clear",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "rent",
        "localmin",
        "intermin",
        "smspack",
        "minutecharges",
        "intercharges",
        "smscharges"
      ]
    },
    {
      "cells": [
        "1000",
        "100",
        "100",
        "100",
        "100",
        "100",
        "100"
      ]
    },
    {
      "cells": [
        "2000",
        "200",
        "200",
        "200",
        "200",
        "200",
        "200"
      ]
    },
    {
      "cells": [
        "3000",
        "300",
        "300",
        "300",
        "300",
        "300",
        "300"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test the reset button",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in addTrafic page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user fill all the fields \"1000\",\"100\",\"100\",\"100\",\"100\",\"100\",\"100\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user click reset button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the form should be clear",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Test the reset button",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in addTrafic page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user fill all the fields \"2000\",\"200\",\"200\",\"200\",\"200\",\"200\",\"200\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user click reset button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the form should be clear",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Test the reset button",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in addTrafic page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user fill all the fields \"3000\",\"300\",\"300\",\"300\",\"300\",\"300\",\"300\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user click reset button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the form should be clear",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Test the fields with incorrect data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is in addTrafic page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user fill all the fields with invalid data",
  "rows": [
    {
      "cells": [
        "ab",
        "ab",
        "ab",
        "ab",
        "ab",
        "ab",
        "af"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user clicks the submit button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the error message should display",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Blank field validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is in addTrafic page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user left all the fields as blank",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user clicks the submit button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the error message should display",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/feature/Addcustomer.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is in add tarif page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the customer fill the valid data in fields",
  "rows": [
    {
      "cells": [
        "12",
        "12",
        "12",
        "12",
        "12",
        "12",
        "11"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user clicks the refresh button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the form should be refresh",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});