
public class RevisionHomework {
	
	public static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}
	
	public static int Calculator2 ( int x, int y) {
		System.out.println(x + y);
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name1 = "kabindra";
	System.out.println(name1);
	
	String name2 = name1.toUpperCase();
	System.out.println(name2);
	
	int a1 = name1.toUpperCase().toLowerCase().length();
	System.out.println(a1);
	
	System.out.println( 10 < 11);
	System.out.println(10 > 11);
	System.out.println(10 >= 9);
	System.out.println(10 <= 9);
	System.out.println(10 == 9);
	System.out.println(10 != 9);
	
	System.out.println(10 > 9 && 9 == 9);
	System.out.println(10 > 9 && 9 != 9);
	System.out.println(10 < 9 && 9 >= 9);
	
	System.out.println(10 > 9 || 9 == 9);
	System.out.println(10 > 9 || 9 != 9);
	System.out.println(10 < 9 || 9 >= 9);
	
	System.out.println(!(9 == 9));
	System.out.println(!(9 != 9));
	
	int a2 = 15;
	if (a2 > 0 && a2 <= 10) {
		System.out.println("I HAVE LITTLE MONEY");
	}
	if (a2 > 10 && a2 <= 20) {
		System.out.println("I HAVE SOME MONEY");
	}
	if (a2 > 20) {
		System.out.println("I HAVE A LOT OF MONEY");
	}
	
	int a3 = 87;
	if (a3 > 95) {
		System.out.println("Excellent");
	}
	if (a3 > 85) {
		System.out.println("Very Good");
	}
	if (a3 > 75) {
		System.out.println("Good");
	}
	
	int a4 = 87;
	if (a4 > 95) {
		System.out.println("Excellent");
	}
	else if (a4 > 85) {
		System.out.println("Very Good");
	}
	else if (a4 > 75) {
		System.out.println("Good");
	}
	
	int a5 = 20;
	int a6 = 15;
	if(a5 > a6) {
		System.out.println("a5 is greater");
	}
	else {
		System.out.println("a6 is greater");
	}
	
	int greater = (a5 > a6) ? a5 : a6;
	System.out.println(greater);
	
	String small = (a5 < a6) ? "a5 is small" : "a6 is small";
	System.out.println(small);
	
	// SWITCHCASE
	
	String city = "Pokhara";
	
	switch(city) {
	
	case "Pokhara":
	case "Begnastal":
		System.out.println("Gandaki");
		break;
		
	case "Kathmandu":
	case "Lalitpur":
		System.out.println("Bagmati");
		break;
		
	case "Butwal":
	case "Tansen":
		System.out.println("Lumbini");
		break;
		
	default:
		System.out.println("No match found");
	
	}
	
	// Print 10 to 1 (using FOR loop)
	for (int i = 10; i >= 1; i--) {
		System.out.println(i);
	}
	
	for (int i = 5; i >= 1; i--) {
		System.out.println(i);			//	5	4	3
		if (i == 3) {
			break;
			}
	}
	
	for (int i = 5; i >= 1; i--) {
		
		if (i == 3) {
			break;
			}
		
		System.out.println(i);			//	5	4
	}
	
for (int i = 5; i >= 1; i--) {
		
		if (i == 3) {
			continue;
			}
		
		System.out.println(i);			//	5	4	2	1
	}
	
	
	
	// Print 10 to 1 (using WHILE loop)
	int i1 = 10;
	while (i1 > 0) {
		System.out.println(i1); 		// 	10	9	8	7	6	5	4	3	2	1	0
		i1--;
	}
	
	int i11   = 6;
	while (i11   > 0) {
		System.out.println(i11  ); 		//	6	5	4
		if (i11 == 4 ) {
		break;
		}
		i11  --;
	}
	
	int i111   = 6;
	while (i111   > 0) {
		System.out.println(i111  ); 		//	6	5	4
		if (i111 == 4 ) {
		break;
		}
		i111  --;
	}
	
	int i2   = 6;
	while (i2   > 0) {
		if (i2 == 4 ) {
			i2  --;
			continue;
		}
		System.out.println(i2);		//	6	5	3	2	1
		i2 --;
	}
	
	Calculator(10,5);
	Calculator(100,40);
	
	Calculator2(5,5);
	Calculator2(10,5);
	
	int a33 = Calculator2(4,3);		// store value in integer
	System.out.println(a33);
	System.out.println(a33 - 3);
	
	
	
	
	
	
	
	
	}
}
