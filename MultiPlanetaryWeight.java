import java.util.Scanner;

public class MultiPlanetaryWeight {

public MultiPlanetaryWeight() {
// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("What is your weight?");
Scanner a = new Scanner(System.in);
double weight = a.nextDouble();
a.nextLine();
System.out.println("Choose a planet.");
String planet = a.nextLine(); 
switch(planet) {
case "Mercury" : weight = weight * 0.38;
break;
case "Venus" : weight = weight * 0.91;
break;
case "Mars" : weight = weight * 0.38;
break;
case "Jupiter" : weight = weight * 2.36;
break;
case "Saturn" : weight = weight * 0.92;
break;
case "Uranus" : weight = weight * 0.89;
break;
case "Neptune" : weight = weight * 1.13;
break;
}
System.out.println("Your weight on " + planet + " is " + weight);
}

}
