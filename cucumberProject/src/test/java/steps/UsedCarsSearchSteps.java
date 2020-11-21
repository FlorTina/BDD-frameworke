package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Actions.CarsGuideHomePageActions;
import pages.Actions.UsedCarsSearchPageActions;

public class UsedCarsSearchSteps {
	
	UsedCarsSearchPageActions usedCarsPage = new UsedCarsSearchPageActions();
	CarsGuideHomePageActions homePage = new CarsGuideHomePageActions();
	
	@And("click on {string} link Used Search Car Page")
	public void click_on_link_Used_Search_Car_Page(String string) throws InterruptedException {
		homePage.clickUsedCarsMenu();
		Thread.sleep(1000);
	}

	@And("select carBrand as {string} from AnyMake dropDown Used Search Car Page")
	public void select_carBrand_as_from_AnyMake_dropDown_Used_Search_Car_Page(String carBrand) throws InterruptedException {
		usedCarsPage.selectCarMake(carBrand);
		Thread.sleep(1000);
	}

	@And("select carModel as")
	public void select_carModel_as(List<String> list) throws InterruptedException {
		
		String menu = list.get(1);
		usedCarsPage.selectCarModel(list.get(1));
		System.out.println("Car model is {" + menu + " }");
		Thread.sleep(1000);
	}

	@And("select location as {string} from SelectLocations dropDown on Used Search Car Page")
	public void select_location_as_from_SelectLocations_dropDown_on_Used_Search_Car_Page(String carlocation) throws InterruptedException {
		usedCarsPage.selectCarLocation(carlocation);
		Thread.sleep(1000);
	}

	@And("select price as {string} from price dropDown on Used Search Car Page")
	public void select_price_as_from_price_dropDown_on_Used_Search_Car_Page(String carPrice) throws InterruptedException {
		usedCarsPage.selectCarPrice(carPrice);
		Thread.sleep(1000);
	}

	@And("click on Find_My_Next_Car button on Used Search Car Page")
	public void click_on_Find_My_Next_Car_button_on_Used_Search_Car_Page() throws InterruptedException {
		usedCarsPage.FindMyNextCar();
		Thread.sleep(1000);
	}

	@Then("I should see list of search cars on Used Search Car Page")
	public void i_should_see_list_of_search_cars_on_Used_Search_Car_Page() {
		System.out.println("All car models listed");
	}

}
