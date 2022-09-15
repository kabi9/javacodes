class Animals{
	
	//	method
	public void eat() {
		System.out.println("I EAT ALL DAY.");
	}
}

class Dog extends Animals {
	
	@Override
	public void eat() {
		System.out.println("I AM EATING MY OWN DOG FOOD");
		super.eat();
	}
	
}
public class InheritanceSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog puppy = new Dog();
		puppy.eat();
	}

}
