Feature: Select Passengers Number
  As QA Automation
  I want to test the search-passengers interface
  To validate the Frontend response

  Background: Passengers screen
    Given that the user is in the Volotea page
    When he accepts cookies and clicks the passengers number button
    Then the user goes to passengers screen

    Scenario: + and - buttons
      When he clicks the + and - buttons
      Then the user sees the number of passengers vary by one

    Scenario Outline: Adding passengers with multiple combinations
      When the user clicks the + button to add passengers according to: '<adults>', '<children>', '<babies>'
      Then the user sees '<adults>', '<children>', '<babies>' passengers selected

      Examples:

      |adults|children|babies|
      | 9    | 5     | 9    |
      #| 9     | 5     | 3    |
      #| 8     | 5     | 7    |
      #| 8     | 3     | 2    |
