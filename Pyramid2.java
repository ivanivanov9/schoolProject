import java.util.Scanner;
public class Pyramid2 {

public Pyramid2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < rows - i; j++) {
				System.out.print("*");
			};
			System.out.println();
		}
	}

}
