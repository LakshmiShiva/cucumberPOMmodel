#Author: your.email@your.domain.com
@regression @us1
Feature: Title of your feature
  I want to use this template for my feature file

 @sprint1 
  Scenario Outline: Test the reset button
    Given the user is in addTrafic page
    When the user fill all the fields "<rent>","<localmin>","<intermin>","<smspack>","<minutecharges>","<intercharges>","<smscharges>"
    When the user click reset button
    Then the form should be clear

    Examples: 
      | rent | localmin | intermin | smspack | minutecharges | intercharges | smscharges |
      | 1000 |      100 |      100 |     100 |           100 |          100 |        100 |
      | 2000 |      200 |      200 |     200 |           200 |          200 |        200 |
      | 3000 |      300 |      300 |     300 |           300 |          300 |        300 |

  @sprint4
  Scenario: Test the fields with incorrect data
    Given the user is in addTrafic page
    When the user fill all the fields with invalid data
      | ab | ab | ab | ab | ab | ab | af |
    When The user clicks the submit button in tariff page
    Then the error message should display in tariff page

  @sprint3
  Scenario: Blank field validation
    Given the user is in addTrafic page
    When the user left all the fields as blank
    When The user clicks the submit button in tariff page
    Then the error message should display in tariff page
