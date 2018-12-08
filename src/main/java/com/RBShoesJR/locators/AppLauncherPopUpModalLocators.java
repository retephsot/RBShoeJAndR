package com.RBShoesJR.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.RBShoesJR.helper.Waits;
import com.RBShoesJR.pages.PageBase;

public class AppLauncherPopUpModalLocators extends PageBase {
	
	public AppLauncherPopUpModalLocators(WebDriver driver) {
		super(driver);
	}
	
	Waits wait = new Waits(driver);
	Actions action = new Actions(driver);
	
	/**
	 * CssSelector locators
	 */
	public static final String APP_LAUNCHER_MODAL_HEADER_CSS = ".appLauncherModalHeader";
	
	/**
	 * XPath locators
	 */
	public static final String APPOINTMENTS_PAGE_LINK_X = "//span[@class='label slds-truncate slds-text-link'][text()='Appointments']";
	
	/**
	 * @return
	 * @throws InterruptedException
	 */
	
	public WebElement getAppLauncherModalHeader() throws InterruptedException {
		Thread.sleep(1500);
		try {
			wait.waitForElementByCssSel(APP_LAUNCHER_MODAL_HEADER_CSS);
		}catch(Exception e) {
			System.out.println("Error waiting for App Launcher Moldal Header");
		}	
		
		return driver.findElement(By.cssSelector(APP_LAUNCHER_MODAL_HEADER_CSS));
	}
	
	public WebElement getAppointmentsPageLinkXPath() throws InterruptedException {
		
		Thread.sleep(1500);
		try {
			wait.waitForElementByXPath(APPOINTMENTS_PAGE_LINK_X);
		}catch(Exception e) {
			System.out.println("Error waiting for Appointments Page Link");
			Thread.sleep(1500);
		}
		return driver.findElement(By.xpath(APPOINTMENTS_PAGE_LINK_X));
	}

}
