
public class Oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CREATING A OBJECT
		
		Person3 kabindra = new Person3();
		System.out.println(kabindra.age);
		System.out.println(kabindra.rollNo);
		System.out.println(kabindra.city);

		Person3 asha = new Person3();
		
		asha.age = 20;				// UPDATE THE AGE FOR ASHA
		System.out.println(asha.age);
		System.out.println(kabindra.age);
		System.out.println(asha.city);
	}

}

class Person3 {
	
	// CREATING FIELDS
	int age = 15;
	int rollNo = 25;
	String city = "pokhara";
	
	// CREATING METHODS
	public static void walk() {
		System.out.println("WALKING");
	}
	
	public static void talk() {
		System.out.println("TALKING");
	}
}