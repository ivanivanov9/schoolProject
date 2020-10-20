import java.util.Scanner;
public class Onetotheleft {

	public Onetotheleft() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		int var = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = var;
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
