package third;
import second.B;
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B fruit = new B();
		fruit.display();
	}

}

/*TO USE CLASS IN ANOTHER PACKAGE; YOU NEED TO MAKE IT PUBLIC. ALSO IMPORT THE CLASS.
 * BY DEFAULT ACCESS MODIFIER IS "DEFAULT"
 * IF METHOD IS PRIVATE -----> WE CANNOT CALL IT IN ANOTHER CLASS
 * IF METHOD IS PROTECTED -----> METHOD CAN ONLY BE ACCESSIBLE INSIDE A CLASS, CAN'T BE CALLED IN OTHER PACKAGE
 */
