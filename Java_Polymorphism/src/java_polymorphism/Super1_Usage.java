package java_polymorphism;

//The super keyword in Java is used to refer immediate parent class object.
//Whenever you create the instance of subclass,an instance of parent class is
//created implicitly which is referred by Super.
//It is used to refer the super class instance variable, or constructor, or method.

class Super_Class{
	
	int i = 10;
	String name = "Super_Class";
	
	public Super_Class() {
		System.out.println("Inside Super Class constructor");
	}
	
	protected void display() {
		System.out.println("Inside Super Class Method : name : "+name);
	}
}

class Sub_Class extends Super_Class{
	
	int i = 20;
	String name = "Sub_Class";

	public Sub_Class() {
		
		super();
		System.out.println("Inside Sub Class Constructor\n");
//		super(); //it will give error - Constructor call must be the
				 //first statement in a constructor

	}
	
	public void display() {
		
		System.out.println("Inside Sub Class Method : name : "+name);
		System.out.println("Calling super.display() ->");
		super.display(); //calling superclass method
		
		System.out.println("\nSub class variable : "+i);
		System.out.println("Super class variable : super.i : "+super.i);

	}
}


public class Super1_Usage {

	public static void main(String[] args) {
		
		Sub_Class s = new Sub_Class();
		s.display();
		
	}
}
