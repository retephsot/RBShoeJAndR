package com.RBShoesJR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.RBShoesJR.helper.Waits;
import com.RBShoesJR.locators.HomePageLocators;
import com.RBShoesJR.pages.AppLauncherPopUpModal;

public class HomePage extends PageBase{
	
	public HomePage (WebDriver driver)
	{
		super(driver);
	}
	
	Waits wait = new Waits(driver);
	HomePageLocators locators = new HomePageLocators(driver);
	
	public MonthPage clickMonthLink(String month) throws InterruptedException
	{
		waitForElementByLinkText(month);
		driver.findElement(By.linkText(month)).click();
		
		waitForElementByClass("title");
		
		return new MonthPage(driver);	
		
	}
	
	public AppLauncherPopUpModal navigateToAppLauncherModal() throws InterruptedException {
		Thread.sleep(2500);
		locators.getAppLauncherBtnCss().click();
		Thread.sleep(2000);
		try{
			wait.waitForElementByCssSel(locators.APP_LAUNCHER_MODAL_HEADER_CSS);
		}catch(Exception e) {
			System.out.println("Error waiting for App Launcher Modal Header");
		}
		
		return new AppLauncherPopUpModal(driver);
	}

}
