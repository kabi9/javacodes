class info2 {
	
	static String subjecta = "Maths";
	String subjectb = "Java";
	
	// For static methods and properties we don't require instance i.e objects
	// access the non - static field in non static method use 'this' keyword
	// access the static field in non - static method use className to access it
	
	public static int addition(int x , int y) {
		System.out.println("Addition of x and y :"+ x+y);
		return x + y ;
	}
	
	public void displayS(){
		System.out.println("Hello subjects :");
		System.out.println(this.subjectb);
		System.out.println(info2.subjecta);
	}
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		info2 a1 = new info2();
		a1.displayS();
		
		
		// static fields and methods can be directly called on class name
		int a = info2.addition(12, 23);
		System.out.println(a);

		System.out.println(info2.subjecta);
	}

}
