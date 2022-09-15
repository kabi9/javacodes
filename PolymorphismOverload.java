// overloading ---- same methodName, same Class, different Signatures 
// overriding ----- same methodName, different Class, same Signatures

	class Calculator {
		//	METHOD 1
		public int Addition(int a, int b) {
			return a + b;
		}
		
		//	METHOD 2
		public int Addition (int a, int b, int c) {
			return a + b + c;
		}
		
		//	METHOD 3
		public int Addition (int a, int b, int c, int d) {
			return a + b + c + d;
		}
	}

	public class PolymorphismOverload {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Calculator c1 = new Calculator();
			int a = c1.Addition(12, 12);
			System.out.println(a);
			int b = c1.Addition(12, 12, 45);
			System.out.println(b);
			int c = c1.Addition(12, 13, 45, 44);
			System.out.println(c);
		}

	}
