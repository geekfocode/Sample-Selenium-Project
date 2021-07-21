package com.framework.tests2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2Class3Test {
	
	@BeforeSuite(groups = {"Smoke","Regression"})
	public void test2Class3Method1() {
		System.out.println("test2--Class3--Method1--BEFORE SUITE");
	}
	
	@AfterSuite(groups = {"Smoke","Regression"})
	public void test2Class3Method2() {
		System.out.println("test2--Class3--Method2--AFTE SUITE");
	}
	
	@Test
	public void test2Class3Method3() {
		System.out.println("test2--Class3--Method3");
	}
	
	@Test
	public void test2Class3Method4() {
		System.out.println("test2--Class3--Method4");
	}

}
