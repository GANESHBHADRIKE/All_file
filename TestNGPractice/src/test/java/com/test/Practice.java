package com.test;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Practice {
	
	
//	@Test
//	public void test1() {
//		
//		ArrayList<String> name  = new ArrayList<String>();
//		name.add("Ganesh");
//		name.add("sham");
//		name.add("adam");
//		name.add("Adarsh");
//		int count = 0;
//		
//		for(int i = 0;i<name.size();i++)
//		{
//			String actual = name.get(i);
//			
//			if(actual.startsWith("A"))
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
//		
//	}
	
	
	@Test
	public void test1() {
		
		ArrayList<String> name  = new ArrayList<String>();
		name.add("Ganesh");
		name.add("sham");
		name.add("adam");
		name.add("Adarsh");
		
		long a = name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(a);
		
	}

}
