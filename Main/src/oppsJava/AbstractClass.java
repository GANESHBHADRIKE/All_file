package oppsJava;

abstract class AbstractClass {
	
	public int age;
	abstract void MyMethod();
}

class ChildClass extends AbstractClass{
	
	public int graduction = 2012;
	public  void MyMethod(){
		System.out.println("abstract method print here");
		
		
	}
	
}

	


 
