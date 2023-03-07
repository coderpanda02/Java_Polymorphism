package java_polymorphism;

//Method Overloading or Compile Time Polymorphism -> 
//determines which method to call at compile time

public class Method_Overloading {
	
	public void show() {	
		System.out.println("Inside the non-parameterized show method");
	}
	
	public void show(int i) {
		System.out.println("\nInside int parameterized show method, value: "+i);
	}
	
	public void show(String str) {
		System.out.println("\nInside string parameterized show method, value: "+str);
	}

	public static void main(String[] args) {
		
			Method_Overloading m = new Method_Overloading();
			
			m.show();
			m.show(1);
			m.show("Hello");
	}

}
