
Feature: LoginFunctionality

  Background: User on login page
    Given user on the login page
@wip
  Scenario Outline: User can login with valid credentials
    When user enter username "<username>" in username box
    And user enter password "<password>" in password box
    And user click login button
    Then user should login homepage
    Examples:
      | username                | password     |
      | salesmanager15@info.com | salesmanager |
      | posmanager88@info.com   | posmanager   |

#
#  Scenario Outline: User can not login with invalid credentials
#    When user enter username "<username>" in username box
#    And user enter password "<password>" in password box
#    And user click login button
#    Then user should see "Wrong login/password" warning message
#    Examples:
#      | username                 | password     |
#      | salesmanager100@info.com | abscd        |
#      | abcd@info.com            | salesmanager |
#
#
#  Scenario Outline: User should see validation message when using empty credentials
#    When user enter username "<username>" in username box
#    And user enter password "<password>" in password box
#    And user click login button
#    Then user should see "Please fill out this field." validation message
#    Examples:
#      | username                | password   |
#      |                         |            |
#      | salesmanager39@info.com |            |
#      |                         | posmanager |
#
#
#  Scenario: User should see the bullet signs style password
#    When user enter password "salesmanager" in password box
#    Then user should see bullet signs
#
#
#  Scenario: Verify ‘Enter’ key of the keyboard is working
#    When user enter username "salesmanager65@info.com" in username box
#    And user enter password "salesmanager" in password box
#    And user click enter key of the keyboard
#    Then user should login homepage