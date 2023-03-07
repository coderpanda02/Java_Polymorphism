package java_polymorphism;

// Runtime Polymorphism or Dynamic Method Dispatch -> resolving which method to call
// at runtime by the type of object assigned to the Base class reference.

class Shape{
	int l;
	int b;
	
	public Shape(int l,int b) {

		this.l = l;
		this.b = b;
	}
	
	public int getArea() {
		return 0;
	}
}

class Rectangle extends Shape{
	
	public Rectangle(int l, int b) {
		super(l,b);
	}

	public int getArea() {
		return l*b;
	}
}

class Triangle extends Shape{
	
	public Triangle(int l, int b) {
		super(l, b);
	}

	public int getArea() {
		return l*b/2;
	}
}

public class Runtime_Polymorphism {

	public static void main(String[] args) {

		Shape shape; //Parent reference variable
		
		//determines which method to call during runtime based on type of object
		
		shape = new Shape(10,20);
		System.out.println("Default Area Value of Shape : "+shape.getArea());
		
		shape = new Rectangle(10, 20); 
		System.out.println("Area of Rectangle : "+shape.getArea());
		
		shape = new Triangle(10, 20);
		System.out.println("Area of Triangle : "+shape.getArea());

	}

}
