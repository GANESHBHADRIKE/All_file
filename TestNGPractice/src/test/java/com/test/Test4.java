package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {
	
	@Test
	public void  webloginhomeloan()
	{
		System.out.println("This is web home loan");
	}
	
	
	@Test
	public void  mobileloginhomeloan()
	{
		System.out.println("This is mobile home loan");
	}
	
	@Test
	public void  apiloginhomeloan()
	{
		System.out.println("This is api home loan");
	}

	@Test(groups= {"Smoke"})
	public void brp() {
		
		System.out.println("I an from Test4 grp class");
		
		
	}
	
	@Parameters({"MainURL","site"})
	@Test
	public void parametrize(String mainwebsite, String website )
	{
		System.out.println(mainwebsite);
		System.out.println(website);
	}

	
}
