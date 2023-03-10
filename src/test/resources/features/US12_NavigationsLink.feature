@INT
Feature: Page navigation links

  Background:
    Given I am on the login as librarian
    And I login as a librarian


  Scenario Outline: : Go to users page
    When I click on "<moduleLink>" module.
    Then "<moduleLink>" page should be displayed.

    Examples:
      | moduleLink |
      | Users      |
      | Books      |
      | Dashboard  |


