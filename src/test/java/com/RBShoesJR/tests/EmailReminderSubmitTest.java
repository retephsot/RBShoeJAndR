package com.RBShoesJR.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.RBShoesUI.testbase.TestBase;

public class EmailReminderSubmitTest extends TestBase	{
	
	@Test (dataProvider = "dataProvider")
	public void isEmailSubmissionSuccessful(String month, String email, String message) throws InterruptedException, 
	IOException 
	
  {		    
		boolean testResults = homepage.clickMonthLink(month)
								      .isEmailSubmissionSuccessful(email, message);
		
		Assert.assertTrue(testResults, "The email has not been successfully submitted.");		  						 			  						 	  						 	  						 
  }
}
