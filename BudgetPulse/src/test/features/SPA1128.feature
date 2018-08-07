Feature: In Transaction Link Adding existing tag(negative)
  @SPA1128
  Scenario: Adding existing tag(negative)

    Given user goes to homepage
    Then user sign in using credentials
    Then user click on Transactions Link on blue ribbon in header
    Then user click on + button on "Tags" header
    Then user click "Add Tag" link
    Then user enter text "TestDuplicateTag" in Tags Name box
    Then user click submit button in form
    Then user click "Add Tag" link
    Then user enter text Test Duplicate Tag in Category Name box
    Then user click submit tag button in form
    And  user get error alert "Tag already exists."
