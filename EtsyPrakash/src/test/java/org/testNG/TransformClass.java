package org.testNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class TransformClass implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation i, Class testClass, Constructor testConstructor, Method testMethod) {
		
		IRetryAnalyzer r = i.getRetryAnalyzer();
		
		i.setRetryAnalyzer(IretryAnalyzerclass.class);
			
		
	}

	

}

