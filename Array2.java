
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
		
		//	PROGRAM 3:
		
		//	HOW TO ACCESS THE ELEMENTS FROM ARRAY.
		
		//						0		1		 2		  3
		String [] cities = {"pokhara","dharan","illam","damak"};
		System.out.println(cities[0]);
		System.out.println(cities[2]);
		
		//	TOTAL NUMBER OF ELEMENTS IN ARRAY
		//**************************************
		
		int a = cities.length;
		System.out.println(a);
		
		
	}

}
