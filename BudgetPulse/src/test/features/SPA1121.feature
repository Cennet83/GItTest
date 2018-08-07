Feature: Adding new Budget item Income Type
  @SPA1121
  Scenario: Adding new Budget item Income Type and see it in Overview

    Given user goes to homepage
    Then user sign in using credentials
    Then user click on Budget Link on blue ribbon
    Then user click on green plus sign on "Add New Budget Item" field
    Then user select "Income" from Budget Type drop down menu
    Then user enter "Net Salary" in Category Name box
    Then user enter "5000" into Monthly Budget Amount box
    Then user click submit button
    Then user click on Dashboard Link on blue ribbon
    Then user select "Income" in Overview and verify that budgeted price is "Budgeted: $5,000.00"
