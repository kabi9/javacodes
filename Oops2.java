class Person2{
	int weight;
	int age;
	int height;
	String country = "Nepal";
	
	// CONSTRUCTOR
	// SET CLASS PROPERTY VALUES AT TIME OF OBJECT CREATION
	Person2 (int ag, int wi, int hi){
		this.age = ag;
		this.weight = wi;
		this.height = hi;
	}
	
	public static void talk() {
		System.out.println("HELLO");
	}
	public static void sleep() {
		System.out.println("GOODNIGHT");
	}
	
	
}






public class Oops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person2 amol = new Person2(12,34,5);
		System.out.println(amol.age);
		System.out.println(amol.weight);
		System.out.println(amol.height);
		
		Person2 sarika = new Person2(11,35,6);
		System.out.println(sarika.age);
		System.out.println(sarika.weight);
		System.out.println(sarika.height);
		
		System.out.println(sarika.country);
		System.out.println(amol.country);
		
		
	}

}
