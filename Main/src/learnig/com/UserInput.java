package learnig.com;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		System.out.println("Enter your name");
		Scanner obj = new Scanner(System.in); // create an object of the Scanner class
		int username = obj.nextInt();
		System.out.println(username);
		
	}

}
