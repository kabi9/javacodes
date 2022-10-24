class DataBaseA{
	
	String connect;
	public DataBaseA() {
		this.connect = "I am connected";
	}
	
	public void displayConnect() {
		System.out.println(this.connect);
	}
}
public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			

		DataBaseA connect1 = new DataBaseA();		//	PURPOSE OF CLASS: CREATE MULTIPLE OBJECTS
		connect1.displayConnect();
		
		DataBaseA connect2 = new DataBaseA();
		connect2.displayConnect();
		
		DataBaseA connect3 = new DataBaseA();
		connect3.displayConnect();
	}

}
