Feature: Test login to ToolsQA

  # Scenario: Test login page
  #  Given I am on toolsQA home page
  #  When I click on MyAccount Link
  #  Then I should be navigated to Login page
  
  Scenario: Test login
    Given I am on toolsQA login page
    When I enter a valid Username
      | Username   |
      | testuser_1 |
    And I enter a valid Password
      | Password |
      | Test@123 |
    And I click Login button
    Then I should be logged in

  
