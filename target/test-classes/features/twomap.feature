Feature: Addcustomer

  @tag1
  Scenario: Add customer
    Given The user should be in telecom page and click
    When The user should provide valid details
      | fname   | lname   | email         | address | phone       |
      | Abi     | sekar   | ab@gmail.com  | salem   |  3455686789 |
      | aravind | revanth | abc@gmail.com | chennai | 34556867899 |
    Then The user validate details
