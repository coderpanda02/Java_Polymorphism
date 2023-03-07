package java_polymorphism;

//	Constructor Overriding is not possible in Java. Constructor looks like a
//	method but has no return type and should have the same name as the class name.
//	On the other hand, a overridden method should have the same name as the 
//	base class method. Thus overriding constructor is not possible as both parent 
//	class and child class can't have the same name.

class Con_Ov1{
	
	public Con_Ov1() {
		System.out.println("\nCalling Base Class Constructor");
	}
}

class Con_Ov2 extends Con_Ov1{
	
//	public Con_Ov1() { //compiler thinks of it as a method and gives error -
						//Return type for the method is missing	
//	}	 
	
	public Con_Ov2() {
		System.out.println("Calling Child Class Constructor");
	}
}

public class Test_Constructor_Overridding {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Con_Ov1 co1 = new Con_Ov1(); // calling base class constructor separately
				
		Con_Ov2 co2 = new Con_Ov2(); // it will call both the parent and child class
								 //constructors as whenever the instance of a subclass 
					   //is created, an instance of parent class is created implicitly.
		
	}

}
