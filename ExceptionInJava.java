
public class ExceptionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	INVALID USER INPUT
		 * DEVICE FAILURE
		 * LOSS OF CONNECTION
		 * OUT OF DISK MEMORY
		 * CODE ERRORS
		 * TRYING TO OPEN FILE BUT NO FILE
		 * 
		 * BASICALLY 2 TYPES EXCEPTION;
		 * 1.	RUN TIME EXCEPTION ---------- PROGRAMMING EXCEPTION
		 * 2.	IO EXCEPTION(COMPILE) ------- CHECK EXCEPTION (LIKE FILE NOT FOUND)
		 */ 
		
//		try {
//					**code**
//		}
//		catch(Exception e) {
//		
//		}
//	
//
//	System.out.println(5/0);
//	System.out.println("hello"); // anyhow have to execute this

		// 		PROGRAM 1 :
		
	try {
		int divideByZero = 5/0;
	}
	
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());			//	PRINTS ONLY DESCRIPTION OF THE EXCEPTION
		System.out.println("next lines in try block");
	}
	
	
	/*
	 		try {
	 			// code
	 		}
	 		catch(Exception e1){
	 		
	 		}
	 		finally {
	 		
	 		}
	*/
	
	// --------------------------------------------------------------
	//		***** PROGRAM 2 *****
	//--------------------------------------------------------------
	
	try {
		System.out.println(7/0);
	}
	catch(Exception e) {
		System.out.println("Exception on program 2: " + e.getMessage());
	}
	finally {
		System.out.println("I will always run .....");
	}
	
	// program3
	

	try {
		System.out.println(7/2);
	}
	catch (Exception e){
		System.out.println("Exception message"+e.getMessage());
	}
	finally {
		System.out.println("I will always run .....");
	}
	
		
		
	}

}
