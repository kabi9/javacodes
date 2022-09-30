class FinalMethodDemo{
	int num = 20;
	public final void Display() {		// USING FINAL KEYWORD ON METHOD, YOU CANNOT OVERRIDE.
										// NOTE: to get clear view, clear final and see result.
		System.out.println("I am from FinalMethodDemo");
	}
}
public class FinalB extends FinalMethodDemo {
	
	public void display() {
		System.out.println("I am from FinalB class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalB a = new FinalB();
		a.Display();
		System.out.println(a.num);
	}

}
