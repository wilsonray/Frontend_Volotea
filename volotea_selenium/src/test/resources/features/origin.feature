Feature: Select Origin Point
  As QA Automation
  I want to test the search-origin interface
  To validate the Frontend response

  #Background: Passengers screen
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
    Then the user sees the origin and destiny he selected

    Examples:
      |adults|children|babies|origin   |destination|
      |4     |2       |4     |Barcelona|Estrasburgo|

  Scenario Outline: Testing origin by clicking the origin and the destination
    Given that the user is in the Volotea page
    And he accepts cookies and clicks the passengers number button
    And the user clicks the + button to add passengers according to: '<adults>', '<children>', '<babies>'
    When he clicks the origin button
    Then the user goes to origin screen
    When he clicks <origin> as the origin and <destination> as the destination
    Then the user sees the origin and destiny he selected

    Examples:
      |adults|children|babies|origin   |destination|
      |4     |2       |4     |Barcelona|Estrasburgo|