Feature: Test Login Functionality

  Scenario Outline: check Login Functionality with valid Credentials
    Given browser is open
    And user is on login Page
    When user Enter <username> and <Password>
    And some other action
    Then user is navigated to home page

    Examples: 
      | username | Password |
      |Ankita | Mot@123 |
