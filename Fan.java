package tema13;

public class Fan {
	public static int SLOW = 1;
	public static int MEDIUM = 2;
	public static int FAST = 3;
	
	private int speed = SLOW;
	private boolean switchedOn = false;
	private double radius = 5;
	private String colour = "Blue";
	

	public Fan() {
		
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public boolean isSwitchedOn() {
		return switchedOn;
	}


	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String toString() {
		if(switchedOn) {
			return "Speed " + speed + ", colour: " + colour + ", radius: " + radius;
		}else {
			return "Colour: " + colour + ", radius: " + radius + ", the fan is turned off.";
		}
	}

}
