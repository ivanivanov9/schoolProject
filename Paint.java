import java.util.Scanner;
public class Paint {
public Paint() {
// TODO Auto-generated constructor stub}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner a = new Scanner(System.in);
System.out.println("Enter height: ");
double height = a.nextDouble();
System.out.println("Enter length: ");
double length = a.nextDouble();
System.out.println("Enter width: ");
double width = a.nextDouble();
int area = (int) Math.ceil(width*length + 2*((width + length) * height));
int fiveLitersPrice = 15, oneLiterPrice = 4;
int fiveLitersAreaCover = 140, oneLiterAreaCover = 30;
int fiveLiterBuckets = 0, oneLiterBuckets = 0;
fiveLiterBuckets += area / fiveLitersAreaCover;
int areaLeft = area % fiveLitersAreaCover;
oneLiterBuckets = areaLeft / 30 + ((areaLeft % 30 != 0) ? 1 : 0);
if (oneLiterBuckets * oneLiterPrice > fiveLitersPrice) {
oneLiterBuckets = 0;
fiveLiterBuckets++;
}
System.out.println("You need " + fiveLiterBuckets + " five liter buckets and " 
+ oneLiterBuckets + " one liter buckets." );
}
}
