
public class SWITCHCASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch(expression){
		// case value1:
		//			System.out.println();
		// case value2:
		//			System.out.println();
		// case value3:
		//			System.out.println();
		// default:
		//			default statements
		
		
		// PROGRAM 1: NOT USING BREAK STATEMENTS
		//**************************************
		
		String city = "Pune";
		switch(city) {
		
		case "Pune":
			System.out.println("Maharastra");		// AS IT ACCEPTS FIRST CASE, PRINTS OUTPUT FOR ALL CASES, 
		case "Bhopal":								// SINCE THERE IS NO BREAKS
			System.out.println("Madhya Pradesh");
		case "Banglore":
			System.out.println("Karnataka");
		case "Jaipur":
			System.out.println("Rajasthan");
		default:
			System.out.println("Incorrect city");
		}
		
		
		// FOR 2ND EXAMPLE
		//******************
		System.out.println("FOR 2ND EXAMPLE");				//	JUST FOR TOPIC at OUTPUT
		
		city = "Bhopal";
		switch(city) {
		
		case "Pune":
			System.out.println("Maharastra");			// AS IT ACCEPTS 2ND CASE, PRINTS ALL OUTPUTS FROM 2ND
		case "Bhopal":
			System.out.println("Madhya Pradesh");
		case "Banglore":
			System.out.println("Karnataka");
		case "Jaipur":
			System.out.println("Rajasthan");
		default:
			System.out.println("Incorrect city");
		}
		
		// FOR 3RD EXAMPLE
		//******************
		System.out.println("FOR 3RD EXAMPLE"); 		//JUST FOR TOPIC FOR OUTPUT
				
				city = "Udaipur";
				switch(city) {
				
				case "Pune":
					System.out.println("Maharastra");
				case "Bhopal":
					System.out.println("Madhya Pradesh");
				case "Banglore":									// AS IT WON'T MATCH ANY CASE, PRINTS DEFAULT OUTPUT
					System.out.println("Karnataka");
				case "Jaipur":
					System.out.println("Rajasthan");
				default:
					System.out.println("Incorrect city");
				}
		
				
		// PROGRAM 2: SWITCH WITH BREAK
		//******************************
				int weight = 50;
				switch(weight) {
				
				case 50:
					System.out.println("LIGHT WEIGHT");
					break;
				case 70:
					System.out.println("NORMAL WEIGHT");
					break;
				case 80:
					System.out.println("HEAVY WEIGHT");
					break;
				default:
					System.out.println("NO CASE MATCH");
				}
				
		// EXAMPLE 2:
		//*************
				weight = 80;
				switch(weight) {
				
				case 50:
					System.out.println("LIGHT WEIGHT");
					break;
				case 70:
					System.out.println("NORMAL WEIGHT");
					break;
				case 80:
					System.out.println("HEAVY WEIGHT");
					break;
				default:
					System.out.println("NO CASE MATCH");
				}
				
		
	//  EXAMPLE 3:
	//***************
	System.out.println("EXAMPLE 3");
				
				city = "Indore";
				switch(city) {
				
				case "Pune":
				case "Nagpur":
					System.out.println("Maharastra");
					break;
				
				case "Bhopal":
				case "Indore":
					System.out.println("Madhya Pradesh");
					break;
				
				case "Jaipur":
				case "Udaipur":
					System.out.println("Rajasthan");
					break;
				
				default:
					System.out.println("CITY DOESNOT MATCH");
				}
		
				
		// LOOPS: ------> FOR & WHILE LOOP
				System.out.println("HELLO");
				System.out.println("HELLO");
				System.out.println("HELLO");
				System.out.println("HELLO");
				System.out.println("HELLO");
		
		// FINITE ---> 5 TIMES TOSS THE COIN ------> for loop
		// KEEPING TOSSING UNTIL THE HEAD COMES ----> while lOOP
				
	
		// A.  FOR LOOP
		//*************************
		
		// for(initialization; conditionCheck; increment/decrement){
		// 		statement one
		//		statement two
				
			
			for (int i=0; i<5; i++) {
				System.out.println(i);
			}
	
			
			for (int i=0; i<=3; i++) {			
				System.out.println("hello");	// prints four hello
			}
			
			
			// FOR NUMBERS 1 TO 10
			//***************************
			for (int i=1; i<=10; i++) {			
				System.out.println(i);	// prints four hello
			}
			
			
			//  TABLE OF TWO
			//*************************
			System.out.println("TABLE OF TWO");
			
			for (int i=2; i<=20; i= i+2) {			// i=i+2 or i+=2
				System.out.println(i);	
			}
			
			
			
		
			
			
			
			
			
			
	}

}
