class Person1{
	
	//	PRIVATE FIELD
	private int age;
	
	//	GETTER method			//	GETTING AGE
	public  int getAge() {
		return age;
	}
	
	//	SETTER method			//	SETTING AGE
	public int setAge(int a) {
		this.age = a;
		return age;
	}
	
}

public class EncapsulationSetOrGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person1 m = new Person1();
		//	System.out.println(m.age);
		int g = m.setAge(50);
		System.out.println(g);
		
		int h = m.getAge();
		System.out.println(h);
	}

}
