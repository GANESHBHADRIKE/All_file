package oppsJava;

public class ClassandObject {
	
	
		
		private int x ;			// Attribute
		
		public void MyFunction() {		//	Function or Method
			
			System.out.println("This is my Function");
		}
	

	public static void main(String[] args) {

		ClassandObject obj = new ClassandObject();	// created the instance of the class
		
		obj.MyFunction();
		int y = obj.x = 5;
		System.out.println(y);
		
	}

	

}
	