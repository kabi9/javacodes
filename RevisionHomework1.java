class Person11 {
	int age;
	String name;
	static String country = "NEPAL";
	
	public Person11(int ag, String nm){		//	constructor used
		this.age = ag;
		this.name = nm;
		
	}
	
	public void eat() {
		System.out.println("I like eating chocolates.");
		System.out.println(this.name); 		// access properties inside method, using this keyword
	}
	
	public void run() {
		System.out.println("I like running fast.");
	}
	
	public static void Cal(){
		System.out.println(" Called without object");
	}
}	
public class RevisionHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person11 kabi = new Person11(20,"Kabi Adhikari");
		Person11 kabindra = new Person11(34,"Kabindra Adhikari");
		
		System.out.println(kabi.age);
		System.out.println(kabi.name);
		
		kabi.eat();
		kabi.run();
		
		kabindra.eat();
		
		Person11.Cal();
		System.out.println(Person11.country);
		
		
	}

}