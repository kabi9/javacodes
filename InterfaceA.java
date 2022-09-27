
public interface InterfaceA {
	void getArea(int length, int breadth);
}

class Rectangle implements InterfaceA {

	@Override
	public void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("THE AREA OF RECTANGLE:" + (length * breadth));
	}	
}

class Square implements InterfaceA {		

	@Override
	public void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("THE AREA OF SQUARE:" + (2 * length * breadth));
	}	
}


//Interface --> 
//how define one interface 
//implement the  interface on the class 
//because same package we create class we main method and create object

// DEFINATION OF INTERFACE
//An interface is fully abstract class . 
//To implement it on class we need to user "implement" keyword
//we need to method abstract method over the class
//We can then create object of class
