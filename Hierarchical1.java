	class FatherA {
	
		String firstNAME;
		String lastName;
	
		FatherA(String firstName, String lastName){
		this.firstNAME = firstName;
		this.lastName = lastName;
		}
	
		public void displayName(String greet) {
		System.out.println(greet + this.firstNAME + this.lastName);
		}
	}
	
	class SonA extends FatherA {
		String sonNAME;
		
		SonA(String firstName, String lastName, String sonName){
		super(firstName, lastName);
		this.sonNAME = sonName;
		}
		
		public void displayName(String greet) {
			System.out.println(greet + this.sonNAME + this.lastName);
		}
	}
		
	class DaughterA extends FatherA {
			String daughterNAME;
			
			DaughterA(String firstName, String lastName, String daughterName){
				super(firstName, lastName);
				this.daughterNAME = daughterName;	
			}
			
			public void displayName(String greet) {
				System.out.println(greet + this.daughterNAME + this.lastName);
			}
			
	}
public class Hierarchical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SonA kabindra = new SonA("kabindra", "adhikari", "rabindra");
		DaughterA pooja = new DaughterA("kabindra", "adhikari", "pooja");
		kabindra.displayName("Good Morning: "); 
		pooja.displayName("Good Evening: ");
		
	}
}


	
