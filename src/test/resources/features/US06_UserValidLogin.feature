@login
Feature: User valid login

  @student
  Scenario Outline: Verify user information <email>
    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then student account holder name should be "<name>"
    Examples:
      | email             | password    | name            |
      | student27@library | libraryUser | Test Student 27 |
      | student28@library | libraryUser | Test Student 28 |
      | student29@library | libraryUser | Test Student 29 |
      | student30@library | libraryUser | Test Student 30 |


  @librarian
  Scenario Outline: Verify user information <email>
    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then librarian account holder name should be "<name>"
    Examples:
      | email               | password    | name              |
      | librarian13@library | libraryUser | Test Librarian 13 |
      | librarian14@library | libraryUser | Test Librarian 14 |
      | librarian15@library | libraryUser | Test Librarian 15 |
      | librarian16@library | libraryUser | Test Librarian 16 |


