abstract class WorldBank1 {
	
	abstract void loan();
	abstract void save();
}

class SBI1 extends WorldBank1{
	
	public void loan() {
		System.out.println("FROM LOAN METHOD");
	}
	
	public void save() {
		System.out.println("FROM SAVE METHOD");
	}
	
	public void sbi() {
		System.out.println("SBI METHOD");
	}
}

class PNB extends WorldBank1{
	
	public void loan() {
		System.out.println("FROM LOAN METHOD");
	}
	
	public void save() {
		System.out.println("FROM SAVE METHOD");
	}
	
	public void pnb() {
		System.out.println("PNB METHOD");
	}
}
	
public class AbstractionBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI1 a = new SBI1();
		a.save();
		a.loan();
		a.sbi();
		
		PNB pnb = new PNB();
		pnb.save();
		pnb.loan();
		pnb.pnb();
	}

}
