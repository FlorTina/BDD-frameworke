@Search-Cars
Feature: Acceptance testing to validate Search cars page is working properly 
In order to validate that the search cars page is working fine we will do the acceptance testing 

@Search-Cars-Positive
Scenario: Validate search cars page
Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide WebSite 
When I move to menu
|Menu|
|buy and sell|
|reviews|
And click on "Search Cars" link 
And select carBrand as "BMW" from AnyMake dropDown
And select carModel as "1 Series" from model dropDown
And select location as "ACT - All" from location dropDown
And select price as "$1,000" from price dropDown
And click on Find_My_Next_Car button
Then I should see list of search cars
And the page title should be "BMW 1 Series Under 1000 for Sale ACT | carsguide"