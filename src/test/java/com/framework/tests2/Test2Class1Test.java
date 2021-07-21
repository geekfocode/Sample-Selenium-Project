package com.framework.tests2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.framework.utility.Logging;

public class Test2Class1Test {
	
	@Test(priority = 1)
	@Parameters({"parameter1", "parameter2","Parameter3"})
	public void test2Class1Method1(Integer key1, String key2, @Optional("optional") String key3) {
		System.out.println("test2--Class1--Method1");
		System.out.println("Pring the value of the fetched parameter1 "+ key1+ " , value of parameter 2 "+key2+" and parameter 3 is "+key3);
	}
	
	@Test(enabled = true)
	public void test2Class1Method2() {
		System.out.println("test2--Class1--Method2");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"test2Class1Method4"})
	public void test2Class1Method3() {
		System.out.println("test2--Class1--Method3");
		Assert.assertTrue(true);
	}
	
	@Test(priority = -1, dependsOnGroups = {"Regression"}, alwaysRun = false, invocationCount = 1)
	public void test2Class1Method4() {
		System.out.println("test2--Class1--Method4");
	}
	
	@BeforeMethod(groups = {"Smoke","Regression"})
	public void test2Class1Method5() {
		System.out.println("test2--Class1--Method5--BEFORE METHOD");
		Assert.assertTrue(true);
	}
	
	@BeforeMethod()
	public void test2Class1Method6() {
		System.out.println("test2--Class1--Method6--BEFORE METHOD");
	}
	
	@AfterMethod(groups = {"Smoke","Regression"})
	public void test2Class1Method7() {
		System.out.println("test2--Class1--Method7--AFTER METHOD");
	}
	
	@AfterMethod
	public void test2Class1Method8() {
		System.out.println("test2--Class1--Method8--AFTER METHOD");
	}
	
	@AfterClass
	public void test2Class1Method10() {
		System.out.println("test2--Class1--Method10--AFTER CLASS");
	}
	
	@BeforeClass
	public void test2Class1Method11() {
		System.out.println("test2--Class1--Method11--BEFORE CLASS");
	}
	
	@AfterGroups(groups = {"Smoke","Regression"})
	public void test2Class1Method12() {
		System.out.println("test2--Class1--Method12--AFTER GROUPS");
	}
	
	@BeforeGroups(groups = {"Smoke","Regression"})
	public void test2Class1Method13() {
		System.out.println("test2--Class1--Method13--BEFORE GROUPS");
	}
	
	@AfterClass(groups = {"Smoke","Regression"})
	public void test2Class1Method14() {
		System.out.println("test2--Class1--Method14--AFTER CLASS");
		Assert.assertTrue(true);
	}
	
	@BeforeClass(groups = {"Smoke","Regression"})
	public void test2Class1Method15() {
		System.out.println("test2--Class1--Method15--BEFORE CLASS");
		Assert.assertTrue(true);
	}
	
	@Test(groups= {"Smoke"})
	public void test2Class1Method16() {
		System.out.println("test2--Class1--Method16--SMOKE GROUP");
		Logging.log().info("This is failed");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"Regression"}, priority = 1)
	public void test2Class1Method17() {
		System.out.println("test2--Class1--Method17--REGRESSION GROUP");
	}
}
