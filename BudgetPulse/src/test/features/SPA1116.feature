Feature: User budget Income information verification

  Scenario: Verify budget select "income" information
    Given user click th budget dashboard
    When user select "Income" option from Overview of this month
    Then user should be able to see "Budgeted" and "Actual Expenses" , "Upcoming Expenses"