#Author: your.email@your.domain.com
Feature: Test the add customer functionality
  I want to use this template for my feature file

  Scenario Outline: Test the fields with valid data
    Given the user is in addcust page
    When the user fill all the fields with valid data "<firstname>","<lastname>","<email>","<address>","<mobilenumber>"
    When The user clicks the submit button
    Then the customer id should generate

    Examples: 
      | firstname | lastname | email         | address | mobilenumber |
      | Lakshmi   | s        | lak@gmail.com | chennai |     71458455 |
      | Siva      | v        | siv@gmail.com | chennai |       555568 |
      | Mithra    | s        | mit@gmail.com | chennai |        87888 |

  Scenario: Test the reset button
    Given the user is in addcust page
    When the user fill all the fields without valid data
      | 12 | 12 | 12@gmail.com | 12 | 12 |
    When The user clicks the submit button
    Then the error should be generated
