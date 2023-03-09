@wip
Feature: Search functionality on the users page
  Agile story: As I user, I should be able to search values in the Users page.

  Background: For all scenarios user is on the login page of the library application
    Given I am on the login page
    Given the user logged in as "librarian"
    And I click on "Users" link

    Scenario Outline: Search accuracy
      When I search for "test"
      Then table should contain rows with "<test>"

      Examples:

      |test|
      |test|

      Scenario: Table columns names
        Then table should have following column names:
          | Actions   |
          | User ID   |
          | Full Name |
          | Email     |
          | Group     |
          | Status    |