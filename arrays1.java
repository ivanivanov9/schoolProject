import java.util.Scanner;
public class arrays1 {
public arrays1() {
// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner a = new Scanner(System.in);
int array1[];
array1 = new int[20];
for(int index = 0; index < array1.length; index++) {
	array1[index] = (int) (Math.random()*100);
}
for(int index = 0; index < array1.length; index++) {
	System.out.println(array1[index]);
}
}


}
