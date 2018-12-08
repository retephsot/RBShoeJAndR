package com.RBShoesJR.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.RBShoesJR.helper.Waits;
import com.RBShoesJR.pages.PageBase;

public class CreateNewAppointmentPageLocators extends PageBase {
	
	public CreateNewAppointmentPageLocators(WebDriver driver) {
		super(driver);
	}
	
	Waits wait = new Waits(driver);
	Actions action = new Actions(driver);
	
	/**
	 * XPath Locators
	 */
	public static final String SERVICE_LIST_DROPDOWN_MENU_LIST_BTN_X = "//div[contains(@class,'slds-input-has-icon--right serviceLookup')]//button";
	
	
	/**
	 * CssSel Locators
	 */
	public static final String LOOK_UP_MENU_SERVICE_LIST_CSS = ".slds-lookup__menu.serviceList";
	/**
	 * 
	 * @return
	 * @throws InterruptedException
	 */	
	public WebElement getServiceListDropDownMenuBtnXPath() throws InterruptedException {
		Thread.sleep(1500);
		try {
			wait.waitForElementByXPath(SERVICE_LIST_DROPDOWN_MENU_LIST_BTN_X);
		}catch(Exception e) {
			System.out.println("Error waiting for the service list drop down menu button");
		}
		return driver.findElement(By.xpath(SERVICE_LIST_DROPDOWN_MENU_LIST_BTN_X));
	}
	
	public WebElement getServiceListLookUpResultCss() throws InterruptedException {
		Thread.sleep(1500);
		try {
			wait.waitForElementByCssSel(LOOK_UP_MENU_SERVICE_LIST_CSS);
		}catch(Exception e) {
			System.out.println("Error waiting for service menu lookup result");
		}
		return driver.findElement(By.cssSelector(LOOK_UP_MENU_SERVICE_LIST_CSS));
	}

}
