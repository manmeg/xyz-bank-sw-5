package com.bank.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Jay Vaghani
 */
public class RetryAnalyser implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 3;


    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount<maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
