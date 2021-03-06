package com.RBShoesJR.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.RBShoesUI.testbase.TestBase;

public class HomeEmailReminderSubmitTest extends TestBase{
	
	@Test (dataProvider = "dataProvider")
	public void isHomeEmailSubmissionSuccessful(String email, String message) throws InterruptedException, 
	IOException 
	
  {		    
		boolean testResults = homepage.isEmailSubmissionSuccessful(email, message);
		
		Assert.assertTrue(testResults, "The email has not been successfully submitted.");		  						 			  						 	  						 	  						 
  }
}
