package learnig.com;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// widening data type casting
		
//		int a = 45;
//		double mydouble = a;
//		System.out.println(mydouble);
		
		// narrowing data type casting
//		double mydouble = 45.0d;
//		int  myint = (int) mydouble; // narrowing type has be done from double to int
//		System.out.println(myint);
		
//		byte mybyte = 127;
//		int myinteger = mybyte;
//		System.out.println(myinteger);
		
		// Set the maximum possible score in the game to 500
		int maxScore = 500;

		// The actual score of the user
		int userScore = 423;

		/* Calculate the percantage of the user's score in relation to the maximum available score.
		Convert userScore to float to make sure that the division is accurate */
		float percentage = (float) userScore / maxScore * 100.0f;

		System.out.println("User's percentage is " + percentage);
		System.out.println("this is Ga \bnesh your hero");
		

	}

}
