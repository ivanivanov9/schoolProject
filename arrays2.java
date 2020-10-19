import java.util.Scanner;
public class arrays2 {
	public arrays2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int array[];
		array = new int[10];
		for(int i=0; i<10; i++) {
			//System.out.println("Enter 10 numbers: ");
			array[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++) {
			int randomIndex = (int) (Math.random() * 10);
			int swap = array[randomIndex];
			array[randomIndex] = array[i];
			array[i] = swap;
		}
		for(int i = 0; i<10; i++) {
			System.out.println(array[i]);
		}
	}
}
