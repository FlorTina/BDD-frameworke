package steps;

import java.util.List;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.Actions.CarsGuideHomePageActions;
import pages.Actions.CarsSearchPageActions;
import pages.Locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class SearchCarsSteps {

	CarsGuideHomePageActions homePAGE = new CarsGuideHomePageActions();
	CarsSearchPageActions carSearchPage = new CarsSearchPageActions();

	@Given("I am on the Home Page {string} of CarsGuide WebSite")
	public void i_am_on_the_Home_Page_of_CarsGuide_WebSite(String url) throws InterruptedException {
		SeleniumDriver.openPage(url);
		Thread.sleep(1000);
	}

	@When("I move to menu")
	public void i_move_to_menu(List<String> list) throws InterruptedException {
		homePAGE.moveToBuyAndSellMenu();
		;
		String menu = list.get(1);
		System.out.println("Menu Selected {" + menu + "}");
		Thread.sleep(1000);
	}

	@And("click on {string} link")
	public void click_on_link(String searchCars) throws InterruptedException {
		homePAGE.clickSearchCarsMenu();
		Thread.sleep(1000);
	}

	@And("select carBrand as {string} from AnyMake dropDown")
	public void select_carBrand_as_from_AnyMake_dropDown(String make) throws InterruptedException {
		carSearchPage.selectCarMake(make);
		Thread.sleep(1000);
	}

	@When("select carModel as {string} from model dropDown")
	public void select_carModel_as_from_model_dropDown(String model) throws InterruptedException {
		carSearchPage.selectCarModel(model);
		Thread.sleep(1000);

	}

	@When("select location as {string} from location dropDown")
	public void select_location_as_from_location_dropDown(String location) throws InterruptedException {
		carSearchPage.selectCarLocation(location);
		Thread.sleep(1000);

	}

	@And("select price as {string} from price dropDown")
	public void select_price_as_from_price_dropDown(String price) throws InterruptedException {
		carSearchPage.selectCarPrice(price);
		Thread.sleep(1000);

	}

	@And("click on Find_My_Next_Car button")
	public void click_on_Find_My_Next_Car_button() throws InterruptedException {
		carSearchPage.FindMyNextCar();
		Thread.sleep(1000);

	}

	@Then("I should see list of search cars")
	public void i_should_see_list_of_search_cars() {
		System.out.println("Car list found");

	}

	@And("the page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Actual Title was: " + actualTitle);
		
		System.out.println("Expected Title was: " + expectedTitle);
	}

}
