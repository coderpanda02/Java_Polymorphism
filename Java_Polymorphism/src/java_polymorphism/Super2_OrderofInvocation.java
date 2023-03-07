package java_polymorphism;

class Fruit1{
	
	public Fruit1() {
		System.out.println("Fruit no-arg constructor.");
	}
	
	public Fruit1(int i) {
		System.out.println(i+" Fruits.");
	}
}


class Berry extends Fruit1{
	
	public Berry() {
		
		super(50); //super constructor call should be the 1st statement
		//will print 50 Fruits, Berry no arg, Blackberry no-arg constructor
		//when called by new Blackberry()
		
		System.out.println("Berry no-arg constructor.");
	}
	
	public Berry(int i) {
		
		//super calls immediate parent's (here, Fruit's) constructor
		super(10); //if super(10) not given-> super(), i.e fruit no-arg will be called
				  
		System.out.println(i+" Berries.");
	}
}


class Blackberry extends Berry{
	
	public Blackberry() { //it will automatically invoke super(), i.e Berry()
		System.out.println("Blackberry no-arg constructor.");
	}
	
	public Blackberry(int i) {
		
		//super calls immediate parent's(berry's) constructor
		super(100);//if super(100) not given, then it will call 
					//berry's no arg constructor (and Fruit(50) inside Berry())
		System.out.println(i+" Blackberries.");
	}
}

public class Super2_OrderofInvocation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Blackberry black = new Blackberry();
		System.out.println();
		
		Fruit1 f = new Fruit1(11);
		System.out.println();
		
		Berry b = new Berry(12);
		System.out.println();
		
		Blackberry bl = new Blackberry(1000);

	}

}
