@Tag
Feature: Feature to test login functionality

  @Regression
  Scenario Outline: Login should be done
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then user should be redirected to home page

    Examples: 
      | username                 | password      |
      | bhadrikeganesh@gmail.com | Bhadrike@1998 |
      | invaliduser@gmail.com    | WrongPass     |

