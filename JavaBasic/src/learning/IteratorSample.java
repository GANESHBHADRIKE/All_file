package learning;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<>();
		str.add("Ganesh");
		
		
		System.out.println(str);
		
		Iterator<String> it =  str.iterator();
		String first = it.next();
		System.out.println(first);
		try {
			String second = it.next();	
			System.out.println(second);
			}
		catch(Exception e) {
			System.out.println("no such element");
		}
		

	}

}
