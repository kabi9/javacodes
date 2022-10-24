class Database {
	
	private static Database dbObject;
	
	private Database() {
		
	}
	
	public static Database getInstance() {		//	iT'S WRITTEN THERE, TO CHECK WHETHER YOU HAVE ANY OBJECT PREVIOUSLY.
		if (dbObject == null) {
			dbObject = new Database();
		}
		
		return dbObject;
	}
	
	public void getConnect() {
		System.out.println(" CONNECTED TO DATABASE");
	}
}
public class SinglePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Database obj;
		obj = Database.getInstance();	// ONLY WAY TO CREATE OBJECT IS CALLING THIS METHOD. GIVES SAME OBJECT. 
										// SO, THERE WILL BE ONLY ONE INSTANCE.
		obj.getConnect();
		
		//	Database c = new database(); 	NOTE: WHEN CREATED CONSTRUCTOR PRIVATE, CANNOT CALL CONSTRUCTOR OUTSIDE THE CLASS. 
	}

}
