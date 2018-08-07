Feature: User budget Expenses information verification
  Scenario: Verify budget select "Expenses" information
    Given user click th budget dashboard
    When user should be able to see expenses as a default selection
    Then user should be able to see "Budgeted" and "Actual Expenses" , "Upcoming Expenses"
