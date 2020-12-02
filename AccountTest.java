package tema14;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1122, 20000);
		acc1.deposit(3000);
		acc1.withdraw(2500);
		acc1.setYearInterestRate(4.5);
		System.out.println("Balance: " + acc1.getBalance() + ", monthly interest: " + acc1.getMonthlyInterest() + ", date of creation of the accont: " + acc1.getDateOfCreation());

	}

}
