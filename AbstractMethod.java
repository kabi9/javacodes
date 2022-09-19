abstract class Plants {
// a simple  class can have both abstract and normal method
// abstract method, they will not have body
// make class abstract if there is one abstract method
	
	// ABSTRACT METHOD
	abstract void eat();
	
	// NORMAL METHOD
	public void gives() {
		System.out.println("GIVES OS OXYGEN");
	}
}
class Bamboo extends Plants{
	
	public void eat() {
		System.out.println("I EAT SUNLIGHT");
	}
}
	
public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bamboo b = new Bamboo();
		b.gives();
		b.eat();
		
	}

}
