
public class ConstructorAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	WHAT IS CONSTRUCTOR ?
		 * 		CONSTRUCTOR WE USED TO SET CLASS PROPERTIES OR EXECUTE SOME CODE
		 * 		AT TIME OF OBJECT CREATION
		 */
		
		Add a = new Add();
		a.Addition();
		
	//	Add.Additon();
		Add.greet();
		//Add.Add();
		a.Add();

	}

}

class Add{
	int a = 5;
	int b = 10;
	public void Add() {            /// void returns nothing
		System.out.println("heyyyyyyyyyyyyy");
	}
	public void Addition() {
		System.out.println(this.a + this.b );
	}
	
	public static String greet() {
		return "HEllo Peeps" ;
	
		
	} 
}
