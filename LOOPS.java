
public class LOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// LOOPS
		// A. for loop
		// B. while loop
		// C. do while loop
				
			// for loop
			//******************
			// for(initialization, conditionCheck, increment/decrement){
			//     statements
			//	}
				
			// PROGRAM 1: PRINT HELLO FOUR TIMES
			//***********************************
				for (int a = 0; a < 4; a++) {  	//1,2,3,4
					System.out.println("FIVES");
				}
			
			// PROGRAM 1(B)
			//******************
			System.out.println("PROGRAM 1B");
			for(int b = 0; b < 6; b = b+2) { //2,4,6
				System.out.println("1B");
			}
				
			// PROGRAM 2
			//***********************
			System.out.println("PRINT NUMBER FROM 1 TO 5");
			for (int c = 1; c <= 5; c++) {			// 2,3,4,5,6
				System.out.println(c);				//1,2,3,4,5
			}
				
			// PROGRAM 3 (TABLES)
			//*******************
			System.out.println("PRINT TABLE OF 3");
			
			for(int d = 3; d <= 30; d = d+3) {
				System.out.println(d);
			}
			
			//PROGRAM 4 : SUM OF ALL NUMBERS
			//*********************************
			System.out.println("SUM OF ALL NUMBERS FROM 1 TO 6");
				// 0 + 1 ====> SUM = 1
				// 1 + 2 ====> SUM = 3
				// 3 + 3 ====> SUM = 6
				// 6 + 4 ====> SUM = 10
				// 10 + 5 ====> SUM = 15
				// 15 + 6 ====> SUM = 21
			int sum = 0;
			for (int i = 1; i <= 6; i++ ) {
				sum = sum + i;
			}
				System.out.println(sum);
			
			// VALUE FROM 4 TO 1
				System.out.println("PRINT VALUE FROM 4 TO 1");
				for (int e = 4; e >= 1; e--) {		// 3,2,1,0
					System.out.println(e); 			// 4,3,2,1
				}
				
			// TABLE OF 4 (REVERSE):
				System.out.println("REVERSE OF TABLE OF FOUR");
				for (int f = 40; f >= 4; f = f - 4) {
					System.out.println(f);
				}
				
			// PROGRAM 6: BREAK STATEMENT WITH for-LOOP
			//********************************************
				System.out.println("USING BREAK");
				
				for(int g = 0; g < 5; g++){
					if (g == 3) {
					break;
					}
					System.out.println(g);		// 0,1,2
				}
			
			System.out.println("BREAK AT 5");
			for (int h = 10; h >= 0; h--) {			// 9,8,7,6,5,4,3,2,1,0
				System.out.println(h);				// 10,9,8,7,6,5
				if (h == 5) {						// ** ALSO PRINTS 5, BECAUSE IT PRINTS BEFORE BREAKING. 
				break;
				}
			}
			
			System.out.println("SAME ABOVE PROGRAM, JUST PRINTS VALUE OF H BELOW");
			for (int i = 10; i >= 0; i--) {			// 9,8,7,6,5,4,3,2,1,0
				if (i == 5) {
				break;
				}
				System.out.println(i); 				// 10,9,8,7,6
			}										// ** DOESN'T PRINT 5, BECAUSE IT PRINTS AFTER BREAKING.
			
			
			// PROGRAM 7: CONTINUE STATEMENT FOR for-LOOP
			//*********************************************
			// CONTINUE: WON'T PRINT AND IMMEDIATELY MOVES TO NEXT STATEMENT
			System.out.println("CONTINUE WITH for-LOOP");
			for (int j = 0; j < 5; j++) {		// 1,2,3,4,5
				if (j == 3) {
				continue;						// ** USE OF CONTINUE: BREAKS 3 AND CONTINUE AGAIN...
			}
				System.out.println(j);			// 0,1,2,4
			}
			
			// REVERSE OF ABOVE PROGRAM
			System.out.println("REVERSE OF ABOVE PROGRAM : CONTINUE");
			for (int k = 5; k >= 1; k--) {		// 4,3,2,1
				if (k == 3) {
				continue;						// ** USE OF CONTINUE: BREAKS 3 AND CONTINUE AGAIN...
			}
				System.out.println(k);			// 5, 4, 2, 1
			}
			
			// PROGRAM 8: while loop
			//***********************
					// while (condition){
					// statement one
					// statement two
					// increment/decrement
			 		// }
			
			System.out.println("PRINT RUN 3 TIMES");
			int l = 0;
			while(l < 3) {
				System.out.println("RUN");
				l = l + 1; 				// 1,2,3,4
			}
			
			System.out.println("PRINT FROM 1 TO 5");
			int m = 1;
			while (m <= 5) {
				System.out.println(m);
				m++;
			}
			
			System.out.println("TABLE OF 3");
			int n = 3;
			while (n <= 30) {
				System.out.println(n);
				n = n + 3;
			}
			
			System.out.println("PRINT 4 TO 1");
			int o = 4;
			while (o >= 1) {
				System.out.println(o);
				o = o - 1;   			// NOTE: OR USE o--;
			}
			
			System.out.println("TABLE OF 6 REVERSE");
			int p = 60;
			while (p >= 6) {
				System.out.println(p);
				p -= 6;					// NOTE: P = P - 5
			}
			
		// PROGRAM 9: while LOOP WITH BREAK STATEMENT
		//*************************************
			System.out.println(" WHILE WITH BREAK");
			int q = 0;
			while (q < 5) {
				if (q == 2) {
				break;
				}
				System.out.println(q);		// 0,1
				q++;						// 1, 2
			}
			
			System.out.println("WHILE WITH BREAK (2)");
			int r = 5;
			while ( r >= 0) {
				System.out.println(r); 		//5,4,3
				if ( r == 3){
				break;
				}
				r -- ; 						// 4, 3
			}
			
	// PROGRAM 10: while-LOOP WITH CONTINUE STATEMENT
	//*************************************
		System.out.println(" WHILE-LOOP WITH C0NTINUE");
		
		//	int s = 0;
		//	while (s < 6) {
		//		if (s == 2) {			  	// 2<5 and 2==2 (keeps continuing infinity loop)
		//		continue;
		//		}
		//	System.out.println(s);	 	// 0,1
		//	s++; 						//  1,2
		//	}
			
		
		int t = 0;
		while ( t < 6) {
			if ( t == 2) {		// NOTE: above program goes infinity loop,so to correct it, we use t++ to jump loop.
			t ++;			// 3 (from loop 2<5 and 2==2; t++ adds value to 3, when continue; jumps loop and prints).
			continue;	
			}
			System.out.println(t);		//0,1,3,4,5
			t ++;						//1,2,4,5,6
		}
		
		
			
			
			
	}

}
