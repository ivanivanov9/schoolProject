import java.util.Scanner;

public class ColorRange {

public ColorRange() {
// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner a = new Scanner(System.in);
System.out.println("Enter a colour code");
int waveLength = a.nextInt();
if (waveLength >= 380 && waveLength < 450){
System.out.println("The colour is Violet");
}
else if (waveLength >= 450 && waveLength < 495 ){
System.out.println("The colour is Blue");
}
else if (waveLength >= 495 && waveLength < 570 ){
System.out.println("The colour is Green");
}
else if (waveLength >= 570 && waveLength < 590 ){
System.out.println("The colour is Yellow");
}
else if (waveLength >= 590 && waveLength < 620 ){
System.out.println("The colour is Orange");
}
else if (waveLength >= 620 && waveLength < 750 ){
System.out.println("The colour is Red");
}
else {
System.out.println("The entered wavelength is not part of the visible spectre");
}
}

}
