Feature: delet customer
  @smoke1
  Scenario:user deleat customer
    Given user in customer page
    When user search name
    And deleat the account
    Then successfully account will be deleted
