
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				/*	WHEN TO USE ARRAY?
				 * 	Datatype [] arrayName = new Datatype[3]	
				 */
		
		// PROGRAM 1:
		//***************
		
		String [] names = new String[3];
		
		//	ARRAY STORES VALUES BY INDEX
		names[0] = "kabindra";
		names[1] = "asha";
		names[2] = "bijay";
		
		//	ANOTHER WAY TO INITIALIZE ARRAY
		String [] names2 = {"kabindra","asha","bijay"};
		
		//	PROGRAM 2: ARRAY OF INTEGERS
		
		int [] numbers = new int[3];
		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;
		
		int [] numbers2 = {11,22,33};
				
				//	0   1    2
				// [11, 22, 33]
		
		//	PROGRAM 3: ACCESS THE ELEMENTS FROM ARRAY.
		
		//						0		1		 2		  3
		String [] cities = {"pokhara","dharan","illam","damak"};
		System.out.println(cities[0]);
		System.out.println(cities[2]);
		
		//	TOTAL NUMBER OF ELEMENTS IN ARRAY
		//**************************************
		
		int a = cities.length;
		System.out.println(a);
		System.out.println(cities[cities.length-1]);
		
		//	PROGRAM 4: PRINT EVERY ELEMENTS OF ARRAY
		
		//					   0		1		2			3
		String [] fruits = {"apple", "mango", "banana", "chikoo"};
		
		for (int i = 0; i < 3; i++) {		// 	1	2	3
			System.out.println(i);			//	0	1	2
		}
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		int [] numbers1 = {11,22,33,44,55};
		
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(numbers1[i]);
		}
		
		// PRINT ALL VALUES OF ARRAY IN REVERSE
		
		// 							0		1		 2			3
		String [] vegetables = { "tomato","potato","Brinjal","cabbage" };
		for (int i = vegetables.length-1; i >= 0; i--) {		//	2,1,0,-1
			// System.out.println(i);							//	3,2,1,0
			System.out.println(vegetables[i]);
		}
		
		//PROGRAM 6:	USING FOR EACH LOOP
		
		int [] age = {11,22,33};
		
		for (int ag: age) {
			System.out.println(ag);
		}
		
		String [] countries = {"Pakistan","Nepal","India","China"};
		
		for (String country:countries) {
			System.out.println(country);
		}
		
		//	PROGRAM 7: SUM OF ALL NUMBERS IN ARRAY
		
		int [] numbers3 = {12,14,16};
		int sum = 0;
		 
		for (int i = 0; i< numbers3.length; i++ ) {
			sum = sum + numbers3[i];
			//	0 	+ 	12	=	12
			//	12	+	14	=	26
			//	26	+	16	=	42
		}
			System.out.println(sum);
		
		// PROGRAM 8 : AVERAGE OF ALL ELEMENTS OF ARRAY
			
			int [] ages1 = {11,22,33,44};
			int total = 0;		// sum of all elements = totalNumberOfElements
			
			for (int i = 0; i < ages1.length; i++) {
				total = total + ages1[i];
				//	0	+	11	=	11
				//	11	+	22	=	33	
				//	33	+	33	=	66	
				//	66	+	44	=	110
			}
				System.out.println(total/ages1.length);
	}

}
