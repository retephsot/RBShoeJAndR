package com.RBShoesJR.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.RBShoesJR.helper.Waits;

public class AppLauncherPopUpModal extends PageBase {
	
	public AppLauncherPopUpModal(WebDriver driver) {
		super(driver);
	}
	
	Actions action = new Actions(driver);
	Waits wait = new Waits(driver);
	
	

}
