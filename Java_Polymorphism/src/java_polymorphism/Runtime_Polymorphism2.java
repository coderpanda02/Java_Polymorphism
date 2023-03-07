package java_polymorphism;

class Fruit {
	
	protected String name;
	protected String taste;
	protected String size;
	
	public Fruit(String name, String taste, String size) {
		
		this.name = name;
		this.taste = taste;
		this.size = size;
	}
	public void eat() {
		System.out.println("Name: "+name+"\nTaste: "+taste);
	}
}

class Apple extends Fruit {

	public Apple(String name, String taste, String size) {
		super(name, taste, size);		
	}

	public void eat() {
		System.out.println("Taste: "+taste);
	}
}

class Orange extends Fruit {
	
	public Orange(String name, String taste, String size) {
		super(name, taste, size);

	}

	public void eat() {
		System.out.println("Taste: "+taste);
	}
}
public class Runtime_Polymorphism2 {

	public static void main(String[] args) {
		
		Fruit f;
		f = new Apple("Apple","Sweet","Medium");
		f.eat();
		
		f = new Orange("Orange","Sour","Medium");
		f.eat();
	}

}
