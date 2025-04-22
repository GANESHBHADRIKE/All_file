package com.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	
	@Override
    public void onTestStart(ITestResult result) {
        // This method will be called when a test method starts
		System.out.println("Test is running ");
       
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // This method will be called when a test method is successful
        System.out.println("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // This method will be called when a test method fails
       
    }

    
    @Override
    public void onTestSkipped(ITestResult result) {
        // This method will be called when a test method fails
       // System.out.println("Test Skipped: " + result.getName());
    }
}
