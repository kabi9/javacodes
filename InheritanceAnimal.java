
class Animal {
	
	//	field
	String name;
	
	//	method
	public void eat() {
		System.out.println(" I CAN EAT ALL DAY.");
	}
}

//	class
class Tiger extends Animal {
	
	//	method
	public void display() {
		System.out.println("My name is " + name);
	}
}


public class InheritanceAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger shera = new Tiger();
		shera.name = "SHERA";
		shera.eat();
		shera.display();
		

	}

}
