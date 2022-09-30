class AnimalB {
	
	protected String type = "animal";		//	ONLY ACCESS INSIDE INHERITED CLASS.	
}

class DogB extends AnimalB {
	
	public String type = "mammal";
	
	public void printType() {
		System.out.println(type);
		System.out.println(super.type);		//	ACCESS PARENT TYPE.
		
	}
}
public class SuperExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DogB d = new DogB();
		d.printType();
	}

}
