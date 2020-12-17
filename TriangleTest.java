package tema18;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input side a of a triangle");
				double a = sc.nextDouble();
		System.out.println("Input side b of a triangle");
				double b = sc.nextDouble();
		System.out.println("Input side c of a triangle");
				double c = sc.nextDouble();
		sc.nextLine();
		System.out.println("Input colour of a triangle");
				String color = sc.nextLine();
		System.out.println("Input if a triangle is filled (true or false)");
				boolean isFilled = sc.nextBoolean();
		
		Triangle t1 = new Triangle(a, b, c);
		t1.setColor(color);
		t1.setFilled(isFilled);
		System.out.println(t1.printTriangle() + "\n" + t1.toString() + "\n" + "Area: " + t1.getArea() + "\n" + "Perimeter: " + t1.getPerimeter());
	}
	

}
