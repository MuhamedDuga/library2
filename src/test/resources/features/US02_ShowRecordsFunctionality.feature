@B28G5-121
Feature: Default

	#US02 As a user, I want to see users information in different records.
  @B28G5-120
  Scenario: Verify default values in Users page
    Given I am on the login page
    And I login as a librarian
    When I click on "Users" link
    Then show records default value should be 10
    And show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |