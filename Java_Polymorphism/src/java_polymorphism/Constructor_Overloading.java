package java_polymorphism;

//Overloading is a process to implement Polymorphism in java
//( Constructor overloading, Method overloading )

public class Constructor_Overloading {
	
	public Constructor_Overloading() {

		System.out.println("Non-parameterized Constructor");
	}
	
	public Constructor_Overloading(int i) {
		System.out.println("Int parameterized Constructor, Value: "+i);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Constructor_Overloading co = new Constructor_Overloading();
		Constructor_Overloading coi = new Constructor_Overloading(10);
		
	}

}
