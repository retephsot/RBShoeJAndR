package com.RBShoesJR.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.RBShoesJR.helper.Waits;
import com.RBShoesJR.pages.PageBase;

public class MonthPageLocators extends PageBase{
	private Waits wait;
	
	// Elements xpathes
	/**Xpath for loading icon.*/
	public static final String LOADING_ICON_X = "//div[@id='PlottedQueriesTable']//div[@class='loading-icon-positioning queryLoader']";
	
	//Elements Css selectors
	/**Css selector for Basic info name.*/
	public static final String BASIC_INFO_NAME_CSS = ".PlottedRowUnit.savedQuery .header .basicinfo div.basicinfo-name";
	
	//Dynamic xpath
	/**Dynamic xpath for marker in the folder, use setter to set xpath.*/
	private String markerX;
	
	public MonthPageLocators(WebDriver driver) {
		super(driver);
		wait = new Waits(driver);
	}
	
	/**
	 * Using the given marker name to set the xpath
	 * @param markerName marker name.
	 */
	public void setMarkerX(String markerName) {
		markerX = "//div[@id='layer-tab-folders']//div[@class='folderItem']//div[contains(@class,'ftu-text inline layerName') and text()='" + markerName + "']";
	}
	
	public WebElement getMarker() throws InterruptedException {
		try {
			wait.waitForElementByXPathS4(markerX);
		}catch(Exception e) {
			System.out.println("Error waiting for query name");
			Thread.sleep(1500);
		}
		
		return driver.findElement(By.xpath(markerX));
	}
}
