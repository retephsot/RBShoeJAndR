package com.RBShoesJR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
	
	public HomePage (WebDriver driver)
	{
		super(driver);
	}
	
	public MonthPage clickMonthLink(String month) throws InterruptedException
	{
		waitForElementByLinkText(month);
		driver.findElement(By.linkText(month)).click();
		
		waitForElementByClass("title");
		
		return new MonthPage(driver);
		
		
	}

}
