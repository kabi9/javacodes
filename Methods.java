
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int a = 10;
//		int b = 5;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
//		
//		int s = 100;
//		int t = 50;
//		System.out.println(s+t);
//		System.out.println(s-t);
//		System.out.println(s*t);
//		System.out.println(s/t);
//		System.out.println(s%t);
//		
		
		Calculator(10,5);		// 	CALLING FUNCTION CALCULATOR IN MAIN METHOD/ PASSING TWO VALUES 10,5
		Calculator(100,50);
		Calculator(90,45);
		
		AdditionA();			//	FUNCTION WITHOUT PARAMETER AND WITHOUT RETURN TYPE
		
		AdditionB(12,12);		//	FUNCTION WITH PARAMETER AND WITHOUT RETURN TYPE
		AdditionB(120,15);
		
		int v = AdditionC(14,10);		//	FUNCTION WITH PARAMETER AND WITH RETURN TYPE
		System.out.println(v);			// v = 14 + 10 = 24
		System.out.println(v + v);		// v + v = 24 + 24 = 48
		System.out.println(v - 5);
		System.out.println(v * 0.10);
		
		String q = SubtractionD(66,33);
		System.out.println(q);
	}
		
		// 10 pairs: I HAVE TO WRITE 50 LINES
		// DRY --- DONOT REPEAT YOURSELF
		// SOLUTION -- FUNCTIONS
	
	
	public static void Calculator(int x, int y) { 			////	FUNCTION NAME CALCULATOR INTRODUCED
		// INSTRUCTIONS ARE ARTHMETIC OPERATIONS
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	//	THREE BASIC TYPES OF FUNCTION
	//***********************************
	
	//	FUNCTION WITHOUT PARAMETER AND WITHOUT RETURN TYPE
	//****************************************************
	
	public static void AdditionA() {
		System.out.println(9+9);
		}
	
	//	FUNCTION WITH PARAMETER AND WITHOUT RETURN TYPE
	//****************************************************
	
	public static void AdditionB(int x, int y) {
		System.out.println(x+y);
	}
	
	//	FUNCTION WITH PARAMETER AND WITH RETURN TYPE
	//****************************************************
	
	public static int AdditionC(int x, int y) {
			return x + y ;
	}
	
	public static String SubtractionD(int a , int b) {
		System.out.println(a - b); 		// 	33
		return "SUBTRACTION SUCCESSFUL";
	}
}
