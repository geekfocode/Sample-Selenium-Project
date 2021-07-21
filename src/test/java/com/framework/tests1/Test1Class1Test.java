package com.framework.tests1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Test1Class1Test {
	
	@BeforeSuite()
	public void test1Class1Method1() {
		System.out.println("test1--Class1--Method1--BEFORE SUITE");
	}
	
	@AfterSuite
	public void test1Class1Method2() {
		System.out.println("test1--Class1--Method2--AFTER SUITE");
	}
	
	public void test1Class1Method3() {
		System.out.println("test1--Class1--Method3");
	}
	
	public void test1Class1Method4() {
		System.out.println("test1--Class1--Method4");
	}
	
	public void test1Class1Method5() {
		System.out.println("test1--Class1--Method5");
	}
	
	public void test1Class1Method6() {
		System.out.println("test1--Class1--Method6");
	}
	
	public void test1Class1Method7() {
		System.out.println("test1--Class1--Method7");
	}
	
	public void test1Class1Method8() {
		System.out.println("test1--Class1--Method8");
	}
	
	public void test1Class1Method9() {
		System.out.println("test1--Class1--Method9");
	}
}
