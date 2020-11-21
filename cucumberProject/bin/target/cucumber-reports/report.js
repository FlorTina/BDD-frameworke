$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/UsedCarSaerch.feature");
formatter.feature({
  "name": "Acceptance testing to valifate Search cars page is working properly.",
  "description": "  In order validate that\n  the search cars page working fine\n  we will do the acceptance testing",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UsedSearch_cars"
    }
  ]
});
formatter.scenario({
  "name": "Validate search cars page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UsedSearch_cars"
    },
    {
      "name": "@UserSearche_cars-Positive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Home Page \"https://www.carsguide.com.au\" of CarsGuide WebSite",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchCarsSteps.i_am_on_the_Home_Page_of_CarsGuide_WebSite(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move to menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ]
    },
    {
      "cells": [
        "buy and sell"
      ]
    },
    {
      "cells": [
        "reviews"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_menu(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Used\" link Used Search Car Page",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.click_on_link_Used_Search_Car_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select carBrand as \"Audi\" from AnyMake dropDown Used Search Car Page",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.select_carBrand_as_from_AnyMake_dropDown_Used_Search_Car_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select carModel as",
  "rows": [
    {
      "cells": [
        "Model"
      ]
    },
    {
      "cells": [
        "A4"
      ]
    },
    {
      "cells": [
        "A3"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.select_carModel_as(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select location as \"NSW - Sydney\" from SelectLocations dropDown on Used Search Car Page",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.select_location_as_from_SelectLocations_dropDown_on_Used_Search_Car_Page(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: NSW - Sydney\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027TINAs-MacBook-Pro.local\u0027, ip: \u00272001:579:a154:7ce0:dbcf:bebf:d473:29a6%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: unknown\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:147)\n\tat pages.Actions.UsedCarsSearchPageActions.selectCarPrice(UsedCarsSearchPageActions.java:40)\n\tat steps.UsedCarsSearchSteps.select_location_as_from_SelectLocations_dropDown_on_Used_Search_Car_Page(UsedCarsSearchSteps.java:37)\n\tat ✽.select location as \"NSW - Sydney\" from SelectLocations dropDown on Used Search Car Page(file:src/test/resources/feature/UsedCarSaerch.feature:20)\n",
  "status": "failed"
});
formatter.step({
  "name": "select price as \"$3,000\" from price dropDown on Used Search Car Page",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.select_price_as_from_price_dropDown_on_Used_Search_Car_Page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Find_My_Next_Car button on Used Search Car Page",
  "keyword": "And "
});
formatter.match({
  "location": "UsedCarsSearchSteps.click_on_Find_My_Next_Car_button_on_Used_Search_Car_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see list of search cars on Used Search Car Page",
  "keyword": "Then "
});
formatter.match({
  "location": "UsedCarsSearchSteps.i_should_see_list_of_search_cars_on_Used_Search_Car_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the page title should be \"Used Audi A4 Under 3000 for Sale  Riverina NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});