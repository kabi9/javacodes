
public class LoopsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// PROGRAM 1:
	//**************
		
	int a = 0;
	do {
		System.out.println("KABI");
		a++;
	}
	while(a < 4);
	
	//	0	1	2	3	4
	// [11, 12, 13, 14, 15]
	
	// OBJECT
	// HUMAN --------- amol
	// PROPERTY -------	age, weight, height, name, color
	// METHOD --------- talking(), walking((), sleeping
	
	// OBJECT
	// VEHICLE -------- AUDI
	// PROPERTY -------- speed, color, mileage, type, model
	// METHOD ---------- start(), stop()
	
	// OBJECT
	// BANK -------- ICICI
	// PROPERTY -------- account number, balance, ifsc
	// METHOD ---------- deposit(), withdraw()
	
	// PROPERTY ----- LENGTH
	
	//PROGRAM 2:
	//**************************
	
	int [] age = new int[5];
	System.out.println(age);
	age[0] = 11;
	age[1] = 12;
	age[2] = 13;
	age[3] = 14;
	age[4] = 15;
	System.out.println(age.length);
	System.out.println(age[0]);
	System.out.println(age[1]);
	
	// LENGTH - 1 IS ALWAYS THE LAST INDEX
	System.out.println(age[age.length-1]);			// age.length = 15; age[age.length - 1]= age[15-1]= age[14]=15
	
	
	//PROGRAM 3:
	//***************************
	System.out.println("BIRTHYEAR");
	
	 int [] birthyear = new int [3];				//	0		1		2
	 birthyear[0] = 1989;							// [1989,  1990,   1991]
	 birthyear[1] = 1990;
	 birthyear[2] = 1991;
	 System.out.println(birthyear[0]);
	 
	 // length
	 System.out.println(birthyear.length);
	
	 // length -1 is always last index
	 System.out.println(birthyear[birthyear.length - 1]);	 	// birthyear[2]= 1991 -----> last index
	 
	 // PROGRAM 4:
	 //******************************************************
	 System.out.println("MARKS");
	 //  			0	 1	  2	   3	4	 5	  6	   7   8   9
	 int[]marks = {100, 110, 132, 333, 444, 222, 333, 44, 55, 66};
	 	
//	 System.out.println(marks[0]);
//	 System.out.println(marks[1]);
//	 System.out.println(marks[2]);
//	 System.out.println(marks[3]);
//	 System.out.println(marks[4]);
//	 System.out.println(marks[5]);
//	 System.out.println(marks[6]);
//	 System.out.println(marks[7]);
//	 System.out.println(marks[8]);
//	 System.out.println(marks[9]);
//	 System.out.println(marks[marks.length]);
//	 System.out.println(marks[marks.length-1]);
//	
	
	for (int i = 0; i < 10; i++) {
		// System.out.println(i);
		System.out.println(marks[i]);
	}
	
	// PROGRAM 5:
	//***********************
	
	// 						0		   1		2		   3	   4
	String [] names = {"chinmay", "sarika", "poorva", "anjali", "ram"};
	
	// PRINT ALL ELEMENT OF ARRAY USING FOR LOOP
	//******************************************
	System.out.println("ARRAY USING FOR");
	
		for (int i = 0; i < names.length; i++ ) {
			// System.out.println(i);
			System.out.println(names[i]);
		}
		
	// PRINT ALL ELEMENT OF ARRAY USING WHILE LOOP
	//*********************************************
	System.out.println("ARRAY USING WHILE LOOP");		
			
			int i = 0;
			while(i < names.length) {
				// System.out.println(b);
				System.out.println(names[i]);
				i++;
			}
			
	// PRINT ALL ELEMENT IN REVERSE USING FOR LOOP
	//*********************************************	
	System.out.println("REVERSE USING FOR LOOP");
	
			for (int c = names.length - 1; c >= 0; c-- ) {
				// System.out.println(c);
				System.out.println(names[c]);
			}
	
	// PRINT ALL ELEMENT IN REVERSE USING WHILE LOOP
	//*********************************************	
	System.out.println("REVERSE USING WHILE LOOP");
	
		int d = names.length - 1;
		while ( d >= 0) {
			// System.out.println(d);
			System.out.println(names[d]);
			d--;
		}
			
			
			
		
	
	
	
	
	
	
	}

}
