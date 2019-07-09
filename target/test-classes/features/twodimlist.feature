Feature: Addcustomer

  @tag1
  Scenario: Add customer
    Given The user should be in telecom page and click
    When The user should provide valid details
    |Aravind|Revanth|abc@gmail.com|chennai|3456789|
    |Abi|sekar|ab@gmail.com|salem|3455686789|
    Then The user validate details
