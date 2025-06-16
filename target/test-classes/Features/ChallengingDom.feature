Feature: validate dynamic page


  Scenario: Validate three colored buttons
    Given User navigate to dynamic dom page
    Then User should see three buttons of color Blue, Red and Green in vertical order


  Scenario Outline: Validate the Answer
    When User clicks on the <color> button
    Then The answer should change
    Examples:
      | color |
      | Blue  |
      | Red   |
      | Green |