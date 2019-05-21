#Author: your.email@your.domain.com
Feature: Test the add tarrif plan functionality
  I want to use this template for my feature file

  Scenario Outline: Test the field with valid data
    Given the user is in addTarifplan page
    When the user fill the field with valid data in addtarif page"<customerid>"
    When The user clicks the submit button in add tariff plan page
    Then the plan should generated for add tarif page

    Examples: 
      | customerid |
      |   517708 |
      |   619896 |

  Scenario: Test the field with incorrect data
    Given the user is in addTarifplan page
    When the user fill all the fields by using invalid data in addtarif page
      | 525898 | 
    When The user clicks the submit button in add tariff plan page
    Then the error should generate the error in addtarifplan page
