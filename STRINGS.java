
public class STRINGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "POKHARA";
		System.out.println(city.toUpperCase());		// POKHARA
		System.out.println(city.toLowerCase());		// pokhara


		
// STRING //
//****************************************
System.out.println("STRING");
System.out.println("*****************");
	
		// STRING + STRING =====> STRING
		// STRING + NUMBER =====> STRING
		// NUMBER + STRING =====> STRING
		// NUMBER + NUMBER =====> NUMBER
		


		int a = 10;
		int b = 20;
		String c = "hello";
		String d = "hi";
		
		System.out.println(a + b);			//  30
		System.out.println(c + d);			//	hellohi
		System.out.println(a + d);			//	10hi
		System.out.println(d + b);			//	hi20
		System.out.println(a + b + c); 		// a+b = 30, 30 + hello = 30hello
		System.out.println(c + b + a); 		// hello + 20 = hello20; hello20 + 10 = hello2010 (*NOTE: STRING + NUM = STRING) 
		
		
	// type ---- objects ---- property and method
	// method will have action and return
		
			// Method --- action - exercise
			// Return ---- muscles
	
	String fruit1 = "Apple";
	String upper = fruit1.toUpperCase();
	System.out.println(upper);					//	APPLE
		
	String fruit2 = "Banana";
	String lower = fruit2.toLowerCase();
	System.out.println(lower);					//	banana
	
	String city3 = "POKHARA";
	int e = city3.length();
	System.out.println(e);						//	7
	System.out.println("WELCOME TO "+ city3);
		
	// concat()	------ JOINS STRINGS
	String firstName = "kabindra";
	String lastName = "adhikari";
	String a22 = firstName.concat(lastName);
	System.out.println(a22);					//	kabindraadhikari
	
	// METHOD CHAINING	----- CHAINING VARIOUS METHODS
	String vegetable = "potato";
	System.out.println(vegetable); 		// potato
	
	String a11 = vegetable.toUpperCase();
	System.out.println(a11); 			// POTATO
	
	int a33 = a11.length();
	System.out.println(a33);
	
	int a44 = vegetable.toUpperCase().toLowerCase().length();
			// "POTATO".toLowerCase().length();
			// "potato".length();
			// 6
	System.out.println(a44);				//	   6
	
	//	equals	---- compares two strings and returns boolean values
	
	String first = "hello";
	String second = "hello";
	boolean result = first.equals(second);
	System.out.println(result);
	
	// contains	----- checks for substrings (RETURNS BOOLEAN VALUE)
	
	String jkl = "I am new to java learning";
	boolean result1 = jkl.contains("java");			// java is available in string.
	System.out.println(result1);
	
	// SUBSTRING()
	
	String city4 = "pokhara";
			// 	0	1	2	3	4	5	6
			// 	p	o	k	h	a	r	a
	
	String result3 = city4.substring(2);			// gives substring from index 2
	System.out.println(result3);					// khara
	
	String result4 = city4.substring(2,5);			// gives substring from index 2 to index 4
	System.out.println(result4);					// kha
	
	//	join()	---- joins the strings
	
	String str1 = "I am";
	String str2 = "learning";
	String str3 = "javascript";
	
	String result6 = String.join("-", str1,str2,str3);		// joins strings with -
	System.out.println(result6);							// I am-learning-javascript
	
	String str11 = "kabindra";
	String str22 = "gmail.com";
	
	String email = String.join("@", str11, str22);
	System.out.println(email);								// kabindra@gmail.com
	
	// replace() ------ replace character
	// replaceAll() ------ replace substring
	//	"chinmay" ----> subString 		"i" ----> character
	// chinmay is cool, chinmay cooks his own food. 		replaceAll("chinmay","amol") for substrings
	
	// replace
	String str4 = "I am learning javascript";
	String str5 = str4.replace("javascript","java");
	System.out.println(str5);
	

	String str6 = "I am learning javascript and javascript is fun";
	String str7 = str6.replace("i","m");
	System.out.println(str7);
	
	// replaceAll()
	String str8 = "I am learning javascript and javascript is fun";
	String str9 = str8.replaceAll("javascript","java");
	System.out.println(str9);
	
	// replaceFirst	---- REPLACE FIRST OCCURANCE
	
	String str10 = "I am learning javascript and javascript is fun";
	String str12 = str10.replaceFirst("javascript","java");
	System.out.println(str12);
	
	// charAt()
	
	String str13 = "pune";
			//	0	1	2	3
			//	p	u	n	e
	char result11 = str13.charAt(2);			//*NOTE: SINCE OUTPUT COMES ONE CHARACTER, CANNOT USE STRING
	System.out.println(result11);
	
	// indexOf()
	
	// trim()	----- removes space
	
	String str14 = " pune ";
	System.out.println(str14.length());
	String str15 = str14.trim();
	System.out.println(str15.length());
	
	// split()
	
	String str16 = "kabindra-adhikari-7709192441";
	String [] result17 = str16.split("-");		// ["kabindra","adhikari","7709192441"]
	System.out.println(result17[0]);
	System.out.println(result17[1]);
	System.out.println(result17[2]);
	
	// startsWith	----- checks whether string starts with passed parameter
	
	String str18 = "I am new to Zorba";
	boolean result19 = str18.startsWith("I am");
	System.out.println(result19);
	
	//	endsWith	----- checks whether string ends with passed parameter
	String str20 = "I am new to Zorba";
	boolean result21 = str20.endsWith("Zorba");
	System.out.println(result21);
	
	
	// PRINT NAGPUR ALL CHRACTERS
	//**************************
			//	0	1	2	3	4	5
			//	n	a	g	p	u	r
	
	String str23 = "nagpur";
	for (int i = 0; i < str23.length(); i++) {		//	1	2	3	4	5	6
		//System.out.println(i);			// 0,	1,	2,	3,	4,	5
		System.out.println(str23.charAt(i));
	}
	
	// PRINT NAGPUR ALL CHRACTERS IN REVERSE
	//******************************************
	
	for (int i = str23.length()-1; i >= 0; i-- ) {
		System.out.println(str23.charAt(i));
	}
	
	//	PRINT COMPLETE STRING IN REVERSE
	//**********************************
		// "hello"	------>	"olleh"
	
	String str24 = "hello";
	String rev = "";
	for (int i = 0; i < str24.length(); i++) {
		rev = str24.charAt(i) + rev;
					//	"h"	+	""		===>	h
					//	e	+	h		===>	eh
					//	l	+	eh		===>	leh
					//	l	+	leh		===>	lleh
					//	o	+	lleh	===>	olleh
	}
		System.out.println(rev);
		
	
		String str25 = "pune";
	String rev2 = "";
			//	0	1	2	3
			//	p	u	n	e
	for (int i = str25.length()-1; i >=0; i--) {
		rev2 = rev2 + str25.charAt(i);
		//	""	+	e		===>	e
		//	e	+	n		===>	en
		//	en	+	u		===>	enu
		//	enu	+	p		===>	enup
	}
		System.out.println(rev2);
		
	//	COUNT NUMBERS OF CHARACTERS IN STRING
	//***************************************
			//	HELLO	-----> HAS 2 "L"
		
	String str26 = "hello";
	int counter = 0;
		//	0	1	2	3	4
		//	h	e	l	l	o
	
	for (int i = 0; i < str26.length(); i++) {
		char a1 = str26.charAt(i);
		if (a1 == 'l') {
			counter = counter + 1;
		}
		}
		System.out.println(counter);
		
		
	}

}
