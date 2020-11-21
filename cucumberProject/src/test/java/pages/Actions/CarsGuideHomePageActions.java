package pages.Actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.Locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators homePage = null;
	
	public CarsGuideHomePageActions() {
		
		this.homePage = new CarsGuideHomePageLocators(); 
			
		PageFactory.initElements(SeleniumDriver.getDriver(), homePage);	
		}
	public void moveToBuyAndSellMenu() {
	Actions action = new Actions(SeleniumDriver.getDriver());
	action.moveToElement(homePage.carsBuyAndSaleLink).perform();
	}
	
	public void clickSearchCarsMenu() {
	homePage.searchCarsLink.click();
		
	}
	
	
	public void clickUsedCarsMenu() {
	homePage.used.click();
	
	}
	

	public void sellMyCarMenu() {
	homePage.SellMyCar.click();
	
}


}