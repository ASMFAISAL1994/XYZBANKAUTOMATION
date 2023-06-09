Feature: Open Account
  @smoke
  Scenario: open account
    Given user in open account page
    When user select customer name
    And user select currancy
    And click process
    Then account creat successfully
