package com.RBShoesJR.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.RBShoesJR.pages.PageBase;

public class JSHelp extends PageBase {
	
	public JSHelp(WebDriver driver) {
		super(driver);
	}
	
	public void jsClickXPath(WebElement xPathLoc) {
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", xPathLoc);
		
	}
	
	public void jsScrollIntoViewXPath(WebElement xPathLoc) {
		
		((JavascriptExecutor)driver).executeScript("arguments[0].srollIntoView(true);", xPathLoc);

	}
	
	public void jsSendKeysXPath(String sendKeyStr, WebElement xPathLoc) {
		
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('innerHTML','" + sendKeyStr + "');", xPathLoc);
		
	}
	
	/*
	 * JS help using cssSelector locator
	 */
	public void jsClickCssSel(WebElement cssSelLoc) {
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", cssSelLoc);
		
	}

}
