class AnimalA {
	public void display() {
		System.out.println("I am from AnimalA class.");
	}
}

class DogA extends AnimalA{
	public void display() {
		System.out.println("I am from DogA class.");
	}
	
	public void message() {
		display();
		super.display(); 		// CALL DISPLAY METHOD OF PARENT.
	}
	
	
}
public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DogA a = new DogA();
		
		a.message();
	}

}
