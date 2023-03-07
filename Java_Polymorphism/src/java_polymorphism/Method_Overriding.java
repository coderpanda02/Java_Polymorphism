package java_polymorphism;


class Parent_Class{
		
	void show() {
		System.out.println("inside Parent Class Method");
	}
}

class Child_Class extends Parent_Class{
		
	void show() {
		System.out.println("inside Child Class Method");
	}
}


public class Method_Overriding {

	public static void main(String[] args) {
		
		Parent_Class p = new Parent_Class();
		Child_Class c = new Child_Class();
		
		p.show(); 
		c.show(); //child hides the parent class method, shows child class show()

	}

}
