import java.util.Scanner;
public class Transposedarray {

	public Transposedarray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number for rows");
int rowSize = sc.nextInt();
System.out.println("Enter a number for columns");
int columnSize = sc.nextInt();
int[][] matrix = new int[rowSize][columnSize];
int[][] transposedMatrix = new int[columnSize][rowSize];
for (int i = 0; i < rowSize; i++) {
	for (int j = 0; j < columnSize; j++) {
		System.out.println("Enter a number on index" + i + ", " + j);
		matrix[i][j] = sc.nextInt();
	}
}
for (int i = 0; i < rowSize; i++) {
	for (int j = 0; j < columnSize; j++) {
		System.out.print(matrix[i][j] + "\t");
	}
	System.out.println();
}
for (int i = 0; i < columnSize; i++) {
	for (int j = 0; j < rowSize; j++) {
		transposedMatrix[j][i] = matrix[i][j];
	}
}
System.out.println("Transposed matrix: \n");
for (int i = 0; i < columnSize; i++) {
	for (int j = 0; j < rowSize; j++) {
		System.out.print(transposedMatrix[i][j] + "\t");
	}
		System.out.println();
}
	
	}

}
