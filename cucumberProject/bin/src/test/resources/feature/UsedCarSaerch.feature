@UsedSearch_cars
Feature: Acceptance testing to valifate Search cars page is working properly.
  In order validate that
  the search cars page working fine
  we will do the acceptance testing

  @UserSearche_cars-Positive
  Scenario: Validate search cars page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide WebSite
    When I move to menu
      | Menu         |
      | buy and sell |
      | reviews      |
    And click on "Used" link Used Search Car Page
    And select carBrand as "Audi" from AnyMake dropDown Used Search Car Page
    And select carModel as
      | Model |
      | A4    |
      | A3    |
    And select location as "NSW - Sydney" from SelectLocations dropDown on Used Search Car Page
    And select price as "$3,000" from price dropDown on Used Search Car Page
    
    And click on Find_My_Next_Car button on Used Search Car Page
   
    Then I should see list of search cars on Used Search Car Page
    And the page title should be "...Under 3000 for Sale Sydney NSW | carsguide"
