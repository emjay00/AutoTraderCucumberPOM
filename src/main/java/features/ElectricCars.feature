Feature: Acceptance testing to validate search functionality is working
  In order to validate that
  search is working on home page


  Scenario: Validate searching cars
    Given  I am on the home page "https://www.autotrader.ca/" of Autotrader website
    When I click on "Shop Electric"
    When set postal code to "n2j 2y2"
    And set Condition to "Used" and "Certified Pre-Owned"
    And set seller type to "OnlineSellerPlus" and "Dealer"
    Then I should see list of cars that fit the parameter

