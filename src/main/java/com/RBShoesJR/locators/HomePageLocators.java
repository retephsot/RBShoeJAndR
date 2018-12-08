package com.RBShoesJR.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.RBShoesJR.helper.Waits;
import com.RBShoesJR.pages.PageBase;

public class HomePageLocators extends PageBase {
	
	public HomePageLocators(WebDriver driver) {
		super(driver);
	}
	
	Waits wait = new Waits(driver);
	Actions action = new Actions(driver);
	
		
	/**
	 * CSS SELECTOR locator for App Launcher button
	 */
	public static final String APP_LAUNCHER_BTN_CSS = ".appLauncher.slds-context-bar__icon-action button";
	public static final String APP_LAUNCHER_MODAL_HEADER_CSS = ".appLauncherModalHeader";
	
	
	public WebElement getAppLauncherBtnCss() throws InterruptedException {
		Thread.sleep(1500);
		try {
			wait.waitForElementByCssSel(APP_LAUNCHER_BTN_CSS);
		}catch(Exception e) {
			System.out.println("Error waiting for App Launcher button");
			Thread.sleep(1500);
		}
		
		return driver.findElement(By.cssSelector(APP_LAUNCHER_BTN_CSS));
	}
	
	
	public WebElement getAppLauncherModalHeader() throws InterruptedException {
		Thread.sleep(1500);
		try {
			wait.waitForElementByCssSel(APP_LAUNCHER_MODAL_HEADER_CSS);
		}catch(Exception e) {
			System.out.println("Error waiting for App Launcher Moldal Header");
		}	
		
		return driver.findElement(By.cssSelector(APP_LAUNCHER_MODAL_HEADER_CSS));
	}

}
