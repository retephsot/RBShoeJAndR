package com.RBShoesJR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase 
{

	protected WebDriver driver;
	
	public PageBase (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public MonthPage ClickMonthLinkk(String month) throws InterruptedException
	{
	    driver.findElement(By.linkText(month)).click();
	    Thread.sleep(1000);
		return new MonthPage(driver);
	}
	
	public boolean isEmailSubmitFieldAvailable () 
	{	
		boolean testresults = driver.findElement(By.id("remind_email_input")).isDisplayed();
				
		System.out.println("The test result is " + testresults);		
		
		return testresults;
			
	}
	
	public boolean isEmailSubmissionSuccessful (String email, String message) throws InterruptedException 
	{	
		driver.findElement(By.id("remind_email_input")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("remind_email_submit")).click();
		waitForElementByCssSel(".flash.flash_success");
		
		boolean testresults = driver.findElement(By.cssSelector(".flash.flash_success")).getText().contains(message + " " + email);
				
		System.out.println("The test result is " + testresults);		
		
		return testresults;
			
	}
	
	public void waitForElementByID(String elementID) {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));	
	}
	
	public void waitForElementByClass(String elementClass) {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.className(elementClass)));
	}
	
	public void waitForElementByCssSel(String elementCSS) {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementCSS)));
	}
	
	public void waitForElementByLinkText(String elementLinkText) {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.linkText(elementLinkText)));
	}

}
