Feature: Select Origin Point
  As QA Automation
  I want to test the search-origin interface
  To validate the Frontend response

  Background: Testing origin by typing the origin and the destination
    #Given that the user is in the Volotea page
    #When he clicks the origin button
    #Then the user goes to origin screen
  Scenario Outline: Testing origin by typing the origin and the destination
    Given that the user is in the Volotea page
    And he accepts cookies and clicks the passengers number button
    And the user clicks the + button to add passengers according to: '<adults>', '<children>', '<babies>'
    When he clicks the origin button
    Then the user goes to origin screen
    When he types <origin> as the origin and <destination> as the destination
    #Then the user sees the origin and destiny he selected
    When the user clicks the departure day
      |departureDay  |
      |<departureDay>|
    Then he should see the day he selected and the calendar to select the return day

    Examples:
      |adults|children|babies|origin   |destination|departureDay|
      |1     |0       |0     |Barcelona|Estrasburgo|16          |