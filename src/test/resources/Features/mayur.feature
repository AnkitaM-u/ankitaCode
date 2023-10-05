Feature: Verify Login Feature

  Scenario: Verify the Login Functionality of Google
    Given valid Login url
    When Provided valid "ankita.motwani" and "Ankita@123"
    Then user should be able to login and see home page
    And check more outcomes

  Scenario: Validate Google Search Functionality
    Given Browser is open
    And User is on Google search Page
    When user Enters text in Google Search Text
    And hits Enter
    Then user is Navigate to search Result
