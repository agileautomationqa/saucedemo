@test
Feature: Login Functionality for standard user
  As a user I want to login in into sauce-demo website.

  Scenario Outline: Standard User should be able to login with valid credentials
    Given   I am on Homepage
    When I enter username "<username>"
    And I enter password "<password>"
    And I click on Login button
    Then Verify the text "Products"
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

    




