class WorldBank {
	
	String country = "NEPAL";
	public void loan(int x) {
		System.out.println("I AM LOAN METHOD FROM WORLDBANK" + x);
	}
	
	public void save(int x) {
		System.out.println("I AM save METHOD FROM WORLDBANK" + x);
	}
	
	public void currentCountry() {
		System.out.println("Current country " + this.country);
	}
}

class SBI extends WorldBank {
	
		@Override
		public void loan(int x) {
			System.out.println("I AM LOAN METHOD FROM sbi" + x);
		}
		
		@Override
		public void save(int x) {
			System.out.println("I AM SAVE METHOD FROM sbi" + x);
		}
	}

class BOI extends WorldBank {
	
	@Override
	public void loan(int x) {
		System.out.println("I AM LOAN METHOD FROM boi" + x);
	}
	
	@Override
	public void save(int x) {
		System.out.println("I AM SAVE METHOD FROM boi" + x);
	}
}

class ICICI extends WorldBank {
	
	@Override
	public void loan(int x) {
		System.out.println("I AM LOAN METHOD FROM icici" + x);
	}
	
	@Override
	public void save(int x) {
		System.out.println("I AM SAVE METHOD FROM icici" + x);
	}
}

public class InheritanceOveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI sbi = new SBI();
		BOI boi = new BOI();
		ICICI icici = new ICICI();
		
		sbi.loan(8);
		sbi.save(7);
		
		sbi.currentCountry();
		boi.currentCountry();
		icici.currentCountry();
	}

}
