package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import automation.selenium.App;
import automation.selenium.CommonFunctions;

public class LandingPage extends App{

	public WebDriver driver;
	WebElement element;
	List<WebElement> elements;
	CommonFunctions cf = new CommonFunctions(driver);
	By radioButtonOneWay = By.xpath("//*[contains(text(),'One way')]");
	By adultsCount=By.xpath("//div[@class='mb-4']/select");
	By childCount=By.xpath("//div[@class='mb-4']/following-sibling::div[2]/select");
	By infantsCount=By.xpath("//p[text()='Below 2 yrs']/../select");
	By fromDropdownWebElement=By.xpath("//*[contains(@placeholder,'Any worldwide city or airport')]");
	By fromDropdownItems=By.xpath("//*[contains(@class,'dropdown__item ')]/p");
	By toDropdownWebElement=By.xpath("(//*[contains(@placeholder,'Any worldwide city or airport')])[2]");
	By toDropdownItems=By.xpath("//*[contains(@class,'dropdown__item ')]/p");
	By departOnButton=By.xpath("//*[contains(@class,'homeCalender')]");
	String dayPickerButtonXpath="//*[contains(text(),'monthAndYear')]/../..//div[contains(text(),date)]";
	By rightArrowButton=By.xpath("//*[@data-testid='rightArrow']");
	By searchFlightsButton=By.xpath("//button[text()='Search flights']");
	
	public LandingPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getRadioButtonOneWay(WebDriver driver) {
		element = driver.findElement(radioButtonOneWay);
		try {
		Assert.assertTrue(element.isDisplayed());
		}catch (Exception e) {
		}
		return element;	
	}
	
	public WebElement getAdultsDropdown(WebDriver driver) {
		element = driver.findElement(adultsCount);
		try {
		Assert.assertTrue(element.isDisplayed());
		}catch (Exception e) {
		}
		return element;	
	}
	public WebElement getChildDropdown(WebDriver driver) {
		element = driver.findElement(childCount);
		try {
		Assert.assertTrue(element.isDisplayed());
		}catch (Exception e) {
		}
		return element;	
	}
	
	public WebElement getInfantDropdown(WebDriver driver) {
		element = driver.findElement(infantsCount);
		try {
		Assert.assertTrue(element.isDisplayed());
		}catch (Exception e) {
		}
		return element;	
	}

	
	public WebElement getDepartOnButton(WebDriver driver) {
		element = driver.findElement(departOnButton);
		try {
		Assert.assertTrue(element.isDisplayed());
		}catch (Exception e) {
		}
		return element;	
	}

	public WebElement getRightArrowButton(WebDriver driver) {
		element = driver.findElement(rightArrowButton);
		try {
		Assert.assertTrue(element.isDisplayed());
		}catch (Exception e) {
		}
		return element;	
	}

	public WebElement getDay(WebDriver driver) {
		
		String[] target={"monthAndYear","date"};
		String[] replacement={"April 2022","10"};
		String path=cf.replaceXpathVariables(dayPickerButtonXpath,target,replacement);
		if(cf.isElementPresent(By.xpath(path),driver))
		{
		element = driver.findElement(By.xpath(path));
		return element;
		}
		else
			return null;
	}
	
	
	public void setDate(WebElement rightArrow,WebDriver driver) {

		while(getDay(driver)==null)
		{
			cf.clickObject(rightArrow, "right arrow button");
		
		}
		cf.clickObject(getDay(driver), "day");
		
	}
	
	public WebElement getFromDropdown(WebDriver driver) {
		element = driver.findElement(fromDropdownWebElement);
		try {
		Assert.assertTrue(element.isDisplayed());
		}catch (Exception e) {
		}
		return element;	
	}
	
	public List<WebElement> getValuesOfFromDropdown(WebDriver driver) {
		elements = driver.findElements(fromDropdownItems);
		return elements;	
	}
	
	public WebElement getToDropdown(WebDriver driver) {
		element = driver.findElement(toDropdownWebElement);
		try {
		Assert.assertTrue(element.isDisplayed());
		}catch (Exception e) {
		}
		return element;	
	}
	
	public List<WebElement> getValuesOfToDropdown(WebDriver driver) {
		elements = driver.findElements(toDropdownItems);
		return elements;	
	}
	
	public WebElement getSearchFlights(WebDriver driver) {
		element = driver.findElement(searchFlightsButton);
		try {
		Assert.assertTrue(element.isDisplayed());
		}catch (Exception e) {
		}
		return element;	
	}
	
}
