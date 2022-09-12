
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("HELLO");
		
		//A. ARITHMETIC OPERATOR
		//**********************
		System.out.println("ARITHMETIC OPERATORS");
			//Addition(+), Subtraction(-), Multiplication(*), Division(/), Modulus(%) 
		    //NOTE: modulus is remainder after division
			//sysout(Ctrl + spacebar)for System.out.println();
			
			int a = 10;
			int b = 5;
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
			System.out.println("Addition is "+ a+b); 		//NOTE: MISSING BRACKET
			System.out.println("Addition is"+(a+b)); 		//NOTE: NO SPACE AFTER "IS"
			System.out.println("Addition is "+ (a+b)); 		//NOTE: PUTTING SPACE AFTER "IS"
			System.out.println("Subtraction is "+ (a-b));
			System.out.println("Multiplication is "+ (a*b));
			System.out.println("Division "+ (a/b));
			System.out.println("Modulus is "+ (a%b));
			
			System.out.println(9/4);
			System.out.println(9%4); //modulus generally used with integers
		
		//FLOAT NUMBER --- 9.0,5.5,6.3 (used floating points, output also be floating numbers)
			System.out.println("FLOAT NUMBER IS "+ (9.0/4.0)); 
			System.out.println(5.0/2.0);
		
		
		//B. COMPARISION OR RELATIONAL OPERATORS
		//**************************************
		System.out.println("RELATIONAL OPERATORS");
				
			// ( <, >, ==, !=, >=, <= )  (!= NOT EQUAL TO)
			// for relational operators, output will be always boolean value(true or false) 
			
				System.out.println(8 == 8);   // equal to
				System.out.println(6 > 5);   // greater than
				System.out.println(7 < 6);   // less than
				System.out.println(7 >= 7);  // >= greater than or equal to
				System.out.println(6 <= 5);  // <= less than or equal to
				System.out.println(4 != 3);  // != not equal to
		
				int s = 100;
				int t = 50;
				System.out.println("For S AND T VALUE");
				System.out.println(s > t);    //TRUE
				System.out.println(t < s);    //TRUE
				System.out.println(s == t);   //FALSE
				System.out.println(s != t);   //TRUE
				System.out.println(s >= t);	  //TRUE
				System.out.println(s <= t);	  //FALSE
				System.out.println(5 >= 5);   //TRUE (>= GREATER THAN OR EQUALS TO)
				
		//C. LOGICAL OPERATORS
		//********************
		System.out.println("LOGICAL OPERATORS");
							
							// 1. AND OPERATOR -----> &&
							//**************************
							System.out.println("AND OPERATOR");
								
									// TRUE TRUE ----> TRUE
									System.out.println(5>=4 && 4==4);
								
									// FALSE TRUE ----> FALSE
									System.out.println(6!=6 && 5==5);
								
									// TRUE FALSE ----> FALSE
									System.out.println(5>3 && 7<=6);
								
									// FALSE FALSE ----> FALSE
									System.out.println(4>5 && 7>8);
								
							//2. OR OPERATOR --------> ||
							//*****************************
							System.out.println("OR OPERATOR");
							
									// TRUE TRUE ----> TRUE
									System.out.println(6==6 || 7!=8);
								
									// FALSE TRUE ----> TRUE
									System.out.println(5!=5 || 6>5);
								
									// TRUE FALSE ----> TRUE
									System.out.println(8>7 || 6>7);
								
									// FALSE FALSE ----> FALSE
									System.out.println(8!=8 || 7>8);
								
							//3. NOT OPERATOR --------> !
							//***************************
							System.out.println("NOT OPERATOR");
							
									// TRUE -------> FALSE
									System.out.println(!(7==7));  // FALSE
									
									//FALSE --------> TRUE
									System.out.println(!(6<5));   // TRUE
									
				
			//UNARY OPERATOR or SHOT HAND OPERATOR
			//************************************
				// = 	int a = 10
				//+=	a += 1 -----> a = a + 1
				//-=	a -= 1 -----> a = a - 1
				//*=	a *= 1 -----> a = a * 1
				///=	a /= 1 -----> a = a / 1
				//%=	a %= 1 -----> a = a % 1
				
				// (we can represent unary operator in three ways: x += 1; x++; x=x+1)
				
				int x = 10;
				x = x+1;
					System.out.println(x);	//x adds value as 10+1=11
				x += 1;
					System.out.println(x);	//x += 1 ----> x= x + 1 -----> x = 11+1= 12
				x ++;
					System.out.println(x);	// ++ NOTE: x++ -----> x+1 (++ only used for 1)
				
					System.out.println("FOR Y");
				
				int y = 90;
					System.out.println(y);
				
				y = y + 5;
				 	System.out.println(y);
				
				 y += 2;	// y = y + 2
				 	System.out.println(y);
				
				 y ++;		// ++ only used for 1 
				 	System.out.println("USING ++ SIGN COMES " + y);
				
				y -= 1;		// y = y-1
					System.out.println(y);
				y -= 5;		// y = y-5
					System.out.println(y);
				
				y *= 2;		// y = 92 * 2
					System.out.println(y);				//	184
				
				y /= 2;		// y = y / 2
					System.out.println("/= 2 RESULT FOR Y " + y);		//	 /= 2 RESULT FOR Y 92
		
		
		
		
		
	}

}
