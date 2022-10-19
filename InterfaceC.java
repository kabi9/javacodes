
public interface InterfaceC {

	void getName(String name);
}

interface A2 {
	void getAge(int age);
}

interface A3 {
	void getCity(String city);
}

class GetInfo implements InterfaceC,A2,A3{

	@Override
	public void getCity(String city) {
		// TODO Auto-generated method stub
		System.out.println("City :"+ city);
		
	}

	@Override
	public void getAge(int age) {
		// TODO Auto-generated method stub
		System.out.println("Age :"+age);
	}

	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name :"+name);
		
	}
	
}
