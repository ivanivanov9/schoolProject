
public class PalindromicPrime {

	public PalindromicPrime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(2 + "\t");
		int count = 1;
		int number = 3;
		while (count < 120) {
			if (! isPalindrome(number) || ! isPrime(number)) {
				number ++;
				continue;
			}
			System.out.print(number + "\t");
			count ++;
			number ++;
			if(count % 10 == 0) {
				System.out.println();
			}
		}
	}	
	public static boolean isPrime(int number) {
		int maxDivider = (int)Math.ceil(Math.sqrt(number));
		boolean isPrime = true;
		for (int i = 2; i <= maxDivider; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	

	}
	public static boolean isPalindrome (int number) {
		int copyOfNumber = number;
		int reversedNumber = 0;
		while (copyOfNumber != 0) {
			int remainder = copyOfNumber % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			copyOfNumber /= 10;
		}
		return number == reversedNumber;
	}

}
