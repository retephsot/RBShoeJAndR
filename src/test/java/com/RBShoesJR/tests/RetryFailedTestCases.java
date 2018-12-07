package com.RBShoesJR.tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {
	
	private int retryCt = 0;
	private int maxRetry = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		if (retryCt < maxRetry) {
			System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCt+1));
			retryCt++;
			return true;
		}
		return false;
	}

}
