package automation.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class LandingPageTest extends App{

	public WebDriver driver;
	CommonFunctions cf = new CommonFunctions(driver);
	LandingPage lp = new LandingPage(driver);
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		cf.openBrowserWithURL(properties.getProperty("URL"),driver);

	}
	
	@Test
	public void selectRadioButtonOneWay() {
		
		cf.clickObject(lp.getRadioButtonOneWay(driver), "One way");
	}
	

	
	@Test
	public void calendar() throws InterruptedException  {

		cf.clickObject(lp.getDepartOnButton(driver), "click on calendar");
		Thread.sleep(3000);
		lp.setDate(lp.getRightArrowButton(driver), driver);

	}
	
	
	@Test
	public void selectAdultsDropdown() {

		cf.selectClasss(lp.getAdultsDropdown(driver), "select adult", "4");
	}
	
	@Test
	public void selectChildDropdown() {

		cf.selectClasss(lp.getChildDropdown(driver), "select child", "2");
	}
	
	
	@Test
	public void selectInfantsDropdown() {

		cf.selectClasss(lp.getInfantDropdown(driver), "select infant", "2");
	}
	
	@Test
	public void selectFromDropdown() throws InterruptedException {

		cf.clickObject(lp.getFromDropdown(driver), "click drop down");
		cf.sendKeysToObject(lp.getFromDropdown(driver), "send value", "Koc");
		Thread.sleep(5000);
		cf.dropdown(lp.getValuesOfFromDropdown(driver), "send value", "KCZ");
	}
	
	@Test
	public void SelectToDropdown() throws InterruptedException {

		cf.clickObject(lp.getToDropdown(driver), "click drop down");
		cf.sendKeysToObject(lp.getToDropdown(driver), "send value", "Bang");
		Thread.sleep(5000);
		cf.dropdown(lp.getValuesOfToDropdown(driver), "send value", "Bangalore");
	}
//	
	
//	@AfterTest
//	public void selectSearchFlightsButton() {
//		
//		cf.clickObject(lp.getSearchFlights(driver), "Search Flights");
//	}

}
