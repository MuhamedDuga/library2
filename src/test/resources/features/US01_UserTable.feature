@B28G5-117
Feature: Default

	#US01 As a user, when I search for users, each user should have a unique ID.
  @B28G5-116
  Scenario: Verify that each user id should is unique
    Given I am on the login page
    And I login as a librarian
    When I click on "Users" link
    Then Each user id should be unique