@searchCars
Feature: Acceptance testing to validate search functionality is working
  In order to validate that
  search is working on home page

  @searchSuccess
  Scenario: Validate searching cars
    Given  I am on the home page "https://www.autotrader.ca/" of Autotrader website
    When I click on menu
      | Buy Online    |
      | Sell My Car   |
      | Shop Electric |
    And select make as "Jeep" from Make dropdown
    #And select model as "Grand Cherokee" from Model dropdown
    And set location as "Waterloo"
    And click search button
    Then I should see list of cars that fit the parameter
    And the page title should be "New & Used Jeep for sale | AutoTrader.ca"
