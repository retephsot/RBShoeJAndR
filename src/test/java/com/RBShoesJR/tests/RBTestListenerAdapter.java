package com.RBShoesJR.tests;

import java.util.Iterator;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class RBTestListenerAdapter extends TestListenerAdapter {
	
	@Override
	public void onFinish(ITestContext context) {
		Iterator<ITestResult> skippedTestCases = context.getSkippedTests().getAllResults().iterator();
		while (skippedTestCases.hasNext()) {
			ITestResult skippedTestCase = skippedTestCases.next();
			ITestNGMethod skipmethod = skippedTestCase.getMethod();
			
			boolean removed = false;
			if (context.getSkippedTests().getResults(skipmethod).size() > 0 ) {
				Iterator<ITestResult> failedTestCases = context.getFailedTests().getAllResults().iterator();
				while(failedTestCases.hasNext()) {
					ITestResult failedTestCase = failedTestCases.next();
					if(skippedTestCase.getName().equals(failedTestCase.getName())) {
						System.out.println("Removing:" + skippedTestCase.getTestClass().toString());
						skippedTestCases.remove();
						removed = true;
					}
				}
				
				
				Iterator<ITestResult> passedTestCases = context.getPassedTests().getAllResults().iterator();
				while(passedTestCases.hasNext() && !removed) {
					ITestResult passedTestCase = passedTestCases.next();
					if(skippedTestCase.getName().equals(passedTestCase.getName())) {
						System.out.println("Removing:" + skippedTestCase.getTestClass().toString());
						skippedTestCases.remove();
					}
				}
			}
		}
	}

}
