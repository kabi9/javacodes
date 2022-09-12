
public class Oops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person4 kabindra = new Person4("kabindra","pokhara",25,012345);
		Person4 asha = new Person4("asha","kathmandu",20,543210);
		
		asha.DisplayName();
		kabindra.DisplayName();
	}

}

class Person4{
	String fullName;
	String city;
	int age;
	int ssn;
	
	Person4(String fn, String ct, int ag, int sn){
		this.fullName = fn;
		this.city = ct;
		this.age = ag;
		this.ssn = sn;
		}
	
	public void DisplayName() {
		System.out.println(this.fullName);
	}
}