@LateNight

Feature:Login with parameters

  Scenario:Verify librarian11 information <email>
    Given I am on the login page
    When I enter user name "librarian11@library"
    And  I enter password "libraryUser"
    And  click the sign in button
    Then dashboard should be displayed "Dashboard"


