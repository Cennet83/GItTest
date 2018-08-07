Feature: Adding Recent Transaction
  @SPA1122
  Scenario: Adding Recent Transaction Income Type


    Then user click on Dashboard Link on the blue ribbon
    Then user click on grey Add New link in Recent Transactions field
    Then user select "Income" option from Transaction Type drop down menu
    Then user enter "Net Salary" in Category box
    Then user enter "Tom's first two week salary" into Description box
    Then user enter "2500" into Amount box
    Then user choose "Chase" in Account drop down menu
    Then user enter "Chase" into Payee box
    Then click Submit & Done button