class Gf{
	String fN;
	String lN;
	Gf(String fN, String lN){		// constructor
		this.fN = fN;
		this.lN = lN;
	}
	public void names() {
		System.out.println(this.fN + this.lN);
	}
}
class F extends Gf{
	String ffN;
	F(String fN, String lN, String ffN){
		super(fN,lN);
		this.ffN = ffN;
	}
	@Override
	public void names() {
		System.out.println( this.ffN + this.fN + this.lN );
		super.names();
	}
	
}

class S extends F{
	String sfN;
	S(String fN, String lN, String ffN,  String sfN){
		super(fN,lN,ffN);
		this.sfN = sfN;
	}
	@Override
	public void names() {
		System.out.println( this.sfN + this.ffN + this.lN );
		super.names();
	}
	
}





class AddA{
	
	int a = 10;
	int b = 20;	
	
	public void AdditionA() {
		System.out.println(this.a + this.b);
	}
		
}

class Overloading{
	public void multiply() {
		System.out.println("*");
	}
	public void multiply(char symbol) {
		System.out.println('$');
	}
}

class Big{
	public void language() {
		System.out.println(" Main programming language");
	}
}

class Small extends Big{
	
	@Override
	public void language() {
		System.out.println(" Java language");
		super.language();
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	PROGRAM 1: WRITE A PROGRAM TO FIND GREATEST BETWEEN TWO NUMBERS
		
		int x = 10;
		int y = 5;
		
		if (x>y) {
			System.out.println("x is greater");
		}
		else {
			System.out.println("y is greater");
		}
	// PROGRAM 2: WRITE ANY 5 METHODS OF STRING
		
		String city = "pokhara";
		String city2 = "pune";
		System.out.println(city.toLowerCase());
		System.out.println(city.toUpperCase());
		System.out.println(city.concat(city2));
		System.out.println(city.equals(city2));
		System.out.println(city.charAt(2));
		
	// PROGRAM 3 : WRITE A PROGRAM OF LOOP THROUGH ARRAY
		
		int [] num = {1,2,3,4,5};
		
		for (int i = 0; i < num.length; i++ ) {
			System.out.println(num[i]);
		}
	
		
	// Program 4: PRINT 10 TO 1 WITH WHILE AND FOR LOOP
		
		for(int i = 10 ; i >= 1;i--) {
			System.out.println(i);
		}
		

		int a1 = 10;	
		while(a1 >= 1) {
			System.out.println(a1);
			a1 --;
		}
		
	// Program 5 : Define a class with constructor
		
				AddA p = new AddA();
				p.AdditionA();
				
	// PROGRAM 6: OVERLOADING AND OVERRIDING
		
	// overloading (same class,same method,different signature)
			Overloading p1 = new Overloading();
			p1.multiply();
			p1.multiply('$');

	// overriding (different class,same method,different signature)
			Small m1 = new Small();
			m1.language();
		
	//	PROGRAM 7: INHERITANCE MULTILEVEL
			
			S rabindra = new S("shailendra","adhikari","kabindra","rabindra");
			rabindra.names();
		
	}

}
