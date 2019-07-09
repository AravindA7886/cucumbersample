Feature: Addcustomer

  @tag1
  Scenario: Add customer
    Given The user should be in telecom page and click
    When The user should provide valid details
      | fname   | Aravind       |
      | lname   | Revanth       |
      | email   | abc@gmail.com |
      | address | chennai       |
      | phone   |        345678 |
    Then The user validate details
