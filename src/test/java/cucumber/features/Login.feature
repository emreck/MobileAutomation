@Regression
Feature: Login Feature


  @Smoke
  @SuccessLogin
  Scenario: Success User Login


    Given I will Click Login Button In Main Screen
    When I will Fills Username As "xx" Password As "yy."
    And I will Click Login Button In Login Screen
    When I will Click Member Number
    When I will Click Logout Button
    When I will Click Continue Logout Popup
    Then I should see Login Button

  @Negative
  Scenario: Incorrect User Login

    Given I will Click Login Button In Main Screen
    When I will Fills Username As "abc123" Password As "abc123"
    And I will Click Login Button In Login Screen
    Then I should See Information Popup Text
    When I will Click Popup Button
    Then I should see Login Button In Login Page