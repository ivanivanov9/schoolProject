package tema13;

public class FanTest {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.setSpeed(Fan.MEDIUM);
		f1.setRadius(5);
		f1.setColour("Red");
		f1.setSwitchedOn(true);
		
		Fan f2 = new Fan();
		f2.setSpeed(Fan.SLOW);
		f2.setColour("Orange");
		f2.setRadius(8);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());

	}

}
