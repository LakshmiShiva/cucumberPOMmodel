#Author: your.email@your.domain.com
Feature: Test the pay bill plan functionality
  I want to use this template for my feature file

  Scenario Outline: Test the customerid field with valid data
    Given the user is in paybill page
    When the user fill the field with valid data in paybill page"<cusid>"
    When The user clicks the submit button
    Then the plan should generated for paybill report page

    Examples: 
      | cusid |
      |   517708 |
      |   619896 |

  Scenario: Test the field with incorrect data
    Given the user is in paybill page
    When the user fill all the fields by using invalid data in paybill page
      | 525898 | 
    When The user clicks the submit button 
    Then the error should generate the error in paybill page
