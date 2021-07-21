package com.framework.tests2;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2Class2Test {
	
	@AfterTest(groups = {"Smoke","Regression"})
	public void test2Class2Method1() {
		System.out.println("test2--Class2--Method1--AFTER TEST");
		Assert.assertTrue(true);
	}
	
	@BeforeTest(groups = {"Smoke","Regression"})
	public void test2Class2Method2() {
		System.out.println("test2--Class2--Method2--BEFORE TEST");
	}
	
	@Test
	public void test2Class2Method3() {
		System.out.println("test2--Class2--Method3");
	}
	
	@Test(priority = 10, groups = {"Smoke"})
	public void test2Class2Method4() {
		System.out.println("test2--Class2--Method4== SMOKE GROUP");
		Assert.assertTrue(false);
	}
	
	public void test2Class2Method5() {
		System.out.println("test2--Class2--Method5");
	}

}
