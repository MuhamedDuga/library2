@US03_MD
Feature: manage user info table

  User Story:
  As a user, I want to change the number of raws to see the user info


  Scenario: Change number of rows in Users page
    Given I am on the login page
    And I login as a librarian
    And I click on "Users" link
    When I select Show "50" records
    Then show records value should be "50"
    And the users table must display "50" records