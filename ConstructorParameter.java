
public class ConstructorParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WITHOUT PARAMETER
		Sub c = new Sub();
		
		//	WITH PARAMETER
		Mul d = new Mul(11,12);
		d.Multiplication();
		
		// OVERLOADED
		Cal x1 = new Cal();
		Cal x2 = new Cal(8);
		Cal x3 = new Cal(10,5);
		x3.Greet();
	}

}

	//CONSTRUCTOR WITH NO PARAMETER
	//*****************************

class Sub {
	int a = 10;
	int b = 5;
	
	Sub(){
		System.out.println("SUBSTRACTION CONSTRUCTOR IS CALLED");
	}
	public void Substraction() {
		System.out.println(this.a - this.b);
	}
}

	//	CONSTRUCTOR WITH PARAMETER
	//********************************

class Mul{
		int a1;
		int a2;
		
		Mul(int a,int b){
			this.a1 = a;
			this.a2 = b;
			}
		
		public void Multiplication() {
			System.out.println(this.a1 * this.a2);
		}
	}

class Cal {
	
	Cal(){
		System.out.println("CONSTRUCTOR WITH NO PARAMETER CALLED");
	}
	
	Cal(int a) {
		System.out.println("CONSTRUCTOR WITH PARAMETER CALLED");
	}
	
	Cal (int a, int b){
		System.out.println("CONSTRUCTOR WITH TWO PARAMETERS CALLED");
	}
	
	public void Greet() {
		System.out.println("HELLO EVERYONE");
	}
	
}

