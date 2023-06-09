Feature: Add Customer

  @smoke
  Scenario Outline: user will fillup Add Customer form with valid data
    Given base url
    When click bank manager button And also click Add Customer button
    And user will fillup '<firstName>', '<LastName>', '<Postcode>'
    And user will click add customer button
    And user will click alert ok button
    Then user find open account


    Examples:
      | firstName | LastName | Postcode |  |
      | ASM       | FAISAL   | 1207     |  |
