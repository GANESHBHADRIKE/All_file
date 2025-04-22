package com.test;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void test1() {
		
		System.out.println("my first test case");
		
		
	}
	@Test(priority=1)
	public void test2() {
		
		System.out.println("my second test case");
		
		
	}
	
	
	@Test(groups= {"Smoke"})
	public void crp() {
		
		System.out.println("I an from smaoke grp class");
		
		
	}
	
	

}
