package org.testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalyzerclass implements IRetryAnalyzer {

	int min=0;
	int max=3;

	public boolean retry(ITestResult result) {
		
		if (min<max) {
			min++;
			return true;
		
		}
		
		return false;
	}

}
