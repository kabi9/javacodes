
public interface InterfaceB {
	void getMethodB1(String method1);
	void getMethodB2(String method2);
	void getMethodB3(String method3);
}

interface D {
	void getMethodD1(String method1);
	void getMethodD2(String method2);
	void getMethodD3(String method3);
}

class C implements InterfaceB, D {

	@Override
	public void getMethodD1(String method1) {
		// TODO Auto-generated method stub
		System.out.println("DMETHOD1:" + method1);
		
	}

	@Override
	public void getMethodD2(String method2) {
		// TODO Auto-generated method stub
		System.out.println("DMETHOD2:" + method2);
		
	}

	@Override
	public void getMethodD3(String method3) {
		// TODO Auto-generated method stub
		System.out.println("DMETHOD3:" + method3);
		
	}

	@Override
	public void getMethodB1(String method1) {
		// TODO Auto-generated method stub
		System.out.println("BMETHOD1:" + method1 );
		
	}

	@Override
	public void getMethodB2(String method2) {
		// TODO Auto-generated method stub
		System.out.println("BMETHOD2:" + method2);
		
	}

	@Override
	public void getMethodB3(String method3) {
		// TODO Auto-generated method stub
		System.out.println("BMETHOD3:" + method3);
		
	}
	
}


//InterfaceB, D with abstract methods 
//Implement both interface on class with definition 
//We create main method on another class \\\\\ create object and call methods
