package pages.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.Locators.UsedCarsSearchLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {

	public UsedCarsSearchLocators usedCarsPage= null;

	public UsedCarsSearchPageActions() {
		this.usedCarsPage = new UsedCarsSearchLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsPage);
	
	}
		

	public void selectCarMake(String carBrand) {
		Select selectCarMaker = new Select (usedCarsPage.makes);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMaker = new Select (usedCarsPage.model);
		selectCarMaker.selectByVisibleText(carModel );
	
}
	
	public void selectCarLocation(String carLocation) {
		Select selectCarMaker = new Select (usedCarsPage.location);
		selectCarMaker.selectByVisibleText(carLocation);
	
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarMaker = new Select (usedCarsPage.price);
		selectCarMaker.selectByVisibleText(carPrice);
	}
	
	public void FindMyNextCar() {
		usedCarsPage.FindMyNextCarBtn.click();
	
		
	}
}	

