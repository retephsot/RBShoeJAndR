package com.RBShoesJR.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.RBShoesJR.helper.Waits;
import com.RBShoesJR.pages.PageBase;

public class GlobalSettingRoutesScheduleLocators extends PageBase{
	private Waits wait;
	public GlobalSettingRoutesScheduleLocators(WebDriver driver) {
		super(driver);
		wait = new Waits(driver);
	}
	
	Actions action = new Actions(driver);
	// Elements' xpath-------------------------------------------
	/**Xpath of Transportation mode select field.*/
	public static final String TRANSPORTATION_MODE_X = "//select[@id='RouteMode']";
	/**Xpath of stop duration drop down menu.*/
	public static final String STOP_DURATION_X = "//select[@class='timedefaults-appointmentduration slds-select']";
	/**Start location input field.*/
	public static final String START_LOC_X = "//*[@id=\"MAStartLocation\"]";
	/**End location input field*/
	public static final String END_LOC_X = "//*[@id=\"MAEndLocation\"]";
	/**Search favorite location result container.*/
	public static final String FAV_RESULT_CONTAINER_X = "//*[@id=\"ui-id-4\"]";
	public static final String ROUTE_TYPE_DROP_DOWN_X = "//select[@class='slds-select timedefaults-routetype']";
	public static final String SAVE_BUTTON_X = "//div[@class='slds-col_bump-left']//button[contains(text(),'Save')]";
	
	// Elements' Css selector------------------------------------
	public static final String START_TIME_SELECT_DROPDOWN_CSS = "#RouteStartTime";
	public static final String END_TIME_SELECT_DROPDOWN_CSS = "#RouteEndTime";
	
	//Dynamic xpath----------------------------------------------
	/**Search result list for start/end location in global setting Route and Schedule.*/
	private String favLocResult;
	
	public WebElement getRouteTypeDropDown() throws InterruptedException {		
		Thread.sleep(2500);
		try {
			wait.waitForElementByXPath(ROUTE_TYPE_DROP_DOWN_X);
		}catch(Exception e) {
			System.out.println("Error waiting for route type drop down select");
			Thread.sleep(1000);
		}
		return driver.findElement(By.xpath(ROUTE_TYPE_DROP_DOWN_X));
	}
	
	public WebElement getSaveBtn() throws InterruptedException {
		Thread.sleep(2000);
		try {
			wait.waitForElementByXPath(SAVE_BUTTON_X);
		}catch(Exception e) {
			System.out.println("Error waiting for the save button");
		}
		return driver.findElement(By.xpath(SAVE_BUTTON_X));
	}
	
	public WebElement getStartTimeSelectDropDownByCss() throws InterruptedException {
		
		Thread.sleep(1500);
		try {
			wait.waitForElementByCssSel(START_TIME_SELECT_DROPDOWN_CSS);
		}catch(Exception e) {
			System.out.println("Error waiting for Start Time Select drop down");
			Thread.sleep(1500);
		}
		
		return driver.findElement(By.cssSelector(START_TIME_SELECT_DROPDOWN_CSS));
	}
	
	public WebElement getEndTimeSelectDropDownByCss() throws InterruptedException {
		
		Thread.sleep(1500);
		try {
			wait.waitForElementByCssSel(END_TIME_SELECT_DROPDOWN_CSS);
		}catch(Exception e) {
			System.out.println("Error waiting for End Time Select drop down");
			Thread.sleep(1500);
		}
		
		return driver.findElement(By.cssSelector(END_TIME_SELECT_DROPDOWN_CSS));
	}
	
	/**
	 * Wait and return the element of stop duration drop down menu.
	 * @return WebElement
	 * @throws InterruptedException
	 */
	public WebElement getStopDurationByXpath() throws InterruptedException {
		try {
			wait.waitForElementByXPath(STOP_DURATION_X);
		} catch (Exception e) {
			System.out.println("Error on waiting for stop duration.");
			Thread.sleep(1500);
		}
		
		return driver.findElement(By.xpath(STOP_DURATION_X));
	}
	
	/**
	 * Wait and return the select field of transportation mode.
	 * @return Select
	 * @throws InterruptedException
	 */
	public Select getTransportationMode() throws InterruptedException {
		try {
			wait.waitForElementByXPath(TRANSPORTATION_MODE_X);
		} catch (Exception e) {
			System.out.println("Error on waiting for transportation mode select field.");
			Thread.sleep(1500);
		}
		
		return new Select(driver.findElement(By.xpath(TRANSPORTATION_MODE_X)));
	}
	
	/**
	 * Wait and return the element of start location input field.
	 * @return WebElement
	 */
	public WebElement getStartLocInput() {
		try {
			wait.waitForElementByXPath(START_LOC_X);
		} catch (Exception e) {
			System.out.println("Error on waiting for start location input field.");
		}
		
		return driver.findElement(By.xpath(START_LOC_X));
	}
	
	/**
	 * Set the xpath for result when search favorite location in start/end location.
	 * @param location
	 */
	public void setFavResult(String location) {
		favLocResult = "//li[@class='ui-menu-item']/a[text()='" + location + "']";
	}
	
	/**
	 * Wait and return the search result for favorite location in start/end location
	 * @return WebElement
	 */
	public WebElement getFavResult() {
		try {
			wait.waitForElementByXPath(favLocResult);
		} catch (Exception e) {
			System.out.println("Error on waiting for favorite location search result.");
		}
		
		return driver.findElement(By.xpath(favLocResult));
	}
	
	/**
	 * Wait and return the element of end location input field.
	 * @return WebElement
	 */
	public WebElement getEndLocInput() {
		try {
			wait.waitForElementByXPath(END_LOC_X);
		} catch (Exception e) {
			System.out.println("Error on waiting for end location input field.");
		}
		
		return driver.findElement(By.xpath(END_LOC_X));
	}
	
	/**
	 * Wait and return the element of favorite location search result container.
	 * @return WebElement
	 */
	public WebElement getFavSearchResultContainer() {
		try {
			wait.waitForElementByXPath(FAV_RESULT_CONTAINER_X);
		} catch (Exception e) {
			System.out.println("Error on waiting for favorite location search result container.");
		}
		
		return driver.findElement(By.xpath(FAV_RESULT_CONTAINER_X));
	}
}
