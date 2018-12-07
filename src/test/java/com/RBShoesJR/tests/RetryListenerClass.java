package com.RBShoesJR.tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import com.RBShoesJR.tests.RetryFailedTestCases;

public class RetryListenerClass implements IAnnotationTransformer {
	
	@Override
	public void transform(ITestAnnotation testannotation, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer retry = testannotation.getRetryAnalyzer();
		
		if (retry == null) {
			testannotation.setRetryAnalyzer(RetryFailedTestCases.class);
		}
	}

}
