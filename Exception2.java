
public class Exception2 {
	
	
	public static void divideByZero() throws Exception {
			
		//	System.out.println(12/0);
		//	throw new ArithmeticException("Trying  to divide by zero");
	
		
//		int age = 16;
		
		
		
			int a = 10 ;
			int b = 5;
			if(a != b) {
				throw new Exception("values not equal");
			}
		
//		if(age < 18) {
//			throw new Exception("not allowed");
//		}
//	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			divideByZero();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}

