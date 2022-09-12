
public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NumberOfTicket <= 5 =====> 5%
		// NumberOfTicket > 5 && NumberOfTicket <= 10 =====> 10%
		//NumberOfTicket > 10 =====> 30%
		// if(condition) {
		//
		// }
		
		// PROGRAM 1
		//**********
		int a = 10;
		if (a >= 10) {
			System.out.println("A IS 10");
		}
		
		// PROGRAM 2: (CHECK WHETHER THE NUMBER IS POSITIVE OR NEGATIVE)
		//**************************************************************
		int b = 90;
		if (b > 0) {
			System.out.println("NUMBER IS POSITIVE");
		}
		else {
			System.out.println("NUMBER IS NEGATIVE");
		}
		
		b = -90;		//IF int IS USED IT ASSIGNS VALUE, WHILE WRITING ONLY b UPDATES NEW VALUE FOR VARIABLE b
		if (b > 0) {
			System.out.println("NUMBER IS POSITIVE");
		}
		else {
			System.out.println("NUMBER IS NEGATIVE");
		}
		
		// PROGRAM 3 (NOT RECOMMENDED)
		//****************************
		if (b>0) System.out.println("NUMBER IS POSITIVE");
		else System.out.println("NUMBER IS NEGATIVE");
		
		// PROGRAM 4: (CHECK THE GREATER NUMBER)
		//**************************************
		System.out.println("PROGRAM 4: CHECKING GREATER NUMBER"); // JUST PUTTING TO MAKE CLEAR IN OUTPUT
		
		int x = 10;
		int y = 20;
		if (x>y) {
			System.out.println("X IS GREATER");
		}
		else {
			System.out.println("Y IS GREATER");
		}
		
		//PROGRAM 5
		//***************
		// USE OF if, if if (checks all conditions)
		//numberOfTicket > 0 && numberOfTicket <= 5 ------> 5% discount
		//numberOfTicket > 5 && numberOfTicket <= 10 ------>10% discount
		//numberOfTicket > 10  ------> 30% discount
		System.out.println("PROGRAM 5: USING IF,IF,IF");
		
		int numberOfTicket = 5;
		if (numberOfTicket > 0 && numberOfTicket <= 5) {
			System.out.println("5 % DISCOUNT");
			}
		if (numberOfTicket > 5 && numberOfTicket <= 10) {
			System.out.println("10 % DISCOUNT");
			}
		if (numberOfTicket > 10) {
			System.out.println("30 % DISCOUNT");
			}
		
		numberOfTicket = 10;   // UPDATING VALUE TO 10, WE DON'T USE int
		if (numberOfTicket > 0 && numberOfTicket <= 5) {
			System.out.println("5 % DISCOUNT");
			}
		if (numberOfTicket > 5 && numberOfTicket <= 10) {
			System.out.println("10 % DISCOUNT");
			}
		if (numberOfTicket > 10) {
			System.out.println("30 % DISCOUNT");
			}
		
		numberOfTicket = 11;     
		if (numberOfTicket > 0 && numberOfTicket <= 5) {
			System.out.println("5 % DISCOUNT");
			}
		if (numberOfTicket > 5 && numberOfTicket <= 10) {
			System.out.println("10 % DISCOUNT");
			}
		if (numberOfTicket > 10) {
			System.out.println("30 % DISCOUNT");
			}
		
		// PROGRAM 6
		//******************
		// USE OF if/else if    (ONLY GOES SECOND CONDITION, IF FIRST CONDITION FAILS)
		//						(ONLY GOES THIRD CONDITION, IF SECOND CONDITION ALSO FAILS)
		//					 	(.......KEEPS GOING ON)
		//DIFFERENCE BETWEEN else AND else if **** (else if SHOULD HAVE CONDITION, WHILE else HAS NO CONDITION)
		System.out.println("PROGRAM 6: USING IF/ELSE IF");
		

		numberOfTicket = -10;     
		if (numberOfTicket > 0 && numberOfTicket <= 5) {
			System.out.println("5 % DISCOUNT");
			}
		else if (numberOfTicket > 5 && numberOfTicket <= 10) {
			System.out.println("10 % DISCOUNT");
			}
		else if (numberOfTicket > 10) {
			System.out.println("30 % DISCOUNT");
			}
		else {
			System.out.println("INCORRECT INPUT");
		}
		
		numberOfTicket = 15;     
		if (numberOfTicket > 0 && numberOfTicket <= 5) {
			System.out.println("5 % DISCOUNT");
			}
		else if (numberOfTicket > 5 && numberOfTicket <= 10) {
			System.out.println("10 % DISCOUNT");
			}
		else if (numberOfTicket > 10) {
			System.out.println("30 % DISCOUNT");
			}
		else {
			System.out.println("INCORRECT INPUT");
		}
		
		//PROGRAM 7: GRADES
		//********************
		System.out.println("PROGRAM 7: GRADES");
		
		// IF PERCENT IS ABOVE 90 -----> A GRADE
		// IF PERCENT IS ABOVE 75 -----> B GRADE
		// IF PERCENT IS ABOVE 65 -----> C GRADE
		
		int marks = 92;
		if (marks>90) {
			System.out.println("A GRADE");
		}
		if (marks>75) {
			System.out.println("B GRADE");
		}
		if (marks>65) {
			System.out.println("C GRADE");  
		}
		// *FOR ABOVE CONDITION SINCE IT MATCHES ALL CONDITIONS, USING ONLY "if" RUNS ALL CONDITIONS GIVING ALL OUTPUTS
		
		
		marks = 76; 		// UPDATES VALUE OF MARKS FROM 92 TO 76 
		if (marks>90) {
			System.out.println("A GRADE");
		}
		else if (marks>75) {
			System.out.println("B GRADE");		// IT MATCHES SECOND AND THIRD CONDITIONS
		}										// BUT USING "else if" goes only 3RD condition, if 1ST & 2ND condition fails
		else if (marks>65) {					//SINCE IT MATCHES 2ND CONDITION, PRINTS OUTPUT ONLY AS "B GRADE"
			System.out.println("C GRADE");
		}
		
		marks = 66;
		if (marks>90) {
			System.out.println("A GRADE");
		}
		else if (marks>75) {
			System.out.println("B GRADE");
		}
		else if (marks>65) {				// USING "else if" / and 1st and 2nd conditions don't match
			System.out.println("C GRADE");  //so goes third condition and matches this condition
		}									// so PRINTS "C GRADE"
		
		
		//PROGRAM 8:
		//************
		System.out.println("PROGRAM 8");
		
		int x1 = 100;
		int x2 = 23;
		int x3 = 45;
		
		if (x1 > x2) {			// x1 IS GREATER
			if (x1 > x3) {
				System.out.println("x1 IS GREATER");
			}
			else {
				System.out.println("x3 IS GREATER");
			}
			}
		else {
			if (x2 > x3) {
				System.out.println("x2 IS GREATER");
			}
			else {
				System.out.println("x3 IS GREATER");
		}
		}
		
		
		// NEXT EXAMPLE (B)
		//******************
		x1 = 100;
		x2 = 230;
		x3 = 45;
		if (x1 > x2) {			// x1 IS GREATER
			if (x1 > x3) {
				System.out.println("x1 IS GREATER");
			}
			else {
				System.out.println("x3 IS GREATER");
			}
			}
		else {
			if (x2 > x3) {
				System.out.println("x2 IS GREATER");
			}
			else {
				System.out.println("x3 IS GREATER");
		}
		}
		
		// NEXT EXAMPLE (C) 
		//******************
				x1 = 100;
				x2 = 230;
				x3 = 450;
				if (x1 > x2) {			// x1 IS GREATER
					if (x1 > x3) {
						System.out.println("x1 IS GREATER");
					}
					else {
						System.out.println("x3 IS GREATER");
					}
					}
				else {
					if (x2 > x3) {
						System.out.println("x2 IS GREATER");
					}
					else {
						System.out.println("x3 IS GREATER");
				}
				}
				
	// PROGRAM 9 (USING LOGICAL OPERATORS MAKES EASY
	//**********************************************
	System.out.println("PROGRAM 9");
	
	x1 = 100;
	x2 = 230;
	x3 = 450;
	if (x1 > x2 && x1 > x3) {
		System.out.println("x1 IS GREATER");
	}
	else if (x2 > x1 && x2 > x3) {
		System.out.println("x2 IS GREATER");
	}
	else {
		System.out.println("x3 IS GREATER");
	}
		
	
	///// EXAMPLE (2)
	//***************
	
	x1 = 100;
	x2 = 230;
	x3 = 45;
	if (x1 > x2 && x1 > x3) {
		System.out.println("x1 IS GREATER");
	}
	else if (x2 > x1 && x2 > x3) {
		System.out.println("x2 IS GREATER");
	}
	else {
		System.out.println("x3 IS GREATER");
	}
	
	///// EXAMPLE (3)
	//***************
	
	x1 = 100;
	x2 = 23;
	x3 = 45;
	if (x1 > x2 && x1 > x3) {
		System.out.println("x1 IS GREATER");
	}
	else if (x2 > x1 && x2 > x3) {
		System.out.println("x2 IS GREATER");
	}
	else {
		System.out.println("x3 IS GREATER");
	}
		
		
		

	}

}
