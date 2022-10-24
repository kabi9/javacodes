enum Size{
			SMALL,
			MEDIUM,
			LARGE,
			EXTRALARGE
}
public class Enum2 {
	Size tshirt;
	
	
	public Enum2(Size size) {
		this.tshirt = size;
	}

	public void orderTshirt() {
		switch(tshirt) {
		case SMALL:
			System.out.println("small size");
			break;
		case MEDIUM:
			System.out.println("medium size");
			break;
		case LARGE:
			System.out.println("large size");
			break;
		default:
			System.out.println("incorrect");
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enum2 qqq = new Enum2(Size.EXTRALARGE);
		qqq.orderTshirt();

	}

}
