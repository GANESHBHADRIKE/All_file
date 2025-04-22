package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	
	@AfterTest
	public void aftertestexecution()
	{
		System.out.println("i will execute after the test");
	}
	
	
	
	@Test(dependsOnMethods = {"test2"})
	public void test1() {
		
		System.out.println("my first test case of Test2");
		
		
	}
	@Test
	public void test2() {
		
		System.out.println("my second test case of Test2");
		
		
	}
	
	@BeforeTest
	public void beforetestrun() {
		
		System.out.println("I will be executed Before Test ");
		
	}
	
	@BeforeSuite
	public void Bfsuite() {
		
		System.out.println("I will be execute befor suite");
		
	}
	
	@BeforeClass
	public void bfclass()
	{
		System.out.println("I will execute before class");
	}
	
	@AfterClass
	public void Afclass()
	{
		System.out.println("I will execute after class");
	}
	
	
	@BeforeMethod
	public void Bfmethod() {
		
		System.out.println("I will execute Before method");
		
	}
	
	@Test(groups= {"Smoke"})
	public void arp() {
		
		System.out.println("I an from Test2 grp class");
		
		
	}
	
	@Test(enabled = false)
	public void enabledMethod()
	{
		
		System.out.println("I am the EnabledMethod");
		
	}
	
	@Test(timeOut = 10000)
	public void timeoutMethod()
	{
		
		System.out.println("I am the EnabledMethod");
		
	}

}
