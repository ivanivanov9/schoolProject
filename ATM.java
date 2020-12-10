package tema16;

import java.util.Scanner;
import tema14.Account;

public class ATM {

	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(i, 100);
		}
		Scanner sc = new Scanner(System.in);
		while (true) {
			int id = -1;
			do {
				System.out.println("Input ID: ");
				id = sc.nextInt();
			} while (id < 0 || id > 9);

			int option = -1;
			while (option != 4) {
				System.out.println("Main menu\n" + "1: check balance\n" + "2: withdraw\n" + "3: deposit\n" + "4: exit\n"
						+ "Enter a choice: \n");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("You have: " + accounts[id].getBalance());
				} else if (option == 2) {
					System.out.println("Amount to withdraw?");
					double amount = sc.nextDouble();
					accounts[id].withdraw(amount);
				} else if (option == 3) {
					System.out.println("Amount to deposit?");
					double amount = sc.nextDouble();
					accounts[id].deposit(amount);

				}

			}
		}
	}

}
