package java_polymorphism;

//Static methods can't be overridden as they are class methods, not instance methods,
//so they are dependent on the class reference type, not on the value assigned to it.
 

class Base_S{
	
	public static void run(){
		System.out.println("Base static run");
	}
	
	public void run_inst() {
		System.out.println("Base instance run");
	}
}

class Child_S extends Base_S{
	
	public static void run(){
		System.out.println("Child static run");
	}
	
	public void run_inst() {
		System.out.println("Child instance run");
	}
	
}

public class Test_Static_Overriding {
	
	public static void main(String[] args){
		
		Base_S b = new Child_S(); // assigning value of child obj to base ref
		
//		b.run(); // not recommended to call static method like that, as they should 
				 // be called in static way, ClassName.static_method() 
		
		Base_S.run(); //it will show 'Base static run'
		
		b.run_inst(); // it will hide the base class instance method (overrides) 
					  // and will show 'child instance run'
	}
}
