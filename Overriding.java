class Language {
	public void display() {
		System.out.println("COMMON PROGRAMMING LANGUAGE");
	}
}

class Java extends Language{
	
	@Override
	public void display() {
		System.out.println("JAVA LANGUAGE");
		// super.display();	//	NOTE: CALL INTIGIT PARENTS(FIELDS + METHODS) TO PRINT PARENT METHOD TOO
	}
}


public class Overriding {		//	NOTE: we override, because we don't want parent method implementation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java java = new Java();
		java.display();
	
	}

}
