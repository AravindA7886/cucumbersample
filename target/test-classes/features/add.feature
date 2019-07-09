@tag
Feature: Add customer

  @tag2
  Scenario Outline: To add a list of customers
    Given The user should be in telecom page and click
    When The user should provide valid details "<fname>","<lname>","<email>","<address>","<phone>"
    Then The user validate details

    Examples: 
      | fname   | lname   | email             | address | phone  |
      | aravind | revanth | success@gmail.com | adf     |  54364 |
      | revanth | aravind | Fail@gmail.com    | ddf     | 546632 |
