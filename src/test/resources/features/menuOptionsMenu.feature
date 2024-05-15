@menu
Feature: User should see menus under "Fleet" module

  Background: Login as a PosManager
  Given User enters "posmanager77@info.com" and "posmanager" for Pos Manager
  Then user click login button

  Scenario: Verify that user can see menus below on the left side under the Fleet Module.
    When User clicks more button on the homepage
    And User clicks the fleet button from dropdown
    Then user can see "Vehicles" menu
    And user can see "Vehicles Odometer" menu
    And user can see "Vehicle Costs" menu
    And user can see "Vehicles Contracts" menu
    And user can see "Vehicles Fuel Logs" menu
    And user can see "Vehicles Services Logs" menu
    And user can see "Costs" menu
    And user can see "Indicative Costs" menu
    And user can see "Vehicle Model" menu
    And user can see "Model make of Vehicle" menu
    And user can see "Service Types" menu
    And user can see "Contract Types" menu
    And user can see "Vehicle Status" menu
    And user can see "Vehicle Tags" menu