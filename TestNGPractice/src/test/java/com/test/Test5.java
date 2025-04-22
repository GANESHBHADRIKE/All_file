package com.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test5 {

//	@Parameters({"MainURL","site"})
//	@BeforeTest
//	public void parametrize(String mainwebsite, String website )
//	{
//		System.out.println(mainwebsite);
//		System.out.println(website);
//	}

	@Test(dataProvider = "dataprovider2")
	public void datatocatch(String username, String password) {
		System.out.println(username);
		System.out.println(password);

	}

	@DataProvider
	public Object[][] dataprovider() {
		// username and password
		// It is of two row and three coloum
		Object[][] data = new Object[3][2];

		// First set

		data[0][0] = "first_username";
		data[0][1] = "first_password";

		// First set

		data[1][0] = "second_username";
		data[1][1] = "second_password";

		// First set

		data[2][0] = "third_username";
		data[2][1] = "third_password";
		return data;
	}

	@DataProvider
	public Object[][] dataprovider2() {
		return new Object[][] { 
			
			{ "username1","password1" }, 
			{ "username2","password2" }

		};
	}
}
