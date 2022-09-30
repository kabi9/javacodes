//   ******		JUST FOR CONCEPT	*********

class DataBase{
	
	String connect;
	public DataBase() {
		this.connect = "I am connected";
	}
	
	public void displayConnect() {
		System.out.println(this.connect);
	}
}
public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			

		DataBase connect1 = new DataBase();		//	PURPOSE OF CLASS: CREATE MULTIPLE OBJECTS
		connect1.displayConnect();
		
		DataBase connect2 = new DataBase();
		connect2.displayConnect();
		
		DataBase connect3 = new DataBase();
		connect3.displayConnect();
	}

}
