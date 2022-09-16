
public class ConstructorPrivate {
	
	private ConstructorPrivate() {
		System.out.println("private constructor is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorPrivate a1 = new ConstructorPrivate();
		Pc a2 = new Pc();
		
		/* CONSTRUCTOR IS ALWAYS THERE
		 * CONSTRUCTOR WITH DEFAULT PARAMETER
		 * CONSTRUCTOR WITH PARAMETER
		 * WE CAN OVERLOAD THE CONSTRUCTOR
		 * CONSTRUCTOR ARE ALWAYS SIMILAR TO CLASS NAME
		 * CONSTRUCTOR EXPLICTLY DOESNOT RETURN ANYTHING
		 * CONSTRUCTOR ARE USED TO RUN CODE OR INITIALISE PROPERTIES AT TIME OF OBJECT
		 */
	}
}

class Pc{
	Pc(){
		System.out.println("constructor is private and cannot be called outside class");
	}
}
