package methods;

public class MethodOverloading {
	  static int plusMethod(int x, int y) {
	    return x + y;
	  }
	  
//		With method overloading, multiple methods can have the same name with different parameters:
	  
	  static double plusMethod(double x, double y) {
	    return x + y;
	  }
	  
	  public static void main(String[] args) {
	    int myNum1 = plusMethod(8, 5);
	    double myNum2 = plusMethod(4.3, 6.26);
	    System.out.println("int: " + myNum1);
	    System.out.println("double: " + myNum2);
	  }
	}
