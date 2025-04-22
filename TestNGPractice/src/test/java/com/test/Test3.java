package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
	
	@BeforeTest
	public void bftest()
	{
		System.out.println("I will execute once before all the test case run");
	}
	
	
	@Test
	public void  weblogincarloan()
	{
		System.out.println("This is web car loan of test3");
	}
	
	
	@Test
	public void  mobilelogincarloan()
	{
		System.out.println("This is mobile car loan of test3");
	}
	
	@Test
	public void  apilogincarloan()
	{
		System.out.println("This is api car loan of test3");
	}
	
	@BeforeMethod
	public void Bfsuite() {
		
		System.out.println("I will execute befor method");
		
	}
	
	
	@Test(groups= {"Smoke"})
	public void drp() {
		
		System.out.println("I an from Test3 grp class");
		
		
	}

}
