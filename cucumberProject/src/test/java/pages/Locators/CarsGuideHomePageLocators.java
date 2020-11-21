package pages.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;

public class CarsGuideHomePageLocators {
	
	WebDriver driver;
	
	public CarsGuideHomePageLocators() {
		driver = SeleniumDriver.getDriver();
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'buy + sell')]")
	public WebElement carsBuyAndSaleLink;

	@FindBy(xpath = "//*[contains(text(),'reviews')]")
	public WebElement review;

	@FindBy(xpath = "//*[contains(text(),'news')]")
	public WebElement news;
	
	@FindBy(xpath = "(//*[contains(text(),'advice')])[3]")
	public WebElement advice;

	@FindBy(linkText = "Used")
	public WebElement used;
	
	@FindBy(linkText = "Search Cars")
	public WebElement searchCarsLink;
	
	@FindBy(linkText = "sub nav sell my car")
	public WebElement SellMyCar;
}
