@US01_Sergey
Feature: Users table

  User Story:
  As a user, when I search users, each user should have a unique ID

  Scenario: unique user ids
    Given I am on the login page
    And I login as a librarian
    When I click on "Users" link
    Then Each user id should be unique