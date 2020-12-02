package tema10;
public class CircleTest {



	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("Perimeter of c1 is " + c1.getPerimeter() + " area of c1 is " + c1.getArea());
		Circle c2 = new Circle(5);
		System.out.println("Perimeter of c2 is " + c2.getPerimeter() + " area of c2 is " + c2.getArea());
		c1.setRdaius(10);
		System.out.println("Perimeter of c1 is " + c1.getPerimeter() + " area of c1 is " + c1.getArea());
	
	}
}
