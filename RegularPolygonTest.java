package tema13;

public class RegularPolygonTest {

	public RegularPolygonTest() {
	
	}

	public static void main(String[] args) {
		RegularPolygon RP1 = new RegularPolygon();
		System.out.println(RP1.getArea() + "	" + RP1.getPerimeter());
		RegularPolygon RP2 = new RegularPolygon(6, 4);
		System.out.println(RP2.getArea() + " 	" + RP2.getPerimeter());
		RegularPolygon RP3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println(RP3.getArea() + " 	" + RP3.getPerimeter());

	}

}
