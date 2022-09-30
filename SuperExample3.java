class FatherQ {
	
	String firstName ;
	String lastName;
	
	public FatherQ(String fn , String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
}

class SonQ extends FatherQ {
	
	String Sname;
	
	public SonQ(String fn , String ln,String Sn) {
		super( fn,ln);
		this.Sname = Sn;
	}
	
}
public class SuperExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SonQ i = new SonQ("Shailendra","Adhikari","Kabindra");
	
	}

}
