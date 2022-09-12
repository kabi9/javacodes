
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// PROGRAM 1: PRINT EVERY CHARACTERS
		
		String str1 = "apple";
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}

		// PROGRAM 2: PRINT SAME STRING IN REVERSE
		
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
			
		// PROGRAM 3: 
			
		
		
		
		
		
		
		
	}

}
