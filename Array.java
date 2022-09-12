
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// PROGRAM 1: PRINT EVERY CHARACTERS
		//***********************************
		
		String str1 = "apple";
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}

		// PROGRAM 2: PRINT SAME STRING IN REVERSE
		//*****************************************
		
		String rev = "";
		for (int i = 0; i < str1.length(); i++) {
			rev = str1.charAt(i) + rev;
					//	"a"		+	""		===>	 a
					//	 p		+	a		===>	 pa
					//	 p		+	pa		===> 	ppa
					//	 l		+	ppa		===> 	lppa
					//	 e		+	lppa	===> 	elppa
		}
			System.out.println(rev);
		
		String rev2 = "";
		for (int i = str1.length()-1; i >= 0; i--) {
			rev2 = rev2 + str1.charAt(i);
			
					//	""		+	e		===>	 e
					//	 e		+	l		===>	 el
					//	 el		+	p		===> 	elp
					//	 elp	+	p		===> 	elpp
					//	 elpp 	+ 	a		===> 	elppa
		}
			System.out.println(rev2);
			
		// PROGRAM 3: PRINT NUMBER OF '*char' IN STRING
		//******************************************
			int counter = 0;
			for (int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i) == 'p') {
					counter = counter + 1;
				}
			}
			
			System.out.println(counter);
		
		//	PRINT ALL VOWELS (A,E,I,O,U
		//*****************************
			
			String str3 = "I live in pokhara";
			int counter3 = 0;
			for (int i = 0; i < str3.length(); i++) {
				if(str3.charAt(i) == 'a' || str3.charAt(i) == 'e' || str3.charAt(i) == 'i' || str3.charAt(i) == 'o' || str3.charAt(i) == 'u'){
					counter3 = counter3 + 1;
					
				}
				}
			System.out.println(counter3);
			
		// ARRAY OF INTEGERS
		//**************************
			
			int [] ar = {1,2,3,4,5};
			System.out.println(ar[0]);
			System.out.println(ar.length);
			
		//	PRINT EVERY ELEMENTS OF ARRAY
		//********************************
		
			//			 0  1  2  3  4 (index)
		 int [] array = {11,22,33,44,55};
		 
		 for (int i = 0; i < array.length; i++) {
			 System.out.println(array[i]);
		 }
		 
		 				/*(also can be used as)
		 				 * for(int element:array){
		 				 * System.out.println(element);
		 				 * }
		 				 */
		 
		 //	PRINT EVERY STRINGS IN ARRAY
		 //******************************
		 
		 String[] names = {"kabindra","asha","bijay"};
		 for (String element:names) {
			 System.out.println(element);
		 }
			
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
			
			
		
		
	}

}
