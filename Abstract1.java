abstract class Greet {
			
			// we cannot create object of abstract class
			// we cannot create object of class with abstract method
	
	public void display() {
		System.out.println("Good Morning !");
	}
}
public class Abstract1 extends Greet {
	
	// cannot create object of abstract class, but can inherit class and use method on other class 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Abstract1 one = new Abstract1();
		one.display();;
	

	}

}
