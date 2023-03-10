@US11
Feature: Login same line

  @librarian
  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian12@library" and "libraryUser".
    Then "dashboard" page should be displayed

    @student
  Scenario: Login as student same line
    Given I am on the login page
    When I login using "student12@library" and "libraryUser".
    Then "books" page should be displayed
