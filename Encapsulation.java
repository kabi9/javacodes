class Area{
	
		// FIELDS TO CALCULATE AREA
		int length;
		int breadth;
		
		// CONSTRUCTOR TO INITIALIZE VALUES
		Area(int length,int breadth){
			this.length = length;
			this.breadth = breadth;
		}
		
		public void getArea() {
			int area = this.length * this.breadth;
			System.out.println(area);
		}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area a = new Area(3,4);
		a.getArea();
	}

}
