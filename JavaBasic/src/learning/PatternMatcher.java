package learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile("Ganesh");
		Matcher matcher = pattern.matcher("Ganesh Ramesh Bhadrike");
		
		boolean match = matcher.find();
		
		if(match) {
			System.out.println("found"+matcher.group());
		}
		else {
			System.out.println("not found");
		}
	}

}