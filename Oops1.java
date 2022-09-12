
public class Oops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// STRING
		// ARRAY
		// INT
		// BOOLEAN
		// OBJECT
		
		Person amol = new Person();
		
		// accessing the fields
		System.out.println(amol.height);
		System.out.println(amol.weight);
		System.out.println(amol.age);
		
		// calling the method on object
		amol.walk();
		amol.talk();
		
		// PERSON ----- OBJECT
		// HEIGHT, WEIGHT, AGE ---- FIELDS
		// WALK(), TALK() --------- METHODS
		
		Person sarika = new Person();
		// accessing the fields
		System.out.println(sarika.height);
		System.out.println(sarika.weight);
		System.out.println(sarika.age);
				
		// calling the method on object
		sarika.walk();
		sarika.talk();
		
		sarika.age = 30;
		System.out.println(sarika.age);
		System.out.println(amol.age);
				
	}

}

class Person {
		// PROPERTIES AND METHODS
		// FIELDS AND METHODS
	
	// FIELDS
	int height = 5;
	int weight = 10;
	int age = 20;
	
	// METHODS
	public static void walk() {
		System.out.println(" I AM WALKING");
	}
	public static void talk() {
		System.out.println(" I AM TALKING");
	}
	
	
}
