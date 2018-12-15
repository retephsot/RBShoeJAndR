package com.RBShoesJR.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.RBShoesUI.testbase.TestBase;

public class ShoePriceAvailableTest extends TestBase {
	
	@Test (dataProvider = "dataProvider")
	public void isShoePriceAvailable(String month) throws InterruptedException, 
	IOException
	
  {		    
		boolean testResults = homepage.clickMonthLink(month)
								      .isShoePriceAvailable();
		
		Assert.assertTrue(testResults, "The shoe price is not available.");		  						 			  						 	  						 	  						 
  }
}
