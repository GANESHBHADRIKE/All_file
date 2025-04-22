package learning;

public class MyMethods {

	
	static void staticmethod() {
		
		System.out.println("this is a static method");
	}
	
	
	public void mymet() {
		System.out.println("this is a public method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMethods obj = new MyMethods();
		staticmethod();
		obj.mymet();
		
		

	}

}
