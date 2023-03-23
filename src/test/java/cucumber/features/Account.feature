@Regression
Feature: Account Feature


  @Smoke
  @Promotion
  Scenario: Random Promotion Code

    Given I will Click Login Button In Main Screen

    When I will Fills Username As "xx" Password As "yy."
    And I will Click Login Button In Login Screen
    When I will Click Member Number
    When I will Click promotion Button
    When I will Fill random promotion code
    Then I will Check random promotion code
    When I will Click promotion Screen Close Button
    Then I will should see Account Page

  @Smoke
  @PersonelInformation
  Scenario: Check Member Number

    Given I will Click Login Button In Main Screen
    When I will Fills Username As "xx" Password As "yy."
    And I will Click Login Button In Login Screen
    When I will Get member number In Home Screen
    When I will Click Member Number
    When I will Click Personel Information Button
    Then I will Check User Id Match


