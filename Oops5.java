
public class Oops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank chinmay = new Bank("Chinmay Deshpande", 123, 100000);
		System.out.println(chinmay.accName);
		System.out.println(chinmay.accNo);
		System.out.println(chinmay.bal);
		
		// deposit amount
		int updatedBal = chinmay.deposit(100000);
		System.out.println(updatedBal);
		
		// withdrawl
		int bal = chinmay.withdrawl(2200000);
		System.out.println(bal);
		
		int currentBal= chinmay.withdrawl(10000);
		System.out.println(currentBal);
		
		// Transcation -----> count of transaction
		// store the transaction in array
	}

}

class Bank {
	String accName;
	int accNo;
	int bal;
	
	Bank(String aN, int acN, int bl){
		this.accName = aN;
		this.accNo = acN;
		this.bal = bl;
	}
	
	public int deposit(int amount) {
		this.bal = this.bal + amount;
		System.out.println("BAL UPDATED");
		return this.bal;
	}
	
	public int withdrawl(int amount) {
		if (this.bal > amount) {
			this.bal = this.bal - amount;
			System.out.println("Balance updated");
			return this.bal;
		}
		else {
			System.out.println("INSUFFICIENT BALANCE");
			return this.bal;
		}

	}
	
}